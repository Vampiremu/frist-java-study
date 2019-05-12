//2  一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？

import java.util.Scanner;
import static java.lang.System.*;

public class second {
    public static void main(String[] args){
        double primitibe_high = 100;
        int number;
        double number_high = 0,general_line = 0;
        Scanner high = new Scanner(in);
        number = high.nextInt();
        for (int i = 0; i < number; i++){
            number_high = primitibe_high/2;
            general_line += number_high + primitibe_high;
            primitibe_high = number_high;
        }
        general_line += number_high;
        out.print(general_line);
        out.printf("%n");
        out.print(number_high);
    }
}
