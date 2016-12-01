/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.brassPlatesTeam.view;

import brassplateteam.BrassPlateTeam;
import java.io.PrintWriter;

/**
 *
 * @author camilaortega
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = BrassPlateTeam.getOutFile();
    private static final PrintWriter logFile = BrassPlateTeam.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                            "-------------------------------------------------"
                          + "\n- Error - " + errorMessage
                          + "\n-----------------------------------------------");
        logFile.println(className + " - " + errorMessage);
    }
    
    
}
