import java.util.Scanner;

public class MinMax {

    // a) Method to find minimum
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min)
                min = num;
        }
        return min;
    }

    // b) Method to find maximum
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        return max;
    }

    // c) Method to find both min and max
    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {

        if (args.length > 0) {
            int[] cmdArray = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                cmdArray[i] = Integer.parseInt(args[i]);
            }

            System.out.println("Command Line Input:");
            System.out.println("Min: " + findMin(cmdArray));
            System.out.println("Max: " + findMax(cmdArray));
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter array size: ");
        int n = sc.nextInt();

        int[] scannerArray = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            scannerArray[i] = sc.nextInt();
        }

        int[] result = findMinMax(scannerArray);
        System.out.println("Scanner Input:");
        System.out.println("Min: " + result[0]);
        System.out.println("Max: " + result[1]);

        sc.close();
    }
}