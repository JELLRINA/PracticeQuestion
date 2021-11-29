package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FlyMeToTheAlphaCentauri {

	public static void main(String[] args) throws IOException {
		// �Ÿ��� ���� ��ġ ��� Ƚ���� ����ϴ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); // �ѹ��� ���

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " "); // ���ڿ� �и�

			// x�� �׻� y���� ���� ���� ���´�. (0 �� x < y < 231)
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());

			int distance = Y - X; // �Ÿ�
			int max = (int) Math.sqrt(distance); // �Ÿ��� ��Ʈ �� int������.

			// �ּ����� �����̵� ��ġ �۵� Ƚ���� ����Ѵ�.
			if (max == Math.sqrt(distance)) {
				sb.append(max * 2 - 1).append('\n'); // k-1,
			} else if (distance <= max * max + max) {
				sb.append(max * 2).append('\n'); // k Ȥ��
			} else {
				sb.append(max * 2 + 1).append('\n'); // k+1 ���⸸�� �ٽ� �̵�
			}

		}
		System.out.print(sb);

	}

}
