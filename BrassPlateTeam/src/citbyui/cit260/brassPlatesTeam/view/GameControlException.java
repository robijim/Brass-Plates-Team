/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.brassPlatesTeam.view;

/**
 *
 * @author camilaortega
 */
public class GameControlException extends Exception{
    public GameControlException(){
    }
    
    public GameControlException(String message){
        super(message);
    }
    
    public GameControlException(String message, Throwable cause){
        super(message, cause);
    }
    
    public GameControlException(Throwable cause){
        super(cause);
    }
}
