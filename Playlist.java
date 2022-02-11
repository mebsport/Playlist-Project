import java.util.*;
//Marcelus Brown
//:)
public class Playlist
{
    private ArrayList<Song> playlist = new ArrayList<Song>();
    private String listName;
    private Song currentSong;
    private int currentSongIndex =-1;
    
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
    }//adds a song to the playlist array list
    public void removeSong(String song)//removes a song from the arraylist
    {
        for(int i = 0; i < playlist.size(); i++)
        {
            if (playlist.get(i).getName().toLowerCase().equals(song.toLowerCase()))//look for matching song converts to lowercase so it's not picky
            {
                System.out.println(playlist.get(i).toString() + " was removed from your playlist");
                playlist.remove(i);
                break;
            }
        }
    }
    public void shuffle()//shuffles list
    {
        for(int i = 0; i < playlist.size(); i++)
        {
            int randomNum = (int) (Math.random() * playlist.size());
            Song current = playlist.get(i);
            Song swap = playlist.set(randomNum, current);
            playlist.set(i, swap);
        }
    }
    public String toString(){
        String details = "";
        //return playlist name + number of songs + length
        details = listName + " | " + getNumSongs() + " Songs | " + getFullLength() + ".";
        return details;
    }

    //change the currently playing song
    public void updateCurrent(int songIndex){
        currentSong = playlist.get(songIndex);
        currentSongIndex = songIndex;
        nowPlaying();
    }
    public void updateCurrent(String newSong){
        for(Song song : playlist)
        {
            if(song.getName().toLowerCase().equals(newSong.toLowerCase()))
            {
                currentSong = song;
                currentSongIndex = playlist.indexOf(song);
            }
        }
    }

    //get the info on the currently playing song
    public String getCurrentSongInfo()
    {
        return currentSong.toString();        
    }

    //search for song from genre or artist and return it. return null if not found (may cause nullpointerexception if mispelled)
    public Song findFromGenre(String genre)
    {
        for (Song song : playlist) {
            if (song.getGenre().toLowerCase().equals(genre.toLowerCase())) {
                return song;
            }
        }
        return null;
    }
    public Song findFromArtist(String artist)
    {
        for (Song song : playlist) {
            if (song.getArtist().toLowerCase().equals(artist.toLowerCase())) {
                return song;
            }
        }
        return null;
    }

    public int getNumSongs()    //get the number of songs in the playlist
    {
        playlist.trimToSize();
        return playlist.size();
    }
    public int getLength()//get the length of the playlist in seconds
    {
        int time = 0;
        for (Song song : playlist) {
            time += song.getLength();
        }
        return time;
    }
    public String getFullLength()//get the length as a string
    {
        int minutes = getLength()/60;
        int seconds = getLength()%60;
        if(minutes >= 60)
        {
            int hours = minutes/60;
            minutes = minutes - (hours * 60);
            minutes ++; //round up for loss of seconds
            return hours + " Hours, " + minutes + " Minutes" ;
        }
        return minutes + " Minutes, " + seconds + " Seconds" ;
    }

    public void print()//print out the playlist
    {
        System.out.println("Songs in " + listName + ":");
        System.out.println(playlist);
    }

    //change current song
    public void nextSong()//go to next song
    {
        if(currentSongIndex + 1 <= playlist.size())
        {
            updateCurrent(currentSongIndex +1);
        } else{ System.out.println("You are at the end of the playlist");}
    }
    public void prevSong()//go back
    {
        if(currentSongIndex- 1 >= 0)
        {
            updateCurrent(currentSongIndex -1);
        }else{System.out.println("You are at the begining of the playlist");}
    }
    public void nowPlaying()//print out the info on what song is playing
    {
        System.out.print("Now Playing: ");
        System.out.println(getCurrentSongInfo());
    }
    public String getNextSongInfo()//get info on what song is up next
    {
        if(currentSongIndex + 1 > playlist.size())
        {
            return playlist.get(currentSongIndex +1).toString();
        }
        return("end of list");
    }
    public int getSize()//get the amount of songs in the playlist
    {
        return playlist.size();
    }

    //start and restart
    public void start()
    {
        if(currentSongIndex == -1)
        {
            updateCurrent(0);
        }
        nowPlaying();
    }
    public void restart()
    {
        updateCurrent(0);
        nowPlaying();
    }

    //sorting
    public void sort()//sort alphabetically
    {
        ArrayList<String> songNames = new ArrayList<String>();//list of strings for name of songs

        for (Song song : playlist) {
            songNames.add(song.getName());//get the names of each song and add it to the array list
        }

        Collections.sort(songNames);//sort songs by name

        for(int i = 0; i < playlist.size(); i++)
        {
            if (!playlist.get(i).getName().equals(songNames.get(i)))//sync the playlist with the sorted names so it's in order
            {
                playlist.add(playlist.get(i));
                playlist.remove(i);
                i--;
            }
        }
    }
    public void sortByArtist()//sort alphabetically by artist
    {
        ArrayList<String> songArtists = new ArrayList<String>();//list of strings for name of songs

        for (Song song : playlist) {
            songArtists.add(song.getArtist());//get the names of each song and add it to the array list
        }

        Collections.sort(songArtists);//sort songs by name

        for(int i = 0; i < playlist.size(); i++)
        {
            if (!playlist.get(i).getArtist().equals(songArtists.get(i)))//sync the playlist with the sorted names so it's in order
            {
                playlist.add(playlist.get(i));
                playlist.remove(i);
                i--;
            }
        }
    }

    //remove all by artist
    public void removeAllByArtist(String artist)
    {
        for(int i = 0; i < playlist.size(); i++)
        {
            if (playlist.get(i).getArtist().toLowerCase().equals(artist.toLowerCase()))
            {
                System.out.println(playlist.get(i).getArtist() + " - " + playlist.get(i).getName() +" was removed from your playlist");
                playlist.remove(i);
                i--;
            }
        }
    }

    //return the arraylist
    public ArrayList<Song> getPlaylist() {
        return playlist;
    }
    //return the name
    public String getListName(){
        return listName;
    }
}

