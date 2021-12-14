package Prime_Tree;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prime_Num_Tree {

	public static boolean checkprime(int n) {
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				c++;
		}
		if (c == 2)
			return true;
		else
			return false;
	}

	public static void main(String[] args) throws FileNotFoundException {

		int count = 1;
		System.out.println("Enter the Height of the tree");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();

		for (int i = 1; i <= a; i++) {
			for (int k = 1; k <= Math.pow(2, (i-1)); k++) {

				/*if (i == k) {
					System.out.print(" ");
				}

				if (i >= count) {
					System.out.print(" ");
				}*/

				while (!checkprime(count)) {
					count++;
				}
				System.out.print("  "+count+" ");
				count++;
			}
			System.out.println();
		}
	}
}

