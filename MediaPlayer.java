import java.util.ArrayList;

public interface MediaPlayer {
	
	boolean powerOn();
	void addMusic(String songName, String singer, float songLength);
	void playMusic(ArrayList<Song> songs);
	void playNextTrack(String nextTrack);
	boolean isPlaying();
	void stop();

}
