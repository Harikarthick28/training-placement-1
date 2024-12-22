import java.util.Scanner;
public class bld {
    public static String check(int age,int weight){
        if(age>18 && weight>45){
            return"eligible";
        }else{
            return "Not eligible";
        }
    }
    public  static void main(String[] args){
        int age,weight;
        String result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur age:");
        age=sc.nextInt();
        System.out.println("Enter ur weight:");
        weight=sc.nextInt();
        result= check(age,weight);
        System.out.println("status:"+result);
        //scanner.close();
    }   
}
