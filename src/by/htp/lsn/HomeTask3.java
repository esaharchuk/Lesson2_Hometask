package by.htp.lsn;

//��������� ������ �� 100 ��������� ������ ������� �� 1 �� 100, ������� ��
//����� ���������� ������� � ���� ������, �������� ������ ����� ������� � ���������, ��������� ������� �� ����� � ���� ������.
public class HomeTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = new int[100];
		int a = 1;
		for (int i = 0; i < 100; i++) {
			x[i] = a;
			a++;
			System.out.print(x[i] + " ");

		}
		for (int i = 0; i < 0; i += 2) {
			int b = x[i];
			x[i] = x[i + 1];
			x[i + 1] = b;
			System.out.print(x[i] + " ");
			System.out.println(x[i + 1] + " ");
		}
	}

}
