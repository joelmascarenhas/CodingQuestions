package InterviewCake;

/**
 * Created by Joel on 07-03-2018.
 *
 * Solving subproblems to solve the max of 3 products.
 * Logic - First we find max and min of 2 numbers followed by max product and min product of 2 numbers in an array. We then find max product of 3 numbers.
 * max3 = max(max3,curr * max2,curr * min2)
 * max2 = max(max2,curr * h,curr *l) max of 2 numbers is either max of 2 positive numbers i.e curr*h OR max of 2 negative numbers i.e curr*l
 * min2 = min(min2,curr * h,curr *l) min of 2 numbers is either min of largest +ve no and smallest -ve no OR largest -ve no and smallest +ve no
 * h = max(h, curr)
 * l = min(l, curr)
 *
 */
public class IC3_MaxProductof3Numbers {
    public static void main(String[] args) {

    }
}
