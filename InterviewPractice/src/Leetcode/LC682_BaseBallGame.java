package Leetcode;

import java.util.Stack;

/**
 * Created by Joel on 15-04-2018.
 */
public class LC682_BaseBallGame {
    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5","2","C","D","+"}));
        //System.out.println(calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));
    }
    public static int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int score = 0,lastR,secondLastR,scoreRound;
        for(String str:ops)
        {
            if(str == "+")
            {
                lastR = stack.pop();
                secondLastR = stack.pop();
                scoreRound = lastR + secondLastR;
                score+=scoreRound;
                stack.push(secondLastR);
                stack.push(lastR);
                stack.push(scoreRound);
            }
            else if(str == "D")
            {
                scoreRound = 2 * stack.peek();
                score+=scoreRound;
                stack.push(scoreRound);
            }
            else if(str == "C")
            {
                score-=stack.pop();
            }
            else
            {
                stack.push(Integer.parseInt(str));
                score+=Integer.parseInt(str);
            }

        }
        return score;
    }
}
