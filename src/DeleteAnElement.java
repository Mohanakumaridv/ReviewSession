import java.util.Scanner;
class DeleteAnElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int i, n, pos;
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt()-1;
        int[] a = new int[n];

        System.out.println("Enter the elements: ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the position of the number which element has to be deleted");
        pos = sc.nextInt();

        for (i = pos; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        n = n - 1;
        System.out.println("the element which on deleting new array we get :");
        for (i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
