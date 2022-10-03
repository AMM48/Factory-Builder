package com.mycompany.factorybuilder;

public class App {

  public static void main(String[] args) {
    CharacterFactory factory = new CharacterFactory();
    var knight = factory.createCharacter(CharacterTypes.KNIGHT, "Aragorn");
    System.out.println(knight.toString());

    var archer = factory.createCharacter(CharacterTypes.ARCHER, "Legolas");
    System.out.println(archer.toString());
    
    var flagBearer = factory.createCharacter(CharacterTypes.FLAG_BEARER, "Frodo");
    System.out.println(flagBearer.toString());

  }
}
