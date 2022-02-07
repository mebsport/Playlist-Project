import java.util.*;
/**
 * Marcelus Brown
 * 2/7/21
 */
public class Playlist
{
    private ArrayList<Song> playlist = new ArrayList<Song>();
    private String listName;
    private Song currentSong;
    
    public Playlist()
    {
        listName = "New Playlist";
    }
    public Playlist(String name)
    {
        listName = name;
    }
    public Playlist(String name,Song firstSong)
    {
        listName = name;
        playlist.add(firstSong);
    }
    
}
