import jdk.dynalink.beans.StaticClass;

import java.util.Random;
import java.util.Scanner;

public class HogwartsWizards {
    //name power (double)  health age occupation scanner    static-school=hogwarts  keeper=dragon
    String name;
    double power;
    int health;
    int age;
    String occupation;
    Scanner scanner = new Scanner(System.in);
    static String school = "hogwarts";
    static String keeper = "dragon";

    public String getName() {
        return name;
    }

    public final class goofydoor() {return goofydoor;
    }

    public double getPower() {
        return power;
    }

    public int getHealth() {
        return health;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public static String getSchool() {
        return school;
    }

    public static String getKeeper() {
        return keeper;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            System.out.println("What? dumb dumb you can't have that! *indian accent*");
        }
        this.age = age;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public static void setSchool(String school) {
        HogwartsWizards.school = school;
    }

    public static void setKeeper(String keeper) {
        HogwartsWizards.keeper = keeper;
    }

    public HogwartsWizards(String name, double power, int health, int age, String occupation) {
        this.name = name;
        this.power = power;
        this.health = health;
        this.age = age;
        this.occupation = occupation;

    }

    public HogwartsWizards() {
        Random random = new Random();
        this.name = generateRandomString();
        this.power = random.nextDouble() * 100;
        this.health = random.nextInt(100);
        this.age = random.nextInt(100);
        if (age > 21) {
            this.occupation = "professor";
        } else {
            this.occupation = "student";
        }
        ;
    }

    public String generateRandomString() {
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder st = new StringBuilder(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            char c = chars[random.nextInt(chars.length)];
            st.append(c);
        }
        return st.toString();
    }

    public void printWizard() {
        Random random = new Random();
        System.out.println("Name: " + name);
        System.out.println("Power: " + power);
        System.out.println("Health: " + health);
        System.out.println("Age: " + age);
        System.out.println("Occupation: " + occupation);
    }
}
        // FIXME: 25.02.2023
// (maybe)
// One more thing is this