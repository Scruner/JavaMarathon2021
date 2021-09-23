package day12.task4;

import java.util.ArrayList;
import java.util.List;

import static day12.task4.MusicBand.transferMembers;

public class Task4 {
  public static void main(String[] args) {
    List<String> membs1 = new ArrayList<>();
    membs1.add("Jon");
    membs1.add("Rick");
    membs1.add("Sam");
    List<String> membs2 = new ArrayList<>();
    membs2.add("Nick");
    membs2.add("Slam");
    membs2.add("Ben");

    MusicBand musBand1 = new MusicBand("Rock Mania", 1994, membs1);
    MusicBand musBand2 = new MusicBand("Gregorian", 2009, membs2);

    musBand1.printMembers();
    musBand2.printMembers();

    transferMembers(musBand1, musBand2);
    musBand1.printMembers();
    musBand2.printMembers();
  }
}
