package InterviewQuestions;

import java.util.Scanner;

/**
 * Created by Joel on 04-02-2017.
 */
public class CheckIfPointInTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Triangle coordinates(x1,y1,x2,y2,x3,y3)");
        int x1,x2,x3,y1,y2,y3,bx,by,px,py;
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        x3 = scanner.nextInt();
        y3 = scanner.nextInt();
        System.out.println("Enter coordinates of boat");
        bx = scanner.nextInt();
        by = scanner.nextInt();
        System.out.println("Enter coordinates of plane");
        px = scanner.nextInt();
        py = scanner.nextInt();

        String result = CheckIfPointInside(x1,y1,x2,y2,x3,y3,bx,by,px,py);
        System.out.println("Result = " + result);
    }
    static String CheckIfPointInside(int x1,int y1,int x2,int y2,int x3,int y3,int bx,int by,int px,int py)
    {
        boolean boatflag=false,planeflag=false;
        float areatri = findArea(x1,y1,x2,y2,x3,y3);
        System.out.println(areatri);

        float areab1 = findArea(bx,by,x2,y2,x3,y3);
        float areab2 = findArea(x1,y1,bx,by,x3,y3);
        float areab3 = findArea(x1,y1,x2,y2,bx,by);
        System.out.println((areab1+areab2+areab3));
        if(areatri == (areab1+areab2+areab3))
            boatflag = true;

        float areap1 = findArea(px,py,x2,y2,x3,y3);
        float areap2 = findArea(x1,y1,px,py,x3,y3);
        float areap3 = findArea(x1,y1,x2,y2,px,py);
        System.out.println((areap1+areap2+areap3));
        if(areatri == (areap1+areap2+areap3))
            planeflag = true;

        if(planeflag == true && boatflag == true)
            return "Both Plane and Boat inside Triangle";
        else if(planeflag == true)
            return "Only plane is in the triangle";
        else if(boatflag == true)
            return "Only boat is in the triangle";
        else return "Neither Boat nor plane in triangle";
    }
    static float findArea(int x1,int y1,int x2,int y2,int x3,int y3)
    {
        return Math.abs(((x1*(y2-y3))+(x2*(y3-y1))+(x3*(y1-y2)))/2);
    }
}
