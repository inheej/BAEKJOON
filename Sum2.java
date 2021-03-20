import java.util.Scanner;

public class Sum2 {
    public static void main(String args[]) {
        int T;
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();
        for(int i=0;i<T;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a + b);
        }
    }
}
