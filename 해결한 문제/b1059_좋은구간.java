import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class b1059_좋은구간 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int L = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");
        int N = Integer.parseInt(br.readLine());

        int ans = -1;
        ArrayList<Integer> arr = new ArrayList<>();
        for (String s : temp) {
            int n  = Integer.parseInt(s);
            arr.add(n);
            if (n == N) {
                ans = 0;
                break;
            }
        }

        if (ans != 0) {
            arr.add(0);
            arr.add(1001);
            arr.add(N);

            Collections.sort(arr);

            int idx = arr.indexOf(N);
            int min_num = N - arr.get(idx - 1);
            int max_num = arr.get(idx + 1) - N;
            ans = min_num * max_num - 1;
        }

        bw.write(String.valueOf(ans));

        bw.flush();
        br.close();
        bw.close();
    }
}
