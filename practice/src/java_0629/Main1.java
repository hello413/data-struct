package java_0629;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            int[] credit = new int[n];
            int credits = 0;
            for (int i = 0; i < n; i++) {
                credit[i] = input.nextInt();
                credits += credit[i];
            }
            int[] grade = new int[n];
            for (int i = 0; i < n; i++) {
                grade[i] = input.nextInt();
            }
            double[] gpa = new double[n];
            double num = 0.0;
            for (int i=0;i<n;i++){
                int g = grade[i];
                if (g>=90){
                    gpa[i] = 4.0*credit[i];
                }else if (g>=85){
                    gpa[i] = 3.7*credit[i];
                }else if (g>=82){
                    gpa[i] = 3.3*credit[i];
                }else if (g>=78){
                    gpa[i] = 3.0*credit[i];
                }else if (g>=75){
                    gpa[i] = 2.7*credit[i];
                }else if (g>=72){
                    gpa[i] = 2.3*credit[i];
                }else if (g>=68){
                    gpa[i] = 2.0*credit[i];
                }else if (g>=64){
                    gpa[i] = 1.5*credit[i];
                }else if (g>=60){
                    gpa[i] = 1.0*credit[i];
                }else {
                    gpa[i] = 0.0*credit[i];
                }
                num+=gpa[i];
            }
            System.out.printf("%.2f",num/credits);
        }
    }
}