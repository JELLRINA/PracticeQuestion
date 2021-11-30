package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ���μ����� {

	public static void main(String[] args) throws IOException {
		// N�� ���μ������ϴ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
 
		//i�� ��Ʈ �� ���� �۰ų� ���� ���. i*i <= N �� ��� ����.
		for (int i = 2; i <= Math.sqrt(N); i++) { //1�� �Ҽ��� �ƴϴ�. 
			while (N % i == 0) { //���������� 0�� ���� i��� �ݺ� n % 2
				sb.append(i).append('\n');
				N /= i; //���� ���� �� ���� 
			}
		}
		if (N != 1) { //N���� 1�� �ƴϸ� n��� �� ����
			sb.append(N);
		}
		System.out.println(sb);

	}

}
