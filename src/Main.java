import java.util.ArrayList;
import java.util.List;

public class MyDictionary<K, V> {
    private List<Pair<K, V>> entries;


    public MyDictionary() {
        entries = new ArrayList<>();
    }


    public void add(K key, V value) {
        Pair<K, V> pair = new Pair<>(key, value);
        entries.add(pair);
    }


    public Pair<K, V> get(int index) {
        return entries.get(index);
    }


    public int size() {
        return entries.size();
    }


    private static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}
