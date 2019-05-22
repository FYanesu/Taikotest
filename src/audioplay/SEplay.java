package audioplay;

import java.io.FileInputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;



public class SEplay{
	public static ContinuousAudioDataStream bgm;
	public static AudioStream Bgm;
	
	public static void sePlay(String se_name) {
		try {
			FileInputStream fileau=new FileInputStream(se_name);
			AudioStream as=new AudioStream(fileau);
			AudioPlayer.player.start(as);
			}
			catch (Exception e) {}
	}
	public static void BgmPlay(String bgm_name){
		try {
			FileInputStream fileau=new FileInputStream(bgm_name);
			Bgm=new AudioStream(fileau);
			AudioPlayer.player.start(Bgm);
			}
			catch (Exception e) {}
	}
	public static void BGMStop() {

		AudioPlayer.player.stop(Bgm);
	}

	

}
