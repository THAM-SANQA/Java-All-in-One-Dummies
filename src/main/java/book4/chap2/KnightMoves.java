package book4.chap2;

import java.util.Scanner;

/**
 * @author thamsanqa 2024
 **/
public class KnightMoves {

    static Scanner sc = new Scanner(System.in);
    //8 moves a knight can make
    //8 by 2 array
    static int[][] moves = {{-2, +1}, {-1, +2}, {+1, +2}, {+2, +1},
            {+2, -1}, {+1, -2}, {-1, -2}, {-2, -1}};

    public static void main(String[] args) {
        System.out.println("Welcome to the Knight Moves Calculator.\n");
        do {
            showKnightMoves();
        } while (getYorN("Do it again?"));
        System.out.println("Goodbye! Thanks for playing.");
    }

    public static void showKnightMoves() {
        // The first dimension is the file (y, b, c, etc.)
        // The second dimension is the rank (1, 2, 3, etc.)
        // Thus, board[3][4] is square d5.
        // A value of 0 means the square is empty
        // 1 means the knight is in the square
        // 2 means the knight could move to the square
        int[][] board = new int[8][8];

        String kSquare;
        Pos kPos;

        //get knight's initial position
        do {
            System.out.print("Enter knight's position: ");
            kSquare = sc.nextLine();
            kPos = convertSquareToPos(kSquare);
        } while (kPos == null);
        board[kPos.x][kPos.y] = 1;
        System.out.println("\nThe knight is at square "
                + convertPosToSquare(kPos));
        System.out.println(
                "From here the knight can move to:");
        for (int move = 0; move < moves.length; move++) {
            int x, y;
            x = moves[move][0]; // the x for this move
            y = moves[move][1]; // the y for this move
            Pos p = calculateNewPos(kPos, x, y);
            if (p != null) {
                System.out.println(convertPosToSquare(p));
                board[p.x][p.y] = 2;
            }
        }
        printBoard(board);
    }

    public static Pos convertSquareToPos(String square) {
        int x = -1;
        int y = -1;
        char file = square.charAt(0);  // Assuming 'square' is a string like "a1"
        y = file - 'a';

        char rank = square.charAt(1);
        x = rank - '1';
        if (x < 0 || x > 7 || y < 0 || y > 7) {
            return null;
        } else {
            return new Pos(x, y);
        }
    }

    // this method converts x, y coordinates such as
    // [0][0] or [3][4] to squares such as a1 or d5.
    public static String convertPosToSquare(Pos p) {
        String file = "";
        if (p.y >= 0 && p.y <= 7) {
            file = String.valueOf((char) ('a' + p.y));
        }
        return file + (p.x + 1);
    }

    // this method calculates a new Pos given a
    // starting Pos, an x move, and a y move
    // it returns null if the resulting move would
    // be off the board.
    public static Pos calculateNewPos(Pos p, int x, int y) {
        // rule out illegal moves
        if (p.x + x < 0 || p.x + x > 7 || p.y + y < 0 || p.y + y > 7) {
            return null;
        }
        // return new position
        return new Pos(p.x + x, p.y + y);
    }

    public static void printBoard(int[][] b) {
        for (int x = 7; x >= 0; x--) {
            for (int y = 0; y < 8; y++) {
                if (b[y][x] == 1) {
                    System.out.print(" X ");
                } else if (b[y][x] == 2) {
                    System.out.print(" ? ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }

    public static boolean getYorN(String prompt) {
        while (true) {
            String answer;
            System.out.print("\n" + prompt + " (Y or N) ");
            answer = sc.nextLine();
            if (answer.equalsIgnoreCase("Y")) {
                return true;
            } else if (answer.equalsIgnoreCase("N")) {
                return false;
            }
        }
    }
}

// this class represents x, y coordinates on the board
class Pos {
    public int x;
    public int y;

    public Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
