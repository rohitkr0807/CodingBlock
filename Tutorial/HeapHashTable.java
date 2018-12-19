package Tutorial;

public class HeapHashTable<K,V> {
    private class HTNode implements Comparable<HTNode>{
        K key;
        V value;

        public HTNode(K key, V value) {
            this.key = key;
            this.value = value;
        }
        @Override
        public boolean equals(Object obj){
            HTNode otherNode= (HTNode) obj;
            return this.key.equals(otherNode.key);
        }

        @Override
        public int compareTo(HTNode o) {
            return 0;
        }

        public void main(){

        }
    }
}
