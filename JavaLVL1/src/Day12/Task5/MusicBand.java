package Day12.Task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }
    public void printMembers(){
        System.out.println(this.members);
    }

    @Override
    public String toString() {
        return "Название группы: " + name  +  "; Год основания: " + year;
    }
    public static void transferMembers(MusicBand bandA, MusicBand bandB){
        for (MusicArtist member : bandA.getMembers()) {
            bandB.getMembers().add(member);
        }
        bandA.getMembers().clear();
    }
}
