package RecursiveFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �����10 {

	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		// ������� ������ ����Լ��� ��� ���� 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		//27*27ĭ �� n=27/3= 9/3= 3
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				star(i, j); //�� �޼ҵ� ȣ��
			}
			sb.append("\n");//i�� �ݺ�1 + j�ǹݺ� ���� �� 
		}
		System.out.println(sb.toString()); //���ڷ� ��ȯ�� ���

	}

	//3���� ���� �������� 1 �� ��� �������, 
	private static void star(int x, int y) {
		while (true) {
			if (y == 0) //ȣ��� j�� 0�̸� �Ѿ��
				break;
			if (y % 3 == 1 && x % 3 == 1) {
				sb.append(" ");
				return;
			}

			y /= 3; //���� 1�̾ƴ� �������� *���
			x /= 3;
		}
		sb.append("*");
	}
}
