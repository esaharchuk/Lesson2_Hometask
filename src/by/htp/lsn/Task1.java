package by.htp.lsn;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. �������� ������ ������ ���� � ��������� ������
		// ���������� �� 1 �� 100. ������� ���������� ������� �� �����.
		// ��� ���������� ������������ ���� for, ��� ������ - ����� ���� for

		int x[] = new int[100];
		int a = 1;
		for (int i = 0; i <= 99; i++) {
			x[i] = a;
			a++;

			System.out.println(x[i] + " ");

		}
	}
}