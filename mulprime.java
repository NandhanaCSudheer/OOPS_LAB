import java.io.*;
import java.util.*;

class Multiple extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(" 5 * " + i + " = " + i*5);
        }
    }
}

class Prime extends Thread {
    int n;

    Prime(int n) {
        this.n = n;
    }

    public boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void run() {
        System.out.println("The prime numbers upto " + n + " are:");
        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}

public class mulprime{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        n = sc.nextInt();
        Multiple m = new Multiple();
        Prime p = new Prime(n);
        m.start();
        p.start();
    }
}