import java.util.Arrays;

public class BackTracking {
    public static void main(String[] args) {

        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path = new int[board.length][board[0].length];

//        allPath("",board,0,0);
        allPathPrint("",board,0,0,path,1);
    }

    static void allPath(String p,boolean[][] maze, int r,int c){
        // here takes it goes all the 4 directions
        if (r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]){
            return;
        }
        maze[r][c] = false;

        if (r < maze.length-1){
            allPath(p + 'D',maze,r+1,c);
        }
        if (c < maze.length-1){
            allPath(p + 'R',maze,r,c+1);
        }
        if (r > 0){
            allPath(p + 'U',maze,r-1,c);
        }
        if (c > 0){
            allPath(p + 'L',maze,r,c-1);
        }

        // this line is where the function will be over
        // so before the function gets removed,
        // also remove the changes that were made by that function calls

        maze[r][c] = true;
    }
    static void allPathPrint(String p,boolean[][] maze, int r,int c,int[][] path,int step){
        // here takes it goes all the 4 directions
        if (r == maze.length-1 && c == maze[0].length-1){
            path[r][c] = step;
            for (int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;

        if (r < maze.length-1){
            allPathPrint(p + 'D',maze,r+1,c,path,step+1);
        }
        if (c < maze.length-1){
            allPathPrint(p + 'R',maze,r,c+1,path,step+1);
        }
        if (r > 0){
            allPathPrint(p + 'U',maze,r-1,c,path,step+1);
        }
        if (c > 0){
            allPathPrint(p + 'L',maze,r,c-1,path,step+1);
        }

        // this line is where the function will be over
        // so before the function gets removed,
        // also remove the changes that were made by that function calls

        maze[r][c] = true;
    }
}
