import java.util.*;
class Solution {
    public static int numberOfSteps(int num) {
        int count=0;
        int i=num;
        while(i>0){
               if(i%2==0){
i=i/2;
count=count+1;
            }else {
i=i-1;
count=count+1;
            }
        }

     return count ;
             }

             public static void main (String []args){
System.out.print("num=");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int n= numberOfSteps(num);
System.out.print(n);
 sc.close();
    }
    }
