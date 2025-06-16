
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Array_ObjectStream {
    public static void main(String[] args) {
        byte[] data = "Hello ! Good morning....".getBytes();
        try(BufferedInputStream bis=new BufferedInputStream(new ByteArrayInputStream(data))){
            long byteCount=0;
            while(bis.read()!=-1){
                byteCount++;
            }
            System.out.println("Total bytes int the input : "+byteCount);
        }catch(IOException e){
            System.out.println("Error reading file");
        }
    }
}
