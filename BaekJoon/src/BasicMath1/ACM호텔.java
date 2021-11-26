package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACMȣ�� {

	public static void main(String[] args) throws IOException {
		// ȣ�� �� ��ȣ�� ��Ģ�� ã�� ����ϴ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine()); // ȣ��
		StringBuilder sb = new StringBuilder();

		// ȣ�� �������κ��� �ɾ ���� ª�� �Ÿ��� �ִ� ���� ��ȣ
		for (int i = 0; i < T; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int H = Integer.parseInt(st.nextToken()); // �� ��
			//int W = Integer.parseInt(st.nextToken()); // �� ��(�ʿ�x)
			int N = Integer.parseInt(st.nextToken()); // N��° �մ�

			// ���� ���, H = 6�̹Ƿ� 10 ��° �մ��� 402 ȣ�� �����ؾ� �Ѵ�. == 6%10=4=*100+(6/10)=+1=2=402
			if (N % H == 0) { //0�� ������ 0���� �ǹǷ� ���� �ɱ�.
				sb.append((H * 100) + (N / H)).append('\n');
			} else { // �������� 0�� �ƴ� ���,
				sb.append(((N % H) * 100) + ((N / H) + 1)).append('\n');
			}
		}
		System.out.print(sb);

	}

}
