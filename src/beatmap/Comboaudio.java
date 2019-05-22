package beatmap;

import window.GameView;
import window.GamebgImg;
import audioplay.SEplay;

public class Comboaudio {
	public static void comboaudio(int comb){
		switch(comb)
		{
		case 50:
			SEplay.BgmPlay("audio/voice_50combo_p1.wav");
			break;
		case 100:
			SEplay.sePlay("audio/voice_100combo_p1.wav");
			break;
		case 200:
			SEplay.sePlay("audio/voice_200combo_p1.wav");
			break;
		case 300:
			SEplay.sePlay("audio/voice_300combo_p1.wav");
			break;
		case 400:
			SEplay.sePlay("audio/voice_400combo_p1.wav");
			break;
		case 500:
			SEplay.sePlay("audio/voice_500combo_p1.wav");
			break;
		case 600:
			SEplay.sePlay("audio/voice_600combo_p1.wav");
			break;
		case 700:
			SEplay.sePlay("audio/voice_700combo_p1.wav");
			break;
		case 800:
			SEplay.sePlay("audio/voice_800combo_p1.wav");
			break;			
		}
	}
}
