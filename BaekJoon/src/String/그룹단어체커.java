package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �׷�ܾ�üĿ {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		// ���ǿ� �´� ���ڿ��� ã�� ����

		int cnt = 0;
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			if (check()) { // check �޼ҵ� ȣ��� ������
				cnt++;
			}
		}
		System.out.print(cnt);

	}

	// check �޼ҵ� ����
	public static boolean check() throws IOException {
		boolean[] check = new boolean[26]; // �׷�ܾ� üũ
		int pre = 0; // �����ܾ�
		String str = br.readLine(); // �ܾ� �Է�

		// �ܾ���̸�ŭ �ݺ�.
		for (int i = 0; i < str.length(); i++) {
			// ����ܾ�
			int now = str.charAt(i);

			if (pre != now) { // ������ ���簡 �ٸ����
				if (check[now - 'a'] == false) { // �ߺ��Ǵ��� Ȯ���ϱ�.
					check[now - 'a'] = true;
					pre = now;
					// ���� �ܾ ������ ��� ����
				} else {
					return false;
				}
			}
			/*���ӵ� ���� ���ڶ�� �������ڷ� �ݺ�.(pre == now) 
			boolean default���� false�� ��������.
			
			else {
				continue;
			}*/
		}
		return true; //�޼ҵ� ����
	}
}
