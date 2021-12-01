package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class �Ҽ�ã�� {

	public static void main(String[] args) throws IOException {
		// 2���� X-1���� ��� ������ X�� �Ҽ����� �Ǻ��ϴ� ���� 1

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		br.readLine();
		int cnt = 0;

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		while (st.hasMoreTokens()) { //true�� ��ȯ�ϸ� ��ū�� ���� 
			boolean value = true;

			int num = Integer.parseInt(st.nextToken());

			if (num == 1) { // 1�� �Ҽ��� �ƴϴ�.
				continue;
			}
			//�Ҽ��� �Ǻ��� num-1�� �ƴ� 2���� ���� num�� �����ٱ��� �˻�
			for (int i = 2; i <= Math.sqrt(num); i++) { 
				if (num % i == 0) {
					value = false;
					break;
				}
			}
			if (value) { // �ƴϸ� �Ҽ��� ���� +1����
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
