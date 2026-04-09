/*
 * Course: CSC-1120
 * Assignment name
 * File name
 * Name: Sean Jones
 * Last Updated:
 */
package week11;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class HashMapChained<K, V> implements Map<K, V> {
    private static class Entry<K, V> implements Map.Entry<K, V> {
        private final K key;
        private V value;

        private Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return this.key;
        }

        @Override
        public V getValue() {
            return this.value;
        }

        @Override
        public V setValue(V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }
    }

    private static final int INITIAL_CAPACITY = 1024;

    private List<Map.Entry<K, V>>[] entries;
    private int size;

    public HashMapChained() {
        entries = new List[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        int index = findIndex(key);
        if(entries[index] == null){
            return false; // doesn't exist
        }
        for(Map.Entry<K, V> entry : entries[index]){
            if(Objects.equals(entry.getKey(), key)){
                return true;
            }
        }
        return false;
    }

    private int findIndex(Object key) {
        int index = key.hashCode() % entries.length;
        if (index < 0) {
            index += entries.length;
        }
        return index;
    }

    @Override
    public boolean containsValue(Object value) {
        for(List<Map.Entry<K, V>> list: entries){
            if(list != null) {
                for (Map.Entry<K, V> entry : list) {
                    if(Objects.equals(entry.getValue(), value)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        return null;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return Set.of();
    }

    @Override
    public Collection<V> values() {
        return List.of();
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return Set.of();
    }
}
