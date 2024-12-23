import java.util.Scanner;

public class fib{
    public static void main(String[] args){
        int a,b,c,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        n=sc.nextInt();
        a=0;
        b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
        
    }
}
