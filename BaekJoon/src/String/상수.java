package String;

import java.io.IOException;
import java.util.Scanner;

public class ��� {

	public static void main(String[] args) throws IOException {
		// ���ڸ� ����� ���ϴ� ����
		//type.1
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
//		//�� ���� ���� ���� �� �ڸ� ���̸�, 0�� ���ԵǾ� ���� �ʴ�.
//		
//		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString()); //�Էµ� ����� �Ųٷ� ����
//		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString()); //���ڰ� string type �̹Ƿ� append ���x
//
////		System.out.print(A > B ? A : B); 
//
//		if( A > B)
//			System.out.print(A);
//		else
//			System.out.print(B);

		//type.2
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		sc.close();

		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString()); //tostring:sb�� ���ڿ� ��ȯ
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

		System.out.print(A > B ? A : B);

	}

}
