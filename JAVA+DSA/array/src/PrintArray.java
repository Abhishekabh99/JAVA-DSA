import java.util.Arrays;
import java.util.Scanner;

class PrintArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] a = new int[4]; // declaring and initialising of array

        for(int i=0;i<=a.length-1;i++)
        {

            System.out.print("Enter "+i +"th element of array : ");
            a[i] = in.nextInt();
        }
        System.out.println("Length of array : "+ a.length);

        System.out.println("here is your array " + Arrays.toString(a)); // this is a way to print array beautifully it will show you brackets and commas too

    }
}