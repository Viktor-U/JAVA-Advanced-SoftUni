import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[size][size];

        for (int i = 0; i < matrix.length; i++) {
            String newRow = scanner.nextLine();
            matrix[i] = newRow.split("");
        }

        int mines = 0;
        boolean isDestroyed = false;
        int battleCruiser = 0;
        boolean isWin = false;

        int submarineRow = -1;
        int submarineCol = -1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j].equals("S")){
                    submarineRow = i;
                    submarineCol = j;
                    matrix[submarineRow][submarineCol] = "-";
                }
            }
        }

        while (true){
            String direction = scanner.nextLine();
            switch (direction){
                case "up":
                    submarineRow--;
                    if (matrix[submarineRow][submarineCol].equals("*")){
                        mines++;
                        matrix[submarineRow][submarineCol] = "-";
                        if (mines == 3){
                            isDestroyed = true;
                            break;
                        }
                    }

                    if (matrix[submarineRow][submarineCol].equals("C")){
                        battleCruiser++;
                        matrix[submarineRow][submarineCol] = "-";
                        if (battleCruiser == 3){
                            isWin = true;
                            break;
                        }
                    }

                    if (matrix[submarineRow][submarineCol].equals("-")){
                        continue;
                    }
                    break;
                case "down":
                    submarineRow++;
                    if (matrix[submarineRow][submarineCol].equals("*")){
                        mines++;
                        matrix[submarineRow][submarineCol] = "-";
                        if (mines == 3){
                            isDestroyed = true;
                            break;
                        }
                    }

                    if (matrix[submarineRow][submarineCol].equals("C")){
                        battleCruiser++;
                        matrix[submarineRow][submarineCol] = "-";
                        if (battleCruiser == 3){
                            isWin = true;
                            break;
                        }
                    }

                    if (matrix[submarineRow][submarineCol].equals("-")){
                        continue;
                    }
                    break;
                case "left":
                    submarineCol--;
                    if (matrix[submarineRow][submarineCol].equals("*")){
                        mines++;
                        matrix[submarineRow][submarineCol] = "-";
                        if (mines == 3){
                            isDestroyed = true;
                            break;
                        }
                    }

                    if (matrix[submarineRow][submarineCol].equals("C")){
                        battleCruiser++;
                        matrix[submarineRow][submarineCol] = "-";
                        if (battleCruiser == 3){
                            isWin = true;
                            break;
                        }
                    }

                    if (matrix[submarineRow][submarineCol].equals("-")){
                        continue;
                    }
                    break;
                case "right":
                    submarineCol++;
                    if (matrix[submarineRow][submarineCol].equals("*")){
                        mines++;
                        matrix[submarineRow][submarineCol] = "-";
                        if (mines == 3){
                            isDestroyed = true;
                            break;
                        }
                    }

                    if (matrix[submarineRow][submarineCol].equals("C")){
                        battleCruiser++;
                        matrix[submarineRow][submarineCol] = "-";
                        if (battleCruiser == 3){
                            isWin = true;
                            break;
                        }
                    }

                    if (matrix[submarineRow][submarineCol].equals("-")){
                        continue;
                    }
                    break;
            }

            matrix[submarineRow][submarineCol] = "S";
            if (isWin){
                System.out.println("Mission accomplished, U-9 has destroyed all battle cruisers of the enemy!");
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        System.out.print(matrix[i][j]);
                    }
                    System.out.println();
                }
                return;
            }

            if (isDestroyed){
                System.out.printf("Mission failed, U-9 disappeared! Last known coordinates [%d, %d]!%n", submarineRow, submarineCol);
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        System.out.print(matrix[i][j]);
                    }
                    System.out.println();
                }
                return;
            }



        }

    }

}