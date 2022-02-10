//Marcelus Brown
//:)
public class Song
{
    private String songName;
    private String artist;
    private int length; //In seconds
    private String genre;
    
    public Song()
    {
        songName = "";
        artist = "";
        length = 0;
        genre = "";
    }
    public Song(String name, String artist, int length, String genre)
    {
        this.songName = name;
        this.artist = artist;
        this.length = length;
        this.genre = genre;
    }
    
    public String getName()
    {
        return songName;
    }
    public String getArtist()
    {
        return artist;
    }
    public String getGenre()
    {
        return genre;
    }
    public int getLength()
    {
        return length;
    }
    
    public String getFullTime()
    {
        int minutes = length/60;
        int seconds = length%60;
        if(seconds < 10)
        {
            return minutes + ":" + "0" + seconds;
        }
        return minutes + ":" + seconds;
    }
    
    public String toString()
    {
        return songName + " - " + artist + " | " + getFullTime();
    }
}

