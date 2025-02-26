package com.aurionpro.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class IdManager {
	private static final String FILE_NAME = "C:\\Users\\Akshat.Pandey\\Desktop\\akJava\\InventoryApp\\src\\ids.properties";
	private static Properties properties = new Properties();
	
	static {
        loadProperties();
    }

    private static void loadProperties() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            try {
            	file.createNewFile();
            }catch(IOException e) {
            	System.out.println("Error: " + e.getMessage());
            }
        }
        
        try (FileInputStream fis = new FileInputStream(file)) {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveProperties() {
        try (FileOutputStream fos = new FileOutputStream(FILE_NAME)) {
            properties.store(fos, "ID Tracking");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getNextId(String type) {
        int nextId = Integer.parseInt(properties.getProperty(type, getDefaultId(type)));
        properties.setProperty(type, String.valueOf(nextId + 1));
        saveProperties();
        return nextId;
    }

    public static void updateLastId(String type, int id) {
        int currentMax = Integer.parseInt(properties.getProperty(type, getDefaultId(type)));
        if (id >= currentMax) {
            properties.setProperty(type, String.valueOf(id + 1));
            saveProperties();
        }
    }

    private static String getDefaultId(String type) {
        switch (type) {
            case "product": return "1000";
            case "supplier": return "5000";
            case "transaction": return "8000";
            default: return "1";
        }
    }
}

