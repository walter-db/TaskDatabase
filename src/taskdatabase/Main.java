/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package taskdatabase;

/**
 *
 * @author walter
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TaskDatabase db = new TaskDatabase();
        
        db.addTask("Do the dishes");
        db.addCompletedTask("Learn Java");
        
        db.displayAll();

    }
    
}
