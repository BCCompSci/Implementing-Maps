public class LinkedMap<K, V> implements Map<K, V> {

  private K key;
  private V value;
  private Map<K, V> next;
  private int N;

  public LinkedMap(K key, V value, Map<K, V> map) {
    this.key = key;
    this.value = value;
    this.next = map;
    this.N = map.size() + 1;
  }

  public V get(K key) {
    return key.equals(this.key) ? value : next.get(key);
  }

  public Map<K, V> put(K key, V value) {
    return new LinkedMap(key, value, this);
  }
  public int size() { return N; }
  public boolean isEmpty() { return false; }
  
  public String toString() {
    String rest = next.toString();
    return String.format("%s +-> %s; %s", key, value, rest);
  }
}
