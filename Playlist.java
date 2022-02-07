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
    private int currentSongIndex;
    
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
    
    public void addSong(Song song)
    {
        playlist.add(song);
    }
    public void removeSong()
    {
        
    }
    public void shuffle(){
        
    }
    public String toString(){
        String details = "";
        //return playlist name + number or songs + length
        return details;
    }
    public void updateCurrent(int songIndex){
        currentSong = playlist.get(songIndex);
        currentSongIndex = songIndex;
    }
    public String getCurrentSongInfo()
    {
        return currentSong.toString();        
    }
    public String getNextSongInfo()
    {
        return playlist.get(currentSongIndex +1).toString(); 
    }
    public Song findFromGenre()
    {
    
    }
    public Song findFromArtist()
    {
    
    }
    public int getNumSongs()
    {
        
    }
    public int getLength()
    {
        
    }
    public void sort()
    {
        
    }
}

