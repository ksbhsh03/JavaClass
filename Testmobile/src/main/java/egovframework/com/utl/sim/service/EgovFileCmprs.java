/**
 *  Class Name : EgovFileCmprs.java
 *  Description : 파일(디렉토리)의 압축 및 압축해제 하는 Business Interface class
 *  Modification Information
 *
 *     수정일         수정자                   수정내용
 *   -------    --------    ---------------------------
 *   2009.02.04    박지욱          최초 생성
 *   2017.02.27    김준호          시큐어코딩(ES)-부적절한 예외 처리[CWE-253, CWE-440, CWE-754]
 *  @author 공통 서비스 개발팀 박지욱
 *  @since 2009. 02. 04
 *  @version 1.0
 *  @see
 *
 *  Copyright (C) 2009 by MOPAS  All right reserved.
 */
package egovframework.com.utl.sim.service;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EgovFileCmprs {

	static final int COMPRESSION_LEVEL 	= 8;
    static final int BUFFER_SIZE 		= 64 * 1024;
    static final char FILE_SEPARATOR 	= File.separatorChar;
   
    private static final Logger LOGGER = LoggerFactory.getLogger(EgovFileCmprs.class); 
    
    /**
	 * 파일(디렉토리)을 압축하는 기능
	 * @param String source 원본파일명(디렉토리명)
	 * @param String target 압축파일명
	 * @return boolean result 압축성공여부 True / False
	 * @exception Exception
	*/
	public static boolean cmprsFile(String source, String target) throws Exception {

		// 압축성공여부
		boolean result = false;
		int cnt = 0;
        // 읽어들일 byte 버퍼
        byte[] buffer = new byte[BUFFER_SIZE];

        FileInputStream finput = null;
        FileOutputStream foutput = null;
        ZipOutputStream zoutput = null;

        String source1 = source.replace('\\', FILE_SEPARATOR).replace('/', FILE_SEPARATOR);
        String target1 = target.replace('\\', FILE_SEPARATOR).replace('/', FILE_SEPARATOR);
		File srcFile = new File(source1);

		if (srcFile.exists()) {

			// 1. 파일인 경우
			if (srcFile.isFile()) {

				String target2 = EgovFileTool.createNewFile(target1);
                File tarFile = new File(target2);

                foutput = null;
                zoutput = null;
		        ZipEntry zentry = null;

		        try {
		        	foutput = new FileOutputStream(tarFile);
			        zoutput = new ZipOutputStream(foutput);
	                finput = new FileInputStream(srcFile);
	                zentry = new ZipEntry(srcFile.getName());
	                zoutput.putNextEntry(zentry);
	                zoutput.setLevel(COMPRESSION_LEVEL);
	                cnt = 0;
	                while ((cnt = finput.read(buffer)) != -1) {
	                    zoutput.write(buffer, 0, cnt);
	                }
	                zoutput.closeEntry();
		            result = true;
		        } catch (Exception e) {
		        	//tarFile.delete();
		        	//2017.02.16 김준호 시큐어코딩(ES)-부적절한 예외 처리[CWE-253, CWE-440, CWE-754]		        	
		        	if(tarFile.delete()){
		        		LOGGER.debug("[file.delete] tarFile : Creation Success ");
		        	}else{
		        	    LOGGER.error("[file.delete] tarFile : Creation Fail ");
		        	}
				    //e.printStackTrace();
				    //throw e;	// 2011.10.10 보안점검 후속조치
		        	LOGGER.error("["+e.getClass()+"] Try/Catch...Exception : " + e.getMessage());
		        } finally {
		        	close(finput);	// 2012.11 KISA 보안조치
		        	close(zoutput);	// 2012.11 KISA 보안조치
		        	close(foutput);	// 2012.11 KISA 보안조치
		        }

			// 2. 디렉토리인 경우
			} else if (srcFile.isDirectory()) {

				String target2 = EgovFileTool.createNewFile(target1);
                File tarFile = new File(target2);

		        ZipEntry zentry = null;

		        try {
		        	foutput = new FileOutputStream(tarFile);
			        zoutput = new ZipOutputStream(foutput);
		        	File [] fileArr = srcFile.listFiles();
					ArrayList<?> list = EgovFileTool.getSubFilesByAll(fileArr);

					for(int i = 0; i < list.size(); i++) {
						File sfile = new File((String)list.get(i));
						finput = new FileInputStream(sfile);
						zentry = new ZipEntry(sfile.getAbsolutePath().replace('\\', '/').replaceAll(srcFile.getAbsolutePath().replace('\\', '/'), ""));
		                zoutput.putNextEntry(zentry);
		                zoutput.setLevel(COMPRESSION_LEVEL);
		                cnt = 0;
		                while ((cnt = finput.read(buffer)) != -1) {
		                    zoutput.write(buffer, 0, cnt);
		                }
		                finput.close();
			            result = true;
					}
					zoutput.closeEntry();
		        } catch (Exception e) {
		        	//tarFile.delete();
		        	//2017.02.16 김준호 시큐어코딩(ES)-부적절한 예외 처리[CWE-253, CWE-440, CWE-754]		        	
		        	if(tarFile.delete()){
		        		LOGGER.debug("[file.delete] tarFile : Creation Success ");
		        	}else{
		        	    LOGGER.error("[file.delete] tarFile : Creation Fail ");
		        	}		        	
				    //e.printStackTrace();
				    //throw e;	 // 2011.10.10 보안점검 후속조치
		        	LOGGER.error("["+e.getClass()+"] Try/Catch...Exception : " + e.getMessage());
		        } finally {
		        	close(finput);	// 2012.11 KISA 보안조치
		        	close(zoutput);	// 2012.11 KISA 보안조치
		        	close(foutput);	// 2012.11 KISA 보안조치
		        }
			}
		}
		return result;
	}

	/**
	 * 파일(디렉토리)을 압축해제하는 기능
	 * @param String source 압축파일명
	 * @param String target 압출이 풀릴 디렉토리
	 * @return boolean result 압축해제성공여부 True / False
	 * @exception Exception
	*/
	public static boolean decmprsFile(String source, String target) throws Exception {

		// 압축해제성공여부
		boolean result = false;
		int cnt = 0;
        // 읽어들일 byte 버퍼
        byte[] buffer = new byte[BUFFER_SIZE];

        FileInputStream finput = null;
        FileOutputStream foutput = null;
        ZipInputStream zinput = null;

        String source1 = source.replace('\\', FILE_SEPARATOR).replace('/', FILE_SEPARATOR);
        String target1 = target.replace('\\', FILE_SEPARATOR).replace('/', FILE_SEPARATOR);
		File srcFile = new File(source1);

		if (srcFile.exists() && srcFile.isFile()) {

			String target2 = EgovFileTool.createNewDirectory(target1);
            File tarFile = new File(target2);
			finput = new FileInputStream(srcFile);
			zinput = new ZipInputStream(finput);

			foutput = null;
			ZipEntry entry;

			try {

				while ( (entry = zinput.getNextEntry()) != null) {

					String filename = entry.getName();
					String tempFile = EgovFileTool.createNewFile(tarFile.getAbsolutePath() + FILE_SEPARATOR + filename);
					File efile = new File(tempFile);
					foutput = new FileOutputStream(efile);
					while ((cnt = zinput.read(buffer)) != -1) {
						if (foutput != null)
							foutput.write(buffer, 0, cnt);
                    }
					foutput.close();	// 2012.11 KISA 보안조치
				}

				result = true;

			//2017.02.27 김준호 시큐어코딩(ES)-부적절한 예외 처리[CWE-253, CWE-440, CWE-754]
			} catch(IllegalArgumentException e) {
		    	LOGGER.error("[IllegalArgumentException] Try/Catch...usingParameters Runing : "+ e.getMessage());
			//2017.02.27 김준호 시큐어코딩(ES)-부적절한 예외 처리[CWE-253, CWE-440, CWE-754]
			} catch (Exception e) {
				//e.printStackTrace();
				//throw e;	// 2011.10.10 보안점검 후속조치
				LOGGER.error("["+e.getClass()+"] Try/Catch...Exception : " + e.getMessage());
			} finally {
	        	close(finput);	// 2012.11 KISA 보안조치
	        	close(zinput);	// 2012.11 KISA 보안조치
	        	close(foutput);	// 2012.11 KISA 보안조치
			}
		}
		return result;
	}

	/**
	 * InputStream, Reader, Writer close 처리 (finally 부분에서 호출되어야 함).
	 *
	 * @param closable
	 */
	protected static void close(Closeable closable) {
		if (closable != null) {
			try {
				closable.close();
			//2017.02.27 김준호 시큐어코딩(ES)-부적절한 예외 처리[CWE-253, CWE-440, CWE-754]
			} catch (IOException e) {
				//System.out.println("IGNORE: " + ignore);
				LOGGER.error("[IOException] Try/Catch...IOException : " + e.getMessage());
			}catch (Exception e) {
				LOGGER.error("["+e.getClass()+"] Try/Catch...Exception : " + e.getMessage());
			}
		}
	}
}
