package ada.tech.generics;

import java.util.List;

public interface Dao<T, K> {

    T create(T entity);
    T update(T entity);
    T findById(K id);
    List<T> findAll();
    boolean delete(K id);

}
