package org.example.designpatternsjava.structural.flyweight;

public class CharacterImpl implements  CharacterFlyweight{
    private char character;

    public CharacterImpl(char character){
        this.character=character;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Character: " + character+ " at position ("+x+","+y+")");
    }
}
