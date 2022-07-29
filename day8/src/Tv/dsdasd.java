package Tv;


	class dsdasd {
		boolean power;
		int channel;
		void Power() {power = !power;}
		
		void channelUp() {++channel;}
		
		void channelDown() {--channel;}
		
	}

		class CaptionTv extends dsdasd{
			boolean caption;
			void  displayCaption(String text) {
				if(caption) {
					System.out.println(text);
				}
			}
		}

