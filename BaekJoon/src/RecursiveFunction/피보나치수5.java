package RecursiveFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �Ǻ���ġ��5 {

	public static void main(String[] args) throws IOException {
		// �Ǻ���ġ �� ���� �ܼ� for�����ε� ���� �� ������, �н��� ���� ��͸� �� ���ô�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		// �迭�� 0���� �����̹Ƿ� N+1���ֱ�
		int[] fibonacci = new int[N + 1];

		for (int i = 0; i < fibonacci.length; i++) {
			// 0 �� 1 �� ��� ���� �ʱ�ȭ
			if (i == 0)
				fibonacci[0] = 0;
			else if (i == 1)
				fibonacci[1] = 1;
			
			//Fn = Fn-1 + Fn-2 (n �� 2)
			else
				fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		System.out.println(fibonacci[N]);
	}

}
