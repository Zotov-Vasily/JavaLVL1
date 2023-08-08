package Day12.Task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> teamA = new ArrayList<>();
        teamA.add("Daniil Svetlov");
        teamA.add("Denis Zhivotovsky");
        teamA.add("Ilya Borisov");
        MusicBand bandA = new MusicBand("Amatory", 2014, teamA);

        List<String> teamB = new ArrayList<>();
        teamB.add("Taras Umansky");
        teamB.add("Denis Kichenko");
        teamB.add("Grigory Karpov");
        MusicBand bandB = new MusicBand("Stigmata", 2003, teamB);

        bandA.printMembers();
        bandB.printMembers();

        MusicBand.transferMembers(bandA, bandB);
        bandA.printMembers();
        bandB.printMembers();
    }
}
