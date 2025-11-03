import java.util.*;
public class q2635_수이어가기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();

        int max = 3;
        int num = 0;

        for(int i = first; i>0; i--){
            int x = first;
            int y = i;
            int count = 2;

            while(x-y>=0){
                int temp = y;
                y=x-temp;
                x=temp;
                count++;
            }
            if(count>max) {
                max=count;
                num = i;
            }
        }

        System.out.println(max);
        int x = first;
        int y = num;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(x);
        while(x-y>=0){
            arr.add(y);
            int temp = y;
            y=x-temp;
            x=temp;
        }
        arr.add(y);
        for(Integer i : arr) {
            System.out.print(String.valueOf(i)+" ");
        }
        sc.close();
    }
}
