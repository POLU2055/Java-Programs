import java.io.*;
public class FileOutputStream_Prgrm {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("output.txt")){
            String data="Good Morning!!\nHave a great day!!!";
            fos.write(data.getBytes());

        }catch(IOException e){
            e.getStackTrace();
            
        }
    }
    
}
