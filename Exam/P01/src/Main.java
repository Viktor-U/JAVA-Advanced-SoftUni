import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[size][size];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().toCharArray();
        }

        //ship spawn location -> submarine location
        int row = 0;
        int col = 0;

        int fishes = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 'S') {
                    row = i;
                    col = j;
                    break;
                }
            }
        }
        boolean isInWhirlpool = false;

        String direction = scanner.nextLine();
        while (!direction.equals("collect the nets")) {

            int newRow = 1;
            int newCol = 1;
            char symbol = ' ';

            switch (direction) {
                case "up":
                    newRow = row - 1;
                    newCol = col;
                    symbol = moveSubmarine(matrix, row, col, newRow, newCol, direction);
                    break;
                case "down":
                    newRow = row + 1;
                    newCol = col;
                    symbol = moveSubmarine(matrix, row, col, newRow, newCol, direction);
                    break;
                case "right":
                    newRow = row;
                    newCol = col + 1;
                    symbol = moveSubmarine(matrix, row, col, newRow, newCol, direction);
                    break;
                case "left":
                    newRow = row;
                    newCol = col - 1;
                    symbol = moveSubmarine(matrix, row, col, newRow, newCol, direction);
                    break;
            }

            row = newRow;
            col = newCol;
            if (newRow >= matrix.length || newCol >= matrix[0].length || newCol < 0 || newRow < 0) {
                if (direction.equals("up")) {
                    row = matrix.length - 1;
                } else if (direction.equals("down")) {
                    row = 0;
                } else if (direction.equals("right")) {
                    col = 0;
                } else {
                    col = matrix[0].length - 1;
                }
            }
            if (symbol == 'W') {
                isInWhirlpool = true;
                break;
            } else if (symbol != '-') {
                fishes += Integer.parseInt(String.valueOf(symbol));
            }

            direction = scanner.nextLine();
        }

        if (isInWhirlpool) {
            System.out.printf("You fell into a whirlpool! The ship sank and you lost the fish you caught." +
                    " Last coordinates of the ship: [%d,%d]\n", row, col);
        } else {
            if (fishes >= 20) {
                System.out.println("Success! You managed to reach the quota!");
            } else {
                System.out.printf("You didn't catch enough fish and didn't reach the quota!" +
                        " You need %d tons of fish more.\n", 20 - fishes);
            }

            if (fishes > 0) {
                System.out.printf("Amount of fish caught: %d tons.\n", fishes);
            }
            printMatrix(matrix);
        }


    }

    private static void printMatrix(char[][] matrix) {

        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }

    }

    public static char moveSubmarine(char[][] matrix, int row, int col, int newRow, int newCol, String direction) {

        char symbol;
        if (newRow >= matrix.length || newCol >= matrix[0].length || newCol < 0 || newRow < 0) {

            if (direction.equals("up")) {
                newRow = matrix.length - 1;
                newCol = col;
            } else if (direction.equals("down")) {
                newRow = 0;
                newCol = col;
            } else if (direction.equals("right")) {
                newRow = row;
                newCol = 0;
            } else {
                newRow = row;
                newCol = matrix[0].length - 1;
            }

        }

        if (matrix[newRow][newCol] == '-') {
            matrix[newRow][newCol] = 'S';
            symbol = '-';
        } else if (matrix[newRow][newCol] == 'W') {
            matrix[newRow][newCol] = 'S';
            symbol = 'W';
        } else {
            symbol = matrix[newRow][newCol];
            matrix[newRow][newCol] = 'S';
        }
        matrix[row][col] = '-';

        return symbol;

    }


}