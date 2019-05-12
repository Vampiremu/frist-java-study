//7  将一个数组逆序输出。

import static java.lang.System.*;
import java.util.Scanner;

public class seventh {
    public static void main(String[] args){
        int i,j;
        Scanner number = new Scanner(in);
        out.println("请输入");
        int s = number.nextInt();
        int[] group = new int[s];
        for (i = 0; i < s; i++){
            group[i] = number.nextInt();
        }
        for (j = i - 1; j >= 0; j--) out.print(group[j]+" ");
    }
}
