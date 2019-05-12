//3  有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。

import static java.lang.System.*;

public class third {
    public static void main(String[] args){
        double sum = 0;
        double transit;
        double[] number = new double[2];
        number[0] = 1;
        number[1] = 2;
        for (int i = 0; i < 20; i++){
            sum += (number[1]/number[0]);
            transit = number[1];
            number[1] = number[1] + number[0];
            number[0] = transit;
        }
        out.print(sum);
    }
}
