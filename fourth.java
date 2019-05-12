//4  求1+2!+3!+...+20!的和

import static java.lang.System.*;

public class fourth {
    public static void main(String[] args){
        int sum = 1;
        int s = 1;
        for (int i = 1; i < 21; i++){
            for (int j = 1; j < i+1; j++) s *= j;
            sum+=s;
        }
        out.print(sum);
    }
}
