package org.example.designpatternsjava.creational.prototype.prototyperegistry;

import java.util.HashMap;
import java.util.Map;

public class CharacterRegistry {

    private   static  final Map<String, GameCharacter> registry = new HashMap<>();
    public static void register(String key, GameCharacter prototype) {
        registry.put(key, prototype);
    }

    public static GameCharacter getClone(String key) {
        GameCharacter prototype = registry.get(key);
        if (prototype == null) {
            throw  new IllegalArgumentException("No prototype found for :");
        }
        return prototype.clone();
    }
}
