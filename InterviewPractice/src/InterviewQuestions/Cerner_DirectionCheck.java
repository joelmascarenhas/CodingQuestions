package InterviewQuestions;

/**
 * Created by Joel on 05-03-2018.
 */
public class Cerner_DirectionCheck {
    public static void main(String[] args) {

    }

    public static String getDirection(int x1,int y1,int x2,int y2)
    {
        if(x1 == x2 && y1 == y2)
            return "HERE";
        else
        {
            if(x2 < x1)
            {
                if(y2 == y1)
                    return "W";
                else if(y2 < y1)
                    return "SW";
                else return "NW";
            }
            else if(x2 > x1)
            {
                if(y2 == y1)
                    return "E";
                else if(y2 < y1)
                    return "SE";
                else return "SW";
            }
            else if(x2 == x1)
            {
                if(y2 > y1)
                    return "N";
                else
                    return "S";
            }
            else
                return "ERR";
        }
    }
}
