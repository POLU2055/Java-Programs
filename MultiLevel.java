import java.util.Scanner;

class Animal{       //super class
    String name;
    void details(Scanner sc){
        System.out.print("Enter the Animal : ");
        name=sc.nextLine();
    }
    void showAnimal(){
        System.out.println("Animal : "+name);
    }
}

class Mammal extends Animal{    //derived class levels
    String type;
    void mammaltype(Scanner sc){
            System.out.print("Enter the Type : ");
            type=sc.nextLine();
    }
    void showMammal(){
        System.out.println("Mammal type : "+type);
    }
}

class Dog extends Mammal{
    String breed;
    void breedDetails(Scanner sc){
        System.out.print("Enter the Dog breed : ");
            breed=sc.nextLine();
    }
    void showDog(){
        System.out.println("Dog breed : "+breed);
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Dog mydog = new Dog();
        mydog.details(sc);
        mydog.mammaltype(sc);
        mydog.breedDetails(sc);
        System.out.println("\n---------My Dog----------\n");
        mydog.showAnimal();
        mydog.showMammal();
        mydog.showDog();
        sc.close();
    }
}
