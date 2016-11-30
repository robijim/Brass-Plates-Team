/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.brassPlatesTeam.exceptions;

/**
 *
 * @author JosephKH
 */
public class MenuControlException extends Exception {

    public MenuControlException() {
    }

    public MenuControlException(String string) {
        super(string);
    }

    public MenuControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public MenuControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public MenuControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
