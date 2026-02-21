package org.example.designpatternsjava.creational.singleton;

public class ConfigManager {
    private static volatile ConfigManager instance;
//    private String configValue;

    private ConfigManager(){
        System.out.println("Loading confirguarion...");
//        this.configValue = "Database=localhost";
    }

    public static ConfigManager getInstance() {
        if(instance == null){
            synchronized (ConfigManager.class) {
                if(instance == null){
                    instance = new ConfigManager();
                }
            }
        }
        return instance;
    }

//    public String getConfigValue() {
//        return configValue;
//    }
}
