package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �Ҽ� {

	public static boolean prime_num[]; // �Ҽ� Ȯ���ϴ� �迭

	public static void main(String[] args) throws IOException {
		// 2���� X-1���� ��� ������ X�� �Ҽ����� �Ǻ��ϴ� ���� 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());

		prime_num = new boolean[N + 1]; //�迭 �Ҵ�
		get_prime_num();

		// �Ҽ���
		int sum = 0; // �հ�
		int min = Integer.MAX_VALUE; // �ּڰ� 2147483647 ����
		for (int i = M; i <= N; i++) {
			if (prime_num[i] == false) { // �Ҽ� �� ��� +sum
				sum += i;
				if (min == Integer.MAX_VALUE) {
					min = i;
				}
			}
		}

//		if(sum == 0) { //�Ҽ��� ���� ��� ù° �� -1���
//			System.out.println(-1);
//		}
//		else {
//			System.out.println(sum);
//			System.out.println(min);
//
//		}
		System.out.println(sum != 0 ? sum + "\n" + min : -1);

	}

	private static void get_prime_num() {
		prime_num[0] = true; // �Ҽ��� �ƴ� 0,1�� true
		prime_num[1] = true;

		// �Ҽ� �ɷ�����
		for (int i = 2; i <= Math.sqrt(prime_num.length); i++) {
			if (prime_num[i]) { // �迭
				continue;
			}
			for (int j = i * i; j < prime_num.length; j += i) { // i�� ����� �Ҽ��� �ƴϹǷ� ��� üũ
				prime_num[j] = true; // �Ҽ��� �ƴѼ� true
			}
		}

	}

}
