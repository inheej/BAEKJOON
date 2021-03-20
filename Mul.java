import java.util.Scanner;

public class Mul {
    public static void main(String args[]) {
        int a,b;
        //int c = 0;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.print(a*b);


        /*while(true){
            a = sc.nextInt();
            if(a>0){
                while(true){
                    b = sc.nextInt();
                    if(b<10) {
                        c = a * b;
                        System.out.println(c);
                        break;
                    }
                }
            }
        }*/
    }
}
