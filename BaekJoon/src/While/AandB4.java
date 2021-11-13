package While;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AandB4 {

	public static void main(String[] args) throws IOException {
		//EOF(End of File) �� �̻� ���� �� �ִ� �����Ͱ� �������� ���� �� ����.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;
		
		while( (str = br.readLine()) != null) { //str�� ����� �����Ͱ� null�̸� �ݺ��� ����
			st = new StringTokenizer(str," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			sb.append(A+B).append("\n");
		}
		System.out.print(sb); //ln���� �ϸ� ctrl+z(EOF) �ȵ�.
	}

}
