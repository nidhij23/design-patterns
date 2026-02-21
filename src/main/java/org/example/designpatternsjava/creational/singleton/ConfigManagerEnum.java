package org.example.designpatternsjava.creational.singleton;

public enum ConfigManagerEnum {
    INSTANCE;
    private String configValue;
    ConfigManagerEnum(){
        System.out.println("Loading confirguarion...");
        configValue = "Database=localhost";
    }

    public String getConfigValue() {
        return configValue;
    }
}
