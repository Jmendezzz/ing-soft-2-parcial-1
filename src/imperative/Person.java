package imperative;

public class Person implements Comparable<Person>{

  public String name;
  public Integer points;

  public Person(String name, Integer points) {
    this.name = name;
    this.points = points;
  }

  @Override
  public int compareTo(Person o) {
    return this.points-o.points;
  }
}
