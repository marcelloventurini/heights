import entities.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many people will participate? ");
        int n = scanner.nextInt();
        Person[] people = new Person[n];
        //Person person;

        for (int i = 0; i < people.length; i++) {
            System.out.println("Enter the data for the participant #" + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();

            scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();

            System.out.print("Height: ");
            double height = scanner.nextDouble();

            people[i] = new Person(name, age, height);
        }

        double sum = 0;
        for (int i = 0; i < people.length; i++) {
            sum += people[i].getHeight();
        }

        double avgHeight = sum / people.length;
        System.out.printf("Average height: %.2f", avgHeight);

        scanner.close();
    }
}
