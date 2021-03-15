package HomeWork_4;

import java.util.Scanner;

public class HomeWork_4 {
    public static int SIZE = 3;
    //public static int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    //public static Random rand = new Random();

    /*public static boolean checkWin(char symb) {
        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;
    }*/

    public static boolean checkWin2(char symbol) {
        int mainDiagonalWin = 0;
        int sideDiagonalWin = 0;

        for (int i = 0; i < SIZE; i++) {
            int rowWin = 0;
            int colWin = 0;

            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symbol)
                    rowWin++;

                if (map[j][i] == symbol)
                    colWin++;
            }

            if (map[i][i] == symbol)
                mainDiagonalWin++;

            if (map[i][SIZE - i - 1] == symbol)
                sideDiagonalWin ++;

            if (rowWin == SIZE || colWin == SIZE || mainDiagonalWin == SIZE || sideDiagonalWin == SIZE)
                return true;
        }

        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    /*public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }*/

    public static void aiTurn2() {
        int x = -1;
        int y = -1;

        boolean flagWin = false;

        for (int j = 0; j < SIZE; j++)
        {
            for (int i = 0; i < SIZE; i++)
            {
                if (isCellValid(j, i))
                {
                    x = i;
                    y = j;

                    char tmp = map[i][j];
                    map[i][j] = DOT_X;

                    if (checkWin2(DOT_X))
                        flagWin = true;

                    map[i][j] = tmp;

                    if (flagWin)
                        break;
                }
            }

            if (flagWin)
                break;
        }

        System.out.println("Компьютер походил в точку " + (y + 1) + " " + (x + 1));
        map[x][y] = DOT_O;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE)
            return false;

        return map[y][x] == DOT_EMPTY;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Компьютер можно победить:");
        System.out.println("1: (2, 2)");
        System.out.println("2: (2, 3) | (1, 1)");
        System.out.println("3: (1, 2) | (2, 1)");
        System.out.println("4: (1, 3) | (3, 1)");

        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin2(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn2();
            printMap();
            if (checkWin2(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
}
