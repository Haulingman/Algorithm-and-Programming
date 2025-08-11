import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zodiacexperiment {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Zodiac[] zodiacs = initializeZodiacs();
        String prophecyFileName = "ZodiacProphecies.txt";
        String userProphecyFileName = "UserProphecies.txt";

        Map<String, String> userProphecies = loadUserPropheciesFromFile(userProphecyFileName);

        do {
            System.out.println("========== Welcome to Zodiac Fortune Teller ==========");
            System.out.print("Enter your birthdate (MM/DD): ");
            String birthdate = scan.nextLine();

            Zodiac userZodiac = determineZodiac(birthdate, zodiacs);
            displayZodiacInfo(userZodiac);
            displayProphecy(userZodiac, prophecyFileName, userProphecies);

            System.out.println("Do you want to create your own prophecy for this zodiac? (yes/no): ");
            String createProphecyChoice = scan.nextLine();
            if (createProphecyChoice.equalsIgnoreCase("yes")) {
                createAndSaveUserProphecy(userZodiac.getName(), userProphecyFileName, userProphecies);
            }

            System.out.print("Do you want another prophecy? (yes/no): ");
        } while (scan.nextLine().equalsIgnoreCase("yes"));

        System.out.println("Thank you for using Zodiac Fortune Teller. Goodbye!");
    }

    public static Zodiac[] initializeZodiacs() {
        return null;
        // ... (unchanged)
    }

    public static Zodiac determineZodiac(String birthdate, Zodiac[] zodiacs) {
        return null;
        // ... (unchanged)
    }

    public static void displayZodiacInfo(Zodiac zodiac) {
        // ... (unchanged)
    }

    public static void displayProphecy(Zodiac zodiac, String prophecyFileName, Map<String, String> userProphecies) {
        String prophecy = loadProphecyFromFile(zodiac.getName(), prophecyFileName, userProphecies);
        System.out.println("Prophecy: " + prophecy);
    }

    public static String loadProphecyFromFile(String zodiacName, String prophecyFileName, Map<String, String> userProphecies) {
        // Load the prophecies from the file
        Map<String, String> prophecies = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(prophecyFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                prophecies.put(parts[0].trim(), parts[1].trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Combine the prophecies, giving priority to user-defined prophecies
        String userProphecy = userProphecies.get(zodiacName.toLowerCase());
        if (userProphecy != null) {
            return userProphecy;
        } else {
            return prophecies.getOrDefault(zodiacName.toLowerCase(), "No prophecy available.");
        }
    }

    public static Map<String, String> loadUserPropheciesFromFile(String userProphecyFileName) {
        Map<String, String> userProphecies = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(userProphecyFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                userProphecies.put(parts[0].trim(), parts[1].trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userProphecies;
    }

    public static void createAndSaveUserProphecy(String zodiacName, String userProphecyFileName, Map<String, String> userProphecies) {
        System.out.print("Enter your own prophecy for " + zodiacName + ": ");
        String userProphecy = scan.nextLine();

        userProphecies.put(zodiacName.toLowerCase(), userProphecy);

        // Save the user-defined prophecies to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(userProphecyFileName))) {
            for (Map.Entry<String, String> entry : userProphecies.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Your prophecy has been saved!");
    }
}

class Zodiac {

    public String getName() {
        return null;
    }
    // ... (unchanged)
}