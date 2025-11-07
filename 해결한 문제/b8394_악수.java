import java.util.*;

public class b8394_악수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long ans = 0;

        if(n==1) ans = 1;
        else{
            int prev = 1;
            int now = 2;
            for(int i=2; i<n; i++){
                int temp = now;
                now = (now+prev)%10;
                prev = temp;
            }
            ans=now;
        }

        System.out.println(ans%10);

        sc.close();
    }   
}
