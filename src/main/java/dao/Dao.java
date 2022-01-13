package dao;

import java.util.Optional;

/**
 *  Interface use in DAO because dao should implement CRUD methods <br>
 *  CRUD = Create , Retrieve, Update, Delete
 *
 * @author Samuel Saint-Omer
 */
public interface Dao<T> {

    Optional<T> getById(int id);

    int add(T entity);

    void delete(T entity);

    void update (T entity);

}
