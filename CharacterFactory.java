
package com.mycompany.factorybuilder;


public class CharacterFactory {

    // TODO: Add a factory method that returns an object (Archer, FlagBearer, or Knight) by its name:
    public static Characters createCharacter(CharacterTypes type, String name){
        if (type.equals(type.ARCHER)){
            return new Archer(name);
        }
        
        else if (type.equals(type.FLAG_BEARER)){
            return new FlagBearer(name);
        }

        else if (type.equals(type.KNIGHT)){
            return new Knight(name);
        }

        return null;
    }
}
