package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ���� {

	public static void main(String[] args) throws IOException {
		// ������ �����Ǵ� ��Ģ�� ���� ������ ��ġ�� ���ϴ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 1; //�� ����
		int range = 2; //1���� �ּڰ� ����
		
		if (N == 1){ //n�� 1�� ��� 1 ���
			System.out.print(1);
		}
		else {
			while(range <= N) { //N�� �ѱ� ������ �ݺ�
				range = range + (6 * cnt); //�ݺ� �� �ּڰ� ���� ����
				cnt++;
			}
			System.out.print(cnt);

		}

	}

}
