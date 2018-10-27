public class EmptyMap<K, V> implements Map<K, V> {
  public EmptyMap() {}
  public V get(K key) { return null; }
  public Map<K, V> put(K key, V value) {
    return new LinkedMap<K, V>(key, value, this);
  }
  public int size() { return 0; }
  public boolean isEmpty() { return true; }
  public String toString() { return ""; }
}
