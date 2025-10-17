import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class b7562 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   public static void main(String[] args) throws IOException {

      int T = Integer.parseInt(br.readLine());
      for(int t = 0; t<T; t++) {
         int L = Integer.parseInt(br.readLine());
         int[][] board = new int[L][L];
         
         String[] temp = br.readLine().split(" ");
         int now_x = Integer.parseInt(temp[0]);
         int now_y = Integer.parseInt(temp[1]);

         temp = br.readLine().split(" ");
         int there_x = Integer.parseInt(temp[0]);
         int there_y = Integer.parseInt(temp[1]);

         int[][] visited = new int[L][L];
         Queue<int[]> q = new LinkedList<>();
         q.add(new int[] {now_x, now_y, 0});

         while(!q.isEmpty()){
            int[] polled = q.poll();
            int x = polled[0];
            int y = polled[1];
            int move = polled[2];

            if(0<=x && x<L && 0<=y && y<L) {
               if(visited[x][y]==0) {
                  visited[x][y] = 1;
                  board[x][y] = move;
                  if(x==there_x && y==there_y) break;
                  move++;
                  q.add(new int[] {x+1, y+2, move});
                  q.add(new int[] {x+2, y+1, move});
                  q.add(new int[] {x+1, y-2, move});
                  q.add(new int[] {x+2, y-1, move});
                  q.add(new int[] {x-1, y+2, move});
                  q.add(new int[] {x-2, y+1, move});
                  q.add(new int[] {x-1, y-2, move});
                  q.add(new int[] {x-2, y-1, move});
               }
            }
         }
         
         bw.write(String.valueOf(board[there_x][there_y]));
         bw.newLine();
      }



      bw.flush();
      br.close();
      bw.close();
   }
}