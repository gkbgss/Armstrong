import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Starting range :");
        int y = sc.nextInt();
        System.out.println("Enter The Ending  range :");
        int x = sc.nextInt();
        int ct = 0;
        for (int j = y; j <= x; j++) {
            int count = getcount(j);
            boolean gk = getarm(j, count);

            if (gk) {
                System.out.println(j + "Number Is Armstrong ");
                ct = ct + 1;
            }

        }
        System.out.println("Total No. of Counts are " + ct);
    }

    public static int getcount(int j) {
        int c = 0;
        while (j != 0) {
            j = j / 10;
            c = c + 1;
        }
        return c;
    }

    public static boolean getarm(int j, int count) {
        int b = j;
        int t = j;
        int sum = 0;
        while (j > 0) {
            b = j % 10;
            sum = sum + getpow(b, count);
            j = j / 10;
        }

        return (sum == t);
    }

    public static int getpow(int b, int count) {
        int pow = 1;
        while (count > 0) {
            pow = pow * b;
            count = count - 1;
        }
        return pow;
    }
}