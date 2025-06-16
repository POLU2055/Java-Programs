import java.io.*;
public class BasicBufferInput {
    public static void main(String[] args) {
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("input.txt"))){
                int byteData;
                while((byteData=bis.read())!=-1){
                    System.out.print((char)byteData);
                }
        }catch(IOException e){
            e.getStackTrace();
        }
    }
}
