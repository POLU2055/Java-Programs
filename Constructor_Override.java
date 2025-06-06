import java.util.Scanner;
class Pet{
    String name;
    public void sound(){
        System.out.println("Animal sounds only");

    }

}
class Dog extends Pet{
    @Override       // overrides sound method
    public void sound(){
        System.out.println(name+ " says : woof ");
    }

}

public class Constructor_Override {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Dog myDog=new Dog();
        System.out.print("Enter dogs name : ");
        myDog.name=sc.nextLine();
        System.out.println("Calling sound of base class");
        myDog.sound();
    }
    
}
