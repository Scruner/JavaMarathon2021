package day12.task5;

import java.util.ArrayList;
import java.util.List;

import static day12.task5.MusicBand.transferMembers;

public class Task5 {
  public static void main(String[] args) {
    List<MusicArtist> membs1 = new ArrayList<>();
    membs1.add(new MusicArtist("Jon", 34));
    membs1.add(new MusicArtist("Rick", 23));
    membs1.add(new MusicArtist("Sam", 27));
    List<MusicArtist> membs2 = new ArrayList<>();
    membs2.add(new MusicArtist("Nick", 35));
    membs2.add(new MusicArtist("Slam", 89));
    membs2.add(new MusicArtist("Ben", 45));

    MusicBand musBand1 = new MusicBand("Rock Mania", 1994, membs1);
    MusicBand musBand2 = new MusicBand("Gregorian", 2009, membs2);

    musBand1.printMembers();
    musBand2.printMembers();

    transferMembers(musBand1, musBand2);
    musBand1.printMembers();
    musBand2.printMembers();
  }
}
