package programs;

import java.util.Scanner;
public class Patient {
    public String patientName;
    public double height;
    public double weight;
    public double BMI(){
        double a= weight/(height*height);
        return a;
    }
}
class Result{
    public static void main(String args[]){
        Patient obj1 = new Patient();
        Scanner obj2 = new Scanner(System.in);
        obj1.height = obj2.nextDouble();
        obj1.weight = obj2.nextDouble();
        System.out.println(obj1.BMI());
    }
}
