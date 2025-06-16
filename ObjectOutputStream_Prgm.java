import java.io.*;
class Person implements Serializable{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age=age;
    }
}


public class ObjectOutputStream_Prgm {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Output.bin"))){
            Person person=new Person("MahaLakshmiiiii",47);
            oos.writeObject(person);    //writing an object 

        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
