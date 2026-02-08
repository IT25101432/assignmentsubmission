public class IT25101432q4 {
    public static void main(String[] args) {

        // Using while loop
        System.out.println("Using while loop");
        int i = 0;
        while (i < 5) {
            int j = 0;
            while (j < 5) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println();

        // Using for loop
        System.out.println("Using for loop");
        for (int a = 1; a <= 5; a++) {
            for (int b = 5 - a; b > 0; b--) {
                System.out.print("  ");
            }
            for (int c = 1; c <= a; c++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}
