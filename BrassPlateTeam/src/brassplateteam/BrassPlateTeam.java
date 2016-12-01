/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brassplateteam;

import byui.cit260.brassPlatesTeam.model.Game;
import byui.cit260.brassPlatesTeam.model.Player;
import citbyui.cit260.brassPlatesTeam.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*import byui.cit260.brassPlatesTeam.model.Game;
import byui.cit260.brassPlatesTeam.model.Inventory;
import byui.cit260.brassPlatesTeam.model.Item;
import byui.cit260.brassPlatesTeam.model.LocationTypeScene;
import byui.cit260.brassPlatesTeam.model.ResourceTypeScene;
import byui.cit260.brassPlatesTeam.model.Scene;
import byui.cit260.brassPlatesTeam.model.Player;
import byui.cit260.brassPlatesTeam.model.Actor;
import byui.cit260.brassPlatesTeam.model.Map;*/

/**
 *
 * @author JosephKH
 */
public class BrassPlateTeam {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    public static void main(String[] args) {
        
        try {
            BrassPlateTeam.inFile = 
                    new BufferedReader (new InputStreamReader(System.in));
            BrassPlateTeam.outFile = new PrintWriter (System.out, true);
            
            //open log file
            String filePath = "log.txt";
            BrassPlateTeam.logFile = new PrintWriter(filePath);
            
            //Create StartProgramViewOrig and display the start program view
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display(); 
        } catch (Throwable e){
            System.out.println("Exception: " + e.toString() + 
                                "\nCause: " + e.getCause() +
                                "\nMessage: " + e.getMessage());
            e.printStackTrace();;
        } finally {
            try {
                if (BrassPlateTeam.inFile != null)
                    BrassPlateTeam.inFile.close();
                
                if (BrassPlateTeam.outFile != null)
                    BrassPlateTeam.outFile.close();
                
                if (BrassPlateTeam.logFile != null)
                    BrassPlateTeam.logFile.close();
                
            } catch (IOException ex) {
                System.out.println("Error closing the files");
                return;
            }
        }
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        BrassPlateTeam.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        BrassPlateTeam.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        BrassPlateTeam.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        BrassPlateTeam.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        BrassPlateTeam.logFile = logFile;
    }
  
}
