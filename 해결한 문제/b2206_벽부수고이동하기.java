import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class b2206_벽부수고이동하기 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   public static void main(String[] args) throws IOException {

      String[] temp = br.readLine().split(" ");
      int N = Integer.parseInt(temp[0]);
      int M = Integer.parseInt(temp[1]);

      int[][] arr = new int[N][M];
      for(int n=0; n<N; n++) {
         temp = br.readLine().split("");
         for(int m=0; m<M; m++) {
            arr[n][m] = Integer.parseInt(temp[m]);
         }
      }

      int[][][] visited = new int[N][M][2];
      
      Queue<int[]> q = new LinkedList<>();
      q.add(new int[] {0, 0, 1, 0});

      int ans = bfs(q, arr, visited, N, M);
      bw.write(String.valueOf(ans));

      bw.flush();
      br.close();
      bw.close();
   }

   public static int bfs(Queue<int[]> q, int[][] arr, int[][][] visited, int N, int M) {
      
      while(!q.isEmpty()) {
         int[] now = q.poll();
         int x = now[0];
         int y = now[1];
         int move = now[2];
         int broke = now[3];
         if( x==N-1 && y==M-1) {
            return move;
         }

         if(0<=x && x<N && 0<=y && y<M) {
            if(visited[x][y][broke]==0) {
               if(arr[x][y]==0) {
                  visited[x][y][broke]+=1;
                  q.add(new int[] {x+1, y, move+1, broke});
                  q.add(new int[] {x-1, y, move+1, broke});
                  q.add(new int[] {x, y+1, move+1, broke});
                  q.add(new int[] {x, y-1, move+1, broke});
               } else if(broke==0) {
                  visited[x][y][broke]+=1;
                  q.add(new int[] {x+1, y, move+1, 1});
                  q.add(new int[] {x-1, y, move+1, 1});
                  q.add(new int[] {x, y+1, move+1, 1});
                  q.add(new int[] {x, y-1, move+1, 1});
               }
            }
         }
      }
      
      return -1;
   }
}