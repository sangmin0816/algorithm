import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

// long으로 해야 하는 것이였다
// 항상 자료형 범위 잘 파악하기!
public class b2748_피보나치수2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
      
        if(n==0)
            bw.write(String.valueOf(0));
        else if(n==1)
            bw.write(String.valueOf(1));
        else {
            BigInteger f1 = new BigInteger("0");
            BigInteger f2 = new BigInteger("1");
            for(int i=2; i<=n; i++) {
                f2 = f2.add(f1);
                f1 = f2.subtract(f1);
            }
            bw.write(f2.toString());
        }

        bw.flush();
        br.close();
        bw.close();
    }
}