public class MapApp {
  public static void main(String[] args) {
    Map<String, Integer> map = new MapC<String, Integer>();
    map.put("Bob", 23);
    map.put("Alice", 34);
    System.out.format("map = %s%n", map);
  }
}
