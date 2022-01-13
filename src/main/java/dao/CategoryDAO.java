package dao;

import entity.E_Categorie;

import java.util.Optional;

/**
 * Category data access object<br>
 * Use to create, retrieve, update, delete category.
 *
 * @author Samuel Saint-Omer
 */
public class CategoryDAO implements Dao<E_Categorie> {

    /**
     * Get category from id
     *
     * @param categoryId category id
     * @return category entity
     */
    @Override
    public Optional<E_Categorie> getById(int categoryId) {
        return Optional.ofNullable(DaoHelper.getById(E_Categorie.class, categoryId));
    }

    /**
     * Add category to database
     *
     * @param entity category name to add
     * @return id of new category
     */
    @Override
    public int add(E_Categorie entity) {
        return DaoHelper.add(entity);
    }

    /**
     * Remove category in database
     *
     * @param entity category to delete
     */
    @Override
    public void delete(E_Categorie entity) {
        DaoHelper.delete(entity);
    }

    /**
     * Update category in database
     *
     * @param entity category to update
     */
    @Override
    public void update(E_Categorie entity) {
        DaoHelper.update(entity);
    }

}
