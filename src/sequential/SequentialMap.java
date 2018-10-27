import java.util.*;

public class SequentialMap<K, V> implements Map<K, V> {

  private K[] keys;
  private V[] values;
  private int N;

  public SequentialMap() {
    keys = (K[]) new Object[100];
    values = (V[]) new Object[100];
    N = 0;
  }

  public V get(K key) {
    for (int i = 0; i < N; i++)
      if (keys[i].equals(key)) return values[i];
    return null;
  }

  public void put(K key, V value) {
    for (int i = 0; i < N; i++)
      if (keys[i] != null & keys[i].equals(key)) {
        values[i] = value;
        return;
      }
    keys[N] = key;
    values[N++] = value;
  }

  public int size() { return N; }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < N; i++)
      sb.append(String.format("%s -> %s; ", keys[i], values[i]));
    return sb.toString();
  }
  public boolean isEmpty() { return N == 0; }

  public static void main(String[] args) {
    Map<String, Integer> map = new SequentialMap();
    map.put("Bob", 34);
    map.put("Mary", 36);
    System.out.format("map = %s%n", map.toString());
  }
}
