package Day12.Task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> membersA = new ArrayList<>();
        membersA.add(new MusicArtist("Bob", 24));
        membersA.add(new MusicArtist("Bill", 23));
        membersA.add(new MusicArtist("Guf", 30));
        MusicBand bandA = new MusicBand("Lilies of the valley", 2022, membersA);

        List<MusicArtist> membersB = new ArrayList<>();
        membersB.add(new MusicArtist("Jony", 22));
        membersB.add(new MusicArtist("Basta", 33));
        membersB.add(new MusicArtist("Kasta", 34));
        MusicBand bandB = new MusicBand("Tulips", 2023, membersB);


        bandA.printMembers();
        bandB.printMembers();

        MusicBand.transferMembers(bandA, bandB);
        bandA.printMembers();
        bandB.printMembers();


    }
}
