import java.util.*;

// https://www.acmicpc.net/problem/11582
public class q11582 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] chickens = new int[N];
        for(int n = 0; n<N; n++) {
            chickens[n] = sc.nextInt();
        }
        int K = sc.nextInt();

        mergeSort(chickens, 0, N-1);
        for(int i=0; i<N; i++) {
            System.out.print(chickens[i]+" ");
        }


        sc.close();
    }

    public static void merge(int list[], int start, int mid, int end){
        int[] temp = new int[list.length];

        int i, j, tempIdx;
        i = start; j = mid+1; tempIdx = start;
        while(i<=mid&&j<=end){
            if(list[i]<=list[j])
                temp[tempIdx++] = list[i++];
            else
                temp[tempIdx++] = list[j++];
        }
        
        for(tempIdx = start; tempIdx<=end; tempIdx++) {
            list[tempIdx] = temp[tempIdx];
        }
    }

    public static void mergeSort(int list[], int start, int end){
        if(start<end){
            int mid=(start+end)/2;
            mergeSort(list, start, mid);
            mergeSort(list, mid+1, end);
            merge(list, start, mid, end);
        }
        
    }
}