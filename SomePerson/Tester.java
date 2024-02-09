package SomePerson;
import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Name person : ");
        String name = kb.next();
        System.out.print("Age : ");
        int age = kb.nextInt();
        Person p1 = new Person(name, age);
        System.out.println("Person name : " + p1.getName());
        System.out.print("Things name : ");
        String nameObj = kb.next();
        System.out.print("How to use : ");
        String HowToUse = kb.nextLine();
        Things things = new Things(nameObj, HowToUse);
        System.out.println("Things name : " + things.getName());
        System.out.print("Animal name : ");
        String nameAnimal = kb.next();
        System.out.print("Type : ");
        String type = kb.next();
        Animal a1 = new Animal(nameAnimal, type);
        System.out.println("Animal name : " + a1.getName());
    }
}
