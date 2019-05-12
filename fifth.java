//5  给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。

import static java.lang.System.*;
import java.util.Scanner;

public class fifth {
    public static void main(String[] args){
        int number_sum,sum,i = 0,j;
        Scanner number = new Scanner(in);
        out.println("请输入：");
        number_sum = number.nextInt();
        sum = number_sum;
        while(number_sum > 0){
            number_sum = number_sum/10;
            i++;
        }
        int[] inverse_number = new int[i];
        for (j = 0; j < i; j++){
            inverse_number[j] = sum % 10;
            sum = sum/10;
        }
        out.print(i);
        out.printf("%n");
        for (j = 0; j < i; j++) out.print(inverse_number[j]+" ");
    }
}
