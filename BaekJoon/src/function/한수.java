package function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �Ѽ� {

	public static void main(String[] args) throws IOException {
		// X�� �Ѽ����� �Ǻ��ϴ� �Լ��� �����Ͽ� ������ �ذ�. 1-99�� ������ ��������. 1-9,10-99 = �Ѽ�
		// ù°�׺��� ���ʷ� ������ ���� ���� ��������� ���� = �������� / ������ �� = ���� ex)222 ->0
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print(hansu(Integer.parseInt(br.readLine())));

	}

	public static int hansu(int num) {
		int cnt = 0; // �Ѽ��� ����

		if (num <= 99) { // 100���� ���� ��� �����ϸ� �ݺ��� x
			return num;
		} else {
			cnt = 99;
			if (num == 1000) { // 1000�� ���������� x, ����ó��
				num = 999;
			}

			for (int i = 100; i <= num; i++) {
				int hun = i / 100; // �����ڸ�
				int ten = (i / 10) % 10; // �����ڸ�
				int one = i % 10; // �����ڸ�

				if ((hun - ten) == (ten - one)) {
					cnt++;
				}
			}
		}

		return cnt;
	}

}
