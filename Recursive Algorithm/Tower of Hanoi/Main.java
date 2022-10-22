
import java.util.*;
import java.lang.*;
import java.io.*;
import static java.lang.Math.abs;

public class Main {
    static void towerOfHanoi(int n, int  from_rod, int  to_rod, int  aux_rod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " +  from_rod + " to rod " + to_rod);
            return;
        }
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
    }
    //  Driver method
    public static void main(String args[]) {
        int n = 3; // Number of disks
        towerOfHanoi(n,1,3,2);
    }
}
