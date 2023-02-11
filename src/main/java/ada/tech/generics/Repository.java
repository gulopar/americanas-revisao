package ada.tech.generics;

import java.util.ArrayList;
import java.util.List;

public class Repository<T, K> {

    public T create(T entity) {
        return entity;
    }

    public T update(T entity) {
        return entity;
    }

    public T findById(K id) {
        return null;
    }
    public List<T> findAll() {
        return new ArrayList<>();
    }
    public boolean delete(K id) {
        return true;
    }

}
