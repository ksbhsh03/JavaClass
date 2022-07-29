package Tv;

public class ds222222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  CaptionTv ctv = new CaptionTv();
          ctv.channel = 10;
          ctv.channelUp();
          System.out.println(ctv.channel);
          ctv.displayCaption("Hello world");
          ctv.caption = true;
          ctv.displayCaption("Hello world");
	}

}
