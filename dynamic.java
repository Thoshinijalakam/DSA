import java.util.*;

public class dynamic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers separated by commas :");
        String input = sc.nextLine();
        sc.close();
        String[] parts = input.split(",");
        int sum = 0;
        System.out.println("entered number:");
        for (int i = 0; i < parts.length; i++) {
            try {
                int num = Integer.parseInt(parts[i].trim());
                System.out.println("Number " + (i + 1) + ": " + num);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number at position " + (i + 1) + ": '" + parts[i].trim() + "'");
                return;
            }
        }

        System.out.println("Sum = " + sum);
    }
}
