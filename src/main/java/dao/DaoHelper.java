package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.transaction.Transactional;

/**
 * Class use to implement generic methods for DAO
 *
 * @author Samuel Saint-Omer
 */
final class DaoHelper {

    private DaoHelper(){
        //Do not instantiate
    }

    /**
     * Get entity from id
     *
     * @param entityClass entity class
     * @param id          entity id
     * @return category entity
     */
    @Transactional
    public static <T> T getById(Class<T> entityClass, int id) {
        try (final Session session = SessionHelper.getSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();
            T entity =  session.get(entityClass, id);
            transaction.commit();
            return entity;
        }
    }

    /**
     * Add entity to database
     *
     * @param entity entity to add
     * @return id of new entity
     */
    @Transactional
    public static <T> int add(T entity) {
        try (final Session session = SessionHelper.getSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();
            int newId = (int) session.save(entity);
            transaction.commit();
            return newId;
        }
    }

    /**
     * Remove entity in database
     *
     * @param entity category to delete
     */
    public static <T> void delete(T entity) {
        try (final Session session = SessionHelper.getSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();
            session.delete(entity);
            transaction.commit();
        }
    }

    /**
     * Update entity in database
     *
     * @param entity entity to update
     */
    public static <T> void update(T entity) {
        try (final Session session = SessionHelper.getSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();
            session.update(entity);
            transaction.commit();
        }
    }
}
