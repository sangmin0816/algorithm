import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class b1459_걷기 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String[] temp = br.readLine().split(" ");
        
        long X = Integer.parseInt(temp[0]);
        long Y = Integer.parseInt(temp[1]);
        long W = Integer.parseInt(temp[2]);
        long S = Integer.parseInt(temp[3]);

        long min_time = (X+Y)*W;
        if(S<W){
            if(X<Y) {
                min_time = S*X + (Y-X)*S;
            } else {
                min_time = S*Y + (X-Y)*S;
            }
            if((X+Y)%2 != 0) {
                min_time += W - S;
            }
        } else if(S<2*W) {
            if(X<Y) {
                min_time = S*X + (Y-X)*W;
            } else {
                min_time = S*Y + (X-Y)*W;
            }
        }

        bw.write(String.valueOf(min_time));
        bw.flush();
        br.close();
        bw.close();
    }
}
