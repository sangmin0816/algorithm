package 다시풀기;

import java.util.*;

public class q13170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 마나수정의 갯수
        int K = sc.nextInt(); // 폭발마나수정의 강도 순서(내림차순)
        int P = sc.nextInt(); // 파괴 최대힘
        int W = sc.nextInt(); // 폭발마나수정의 오차범위

        int ans = (int)Math.ceil(P/(double)W);

        System.out.println(ans);

        sc.close();
    }    
}
