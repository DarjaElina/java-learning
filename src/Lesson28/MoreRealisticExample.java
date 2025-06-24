package Lesson28;

import java.io.*;

public class MoreRealisticExample {}

class AppConfigLoader {
    public void loadConfig() throws FileNotFoundException {
        try {
            File f = new File("config.txt");
            FileInputStream fis = new FileInputStream(f);
            // Imagine loading the config here...
            System.out.println("Config loaded successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("[LOG] Config file not found. Attempting to fall back...");
            // Partial handling: we log the error
            // but we don’t know how to proceed, so we rethrow
            throw e;
        } finally {
            System.out.println("Cleanup or logging in finally.");
        }
    }

    public void startApplication() {
        try {
            loadConfig();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Could not start app. Please provide a valid config file.");
            // Now we fully handle it: maybe use defaults or exit the app.
        } finally {
            System.out.println("Application startup phase done (even if failed).");
        }
    }

    public static void main(String[] args) {
        new AppConfigLoader().startApplication();
    }
}
