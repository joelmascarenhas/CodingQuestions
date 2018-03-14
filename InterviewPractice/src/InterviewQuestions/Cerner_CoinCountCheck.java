package InterviewQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * Created by Joel on 05-03-2018.
 */
public class Cerner_CoinCountCheck {
    public static void main(String[] args) throws IOException{
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        int value;
        while ((line = in.readLine()) != null) {
            value = Integer.parseInt(line);
            System.out.println(countCoins(value));
        }
    }

    public static int countCoins(int value)
    {
        int temp = 0;
        int count = 0;
        if(value > 5)
        {
            count = value / 5;
            temp = temp % 5;
        }
        else
        {
            temp = value;
        }

        if(temp > 3)
        {
            count+= (temp / 3);
            temp = temp % 3;
        }

        count+= temp;
        return count;
    }
}
