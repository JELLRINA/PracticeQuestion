package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �м�ã�� {

	public static void main(String[] args) throws IOException {
		// �м��� �������� ��Ģ�� ã�� ����

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 1/1=2(¦�� but,�밢�� ���� Ȧ��), 1/2 2/1=3(Ȧ�� but,�밢�� ���� ¦��) ...
		//
		int X = Integer.parseInt(br.readLine());
		int cnt = 1, sum = 0; // �밢������,���� ��

		while (true) {
			if (X <= sum + cnt) {
				if (cnt % 2 == 1) { // �밢�� ������ Ȧ�����,
					System.out.print((cnt - (X - sum - 1)) + "/" + (X - sum));
					break; 
				} else { // �밢�� ������ ¦�����,
					System.out.print((X - sum) + "/" + (cnt - (X - sum - 1)));
					break; //��� �� ����
				}

			} else { //X�� �� ũ�� �÷��ְ� �ݺ��� �ٽ� �簳.
				sum += cnt;
				cnt++;
			}
			
		}

	}

}
