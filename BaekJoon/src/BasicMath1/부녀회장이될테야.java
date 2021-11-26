package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �γ�ȸ���̵��׾� {

	// 1 �� k, n �� 14
	public static int[][] APT = new int[15][15]; // ��,ȣ

	public static void main(String[] args) throws IOException {
		// ���� ������ ���� ��Ģ�� ã�� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		APT(); //ȣ��
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) { //k,n�� �ݺ��� test case�� ��
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			sb.append(APT[k][n]).append('\n');
		}
		System.out.println(sb);
	}

	public static void APT() {
		for (int i = 0; i < APT.length; i++) {
			APT[i][1] = 1; // 0������ �ְ� �������� 1ȣ���� ������,
			APT[0][i] = i; // 0���� iȣ���� i���� ���.
		}
		//��i���� jȣ�� ����� �ڽ��� �Ʒ�(i-1)���� 1ȣ���� bȣ���� ������� ���� �ո�ŭ ������� ������ ��ƾ� �Ѵ١�
		for (int i = 1; i < APT.length; i++) { // 1�� - 14��
			for (int j = 2; j < APT.length; j++) { // 2ȣ - 14ȣ
				APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
			}
		}
	}

}
