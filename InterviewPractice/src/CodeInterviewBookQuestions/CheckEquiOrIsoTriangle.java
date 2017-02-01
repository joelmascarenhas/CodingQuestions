package CodeInterviewBookQuestions;
import java.util.*;

/**
 * Created by Joel on 30-01-2017.
 */
public class CheckEquiOrIsoTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> result = new ArrayList<>();
        int n = scanner.nextInt();
        for(int i = 0;i < n;i++)
        {
            result.add(checkTriangle(scanner.nextLong(),scanner.nextLong(),scanner.nextLong()));
        }
        int size = result.size();
        for(int i = 0;i < size;i++)
            System.out.println(result.get(i));
    }

    public static String checkTriangle(long side1,long side2,long side3) {
        //Checking Triangle Inequality
        Set<Long> set = new HashSet<>();
        int flag = 0;
        if (side1 == 0 || side2 == 0 || side3 == 0)
            flag = 1;
        else
            flag = (side1 + side2) >= side3 ? (((side1 + side3) >= side2) ? (((side2 + side3) >= side1) ? 0 : 1) : 1) : 1;

        if(flag == 0) {
            set.add(side1);
            set.add(side2);
            set.add(side3);
            if (set.size() == 1)
                return "Equilateral";
            else if (set.size() == 2)
                return "Isosceles";
            else
                return "None of these";
        }
        else
            return "None of these";

    }

}
