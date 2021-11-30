package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ������������ {

	public static boolean[] prime = new boolean[10001];

	public static void main(String[] args) throws IOException {
		// �Ҽ� ���� ���� 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		get_prime();

		int T = Integer.parseInt(br.readLine()); // �־����� �׽�Ʈ���̽� ����

		// �� '�Ҽ�'�� ���̰� ���� ���� ���� ����Ѵ�.
		while (T-- > 0) {
			int n = Integer.parseInt(br.readLine()); // ¦�� n
			int first = n / 2; //p��q�� �Ҽ�
			int second = n / 2;
			
			while (true) {
				//�� ���� �Ҽ��� ��쿡�� ���
				if(!prime[first] && !prime[second]) {
					//�������� �����Ѵ�.
					sb.append(first).append(' ').append(second).append('\n');
					break;
				}
				//����ϴ� �Ҽ��� ���� �ͺ��� ���� ����ϸ�,(���� ������ ���ְ� �ݺ�.)
				first--;
				second++;
			}
		}
		System.out.println(sb);

	}

	private static void get_prime() {
		// 0,1�� �Ҽ��� �ƴϴ�
		prime[0] = prime[1] = true;

		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if (prime[i])
				continue;
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}

}
