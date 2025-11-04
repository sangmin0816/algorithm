import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class b2729_이진수덧셈_ver2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        for(int t=0; t<T; t++){
            String[]temp = br.readLine().split(" ");

            BigInteger A = new BigInteger(temp[0], 2);
            BigInteger B = new BigInteger(temp[1], 2);
            BigInteger ans = A.add(B);


            bw.write(ans.toString(2));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
