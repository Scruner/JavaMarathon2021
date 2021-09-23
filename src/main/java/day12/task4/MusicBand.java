package day12.task4;

import java.util.List;

public class MusicBand {
  private String name;
  private int year;
  private final List<String> members;

  public MusicBand(String name, int year, List<String> members) {
    this.name = name;
    this.year = year;
    this.members = members;
  }

  public List<String> getMembers() {
    return members;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
    musicBand2.members.addAll(musicBand1.members);
    musicBand1.members.clear();
  }

  public void printMembers() {
    System.out.println(this.members);
  }

  @Override
  public String toString() {
    return "MusicBand{"
        + "name='"
        + name
        + '\''
        + ", year="
        + year
        + ", musicians="
        + members
        + '}';
  }
}
