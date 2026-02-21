package org.example.designpatternsjava.creational.prototype.prototyperegistry;

public interface GameCharacter extends Cloneable{
    GameCharacter clone();
    void attack();
}
