package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ������ {

	public static void main(String[] args) throws IOException {
		// ��� ��츦 �õ��Ͽ� N�� �����ڸ� ���ϴ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// � �ڿ��� N�� ���� ��,ù° �ٿ� �ڿ��� N(1 �� N �� 1,000,000)�� �־�����.
		int n = Integer.parseInt(br.readLine());

		// ù° �ٿ� ���� ����Ѵ�. �����ڰ� ���� ��쿡�� 0�� ����Ѵ�.
		int result = 0;

		for (int i = 0; i < n; i++) {
			int num = i;
			// �� �ڸ��� �� ����
			int sum = 0;

			// �� �ڿ��� N�� �������� N�� N�� �̷�� �� �ڸ����� ��
			while (num != 0) {
				sum += num % 10;
				num /= 10;
			}
			if (sum + i == n) {
				result += i;
				break;
			}
		}
		System.out.println(result);

	}

}
