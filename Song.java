/**
 * Marcelus Brown
 * 2/7/21
 */
public class Song
{
    private String songName;
    private String artist;
    private int length;
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
}
