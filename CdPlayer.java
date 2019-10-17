import java.util.ArrayList;
import java.util.Scanner;

public class CdPlayer implements MediaPlayer {

	Scanner scanner = new Scanner(System.in);

	@Override
	public boolean powerOn() {
		
		System.out.println("CD Player is On");
		return true;
	}


	@Override
	public void playMusic(ArrayList<Song> songsLibrary) {
		System.out.println("Press 1 to play song");
		int play = scanner.nextInt();
		int i = 0;
		while(play == 1 || play == 1) {
			System.out.println("Playing : " + songsLibrary.get(i).songName);
			i++;
			System.out.println("Press 1 to play next song or 2 to stop playing");
			play = scanner.nextInt();
			if (i == songsLibrary.size()) {
				System.out.println("All songs are played!");
				break;
			}
		}
		System.out.println("Exiting the Music Library");
	}

	@Override
	public void playNextTrack(String nextTrack) {
		
		System.out.println(">>||" + nextTrack + " on CD Player");
		
	}

	@Override
	public boolean isPlaying() {
		return isPlaying();
	}

	@Override
	public void stop() {
		
		System.out.println("The music track has stopped ");
		}


	@Override
	public void addMusic(String songName, String singer, float songLength) {
		// TODO Auto-generated method stub
		
	}

}
