package dao;

import entity.E_Competence;

import java.util.Optional;

/**
 * Competence data access object<br>
 * Use to create, retrieve, update, delete competence.
 *
 * @author Samuel Saint-Omer
 */
public class CompetenceDAO implements Dao<E_Competence> {

    /**
     * Get competence from id
     *
     * @param competenceId competenceId id
     * @return competence entity
     */
    @Override
    public Optional<E_Competence> getById(int competenceId) {
        return Optional.ofNullable(DaoHelper.getById(E_Competence.class, competenceId));
    }

    /**
     * Add category to database
     *
     * @param entity entity to add
     * @return id of new category
     */
    @Override
    public int add(E_Competence entity) {
        return DaoHelper.add(entity);
    }

    /**
     * Remove competence in database
     *
     * @param entity category to delete
     */
    @Override
    public void delete(E_Competence entity) {
        DaoHelper.delete(entity);
    }

    /**
     * Update competence in database
     *
     * @param entity category to update
     */
    @Override
    public void update(E_Competence entity) {
        DaoHelper.update(entity);
    }
}
