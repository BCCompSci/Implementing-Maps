public interface Map<K, V> {
  V get(K key);
  Map<K, V> put(K key, V value);
  int size();
  boolean isEmpty();
  String toString();
}
