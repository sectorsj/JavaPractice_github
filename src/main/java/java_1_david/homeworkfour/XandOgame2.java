package java_1_david.homeworkfour;


import java.util.Scanner;

public class XandOgame2 {

    public static Scanner sc = new Scanner(System.in);

    public static char[][] map;
    public final static int SIZE_MAP = 5;
    public final static int DOT_TO_WIN = 4;

    public final static char DOT_X = 'X';
    public final static char DOT_O = 'O';
    public final static char EMPTY_DOT = '•';


    public static void main(String[] args) {
        initMap();
        printMap();

        if (!isFirstMove()){
            System.out.println("Ходит компьютер");
        }else {
            System.out.println("Ходит игрок");
        }

        while (true) {
            playerTurn();
            printMap();
            if (isWin(DOT_X)) {
                System.out.println("YOU WIN!");
                break;
            }
            if (isMapFull()) {
                System.out.println("У Вас ничья");
                break;
            }
            aITurn();
            printMap();
            if (isWin(DOT_O)) {
                System.out.println("YOU LOSE(((((((!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Game ended in draw");
                break;
            }
        }
    }

    private static boolean isFirstMove() {

        System.out.println("Пожалуйста выберите кто будет ходить первым:");
        System.out.println("0 - компьютер / 1 - игрок");

        int x = sc.nextInt();

        if (x > 0){
            return true;
        }else if (x <= 0 && x > 0){
            return false;
        }else
        return false;
    }



    public static boolean isMapFull() {
       int count = 0;
        for (int i = 0; i < SIZE_MAP; i++) {
            for (int j = 0; j < SIZE_MAP; j++) {
                if (map[i][j] == EMPTY_DOT) {
                count++;
                }
            }
        }
        return count == 0;
    }


    private static void aITurn() {
        int x, y;
        do {
            x = (int)(Math.random() * SIZE_MAP);
            y = (int)(Math.random() * SIZE_MAP);
        } while (!isTurnValid(x - 1, y - 1));
        map[x][y] = DOT_O;
    }

    private static boolean isTurnValid(int x, int y) {
        if (x < 0 || x > SIZE_MAP - 1 || y < 0 || y > SIZE_MAP - 1) {
            return false;
        }
        if (map[y][x] == EMPTY_DOT) {
            return true;
        }
        return false;
    }

    private static void playerTurn() {
        int x, y;
        System.out.println("Пожалуйста введите координаты Вашего хода в формате х, у");
        do {
            x = sc.nextInt();
            y = sc.nextInt();
        } while (!isTurnValid(x - 1, y - 1));
        map[x - 1][y - 1] = DOT_X;

    }

    private static void printMap() {
        for (int i = 0; i < SIZE_MAP; i++) {
            System.out.print(" " + (i + 1));
        }
        System.out.println();
        for (int i = 0; i < SIZE_MAP; i++) {
            System.out.print(i + 1 + "");
            for (int j = 0; j < SIZE_MAP; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void initMap() {
        map = new char[SIZE_MAP][SIZE_MAP];
        for (int i = 0; i < SIZE_MAP; i++) {
            for (int j = 0; j < SIZE_MAP; j++) {
                map[i][j] = EMPTY_DOT;
            }
        }
    }

    private static boolean isWin(char symbol) {
        int count = 0;
        for (int i = 0; i < SIZE_MAP; i++) {
            for (int j = 0; j < SIZE_MAP; j++) {
                if (i == SIZE_MAP - (i + 1) && map[i][j] == symbol) {
                    count++;
                } else if (i == SIZE_MAP - (i + 1) && !(map[i][j] == symbol)) {
                    count = 0;
                }else {

                }
            }
            if (count == DOT_TO_WIN) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}

