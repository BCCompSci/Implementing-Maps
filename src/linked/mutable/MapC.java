public class MapC<K, V> implements Map<K, V> {
  private int N;
  private Node root;
  private class Node {
    K key;
    V value;
    Node next;
    private Node(K key, V value, Node next) {
      this.key = key;
      this.value = value;
      this.next = next;
    }
  }
  public MapC() {
    root = null;
    N = 0;
  }
  public V get(K key) {
    if (root == null)
      throw new java.util.NoSuchElementException("No");
    Node p = root;
    while (p != null)
      if (key.equals(p.key))
        return p.value;
      else
        p = p.next;
    throw new java.util.NoSuchElementException("No2");
   }
  public void put(K key, V value) {
    root = new Node(key, value, root);
    N++;
  }
  public int size() { return N; }
  public boolean isEmpty() { return N == 0; }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    Node p = root;
    while (p != null) {
      sb.append(String.format("%s -> %s; ", p.key, p.value));
      p = p.next;
    }
    return sb.toString();
  }
}
