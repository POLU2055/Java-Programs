import java.io.*;
public class BasicDataStreamInput{
    public static void main(String[] args) {
        //writing the data
        try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("output.bin"))){

            dos.writeInt(44);
            dos.writeDouble(4.4);
            dos.writeUTF("Hello");

        }catch(IOException e){
            e.getStackTrace();
        }
        //read the data
        try(DataInputStream dis = new DataInputStream(new FileInputStream("output.bin"))){
                System.out.println("Int : "+dis.readInt());
                System.out.println("Double : "+dis.readDouble());
                System.out.println("String : "+dis.readUTF());

        }catch(IOException e ){
            e.getStackTrace();
        }
    }
}
