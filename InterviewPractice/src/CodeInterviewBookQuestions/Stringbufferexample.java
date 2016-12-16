package CodeInterviewBookQuestions;

/**
 * Created by Joel on 14-12-2016.
 */
public class Stringbufferexample {
    public static void main(String[] args) {
        String str = "Hello how are you today I am fine Thank you";
        String[] arr = str.split(" ");
        StringBuffer finalstr = new StringBuffer();
        for(String s : arr)
        {
            finalstr.append(s);
        }
        System.out.println(finalstr.toString());
    }


}
