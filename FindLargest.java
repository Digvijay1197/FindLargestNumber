import java.util.Scanner;

public class FindLargest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter no 1:");
        int no1=sc.nextInt();

        System.out.println("please enter no 2:");
        int no2=sc.nextInt();

        if(no1>no2){
            System.out.println(no1+" is greater than "+no2);
        }else{
            System.out.println(no2+" is greater than "+no1);
        }
        
    }
}