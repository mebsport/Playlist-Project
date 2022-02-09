import java.util.*;
public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist("super duper amazing playlist");
        playlist.addSong(new Song("Movie", "Rio Da Yung Og", 209, "Hip-Hop/Rap"));
        playlist.addSong(new Song("Lean Chronicles", "Rio Da Yung Og", 139, "Hip-Hop/Rap"));
        playlist.addSong(new Song("pushin P", "Gunna", 136, "Hip-Hop/Rap"));
        playlist.addSong(new Song("$200 Haircuts", "Rio Da Yung Og", 151, "Hip-Hop/Rap"));
        playlist.addSong(new Song("Ready", "Lil Baby", 213, "Hip-Hop/Rap"));
        playlist.addSong(new Song("L.A. Vibe", "King Lil G", 223, "Hip-Hop/Rap"));
        playlist.addSong(new Song("Poke It Out", "Wale", 208, "Hip-Hop/Rap"));
        playlist.addSong(new Song("Know Like I Know", "YoungBoy Never Broke Again", 232, "Hip-Hop/Rap"));
//        playlist.addSong(new Song("Movie", "Rio Da Yung Og", 309, "Hip-Hop/Rap"));
//        playlist.addSong(new Song("Movie", "Rio Da Yung Og", 309, "Hip-Hop/Rap"));
//        playlist.addSong(new Song("Movie", "Rio Da Yung Og", 309, "Hip-Hop/Rap"));
//        playlist.addSong(new Song("Movie", "Rio Da Yung Og", 309, "Hip-Hop/Rap"));
//        playlist.addSong(new Song("Movie", "Rio Da Yung Og", 309, "Hip-Hop/Rap"));
//        playlist.addSong(new Song("Movie", "Rio Da Yung Og", 309, "Hip-Hop/Rap"));
//        playlist.addSong(new Song("Movie", "Rio Da Yung Og", 309, "Hip-Hop/Rap"));
//        playlist.addSong(new Song("Movie", "Rio Da Yung Og", 309, "Hip-Hop/Rap"));
//        playlist.addSong(new Song("Movie", "Rio Da Yung Og", 309, "Hip-Hop/Rap"));
//        playlist.addSong(new Song("Movie", "Rio Da Yung Og", 309, "Hip-Hop/Rap"));
//        playlist.addSong(new Song("Movie", "Rio Da Yung Og", 309, "Hip-Hop/Rap"));
//        playlist.addSong(new Song("Movie", "Rio Da Yung Og", 309, "Hip-Hop/Rap"));
//        playlist.addSong(new Song("Movie", "Rio Da Yung Og", 309, "Hip-Hop/Rap"));
//        playlist.addSong(new Song("Movie", "Rio Da Yung Og", 309, "Hip-Hop/Rap"));
//        playlist.addSong(new Song("Movie", "Rio Da Yung Og", 309, "Hip-Hop/Rap"));
//        playlist.addSong(new Song("Movie", "Rio Da Yung Og", 309, "Hip-Hop/Rap"));
//        playlist.addSong(new Song("Movie", "Rio Da Yung Og", 309, "Hip-Hop/Rap"));
//        playlist.addSong(new Song("Movie", "Rio Da Yung Og", 309, "Hip-Hop/Rap"));
//        playlist.addSong(new Song("Movie", "Rio Da Yung Og", 309, "Hip-Hop/Rap"));
//        playlist.addSong(new Song("Movie", "Rio Da Yung Og", 309, "Hip-Hop/Rap"));
//        playlist.addSong(new Song("Movie", "Rio Da Yung Og", 309, "Hip-Hop/Rap"));
//        playlist.addSong(new Song("Movie", "Rio Da Yung Og", 309, "Hip-Hop/Rap"));
//        playlist.addSong(new Song("Movie", "Rio Da Yung Og", 309, "Hip-Hop/Rap"));
//        playlist.addSong(new Song("Movie", "Rio Da Yung Og", 309, "Hip-Hop/Rap"));
        playlist.print();
        playlist.start();
        playlist.shuffle();
        playlist.print();
        playlist.nowPlaying();
        playlist.nextSong();
        playlist.nextSong();
        playlist.sort();
        playlist.print();
    }
}
