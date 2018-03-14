package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Joel on 12-03-2018.
 */
public class Google_Time {
    public static void main(String[] args) {
        /*gnTimeList = ["10:10", "15:41", "23:59", "12:34","12:11", "12:31", "12:33", "01:01", "00:11", "11:00"]
# gnTimeList = ["11:00"]
        for each in gnTimeList:
        validTime = getMinPossibleNextTime(each)
        print each, validTime, "\n"*/
        System.out.println(getMinPossibleNextTime("10:10"));
    }
    public static String getMinPossibleNextTime(String inputtime)
    {
        String tokens[] = inputtime.split(":");
        String hour = tokens[0];
        String minute = tokens[1];
        String swappedMinute = checkForSameHour(minute.toCharArray(),minute);
        if(swappedMinute != "")
            return hour+":"+swappedMinute;
        else {
            Map<Character, Integer> map = new HashMap<>();
            char[] timeArray = inputtime.toCharArray();
            for (char c : timeArray)
            {
                if(c == ':')
                    continue;

                if(map.containsKey(c))
                    map.put(c,map.get(c) + 1);
                else
                    map.put(c,1);
            }

            for(int i=Integer.parseInt(hour)+1;i<24;i++)
            {
                String hourval = Integer.toString(i);
                if(hourval.length() < 2)
                    hourval = "0" + hourval;
                String requireMinute = checkValidity(hourval,map);
                if(requireMinute != "")
                {
                    hourval = hourval + ":" + requireMinute;
                    System.out.println("----------------------"+hourval);
                    return hourval;
                }
            }

            for(int i=0;i<Integer.parseInt(hour);i++)
            {
                String hourval = Integer.toString(i);
                if(hourval.length() < 2)
                    hourval = "0" + hourval;
                String requireMinute = checkValidity(hourval,map);
                if(requireMinute != "")
                {
                    hourval = hourval + ":" + requireMinute;
                    return hourval;
                }
            }

        }
        return inputtime;
    }

    public static String checkValidity(String hourval, Map<Character,Integer> map)
    {
        if(map.containsKey(hourval.charAt(0))) {
            int count = map.get(hourval.charAt(0));
            if (count == 1)
                map.remove(hourval.charAt(0));
            else
                map.put(hourval.charAt(0), map.get(hourval.charAt(0)) - 1);
            if (map.containsKey(hourval.charAt(1))) {
                count = map.get(hourval.charAt(1));
                if (count == 1)
                    map.remove(hourval.charAt(1));
                else
                    map.put(hourval.charAt(1), map.get(hourval.charAt(1)) - 1);
                String minMinute = getMinValidMinute(map.keySet());
                if (minMinute != "")
                    return minMinute;
                else {
                    if (map.containsKey(hourval.charAt(0)))
                        map.put(hourval.charAt(0), map.get(hourval.charAt(0)) + 1);
                    else
                        map.put(hourval.charAt(0), 1);

                    if (map.containsKey(hourval.charAt(1)))
                        map.put(hourval.charAt(1), map.get(hourval.charAt(1)) + 1);
                    else
                        map.put(hourval.charAt(1), 1);
                    return "";
                }

            }
            if (map.containsKey(hourval.charAt(0)))
                map.put(hourval.charAt(0), map.get(hourval.charAt(0)) + 1);
            else
                map.put(hourval.charAt(0), 1);

        }
        return "";
    }
    public static String getMinValidMinute(Set<Character> set)
    {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        String result="";
        for(char c:set)
        {
            int val = (int)c - 48;
            if(c < min)
                 min = val;
            if(c > max)
                max = val;
        }
        if(min <= 5 && max <= 9)
        {
            result = Integer.toString(min) + Integer.toString(max);
            return result;
        }
        return result;
    }
    public static String checkForSameHour(char[] minuteArray,String minute)
    {
        String result = "";
        int firstChar = (int)minuteArray[0]- 48;
        int secondChar = (int)minuteArray[1] - 48;
        if(firstChar > secondChar && secondChar <=5 &&  firstChar <= 9)
        {
            result = result + Integer.toString(firstChar) + Integer.toString(secondChar);
            if(Integer.parseInt(result) > Integer.parseInt(minute))
                return result;
        }
        return "";
    }
}
