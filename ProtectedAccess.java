import java.util.Scanner;

class Person{
    protected String name;
    protected void setName(String name){
        this.name=name;
    }
    protected void displayName(){
        System.out.println("Name : "+name);
    }
}

class Boy extends Person{
    protected float height;
    protected void setHeight(float height){
        this.height=height;
    }
    protected void displayDetails(){
        displayName();
        System.out.println("Height : "+height);
    }
}

public class ProtectedAccess {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the name : ");
        String name=sc.nextLine();
        System.out.print("Enter the height : ");
        float height=sc.nextFloat();
        Boy b=new Boy();
        b.setName(name);
        b.setHeight(height);
        System.out.println("\n-----Person Details----\n");
        b.displayDetails();
        sc.close();
    }
}
