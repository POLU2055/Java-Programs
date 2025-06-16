import java.io.*;
public class BasicDataOutputStream {
    public static void main(String[] args) {
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("output.bin"))){
            dos.writeInt(10);
            dos.writeDouble(6032);
            dos.writeUTF("MAHA LAKSHMI");
        }catch(IOException e ){
                e.getStackTrace();
        }
        
    }
}
