package RecursiveFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ���丮�� {

	public static void main(String[] args) throws IOException {
		// ���丮���� �ܼ� for�����ε� ���� �� ������, �н��� ���� ��͸� �� ���ô�.
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * int N = Integer.parseInt(br.readLine()); int result = factorial(N);
		 * System.out.println(result);
		 * 
		 * }
		 * 
		 * private static int factorial(int N) { // TODO Auto-generated method stub if
		 * (N <= 1) return 1; // 0!=1 0,1�� �� ��� return 1 return N * factorial(N - 1);
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int sum = 1;

		//// N �� 0�� �ƴ� �� ���� 1�� �����ϸ鼭 sum�� �ݺ������� �����ش�
		while (N != 0) {
			sum = sum * N;
			N--;
		}
		System.out.println(sum);

	}

}
