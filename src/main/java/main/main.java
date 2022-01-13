package main;

import dao.CategoryDAO;
import dao.CompetenceDAO;
import entity.E_Categorie;
import entity.E_Competence;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class main {

    public static void etape4(){
        CategoryDAO dao = new CategoryDAO();
        int catId = dao.add(new E_Categorie("new category"));
        System.out.println("New Cat id : "+catId);
        E_Categorie cat = dao.getById(catId).get();
        System.out.println("New Cat : "+cat);
        dao.delete(cat);
        System.out.println(cat);
    }

    public static void etape5(){
        CompetenceDAO competenceDAO = new CompetenceDAO();
        CategoryDAO categoryDAO = new CategoryDAO();
        // Creation
        E_Categorie cat = newCategoryWithName("cat1");
        List<E_Competence> competences = new ArrayList<>();
        competences.add(newCompetenceWithNameAndCategory("comp1",cat));
        competences.add(newCompetenceWithNameAndCategory("comp2",cat));
        competences.add(newCompetenceWithNameAndCategory("comp3",cat));
        // Print
        competences.forEach(comp -> System.out.println(comp));
        // Deletion (to avoid conflict on rerun)
        competences.forEach(comp -> competenceDAO.delete(comp));
        categoryDAO.delete(cat);
    }


    public static E_Categorie newCategoryWithName(String name){
        CategoryDAO categoryDAO = new CategoryDAO();
        E_Categorie entity = new E_Categorie();
        entity.setCategorie(name);
        int newId = categoryDAO.add(entity);
        return  categoryDAO.getById(newId).orElseThrow(NoSuchElementException::new);
    }

    public static E_Competence newCompetenceWithNameAndCategory(String name,E_Categorie cat){
        CompetenceDAO CompetenceDAO = new CompetenceDAO();
        E_Competence entity = new E_Competence();
        entity.setCompetence(name);
        entity.setCategorie(cat);
        int newId = CompetenceDAO.add(entity);
        return  CompetenceDAO.getById(newId).orElseThrow(NoSuchElementException::new);
    }
    

    public static void main(final String[] args) {

        CompetenceDAO competenceDAO = new CompetenceDAO();
        CategoryDAO categoryDAO = new CategoryDAO();
        // Creation
        E_Categorie cat = newCategoryWithName("cat1");
        cat.setCategorie("cat1_update");
        categoryDAO.update(cat);
        categoryDAO.delete(cat);





    }
}