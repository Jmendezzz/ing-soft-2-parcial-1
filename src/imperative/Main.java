package imperative;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {

    NavigableSet<Person> leaderBoard = new TreeSet<>();

    leaderBoard.add(new Person("John", 16));
    leaderBoard.add(new Person("Juan", 18));
    leaderBoard.add(new Person("José", 15));
    leaderBoard.add(new Person("David", 20));

    int position = leaderBoard.size();
    for (Person person : leaderBoard) {
      System.out.println(position + " - " + person.name);
      position--;
    }
  }
}
