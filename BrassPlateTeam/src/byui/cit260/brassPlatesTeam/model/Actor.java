/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.brassPlatesTeam.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

public enum Actor implements Serializable {
    
    Lehi("He is the prophet and leader of the family."),
    Nephi("Son of Lehi, and obedient son."),
    Sam("Son of Lehi, and faithful brother of Nephi."),
    Laman("Oldest son of Lehi, complainer, and not a faithful brother or son."),
    Lemuel("Sam and Nephi's 2nd oldest brother, not faithful, and follows Laman's lead."),
    Laban("Keeper and protector of the Brass Plates."),
    Zoram("Laban's servant in the treasury, and eventually a faithful friend to Nephi and his family.");
    
    private final String description;
    private final Point coordinates;

    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }
}

