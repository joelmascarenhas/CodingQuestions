package InterviewQuestions;

import java.util.Scanner;

/**
 * Created by Joel on 04-02-2017.
 */
public class CheckIfPointInTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Triangle coordinates(x1,y1,2,y2,x3,y3)");
        int x1,x2,x3,y1,y2,y3,bx,by,px,py;
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        x3 = scanner.nextInt();
        y3 = scanner.nextInt();
        bx = scanner.nextInt();
        by = scanner.nextInt();
        px = scanner.nextInt();
        py = scanner.nextInt();

        String result = CheckIfPointInside(x1,y1,x2,y2,x3,y3,bx,by,px,py);
        System.out.println("Result= " + result);
    }
    static String CheckIfPointInside(int x1,int y1,int x2,int y2,int x3,int y3,int bx,int by,int px,int py)
    {
        boolean boatflag=false,planeflag=false;
        float areatri = findArea(x1,y1,x2,y2,x3,y3);

        float areab1 = findArea(x1,y1,x2,y2,bx,by);
        float areab2 = findArea(x1,y1,x2,y2,bx,by);
        float areab3 = findArea(x1,y1,x2,y2,bx,by);
        if(areatri == (areab1+areab2+areab3))
            boatflag = true;

        float areap1 = findArea(x1,y1,x2,y2,px,py);
        float areap2 = findArea(x1,y1,x2,y2,px,py);
        float areap3 = findArea(x1,y1,x2,y2,px,py);
        if(areatri == (areap1+areap2+areap3))
            planeflag = true;

        if(planeflag == true && boatflag == true)
            return "Both Plane and Boat inside Triangle";
        else if(planeflag == true)
            return "Only plane is in the triangle";
        else if(boatflag == true)
            return "Only boat is in the triangle";
        else return "Neither Boat no plane in triangle";
    }
    static float findArea(int x1,int y1,int x2,int y2,int x3,int y3)
    {
        return (x1*Math.abs(y2-y3)+x2*Math.abs(y3-y1)+x3*Math.abs(y1-y2))/2;
    }
}
