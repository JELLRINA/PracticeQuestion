package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class ū��AandB {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//		String str_A = st.nextToken();
//		String str_B = st.nextToken();
//
//		//�� ���ڿ� �� ���� �� ���� ����
//		int max_length = Math.max(str_A.length(), str_B.length());
//
//		int[] A = new int[max_length + 1];
//		int[] B = new int[max_length + 1];
//
//		// A�ʱ�ȭ
//		for (int i = str_A.length() - 1, idx = 0; i >= 0; i--, idx--) {
//			A[idx] = str_A.charAt(i) - '0'; //�� �� ���ں��� ��������(�ϳ���) ����
//		}
//
//		// B�ʱ�ȭ
//		for (int i = str_B.length() - 1, idx = 0; i >= 0; i--, idx--) {
//			B[idx] = str_B.charAt(i) - '0';
//		}
//		
//		//A�迭 ���� ���
//		StringBuilder sb = new StringBuilder();
//		if(A[max_length] != 0) { //0�� �ƴ� ��쿡�� ���
//			sb.append(A[max_length]);
//		}
//		
//		for(int i = max_length - 1; i >=0; i++) {
//			sb.append(A[i]);
//		}
//		
//		System.out.println(sb);


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		
		A = A.add(B);
		
		System.out.println(A.toString());

	}

}
