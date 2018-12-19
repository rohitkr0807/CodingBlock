package HashTable;

public class HashTable<K,V> {
    private class HTPair{
        K key;
        V value;
        private HTPair(K key, V value){
            this.key=key;
            this.value=value;
        }
        @Override
        public boolean equals(Object obj){
            HTPair o=(HTPair) obj;
            return this.key.equals(o.key);
        }
    }
}