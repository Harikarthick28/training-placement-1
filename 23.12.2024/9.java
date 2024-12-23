import java.util.Scanner;
class ly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 4 == 0) {
            System.out.println("LEAP YEAR");
        } else {
            System.out.println("NOT A LEAP YEAR");
        }

    }
}
