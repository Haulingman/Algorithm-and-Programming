import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Zodiac {
    private String name;
    private int age;
    private int birthDate;
    private int birthMonth;
    private String element;
    private String character;

    public Zodiac(String name, int age, int birthDate, int birthMonth, String element, String character) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.birthMonth = birthMonth;
        this.element = element;
        this.character = character;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public String getElement() {
        return element;
    }

    public String getCharacter() {
        return character;
    }

    public void displayZodiacInfo() {
        System.out.println("Zodiac Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Date of Birth: " + getBirthDate() + "/" + getBirthMonth());
        System.out.println("Element: " + getElement());
        System.out.println("Character: " + getCharacter());
    }
}

public class ProjectZodiak {
    private ArrayList<Zodiac> zodiacList;
    private Scanner scanner;

    public ProjectZodiak() {
        zodiacList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addZodiac(Zodiac zodiac) {
        zodiacList.add(zodiac);
    }

    public void displayZodiacs() {
        for (Zodiac zodiac : zodiacList) {
            zodiac.displayZodiacInfo();
            System.out.println();
        }
    }

    public void searchZodiac(String name) {
        boolean found = false;
        for (Zodiac zodiac : zodiacList) {
            if (zodiac.getName().equalsIgnoreCase(name)) {
                zodiac.displayZodiacInfo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Zodiac not found");
        }
    }

    public void deleteZodiac(String name) {
        Zodiac zodiacToRemove = null;
        for (Zodiac zodiac : zodiacList) {
            if (zodiac.getName().equalsIgnoreCase(name)) {
                zodiacToRemove = zodiac;
                break;
            }
        }
        if (zodiacToRemove != null) {
            zodiacList.remove(zodiacToRemove);
            System.out.println("Zodiac deleted successfully");
        } else {
            System.out.println("Zodiac not found");
        }
    }

    public void sortZodiacs() {
        Collections.sort(zodiacList, Comparator.comparing(Zodiac::getName));
    }

    public void performOperations() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Zodiac");
            System.out.println("2. Display Zodiacs");
            System.out.println("3. Search Zodiac");
            System.out.println("4. Delete Zodiac");
            System.out.println("5. Sort Zodiacs");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Zodiac Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter Birth Date: ");
                    int date = scanner.nextInt();
                    System.out.print("Enter Birth Month: ");
                    int month = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter Element: ");
                    String element = scanner.nextLine();
                    System.out.print("Enter Character: ");
                    String character = scanner.nextLine();

                    Zodiac newZodiac = new Zodiac(name, age, date, month, element, character);
                    addZodiac(newZodiac);
                    break;
                case 2:
                    displayZodiacs();
                    break;
                case 3:
                    System.out.print("Enter Zodiac Name to Search: ");
                    String searchName = scanner.nextLine();
                    searchZodiac(searchName);
                    break;
                case 4:
                    System.out.print("Enter Zodiac Name to Delete: ");
                    String deleteName = scanner.nextLine();
                    deleteZodiac(deleteName);
                    break;
                case 5:
                    sortZodiacs();
                    System.out.println("Zodiacs sorted by name");
                    break;
                case 6:
                    scanner.close();
                    System.out.println("Exiting Program...");
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        ProjectZodiak zodiacSigns = new ProjectZodiak();
        zodiacSigns.performOperations();
    }
}
