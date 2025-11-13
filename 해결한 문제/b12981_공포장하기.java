
import java.util.*;

public class b12981_공포장하기 { // https://www.acmicpc.net/problem/12981
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();

        int ans = R/3 + G/3 + B/3;
        R = R%3; 
        G = G%3; 
        B = B%3;

        while(R>0 && G>0 && B>0) {
            ans++; R--; G--; B--;
        }
        if(R+G+B<3 && R+G+B>0) ans++;
        else if(R+G+B>=3) ans+=2;

        System.out.println(ans);
        sc.close();
    }
}
