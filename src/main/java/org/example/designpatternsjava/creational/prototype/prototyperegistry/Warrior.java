package org.example.designpatternsjava.creational.prototype.prototyperegistry;

public class Warrior implements GameCharacter{
    private String weapon;
    private int health;

    public Warrior(String weapon, int health) {
        this.weapon = weapon;
        this.health = health;
    }

    @Override
    public GameCharacter clone() {
       try {
           return (GameCharacter) super.clone();
       } catch (CloneNotSupportedException e) {
           throw new RuntimeException();
       }
    }

    @Override
    public void attack() {
        System.out.println("Warrior attacks with " + weapon);
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
