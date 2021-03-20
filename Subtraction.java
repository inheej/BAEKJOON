import java.util.Scanner;

public class Subtraction {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        if (a>0){
            if(b<10){
                c = a-b;
            }
        }
        System.out.print(c);
    }
}
