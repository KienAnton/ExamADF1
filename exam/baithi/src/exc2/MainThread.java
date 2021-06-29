package exc2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MainThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("Result:");
        StringTokenizer world = new StringTokenizer(str," ");
        while(world.hasMoreTokens()){
            System.out.println(world.nextToken());
        }
    }
}
