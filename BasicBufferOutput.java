import java.io.*;
public class BasicBufferOutput {
    public static void main(String[] args) {
        try(BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("output.txt"))){
            String data="Hello\nGood morning\nHave a great day!!!";
            bos.write(data.getBytes());
        }catch(IOException e){
            e.getStackTrace();
        }
    }
}
