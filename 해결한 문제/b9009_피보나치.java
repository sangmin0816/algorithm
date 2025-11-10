import java.util.*;

public class b9009_피보나치 {

    static ArrayList<Long> solution(long num){
        ArrayList<Long> fibo = new ArrayList<>();
        ArrayList<Long> answer = new ArrayList<>();
        fibo.add(0L);
        fibo.add(1L);
        int index = 2;
        
		//주어진 수보다 작은 피보니치 리스트를 만든다
        while (true) {
            long plusNum = fibo.get(index - 1) + fibo.get(index - 2);
            if(plusNum > num) break;
            fibo.add(plusNum);
            index++;
        }

        Collections.sort(fibo,Collections.reverseOrder());
		
        //주어진 수를 피보나치 리스트에서 큰 값부터 빼가며 0 을 만든다.
        while(num != 0) {
            for (int i = 0; i < fibo.size(); i++) {
            	//빼줄 때 피보나치의 값이 num보다 큰지 확인
                if (fibo.get(i) <= num) {
                    num -= fibo.get(i);
                    answer.add(fibo.get(i));
                }
            }
        }

        Collections.sort(answer);
        answer.remove(0);
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            long num = sc.nextInt();

            for (long x : solution(num)) {
                System.out.printf(x + " ");
            }
            System.out.println();

        }

    }
}