package by.htp.lsn;

public class HomeTask2 {
	// Вывести из массива (задание 1) все чётные элементы на экран
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[] = new int[100];
		int a = 2;
		for (int i = 0; i <= 49; i++) {
			x[i] = a;
			a = a + 2;
			System.out.println(x[i] + " ");
		}

	}
}
