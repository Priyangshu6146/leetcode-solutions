import java.util.*;
class Solution {
    public static int sum(int num1, int num2) {
        int sum=num1+num2;
        return sum;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("num1 is ");
        int num1=sc.nextInt();
        System.out.print("num2 is ");
        int num2=sc.nextInt();

        int result = sum(num1, num2);
        System.out.print("so"+ result +"is returned.");
        sc.close();
    }
}