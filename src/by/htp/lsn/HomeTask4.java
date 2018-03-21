package by.htp.lsn;

public class HomeTask4 {
	// Подсчитать количество чётных и нечётных элементов в массиве из задания 1,
	// вывести количество четных и нечетных на экран
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int counterEven = 0;
		int counterOdd = 0;

		int x[] = new int[100];

		for (int i = 0; i < 100; i++) {
			x[i] = (int) Math.round(Math.random() * 999);
			System.out.print(x[i] + " ");
			if (x[i] % 2 == 0) {
				counterEven++;
			} else {
				counterOdd++;
			}
		}
		System.out.println("\n" + counterEven);
		System.out.println("\n" + counterOdd);
	}

}
