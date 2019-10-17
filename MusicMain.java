import java.util.ArrayList;

public class MusicMain {

	public static void main(String[] args) {
		ArrayList<Song> songLibrary = new ArrayList<Song>();
		MediaPlayer musicDirectory;

		Song song = new Song("Teriyakiboys", "Wiz Khalifa", 5.17);
		Song song1 = new Song("demo", "ABC", 3.76);

		songLibrary.add(song);
		songLibrary.add(song1);
		
		System.out.println("My Songs : ");
		System.out.println(songLibrary);
		
		musicDirectory = new CdPlayer();
		musicDirectory.powerOn();
		musicDirectory.playMusic(songLibrary);
		musicDirectory.playNextTrack(" 1st track is playing");
		musicDirectory.stop();
		
		System.out.println("*************************************");
		
		musicDirectory = new DvdPlayer();
		musicDirectory.powerOn();
		musicDirectory.playMusic(songLibrary);
		musicDirectory.playNextTrack(" 2nd track is playing");
		musicDirectory.stop();
		
		System.out.println("*************************************");
		
		musicDirectory = new HomeTheater();
		musicDirectory.powerOn();
		musicDirectory.playMusic(songLibrary);
		musicDirectory.playNextTrack(" 3rd track is playing");
		musicDirectory.stop();
		
		System.out.println("*************************************");

	}

}
