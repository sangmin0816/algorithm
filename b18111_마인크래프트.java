import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class b18111_마인크래프트 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException { // https://www.acmicpc.net/problem/18111
        // Scanner 사용 시 시간 초과 발생

        String[] temp = br.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int M = Integer.parseInt(temp[1]);
        long B = Long.parseLong(temp[2]);

        int[][] arr = new int[N][M];
        int total = 0;

        for(int i=0; i<N; i++) {
            String[] no_temp = br.readLine().split(" ");
            for(int j=0; j<M; j++) {
                arr[i][j] = Integer.parseInt(no_temp[j]);
                total += arr[i][j];
            }
        }

        int time = Integer.MAX_VALUE;
        int height = 0;
        for(int h = 0; h<=256; h++) {
            int now = 0;

            if(h*N*M>(total+B)) break;
            for(int i=0; i<N; i++) {
                for(int j=0; j<M; j++) {
                    int block = arr[i][j] - h;
                    if(block>0) {
                        now += 2*block;
                    } else if(block<0) {
                        now += -block;
                    };
                }
            }

            if(time>now) {
                time = now;
                height = h;
            } else if(time==now && height<h) {
                height = h;
            }
        }

        bw.write(time+" "+height);

        bw.flush();
        bw.close();
        br.close();
    }
}