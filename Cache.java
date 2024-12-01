import java.util.HashMap;

public class Cache<T> {
    private HashMap<String, T> cache = new HashMap<>();

    public void add(String key, T value) {
        cache.put(key, value);
    }

    public T get(String key) {
        return cache.get(key);
    }

    public void clear() {
        cache.clear();
    }

    public void addAll(Cache<? super T> otherCache) {
        for (String key : cache.keySet()) {
            otherCache.add(key, cache.get(key));
        }
    }
}
