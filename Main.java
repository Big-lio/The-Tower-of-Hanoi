import java.util.*;
import java.io.*;


class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Total number of disks:  (1-10)");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean a = false; 
        while (a==false){
            if (n>10 || n<1){
                System.out.println("Wrong input");
                System.out.println("Try again");

                n= in.nextInt();
            }
            else{
                a=true;
            }
        }
        HanoiTower test = new HanoiTower();
        test.iterativeProcess(n);
    }
}