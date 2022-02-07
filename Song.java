/**
 * Marcelus Brown
 * 2/7/21
 */
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
    public Song(String n, String a, int l, String g)
    {
        songName = n;
        artist = a;
        length = l;
        genre = g;
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
        return minutes + ":" + seconds;
    }
    
    public String toString()
    {
        return songName + " - " + artist + " | " + getFullTime();
    }
}

