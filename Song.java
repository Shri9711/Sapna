
public class Song{
    String songName;
    String singerName;
    double songLength;

    public Song(String songName, String singerName, double songLength) {
        this.songName = songName;
        this.singerName = singerName;
        this.songLength = songLength;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongName() {
        return songName;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public double getSongLength() {
        return songLength;
    }

    public void setSongLength(float songLength) {
        this.songLength = songLength;
    }
    
    @Override
    public String toString() {
    	return "Song name : " + songName + "|" + " Singer : " + singerName + "|" + " song length : " + songLength;
    }
}