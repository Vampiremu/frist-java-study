//9   有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数

import static java.lang.System.*;
import java.util.Scanner;

public class ninth {
    public static void main(String[] args){
        Scanner group = new Scanner(in);
        int n ,m;
        n = group.nextInt();
        m = group.nextInt();
        int[] arrayss = new int[n];
        int[] arrayss_f = new int[n];
        for (int i = 0; i < n; i++){
            arrayss[i] = arrayss_f[i] = group.nextInt();

        }
        for (int i = 0;i < n - m; i++){
            arrayss[n - 1 - i] = arrayss[n - m - 1 - i];
        }
        if (m >= 0) System.arraycopy(arrayss_f, n - m + 0, arrayss, 0, m);//将后m个数放到前面
        for (int i = 0; i < n; i++){
            out.print(arrayss[i]);
        }
    }
}
