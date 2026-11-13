import java.util.*;
class Solution {
    public static int smallestEvenMultiple(int n) {
            int a=2*n;
         for(int i=1;i<=n;i++){
            int b=i*n;
            if(b%2==0){if(b>a){
                return a;
            }else if(a>b){
                return b;
            }else {
                return b;
            }
         }
         }
         return a;
          }
    public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.print("n=");
int n=sc.nextInt();
int num=smallestEvenMultiple(n);
if(num%2==0){
    System.out.print("The smallest multiple of both "+n+"and 2 is "+num);
}else {
    System.out.print("The is not smallest multiple of both "+n+"and 2 is "+num);
}
sc.close();
        }
    }