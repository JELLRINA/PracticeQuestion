package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �����ǰ��� {

	public static void main(String[] args) throws IOException {
		
		// �� ���ڰ� �� �� ���Դ��� �����ϱ� ���� ������ �迭�� ����� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//0-9���� �迭 ����
		int[] arr = new int[10];
		
		//n�� ���� A,B,C�� ����
		int n = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		
		//int���� string���� ��ȯ
		String str = String.valueOf(n);
		
		//string���� �ƽ�Ű�ڵ� -48 or -'0' �� ���� �� +1
		for (int i = 0; i < str.length(); i++) {
			arr[(str.charAt(i)-48)]++;
		}
		for(int result : arr) {
			System.out.println(result);

		}
	}

}
