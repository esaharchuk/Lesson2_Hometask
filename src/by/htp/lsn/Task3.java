package by.htp.lsn;

public class Task3 {

	public static void main(String[] args) {
		int[] a = new int[100];
		int i = 0;
		int b = 2;
		while (i < 99) {
			a[i] = b;
			b += 2;
			i++;
		}
		for (i = 0; i < 50; i++)
			System.out.print(a[i] + " ");

	}
}
