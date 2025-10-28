import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class b1064_평행사변형 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] temp = br.readLine().split(" ");
        double xA = Integer.parseInt(temp[0]);
        double yA = Integer.parseInt(temp[1]);
        double xB = Integer.parseInt(temp[2]);
        double yB = Integer.parseInt(temp[3]);
        double xC = Integer.parseInt(temp[4]);
        double yC = Integer.parseInt(temp[5]);
        
        double ans = -1.0;
        if((xA-xB)*(yA-yC) != (xA-xC) * (yA-yB)) {
            ArrayList<Double> arr = new ArrayList<>();
            double a_b = Math.sqrt(Math.pow((xA-xB), 2) + Math.pow((yA-yB),2));
            double a_c = Math.sqrt(Math.pow((xA-xC), 2) + Math.pow((yA-yC),2));
            arr.add((a_b+a_c)*2);
            double b_a = Math.sqrt(Math.pow((xB-xA), 2) + Math.pow((yB-yA),2));
            double b_c = Math.sqrt(Math.pow((xB-xC), 2) + Math.pow((yB-yC),2));
            arr.add((b_a+b_c)*2);
            double c_a = Math.sqrt(Math.pow((xC-xA), 2) + Math.pow((yC-yA),2));
            double c_b = Math.sqrt(Math.pow((xC-xB), 2) + Math.pow((yC-yB),2));
            arr.add((c_a+c_b)*2);
    
            ans = Collections.max(arr)-Collections.min(arr);
        }
        bw.write(String.valueOf(ans));

        bw.flush();
        br.close();
        bw.close();
    }
}
