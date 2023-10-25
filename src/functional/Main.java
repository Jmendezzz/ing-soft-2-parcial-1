package functional;

import imperative.Person;

import java.util.List;
import java.util.function.Predicate;

public class Main {
  public static void main(String[] args) {

    List<Person> leaderBoard = List.of(
        new Person("John", 16),
        new Person("Juan", 18),
        new Person("José", 15),
        new Person("David", 20)
    );

    List<Person> peopleWithMoreThan17Points = leaderBoard.stream()
                                                          .filter(isGreaterThan(17))
                                                          .toList();

    Integer totalPoints = leaderBoard.stream()
                                      .map(person -> person.points)
                                      .reduce(0, Integer::sum);

    List<String> participantNames = leaderBoard.stream()
                                                .map(person -> person.name)
                                                .toList();

    List<Person> peopleNamesStartWithJ = leaderBoard.stream()
                                                    .filter(person -> person.name.startsWith("J"))
                                                    .toList();

  }

  public static Predicate<Person> isGreaterThan(int points) {
    return person -> person.points > points;
  }
}
