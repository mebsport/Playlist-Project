import java.util.*;
//Marcelus Brown
//:)
public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist("super duper amazing playlist");
        playlist.addSong(new Song("Movie", "Rio Da Yung Og", 209, "Hip-Hop/Rap"));
        playlist.addSong(new Song("Lean Chronicles", "Rio Da Yung Og", 139, "Hip-Hop/Rap"));
        playlist.addSong(new Song("pushin P", "Gunna & Future", 136, "Hip-Hop/Rap"));
        playlist.addSong(new Song("$200 Haircuts", "Rio Da Yung Og", 151, "Hip-Hop/Rap"));
        playlist.addSong(new Song("Ready", "Lil Baby", 213, "Hip-Hop/Rap"));
        playlist.addSong(new Song("L.A. Vibe", "King Lil G", 223, "Hip-Hop/Rap"));
        playlist.addSong(new Song("Poke It Out", "Wale", 208, "Hip-Hop/Rap"));
        playlist.addSong(new Song("Know Like I Know", "YoungBoy Never Broke Again", 232, "Hip-Hop/Rap"));
        playlist.addSong(new Song("Who Want Smoke??", "Nardo Wick", 279, "Hip-Hop/Rap"));
        playlist.addSong(new Song("trademark usa", "Baby Keem", 279, "Hip-Hop/Rap"));
        playlist.addSong(new Song("Shotta Flow", "NLE Choppa", 176, "Hip-Hop/Rap"));
        playlist.addSong(new Song("Right Foot Creep", "YoungBoy Never Broke Again", 159, "Hip-Hop/Rap"));
        playlist.addSong(new Song("Take On the World (Theme Song from \"Girl Meets World\")", "Rowan Blanchard & Sabrina Carpenter", 192, "Soundtrack"));
        playlist.addSong(new Song("DNA.", "Kendrick Lamar", 185, "Hip-Hop/Rap"));
        playlist.addSong(new Song("HUMBLE", "Kendrick Lamar", 177, "Hip-Hop/Rap"));
        playlist.addSong(new Song("Opps", "JayDaYoungan & Yungeen Ace", 222, "Hip-Hop/Rap"));
        playlist.addSong(new Song("Fame & Riches", "Polo G", 309, "Hip-Hop/Rap"));
        playlist.addSong(new Song("A$AP Forever", "A$AP Rocky", 233, "Hip-Hop/Rap"));
        playlist.addSong(new Song("Wyclef Jean", "Young Thug", 236, "Hip-Hop/Rap"));
        playlist.addSong(new Song("Ain't Like No Other", "3Breezy", 220, "Hip-Hop/Rap"));
        playlist.addSong(new Song("Mob Ties", "Drake", 205, "Hip-Hop/Rap"));
        playlist.addSong(new Song("Started From the Bottom", "Drake", 173, "Hip-Hop/Rap"));
        playlist.addSong(new Song("The Way Life Goes", "Lil Uzi Vert", 268, "Hip-Hop/Rap"));
        playlist.addSong(new Song("Headlines", "Drake", 235, "Hip-Hop/Rap"));
        playlist.addSong(new Song("Dreams and Nightmares", "Meek Mill", 230, "Hip-Hop/Rap"));
        playlist.addSong(new Song("2055", "Sleepy Hallow", 123, "Hip-Hop/Rap"));
        playlist.addSong(new Song("Breakin Bad", "Rio Da Yung Og", 131, "Hip-Hop/Rap"));
        playlist.addSong(new Song("Tip Toe", "Sheff G & Sleepy Hallow", 181, "Hip-Hop/Rap"));
        playlist.addSong(new Song("Luv Is Art", "A Boogie wit da Hoodie", 161, "Hip-Hop/Rap"));
        playlist.addSong(new Song("Going Bad", "Meek Mill", 180, "Hip-Hop/Rap"));
        playlist.addSong(new Song("She Will", "Lil Wayne", 305, "Hip-Hop/Rap"));
        playlist.addSong(new Song("Web Dev Anthem", "lil Looskie", 231, "Country"));
        playlist.addSong(new Song("looskie loves peanut butter", "lil Looskie", 192, "Country"));
        playlist.addSong(new Song("coding jam", "lil Looskie", 291, "Country"));
        playlist.addSong(new Song("looskie the king", "lil Looskie", 271, "Country"));
        playlist.addSong(new Song("nathans song", "KING NATHAN", 622, "Pop"));
//        playlist.addSong(new Song("name", "artist", 309, "genre")); add new song template


        playlist.print();
        playlist.start();
        playlist.shuffle();
        playlist.print();
        playlist.nowPlaying();
        playlist.nextSong();
        playlist.nextSong();
        System.out.println("Sorted List");
        playlist.sort();
        playlist.print();
        System.out.println("Next up song is: " + playlist.getNextSongInfo());
        playlist.nextSong();
        playlist.removeSong("Opps");
        System.out.println(playlist.toString());
        System.out.println("There is one song in this playlist from a movie soundtrack: " + playlist.findFromGenre("Soundtrack").toString());
        playlist.removeSong(playlist.findFromGenre("Soundtrack").getName());
        playlist.removeAllByArtist("lil looskie");
        System.out.println(playlist.toString());
        playlist.shuffle();
        playlist.restart();
        System.out.print("Nathan has one song in this playlist: ");
        System.out.println(playlist.findFromArtist("King Nathan").toString());
        System.out.println("There are " + playlist.getSize() + " songs in your playlist.");
        System.out.println("Your playlist is " +  playlist.getFullLength() + " long.");
        playlist.shuffle();
        playlist.sortByArtist();
        System.out.println("playlist sorted by artist name a-z: " + playlist.getPlaylist());
        playlist.restart();
        System.out.println("the name of this playlist is " + playlist.getListName());
        playlist.updateCurrent(5);
        playlist.prevSong();
        playlist.updateCurrent("Headlines");
        System.out.println("Testing Done :)");
        playlist.sortByLength();
        playlist.printQueue();
        System.out.println();

        Playlist list = new Playlist("DA BEST PLAYLIST");
        list.addSong(new Song("Web Dev Anthem", "lil Looskie", 231, "Country"));
        list.addSong(new Song("looskie loves peanut butter", "lil Looskie", 192, "Country"));
        list.addSong(new Song("coding jam", "lil Looskie", 291, "Country"));
        list.addSong(new Song("looskie the king", "lil Looskie", 271, "Country"));
        list.addSong(new Song("nathans song", "KING NATHAN", 622, "Pop"));
        list.addSong(new Song("Teacher Jams", "Mr. G", 321, "Pop"));
        list.addSong(new Song("Rolling In Money", "Mar$", 281, "Classical"));
        list.addSong(new Song("fornite in class", "looskie", 238, "Jazz"));
        list.addSong(new Song("DeBop", "Lil Lumps", 120, "Country"));
        list.addSong(new Song("father", "exercise miracle", 120, "Hip-Hop/Rap"));
//        list.addSong(new Song("name", "artist", 309, "genre")); add new song template

        playlist.toggleLoop();
        playlist.printQueue();
        playlist.addList(list);
        playlist.changeName("CODING JAMS TO LISTEN TO WHILE CODING");
        playlist.print();
    }
}
