package by.htp.lsn;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. ��������� ������ ��������� �� A �� Z,
		// ���������� ������� ������� �� �����.

		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		char[] symbols = new char[letters.length()];
		int i = 0;

		for (char letter : letters.toCharArray()) {
			symbols[i] = letter;
			i++;

		}

		System.out.println(symbols);
	}
}
