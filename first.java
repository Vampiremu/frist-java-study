//1  学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
import java.util.Scanner;
import static java.lang.System.*;

public class first {

    public static void main(String[] args) {
        int student_number,i=0;
        out.println("请输入学生人数：");
        Scanner reader = new Scanner(in);
        student_number=reader.nextInt();
        int[][] student_grade = new int[student_number][2];
        out.println("请按顺序输入学生成绩，并以非数字结束（如果输入成绩和学生数量相等则无需输入）:");
        while(i<student_number&&reader.hasNextInt()){
            student_grade[i][0] = reader.nextInt();
            if (student_grade[i][0] >= 90) student_grade[i][1] = 0;
            if (student_grade[i][0] >= 60 && student_grade[i][0] < 90) student_grade[i][1] = 1;
            if (student_grade[i][0] < 60) student_grade[i][1] = 2;
            i++;
        }
        for (int j = 0; j < i; j++){
            switch (student_grade[j][1]){
                case 0: out.printf("A%n");break;
                case 1: out.printf("B%n");break;
                case 2: out.printf("C%n");break;
            }
        }
    }
}
