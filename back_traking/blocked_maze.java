package back_traking;
import java.util.*;

class Maze{
    public static void blockedMaze(int[][] maze, int row, int col, String ans){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(ans);
            return;
        }

        if(row == -1 || row == maze.length || col == -1 || col == maze[0].length || maze[row][col] == 1){
            return;
        }

        maze[row][col] = 1;

        // top
        blockedMaze(maze, row - 1, col, ans + "T");

        // down
        blockedMaze(maze, row + 1, col, ans + "D");

        //left
        blockedMaze(maze, row, col - 1, ans + "L");

        //right
        blockedMaze(maze, row, col + 1, ans + "R");

        maze[row][col] = 0;

    }

    //with visited array
    public static void blockedMaze1(int[][] maze, int row, int col, String ans, boolean[][] visited){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(ans);
            return;
        }

        if(row == -1 || row == maze.length || col == -1 || col == maze[0].length || maze[row][col] == 1 || visited[row][col] == true){
            return;
        }

        visited[row][col] = true;

        // top
        blockedMaze1(maze, row - 1, col, ans + "T", visited);

        // down
        blockedMaze1(maze, row + 1, col, ans + "D", visited);

        //left
        blockedMaze1(maze, row, col - 1, ans + "L", visited);

        //right
        blockedMaze1(maze, row, col + 1, ans + "R", visited);

        visited[row][col] = false;

    }

    public static void main(String[] args) {
        int[][] maze = {{0,1,0,0},{0,0,0,0},{0,1,0,0},{0,0,1,0}};
        blockedMaze(maze, 0, 0, "");
        System.out.println("------------------");
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        blockedMaze1(maze, 0, 0, "", visited);
    }
}