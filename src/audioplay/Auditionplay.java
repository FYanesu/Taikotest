package audioplay;

public class Auditionplay {
		public static void auditionplay(int x,int y){
			SEplay.BGMStop();
			switch(x){
			case 12:
				switch(y){
				case 181:
					SEplay.BgmPlay("audio/����_.wav");
					break;
				case 291:
					SEplay.BgmPlay("audio/����_.wav");
					break;
				case 401:
					SEplay.BgmPlay("audio/����_.wav");
					break;
				}
			break;
			case 632:
				switch(y){
				case 181:
					SEplay.BgmPlay("audio/�ɱ�_.wav");
					break;
				case 291:
					SEplay.BgmPlay("audio/����_.wav");
					break;
				case 401:
					SEplay.BgmPlay("audio/����_.wav");
					break;
				}
			break;
			}	
		}
		public static int song(int x,int y){
			int song = 1;
			switch(x){
			case 12:
				switch(y){
				case 181:
					song=1;
					break;
				case 291:
					song=2;
					break;
				case 401:
					song=3;
					break;
				}
			break;
			case 632:
				switch(y){
				case 181:
					song=4;
					break;
				case 291:
					song=5;
					break;
				case 401:
					song=6;
					break;
				}
			break;
			}
			return song;
		}
		public static void songplay(int son){
			switch(son){
			case 1:
				SEplay.BgmPlay("audio/����.wav");
			break;
			case 2:
				SEplay.BgmPlay("audio/����.wav");
			break;
			case 3:
				SEplay.BgmPlay("audio/����.wav");
				break;
			case 4:
				SEplay.BgmPlay("audio/�ɱ�.wav");
				break;
			case 5:
				SEplay.BgmPlay("audio/����.wav");
				break;
			case 6:
				SEplay.BgmPlay("audio/����.wav");
				break;
				
			}
		}
}
