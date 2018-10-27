public class MapApp {
  public static void main(String[] args) {

    Map<String, Integer>
      m0 = new EmptyMap<String, Integer>(),
      m1 = new LinkedMap<String, Integer>("Bob", 23, m0),
      m2 = new LinkedMap<String, Integer>("Alice", 34, m1);
      System.out.format("m2 = %s%n", m2);
  }
}
