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
    public void shuffle()
    {
        for(int i = 0; i < playlist.size(); i++)
        {
            int randomNum = (int) (Math.random() * playlist.size());
            Song current = playlist.get(i);
            Song random = playlist.set(randomNum, current);
            playlist.set(i, random);
        }
    }
    public String toString(){
        String details = "";
        //return playlist name + number or songs + length
        details = listName + " | " + getNumSongs() + " Songs | " + getFullLength() + ".";
        return details;
    }
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
    public String getCurrentSongInfo()
    {
        return currentSong.toString();        
    }

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
    public int getNumSongs()
    {
        playlist.trimToSize();
        return playlist.size();
    }
    public int getLength()
    {
        int time = 0;
        for (Song song : playlist) {
            time += song.getLength();
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
            return hours + " Hours, " + minutes + " Minutes" ;
        }
        return minutes + " Minutes, " + seconds + " Seconds" ;
    }

    public void print()
    {
        System.out.println("Songs in " + listName + ":");
        System.out.println(playlist);
    }

    //change current song
    public void nextSong()
    {
        if(currentSongIndex + 1 <= playlist.size())
        {
            updateCurrent(currentSongIndex +1);
        } else{ System.out.println("You are at the end of the playlist");}
    }
    public void prevSong()
    {
        if(currentSongIndex- 1 >= 0)
        {
            updateCurrent(currentSongIndex -1);
        }else{System.out.println("You are at the begining of the playlist");}
    }
    public void nowPlaying()
    {
        System.out.print("Now Playing: ");
        System.out.println(getCurrentSongInfo());
    }
    public String getNextSongInfo()
    {
        if(currentSongIndex + 1 > playlist.size())
        {
            return playlist.get(currentSongIndex +1).toString();
        }
        return("end of list");
    }
    public int getSize()
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
    public void sort()
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
    public void sortByArtist()
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

    public ArrayList<Song> getPlaylist() {
        return playlist;
    }
    public String getListName(){
        return listName;
    }

//    public void playSongByIndex(int index){
//        updateCurrent(index);
//        nowPlaying();
//    }
//    public void playSong(String song)
//    {
//
//    }
}

