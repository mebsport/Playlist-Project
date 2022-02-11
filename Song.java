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
    }//returns the song name
    public String getArtist()
    {
        return artist;
    }//returns the name of the artist
    public String getGenre()
    {
        return genre;
    }//returns the genre of the song
    public int getLength()
    {
        return length;
    }//returns the length of the song in seconds
    
    public String getFullTime()//returns the time as a string in the format mintues:seconds
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

