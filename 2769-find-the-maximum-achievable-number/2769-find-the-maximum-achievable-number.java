import java.util.*;
class Solution {
    public static int theMaximumAchievableX(int num, int t) {
        int x=num+2*t;
        return x;
    }
    public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.print("num");
int num=sc.nextInt();
System.out.print("t");
int t=sc.nextInt();
int Answer=theMaximumAchievableX(num,t);
System.out.print(Answer);
sc.close();
    }
}