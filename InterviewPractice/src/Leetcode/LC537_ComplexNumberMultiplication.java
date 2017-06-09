package Leetcode;

import java.util.Scanner;

/**
 * Created by Joel on 09-06-2017.
 */
public class LC537_ComplexNumberMultiplication {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(complexNumMul(scanner.next(),scanner.next()));
    }
    public static String complexNumMul(String a,String b)
    {
        String[] complex_number1 = a.split("\\+");
        String[] complex_number2 = b.split("\\+");
        int res_real = Integer.parseInt(complex_number1[0]) * Integer.parseInt(complex_number2[0]);
        String[] imag1 = complex_number1[1].split("i");
        String[] imag2 = complex_number2[1].split("i");
        res_real = res_real + (Integer.parseInt(imag1[0]) * Integer.parseInt(imag2[0]) * -1);
        int res_imag = (Integer.parseInt(complex_number1[0]) * Integer.parseInt(imag2[0])) + (Integer.parseInt(complex_number2[0]) * Integer.parseInt(imag1[0]));
        return (res_real+"+"+res_imag+"i");
    }
}
