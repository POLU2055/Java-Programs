import java.io.*;
class Person implements Serializable{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age=age;
    }
    @Override
    public String toString(){
        return "Person(name= " +name+", age "+age+")";
    }
}


public class ObjectInputStream_Prgm {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Output.bin"))){
            Person person=new Person("Maha",47);
            oos.writeObject(person);    //writing an object 

        }catch(IOException e){
            e.printStackTrace();
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Output.bin"))){
           Person person = (Person) ois.readObject(); 
           System.out.println(person);

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
