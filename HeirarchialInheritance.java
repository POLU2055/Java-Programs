
import java.util.Scanner;
class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Cat is meowing");
    }
}
//cat and dog  make different sounds but common is eating..

public class HeirarchialInheritance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Dog d= new Dog();
        d.eat(); //inhertied method
        d.bark(); // self method
        Cat c=new Cat();
        c.eat();// inherited method
        c.meow();// self method

    }
}
