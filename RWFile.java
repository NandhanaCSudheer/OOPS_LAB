import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;


public class RWFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter filename");
        String fileName = scanner.nextLine();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            System.out.println("Enter the file content");
            String content = scanner.nextLine();
            fileOutputStream.write(content.getBytes());     //getBytes() converts string → bytes (because file streams work with bytes)
            System.out.println("File Content"+"\n");
            FileInputStream fileInputStream=new FileInputStream(fileName);
            int data=fileInputStream.read();      //read() reads one byte at a time and stores it in data as an Integer
            while(data!=-1){
                System.out.print((char)data);
                data=fileInputStream.read();
            }
            fileInputStream.close();
        } catch (Exception e) {
            System.out.println("Unable to create file");
        }

    }
}