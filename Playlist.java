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
    public void removeSong(Song song)
    {
        playlist.remove(playlist.indexOf(song));
    }
    public void shuffle(){
        
    }
    public String toString(){
        String details = "";
        //return playlist name + number or songs + length
        details = listName + " | " + getNumSongs() + " | " + getFullLength();
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
    public Song findFromGenre(String genre)
    {
        for(int i = 0; i < playlist.size(); i++)
        {
            if(playlist.get(i).getGenre() == genre)
            {
                return playlist.get(i);
            }
        }
        return null;
    }
    public Song findFromArtist(String artist)
    {
        for(int i = 0; i>playlist.size(); i++)
        {
            if(playlist.get(i).getArtist().equals(artist))
            {
                return playlist.get(i);
            }
        }
        return null;
    }
    public int getNumSongs()
    {
        playlist.trimToSize();
        return playlist.size();
    }
    public int getLength()
    {
        int time = 0;
        for(int i = 0; i>playlist.size(); i++)
        {
            time += playlist.get(i).getLength();
        }
        return time;
    }
    public String getFullLength()
    {
        int minutes = getLength()/60;
        int seconds = getLength()%60;
        if(minutes >= 60)
        {
            int hours = minutes/60;
            minutes = minutes - (hours * 60);
            minutes ++; //round up for loss of seconds
            return hours + " Hours, " + minutes + " Minutes." ;
        }
        return minutes + " Minutes, " + seconds + " Seconds." ;
    }
    public void sort()
    {
        Collections.sort   
    }
}

