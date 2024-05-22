import java.util.Scanner;

public class P02NavyBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[size][size];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().toCharArray();
        }

        //submarine spawn location -> submarine location
        int row = 0;
        int col = 0;
        
        int health = 3;
        int enemies = 3;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 'S'){
                    row = i;
                    col = j;
                    break;
                }
            }
        }

        String direction = scanner.nextLine();
        while (health != 0 && enemies != 0){

            int newRow = 1;
            int newCol = 1;
            char symbol = ' ';
            
            switch (direction){
                case "up":
                    newRow = row - 1;
                    newCol = col;
                    symbol = moveSubmarine(matrix,row, col, newRow,newCol);
                    break;
                case "down":
                    newRow = row + 1;
                    newCol = col;
                    symbol = moveSubmarine(matrix,row, col, newRow,newCol);
                    break;
                case "right":
                    newRow = row;
                    newCol = col + 1;
                    symbol = moveSubmarine(matrix,row, col, newRow,newCol);
                    break;
                case "left":
                    newRow = row;
                    newCol = col - 1;
                    symbol = moveSubmarine(matrix,row, col, newRow,newCol);
                    break;
            }

            row = newRow;
            col = newCol;

            if (symbol == '*'){
                health--;
            } else if (symbol == 'C') {
                enemies--;
            }

            if (health != 0 && enemies != 0) {
                direction = scanner.nextLine();
            }
        }

        if (health == 0){
            System.out.printf("Mission failed, U-9 disappeared! Last known coordinates [%d, %d]!\n",row, col);
        }else {
            System.out.println("Mission accomplished, U-9 has destroyed all battle cruisers of the enemy!");
        }

        printMatrix(matrix);



    }

    private static void printMatrix(char[][] matrix) {

        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }

    }

    public static char moveSubmarine (char[][] matrix,int row, int col, int newRow, int newCol){

        char symbol;

        if (matrix[newRow][newCol] == '-'){
            matrix[newRow][newCol] = 'S';
            symbol = '-';
        }else if (matrix[newRow][newCol] == 'C'){
            matrix[newRow][newCol] = 'S';
            symbol = 'C';
        }else {
            matrix[newRow][newCol] = 'S';
            symbol = '*';
        }
        matrix[row][col] = '-';

        return symbol;

    }


}
    