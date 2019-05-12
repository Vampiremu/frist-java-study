//6  一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同

import static java.lang.System.*;
import java.util.Scanner;

public class sixth {
    public static void main(String[] args){
        int p_number;
        int[] digit = new int[5];
        Scanner number = new Scanner(in);
        p_number = number.nextInt();
        for (int i =0; i < 5; i++){
            digit[i] = p_number%10;
            p_number = p_number/10;
        }
        if (digit[0] == digit[4] && digit[1] == digit[3]) out.print("Ture");
        else out.print("False");
    }
}
