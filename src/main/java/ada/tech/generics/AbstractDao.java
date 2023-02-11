package ada.tech.generics;

import java.util.List;

public class AbstractDao<T, K> implements Dao<T, K> {

    private final Repository<T,K> repository;

    public AbstractDao(Repository<T, K> repository) {
        this.repository = repository;
    }

    @Override
    public T create(T entity) {
        return repository.create(entity);
    }

    @Override
    public T update(T entity) {
        return repository.update(entity);
    }

    @Override
    public T findById(K id) {
        return repository.findById(id);
    }

    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public boolean delete(K id) {
        return false;
    }

    // Repository<T> repository;

}
