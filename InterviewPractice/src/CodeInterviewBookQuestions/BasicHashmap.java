package CodeInterviewBookQuestions;


import java.util.HashMap;
import java.util.Scanner;


/**
 * Created by Joel on 14-12-2016.
 */
public class BasicHashmap {
    static public HashMap<Integer,Student> buildMap(Student[] students)
    {
        HashMap<Integer,Student> map = new HashMap<Integer,Student>();
        for(Student s:students)
            map.put(s.getId(),s);
        return map;
    }
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Scanner scanner = new Scanner(System.in);
        String name;
        int id;
        for(int i=0;i<students.length;i++)
        {
            id = scanner.nextInt();
            name = scanner.next();
            students[i] = new Student(id,name);
        }

        System.out.println(buildMap(students).containsKey(90));



    }
}
class Student
{
    int id;
    String name;
    Student(int sid,String sname)
    {
      id = sid;
      name = sname;
    }
    public int getId()
    {
        return id;
    }
    public void dummy()
    {
        System.out.println("Dummy");
    }
}
