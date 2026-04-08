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

public class HashMapOpen<K, V> implements Map<K, V> {
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

    private static final int DEFAULT_CAPACITY = 10;
    private static final double LOAD_THRESHOLD = 0.8;

    private Map.Entry<K, V>[] data;
    private int size;

    public HashMapOpen() {
        this.data = new Map.Entry[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        int index = findIndex(key);
        while(this.data[index] != null) {
            if(Objects.equals(key, this.data[index].getKey())) {
                return true;
            }
            index = (index + 1) % data.length;
        }
        return false;
    }

    private int findIndex(Object key) {
        int index = key.hashCode() % data.length;
        if(index < 0) {
            index += data.length;
        }
        return index;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public V get(Object key) {
        int index = findIndex(key);
        while(this.data[index] != null) {
            if(Objects.equals(key, this.data[index].getKey())) {
                return this.data[index].getValue();
            }
            index = (index + 1) % data.length;
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        if((double) this.size / this.data.length >= LOAD_THRESHOLD) {
            // rehash
        }
        int index = findIndex(key);
        while(this.data[index] != null) {
            index = (index + 1) % data.length;
        }
        this.data[index] = new Entry<>(key, value);
        ++this.size;
        return value;
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
