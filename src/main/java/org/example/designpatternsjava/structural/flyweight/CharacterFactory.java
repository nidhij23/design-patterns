package org.example.designpatternsjava.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static final Map<Character, CharacterFlyweight> characters = new HashMap<>();

    public static CharacterFlyweight getCharacter(char c) {
        if (!characters.containsKey(c)) {
            characters.put(c, new CharacterImpl(c));
        }
        return characters.get(c);
    }
}
