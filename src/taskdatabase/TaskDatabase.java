package taskdatabase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.LinkedList;

/**
 *
 * @author walter
 */
public class TaskDatabase {
    LinkedList<Task> tasks = new LinkedList<Task>();
                
    void addTask(String title) {
        Task task = new IncompletedTask(title);
        tasks.add(task);
    }
              
    void addCompletedTask(String title) {
        Task task = new CompletedTask(title);
        tasks.add(task);
        
        
    }
    
    void displayAll() {
        for (Task task: tasks) {
            task.display();
        }
    }
}
