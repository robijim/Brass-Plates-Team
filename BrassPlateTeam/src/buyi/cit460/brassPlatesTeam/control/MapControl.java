/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit460.brassPlatesTeam.control;

import byui.cit260.brassPlatesTeam.model.Map;
import byui.cit260.brassPlatesTeam.model.Scene;
import java.util.Set;

/**
 *
 * @author camilaortega
 */
public class MapControl {

    private static String False;

    public static void moveActorsToStartingLocation(Map map) {
        System.out.println("\n***called moveActorsToStartingLocation() in MapControl***");
    }

    public static Map createMap() {
        
        //create a new map
        Map map = new Map(20, 20);
        
        //create scene
        Scene[] scene = createScenes();
        
        //assign scenes to locations
        GameControl.assignScenesToLocations(map, scene);
        
        return map;
    }

    private static Scene[] createScenes() {
        Scene[] scene = new Scene[SceneType.values().length];
        Scene startingScene = new Scene();
        startingScene.setDescription(
                  "\tAnd it came to pass that I, Nephi, returned from speaking "
                + "\nwith the Lord, to the tent of my father.And it came to "
                + "\npass that he spake unto me, saying: Behold I have dreamed,"
                + "\na dream, in the which the Lord hath commanded me that thou"
                + "\nand thy brethren shall return to Jerusalem."
                + "\n"
                + "\n\tFor behold, Laban hath the record of the Jews and also a"
                + "\ngenealogy of my forefathers, and they are engraven upon"
                + "\nplates of brass."
                + "\n"
                + "\n\tWherefore, the Lord hath commanded me that thou and thy"
                + "\nbrothers should go unto the house of Laban, and seek the"
                + "\nrecords, and bring them down hither into the wilderness."
                + "\n\tAnd now, behold thy brothers murmur, saying it is a hard "
                + "\nthing which I have required of them; but behold I have not"
                + "\nrequired it of them, but it is a commandment of the Lord."
                + "\n"
                + "\n\tTherefore go, my son, and thou shalt be favord of the Lord,"
                + "\nbecause thou hast not murmured."
                + "\n");
        startingScene.setMapSymbol(" ST ");
        startingScene.setBlockedLocation(false);
        startingScene.setTravelTime(240);
        scene[SceneType.start.ordinal()] = startingScene;
        
        Scene desertScene = new Scene();
        desertScene.setDescription(
                  "\nwill go and do the things which the Lord has commanded, for I"
                + "\n\tAnd it came to pass that I, Nephi, said unto my father: I"
                + "\n know that the Lord giveth no commandments unto the children"
                + "\nof men, save he shall prepare a way for them that they may"
                + "\naccomplish the thing which he commandeth them."
                + "\n"
                + "\n\tAnd I, Nephi, and my brethren took our journey in the"
                + "\nwilderness, with our tents, to go up to the land of Jerusalem.");
        desertScene.setMapSymbol( " DS ");
        desertScene.setBlockedLocation(false);
        desertScene.setTravelTime(120);
        scene[SceneType.desert.ordinal()] = desertScene;
        
        Scene cityGateScene = new Scene();
        cityGateScene.setDescription(
                  "\n\tAnd it came to pass that when we had gone up to the land "
                + "\nJerusalem, I and my brethren did consult one with another."
                + "\nAnd we cast lots--who of us should go in unto the house "
                + "\nof Laban.");
        cityGateScene.setMapSymbol(" CG ");
        cityGateScene.setBlockedLocation(false);
        cityGateScene.setTravelTime(15);
        scene[SceneType.cityGate.ordinal()] = cityGateScene;
        
        Scene labansHouse1Scene = new Scene();
        labansHouse1Scene.setDescription(
                  "\n\tAnd it came to pass that the lot fell upon Laman; and "
                + "\nLaman went in unto the house of Laban, and he talked "
                + "\nwith him as he sat in his house."
                + "\n"
                + "\n\tAnd he desired of Laban the records which were engraven"
                + "\nupon the plates of brass, which contained the genealogy"
                + "\nof my father."
                + "\n"
                + "\n\tAnd behold, it came to pass that Laban was angry, and "
                + "\nthrust him out from his presence; and he would not "
                + "\nthat he should have the records. Wherefore, he said unto"
                + "\nhim: Behold thou art a robber, and I will slay thee."
                + "\nBut Laman fled out of his presence, and told the things "
                + "\nwhich Laban had don, unto us.");
        labansHouse1Scene.setMapSymbol(" LH1 ");
        labansHouse1Scene.setBlockedLocation(false);
        labansHouse1Scene.setTravelTime(15);
        scene[SceneType.labansHouse1.ordinal()] = labansHouse1Scene;
        
        Scene resourceScene = new Scene();
        resourceScene.setDescription(
                  "\n\t...and my brethren were about to return unto my "
                + "\nfather in the wilderness. But behold I said unto them"
                + "\nthat: As the Lord liveth, and as we live, we will not"
                + "go down unto our father in the wilderness until we "
                + "have accomplished the thing which the Lord hath "
                + "\ncommanded us."
                + "\n"
                + "\n...therefore let us go down to the land of our "
                + "\nfather's inheritance, for behold he left gold and "
                + "\nsilver, and all manner of riches...behold, it is "
                + "wisdom in God that we should obtain these records,"
                + "that we may preserve unto our children the language "
                + "of our fathers; and also that we may preserve unto them"
                + "the words which have been spoken by the mouth of all the"
                + "\nholy prophets...even down unto this present time.");
        resourceScene.setMapSymbol(" RS ");
        resourceScene.setBlockedLocation(false);
        resourceScene.setTravelTime(30);
        scene[SceneType.resource.ordinal()] = resourceScene;
        
        Scene labansHouse2Scene = new Scene();
        labansHouse2Scene.setDescription(
                  "\n\tAnd after we had gathered these things together, "
                + "\nwe went up again unto the house of Laban."
                + "\n"
                + "\n\tAnd it came to pass that we went in unto Laban, and"
                + "\ndesired him that he would give unto us the records "
                + "\nwhich were engraven upon the plates of brass, for which"
                + "\nwe would give unto him our gold, and our silver, and"
                + "\nall our precious things."
                + "\n"
                + "\n\tAnd it came to pass that when Laban saw our property,"
                + "\nand that it was exceedingly great, he did lust after"
                + "\nit, insomuch that he thrust us out, and sent his servants"
                + "\nto slay us, that he might obtain our property."
                + "\nAnd it came to pass that we did flee before the servants"
                + "\nof Laban, and we were obliged to leave behind our"
                + "\nproperty.");
        labansHouse2Scene.setMapSymbol(" LH2 ");
        labansHouse2Scene.setBlockedLocation(false);
        labansHouse2Scene.setTravelTime(15);
        scene[SceneType.labansHouse2.ordinal()] = labansHouse2Scene;

        Scene armorScene = new Scene();
        armorScene.setDescription(
                  "\n\tI Nephi, crept into the city and went forth towards"
                + "\nthe house of Laban. And I was led by the Spirit, not "
                + "\nknowing beforehand the things which I should do."
                + "\n"
                + "\n\t...and as I came near unto the house of Laban I "
                + "\nbeheld a man, and he had fallen to the earth before me,"
                + "\nfor he was drunken with wine. And when I came to him"
                + "\nI found that it was Laban."
                + "\n"
                + "\n\tAnd i beheld his sword, and I drew it forth from "
                + "\nthe sheath thereof; and the hilt thereof was of pure gold,"
                + "\nand the workmanship thereof was exceedingly fine, and I"
                + "\nsaw that the blade thereof was of the most precious steel."
                + "\n"
                + "\n\tAnd it came to pass that I was constrained by the Spirit"
                + "\nthat I should kill Laban...And I shrunk and would that "
                + "\nI might not slay him. And the Spirit said unto me again:"
                + "\nBehold the Lord hath delivered him into thy hands..."
                + "\n...I did obey...and I smote off his head with his own"
                + "\nsword.");
        armorScene.setMapSymbol(" AS ");
        armorScene.setBlockedLocation(false);
        armorScene.setTravelTime(30);
        scene[SceneType.armor.ordinal()] = armorScene;
        
        Scene treasuryScene = new Scene();
        treasuryScene.setDescription(
                  "\n\tAs I went forth towards the treasury of Laban, "
                + "\nbehold, I saw the servant of Laban who had the keys "
                + "\nof the treasury. And I commanded him in the voice of "
                + "\nLaban, that he should go with me into the treasury"
                + "\n"
                + "\n\tAnd he supposed me to be his master, Laban... "
                + "\n...And I spake unto him that I should carry the "
                + "\nengravings, which were upon the plates of brass, to"
                + "\nmy elder brethren, who were without the walls."
                + "\nAnd I also bade him that he should follow me. And he"
                + "\nsupposing that I spake of the brethren of the church"
                + "\nand that I was truly that Laban whom I had slain, "
                + "\nwherefore he did follow me.");
        treasuryScene.setMapSymbol(" TS ");
        treasuryScene.setBlockedLocation(false);
        treasuryScene.setTravelTime(30);
        scene[SceneType.treasury.ordinal()] = treasuryScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
                  "\n\tAnd it came to pass that we took the plates of"
                + "\nbrass and the servant of Laban, and departed into the "
                + "\nwilderness, and journeyed unto the tent of our father."
                + "\n"
                + "\n\tAnd it came to pass that after we had come down unto "
                + "\nthe wilderness unto our father, behold, he was filled "
                + "\nwith joy, and also my mother, Sariah, was exceedingly"
                + "\nglad, for she truly had mourned because of us."
                + "\n\tAnd when we had returned to the tent of my father, "
                + "\nbehold their joy was full, and my mother was comforted."
                + "\nAnd she spake, saying: Now I know of a surety that"
                + "\nthe Lord hath commanded my husband to flee into the "
                + "\nwilderness; and I also know of a surety that the Lord "
                + "\nhath protected my sons, and delivered them out of the"
                + "\nhands of Laban, and given them power whereby they could"
                + "accomplish the thing which the Lord hath commanded them.");
        finishScene.setMapSymbol(" FS ");
        finishScene.setBlockedLocation(false);
        finishScene.setTravelTime(120);
        scene[SceneType.finish.ordinal()] = finishScene;
        
            return scene;
    }

    public static String getMapSymbol() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }
