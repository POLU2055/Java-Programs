import java.io.*;
public class BasicFileRead {
    public static void main(String[] args) {
        try(FileReader fr=new FileReader("input.txt")){
            int charByte;
            while((charByte = fr.read())!=-1){
                System.out.print((char)charByte);
            }

        }catch(Exception e){
            System.out.println("Error caught!!!");
        }
    }
}
