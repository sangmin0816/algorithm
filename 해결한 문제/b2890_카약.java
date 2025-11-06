import java.io.IOException;
import java.util.*;

public class b2890_카약 {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();
        
        String[][] map = new String[R][C];

        int rank[][] = new int[9][2];
        

        for(int i=0; i<R; i++){
            String[] temp = sc.next().strip().split("");
            for(int j=0; j<C; j++) {
                map[i][j] = temp[j];
                if(!map[i][j].equals("S")
                & !map[i][j].equals(".")
                & !map[i][j].equals("F")
                ) {
                    int num = Integer.parseInt(map[i][j])-1;
                    rank[num][0] = num;
                    rank[num][1] = j;
                    break;
                }
            }
        }

        Arrays.sort(rank, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
            
        });
        
        int rankNum = 1;
        int colNum = rank[0][1];
        rank[0][1] = 1;
        for(int i=1; i<9; i++) {
            if(rank[i][1] == colNum) {
                rank[i][1] = rankNum;
                continue;
            }
            rankNum++;
            colNum = rank[i][1];
            rank[i][1] = rankNum;
        }

        Arrays.sort(rank ,new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
            
        });

        for(int i=0; i<9; i++) System.out.println(rank[i][1]);

        sc.close();
    }
}
