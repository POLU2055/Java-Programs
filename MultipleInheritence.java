import java.util.Scanner;

interface Father{
    void getFatherDetails(Scanner sc);
    void showFatherDetails();
}
interface Mother{
    void getMotherDetails(Scanner sc);
    void showMotherDetails();
}
class Child implements Father,Mother{
    String fatherName, motherName, childName;
    int fatherAge, motherAge, childAge;
    String fatherJob,motherJob,childHobby;
    public void getFatherDetails(Scanner sc){
        System.out.println("Enter father name : ");
        fatherName=sc.nextLine();
        System.out.println("Enter father age : ");
        fatherAge=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter father job : ");
        fatherJob=sc.nextLine();

    }
    public void showFatherDetails(){
        System.out.println("Father : "+fatherName+" | Age : "+fatherAge+" | Job : "+fatherJob);
    }

    public void getMotherDetails(Scanner sc){
        System.out.println("Enter mother name : ");
        motherName=sc.nextLine();
        System.out.println("Enter mother age : ");
        motherAge=sc.nextInt();
        sc.nextLine(); // to avpoid the enter after int as input for job or use parseInt....
        System.out.println("Enter mother job : ");
        motherJob=sc.nextLine();

    }
    public void showMotherDetails(){
        System.out.println("Mother : "+motherName+" | Age : "+motherAge+" | Job : "+motherJob);
    }

    public void getChildDetails(Scanner sc){
        System.out.println("Enter child name : ");
        childName=sc.nextLine();
        System.out.println("Enter child age : ");
        childAge=Integer.parseInt(sc.nextLine());
        System.out.println("Enter child hobby : ");
        childHobby=sc.nextLine();

    }
    public void showChildDetails(){
        System.out.println("Child  : "+childName+" | Age : "+childAge+" | Hobby : "+childHobby);
    }

}

public class MultipleInheritence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Child c = new Child();
        System.out.println("----Enter father details----");
        c.getFatherDetails(sc);
        System.out.println("----Enter mother details----");
        c.getMotherDetails(sc);
        System.out.println("----Enter child details----");
        c.getChildDetails(sc);
        System.out.println("------Family  details-------");
        c.showFatherDetails();
        c.showMotherDetails();
        c.showChildDetails();
    }
}
