package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ���ͺб��� {

	public static void main(String[] args) throws IOException {
		// ������ �߻��ϴ� ������ ã�� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()); //�� ĭ
		
		// A/C-B +1 = ���ͺб���
		int A = Integer.parseInt(st.nextToken()); //�������
		int B = Integer.parseInt(st.nextToken()); //�������
		int C = Integer.parseInt(st.nextToken()); //�Ǹź��
		
		//C��B�� ������ '-'������ 0�� �ǹǷ� '<='
		if(C <= B) {
			System.out.println("-1"); //���ͺб����� �������� ������ -1�� ����Ѵ�.

		}else {
			System.out.println((A/(C-B))+1);

		}
	}

}
