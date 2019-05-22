package beatmap;
import window.GameView;
public class Beatcheck {
	static int aim = 419,smallC = 41,bigC = 69,missC = 90,p1 = 358,p2 = 475,g1 = 320,g2 = 503,m1 = 291,m2 = 510;
	public static boolean d=false,f=false,j=false,k=false;
	public static boolean CheckM(Note note){
		int notex = note.x+69;
		if((notex>m1&&notex<m2)&&(d||f||j||k)){
			return true;
		}
		else{
			return false;
		}
	}
	public static void Check(Note note){
		int notex = note.x+69;	
		if(notex>p1&&notex<p2){
			if((note.type==1&&(f||j))||(note.type==3&&f&&!j)||(note.type==3&&j&&!f)||(note.type==2&&(d||k))||
					(note.type==4&&d&&!k)||(note.type==4&&k&&!d)){
				GameView.prefect++;
				GameView.hit=7;
				GameView.scrint+=490;
				GameView.hitscr=490;
				GameView.combo+=1;
				Comboaudio.comboaudio(GameView.combo);
			}
			if(note.type==3&&(f&&j)||note.type==4&&(d&&k)){
				GameView.prefect++;
				GameView.hit=7;
				GameView.scrint+=980;
				GameView.hitscr=980;
				GameView.combo+=1;
				Comboaudio.comboaudio(GameView.combo);
			}
			if((note.type==1&&(d||k))||(note.type==3&&(d||k))||(note.type==2&&(f||j))||(note.type==4&&(f||j))){
				GameView.miss++;
				GameView.hit__=7;
				GameView.combo=0;
			}
		}else if(notex>g1&&notex<g2){
			if((note.type==1&&(f||j))||(note.type==3&&f&&!j)||(note.type==3&&j&&!f)||(note.type==2&&(d||k))||
					(note.type==4&&d&&!k)||(note.type==4&&k&&!d)){
				GameView.good++;
				GameView.hit_=7;
				GameView.scrint+=240;
				GameView.hitscr=240;
				GameView.combo+=1;
				Comboaudio.comboaudio(GameView.combo);
			}
			if(note.type==3&&(f&&j)||note.type==4&&(d&&k)){
				GameView.good++;
				GameView.hit_=7;
				GameView.scrint+=480;
				GameView.hitscr=480;
				GameView.combo+=1;
				Comboaudio.comboaudio(GameView.combo);
			}
			if((note.type==1&&(d||k))||(note.type==3&&(d||k))||(note.type==2&&(f||j))||(note.type==4&&(f||j))){
				GameView.miss++;
				GameView.hit__=7;
				GameView.combo=0;
			}			
		}else if(notex>m1&&notex<m2){
			if(d||f||j||k){
				GameView.miss++;
				GameView.hit__=7;
				GameView.combo=0;
			}	
		}
	}
}
