package by.htp.lsn;

public class HomeTask5 {

	public static void main(String[] args) {
		// ����� ������������ ������� ������� �� ������� 1, ������� ��������
		// ������������� �������� �� �����

		int x[] = new int[100];

		for (int i = 0; i < 100; i++) {
			x[i] = (int) Math.round(Math.random() * 999);
		}

		int max = x[0];
		for (int i = 0; i < 100; i++) {
			if (x[i] > max) {
				max = x[i];
			}

			System.out.println("Max: " + max);
		}
	}
}
