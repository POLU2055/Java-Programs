//threading 
import java.io.*;
public class BasicPipeInput {
    public static void main(String[] args) throws IOException {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);
        new Thread(() ->  {
            try {
                pos.write("Samsung, NokioQ!!".getBytes());
                pos.close();;
                
            } catch (Exception e) {
                System.out.println("Error caught!!");
            }
        }).start();
        new Thread(()->{
            try{
                int data;
                while((data=pis.read())!=-1){
                    System.out.print((char)data);
                }pis.close();
            }catch(IOException e){
                System.out.println("Error caught!!");
            }
        }).start();
   }
}
