package by.htp.lsn;

public class HomeTask1 {
	// ��������� ������ �������� �� 100 ��������� ���������� ������ �������
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[] = new int[100];

		for (int i = 0; i < 99; i++) {
			x[i] = (int) Math.round(Math.random() * 999);
			System.out.println(x[i] + " ");

		}
	}

}
