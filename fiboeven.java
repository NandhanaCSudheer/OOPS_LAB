import java.io.*;
import java.util.*;

class fibonacci implements Runnable{
    public void run(){
        int l = 0;
        int f = 1;
        for(int i=0;i<10;i++){
            int s = l + f;
            System.out.println("The "+ i +"th term in the fibonacci series is: "+ s);
            l = f;
            f = s;
        }
    }
}

class even implements Runnable{
    public void run(){
        for(int i=0;i<=10;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}

public class fiboeven{
    public static void main(String args[]){
        Thread f = new Thread(new fibonacci());
        Thread e = new Thread(new even());
        f.start();
        e.start();
    }
}