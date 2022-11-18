/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.ProjectController;
import controller.TaskController;
import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;

/**
 *
 * @author Leonardo
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        
//        ProjectController projectController = new ProjectController();
//        
//        Project project = new Project();
//        project.setName("Projeto Teste");
//        project.setDescription("description");
//        projectController.save(project);
//        
////        
        TaskController taskController = new TaskController();

        Task task = new Task();
        task.setIdProject(5);
        task.setName("Fazer Devocional");
        task.setDescription("Ler, meditar, orar em um ambiente tranquilo.");
        task.setNotes("Salmos 23 e 139");
        task.setIsCompleted(false);
        task.setDeadLine(new Date());
        
        taskController.save(task);
//        
////        task.setName("Fazer JEJUM DE DANIEL");
////        taskController.update(task);
//        List<Task> tasks = taskController.getAll(5);
//        System.out.println("Total de tarefas " + tasks.size());
        
        
        
        
    }
    
}
