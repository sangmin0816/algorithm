import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 적어도 자바에 있어서는 브론즈에 있을 문제는 아닌 것 같기두 하다.
public class b2729_이진수덧셈 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        for(int t=0; t<T; t++){
            String[]temp = br.readLine().split(" ");

            int longerString = temp[0].length() > temp[1].length()? temp[0].length() : temp[1].length();
            String A = String.format("%80s", temp[0]).replace(" ", "0");
            String B = String.format("%80s", temp[1]).replace(" ", "0");

            String ans = binaryCalc(A, B, longerString);
            int index = -1;
            for(int i=0; i<ans.length(); i++) {
                if(ans.charAt(i)=='1') {
                    index = i;
                    break;
                }
            }
            if(index==-1){
                ans = "0";
            } else {
                ans = ans.substring(index, ans.length());
            }
            bw.write(ans);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static String binaryCalc(String A, String B, int longerString) {
        String ans = "";

        char surplus = '0';
        for(int i=79; i>=80-longerString; i--) {
            String operand = ""+surplus+A.charAt(i)+B.charAt(i);
            switch(operand) {
                default:
                    ans = "0"+ans;
                    break;
                case "100":
                case "010":
                case "001":
                    surplus = '0';
                    ans = "1"+ans;
                    break;
                case "110":
                case "101":
                case "011":
                    surplus = '1';
                    ans = "0"+ans;
                    break;
                case "111":
                    surplus = '1';
                    ans = "1"+ans;
                    break;
                // 000 001 010 011 100 101 110 111
            }
        }
        if(surplus=='1') {
            ans = "1"+ans;
        }

        return ans;
    }
}
