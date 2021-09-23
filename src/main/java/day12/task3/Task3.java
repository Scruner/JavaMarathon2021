package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
  public static void main(String[] args) {
    List<MusicBand> listBands = new ArrayList<>();
    MusicBand mb1 = new MusicBand("Rock Mania", 1994);
    MusicBand mb2 = new MusicBand("Rock Mafia", 2004);
    MusicBand mb3 = new MusicBand("Roj Bia", 1998);
    MusicBand mb4 = new MusicBand("Fk Ma", 2014);
    MusicBand mb5 = new MusicBand("Rk Mana", 2000);
    MusicBand mb6 = new MusicBand("Sipultura", 2007);
    MusicBand mb7 = new MusicBand("Kreator", 1995);
    MusicBand mb8 = new MusicBand("Bon Jovi", 2010);
    MusicBand mb9 = new MusicBand("Queen", 2017);
    MusicBand mb10 = new MusicBand("Cinema", 2019);
    MusicBand mb11 = new MusicBand("Metallica", 2021);
    listBands.add(mb1);
    listBands.add(mb2);
    listBands.add(mb3);
    listBands.add(mb4);
    listBands.add(mb5);
    listBands.add(mb6);
    listBands.add(mb7);
    listBands.add(mb8);
    listBands.add(mb9);
    listBands.add(mb10);
    listBands.add(mb11);
    Collections.shuffle(listBands);
    System.out.println(listBands);
    System.out.println(groupsAfter2000(listBands));
  }

  public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
    List<MusicBand> result = new ArrayList<>();
    for (MusicBand mb : bands)
      if (mb.getYear() > 2000) {
        result.add(mb);
      }
    return result;
  }
}
