import java.util.*;
class Solution {
    public static double[] convertTemperature(double celsius) {
        double kelvin=celsius+273.15;
        double Fahrenheit=celsius*1.80+32.00;
        double ans[]={kelvin,Fahrenheit};
        return ans;
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.print("celsius=");
        double celsius=sc.nextDouble();
        double output[]=convertTemperature(celsius);
        Arrays.toString(output);
        sc.close();
    }
}