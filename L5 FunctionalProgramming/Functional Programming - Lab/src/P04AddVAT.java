import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class P04AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] prices = Arrays.stream(scanner.nextLine().split(", ")).mapToDouble(Double::parseDouble).toArray();


        Function<double[], double[]> adVat = arr -> Arrays.stream(arr).map(e -> e * 1.2).toArray();

        System.out.println("Prices with VAT:");
        for (double v : adVat.apply(prices)) {
            System.out.printf("%.2f%n",v);
        }




    }
}
