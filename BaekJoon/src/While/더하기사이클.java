package While;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ���ϱ����Ŭ {

	public static void main(String[] args) throws IOException {
		// ���� ���� ���ƿ� ������ ������ �ݺ��ϴ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int cnt = 0; //�ݺ������� ��
		int copy = n; //����

		do {
			n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10); //�� �� ���ؼ� �ٽ� �ǵ��� ���� ���� ã�� ����
			cnt++;
		} while (copy != n); //�Էµ� ���� ���� ���� �ٸ� ��� �ݺ� �� ==�Ǹ� print

		System.out.println(cnt);

	}

}
