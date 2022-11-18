/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TodoApp;

import controller.ProjectController;
import model.Project;

/**
 *
 * @author Leonardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        project.setName("Projeto Teste");
        project.setDescription("description");
        projectController.save(project);
        
       // project.setName("Novo nome do projeto");
        //projectController.update(project);
        
        //List<Project> projects = projectController.getAll();
        //System.out.println("Total de projetos = " + projects.size());
        
        
        
    }
    
}
