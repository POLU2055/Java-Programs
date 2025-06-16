import java.io.*;
public class BasicFileWrite {
    public static void main(String[] args) {
        try(FileWriter fw=new FileWriter("output.txt")){
            fw.write("Hello\nHiiii\nGood morning!!!");
        }catch(Exception e){
            System.out.println("Error caught!!");
        }
    }
}
