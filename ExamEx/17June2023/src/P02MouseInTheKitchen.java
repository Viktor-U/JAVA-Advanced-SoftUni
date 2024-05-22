import java.util.Scanner;

public class P02MouseInTheKitchen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] size = scanner.nextLine().split(",");
        int rows = Integer.parseInt(size[0]);
        int cols = Integer.parseInt(size[1]);

        char[][] area = new char[rows][cols];
        fillMatrix(area, scanner);

        int row = 0;
        int col = 0;

        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[0].length; j++) {

                if (area[i][j] == 'M'){
                    row = i;
                    col = j;
                    break;
                }
            }
        }

        boolean isEnd = true;



        String input = scanner.nextLine();
        while (!input.equals("danger") && isEnd && isContainCheese(area)){
            int newRow = 0;
            int newCol = 0;

            switch (input){
                case "up":
                    newRow = row - 1;
                    newCol = col;
                    isEnd = moveMouse(row, col, newRow, newCol, area);
                    break;
                case "down":
                    newRow = row + 1;
                    newCol = col;
                    isEnd = moveMouse(row, col, newRow, newCol, area);
                    break;
                case "right":
                    newRow = row;
                    newCol = col + 1;
                    isEnd = moveMouse(row, col, newRow, newCol, area);
                    break;
                case "left":
                    newRow = row;
                    newCol = col - 1;
                    isEnd = moveMouse(row, col, newRow, newCol, area);
                    break;
            }
            if (isEnd) {
                if (area[newRow][newCol] != '@') {
                    row = newRow;
                    col = newCol;
                }
            }



            input = scanner.nextLine();
        }

        if (isEnd) {
            boolean isContainCheese = isContainCheese(area);

            if (!isContainCheese) {
                System.out.println("Happy mouse! All the cheese is eaten, good night!");
            } else {
                System.out.println("Mouse will come back later!");
            }


            printMatrix(area);
        }
    }

    private static boolean isContainCheese(char[][] area) {
        boolean isContainCheese = false;

        for (char[] chars : area) {
            for (char aChar : chars) {
                if (aChar == 'C') {
                    isContainCheese = true;
                    break;
                }
            }
        }
        return isContainCheese;
    }

    private static boolean moveMouse(int row, int col, int newRow, int newCol, char[][] area) {

        boolean isEnd = true;

        if (newRow >= area.length || newCol >= area[0].length || newCol < 0 || newRow < 0){
            System.out.println("No more cheese for tonight!");
            printMatrix(area);
            isEnd = false;
        }else {
            if (area[newRow][newCol] == '*' || area[newRow][newCol] == 'C') {
                area[row][col] = '*';
                area[newRow][newCol] = 'M';

            } else if (area[newRow][newCol] == 'T') {
                area[row][col] = '*';
                area[newRow][newCol] = 'M';
                System.out.println("Mouse is trapped!");
                printMatrix(area);
                isEnd = false;
            }
        }
        return isEnd;
    }
    public static void printMatrix(char[][] matrix){

        for (char[] chars : matrix) {
            for (char c : chars) {
                System.out.print(c);
            }
            System.out.println();
        }

    }

    private static void fillMatrix(char[][] area, Scanner scanner) {
        for (int i = 0; i < area.length; i++) {
            area[i] = scanner.nextLine().toCharArray();
        }
    }
}
