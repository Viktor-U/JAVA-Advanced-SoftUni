import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();
        Map<String, Double> map = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] arr = scanner.nextLine().split("\\s+");

            Employee employee = new Employee();

            employee.setName(arr[0]);
            employee.setSalary(Double.parseDouble(arr[1]));
            employee.setDepartment(arr[3]);

            switch (arr.length){

                case 5:
                    if (arr[4].matches("\\d+")){
                        employee.setAge(arr[4]);
                    }else {
                        employee.setEmail(arr[4]);
                    }
                    break;
                case  6:
                    employee.setEmail(arr[4]);
                    employee.setAge(arr[5]);
                    break;
            }
            employees.add(employee);
        }

        for (Employee employee : employees) {

            if (map.containsKey(employee.getDepartment())){

                map.put(employee.getDepartment(), map.get(employee.getDepartment()) + employee.getSalary());

            }else {

                map.put(employee.getDepartment(), employee.getSalary());

            }
        }

        String maxDepartment = "";
        double maxSalary = Double.MIN_VALUE;

        for (var entry : map.entrySet()) {

            if (entry.getValue() > maxSalary){
                maxSalary = entry.getValue();
                maxDepartment = entry.getKey();
            }

        }


        String finalMaxDepartment = maxDepartment;


        System.out.println("Highest Average Salary: " + maxDepartment);

        employees.stream().filter(e -> e.getDepartment().equals(finalMaxDepartment))
                .sorted((a,b) -> Double.compare(b.getSalary(), a.getSalary()))
                .forEach(System.out::println);

    }
}