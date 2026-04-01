import java.util.Scanner;

class UserException extends Exception{
    UserException(String msg1){
        super(msg1);
    }
}

class PassException extends Exception{
    PassException(String msg2){
        super(msg2);
    }
}
 
public class UserPassException{
    public static void main(String args[]){
        String uname, pass;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username: ");
        uname = sc.nextLine();
        System.out.println("Enter the password: ");
        pass = sc.nextLine();
        try{
            if (!uname.equals("admin@1")){
                throw new UserException("Invalid username!!!");
            }
            if(!pass.equals("Admin@1")){
                throw new PassException("Invalid password!!!");
            }
        }
        catch(UserException e){
            System.out.println("RuntimeError "+ e.getMessage());
        }
        catch(PassException e){
            System.out.println("RuntimeError "+ e.getMessage());
        }

        finally{
            System.out.println("End of the program.....");
        }
    }
}