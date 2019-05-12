//8  输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。

import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;

public class eighth {
    public static void main(String[] args){
        Scanner group = new Scanner(in);
        int group_number;
        out.println("请输入数组长度");
        group_number = group.nextInt();
        int[] array = new int[group_number];
        for (int i = 0; i < group_number; i++){
            array[i] = group.nextInt();
        }
//        Arrays.sort(array);
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        for (int i = 0; i < group_number; i++){
            if (min == array[i]){
                int ch = array[group_number - 1];
                array[group_number - 1] = min;
                array[i] = ch;
            }
            if (max == array[i]){
                int ch = array[0];
                array[0] = max;
                array[i] = ch;
            }
        }
        for (int i = 0; i < group_number; i++){
            out.print(array[i]+" ");
        }
    }
}
