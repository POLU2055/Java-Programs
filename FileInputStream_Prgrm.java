import java.io.FileInputStream;
import java.io.IOException;
public class FileInputStream_Prgrm{
    public static void main(String[] args) {
        try(FileInputStream fis=new FileInputStream("input.txt")){
            int byteData;
            while((byteData = fis.read())!=-1){
                System.out.print((char)byteData);
            }
        }
    catch(IOException e){
        System.out.println("Exception caught");

    }
    }
}