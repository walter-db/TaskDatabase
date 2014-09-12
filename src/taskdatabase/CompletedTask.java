package taskdatabase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author walter
 */
public class CompletedTask extends Task {
    
    CompletedTask (String title){
        this.statusIcon="X";
        this.title = title;
    }
}
