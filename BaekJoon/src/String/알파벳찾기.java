package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ���ĺ�ã�� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[26]; //a-z: 26

		for (int i = 0; i < arr.length; i++) { //-1�� ��� ���
			arr[i] = -1; //�Է� �ȵ� ���ĺ��� -1�� ���.
		}
		String S = br.readLine(); //���ڿ� �Է�. ex)baekjoon 8��
		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i); //���� ���� �� ch�� ����

			if (arr[ch - 'a'] == -1) { // arr = -1(�Է¾ȵȹ迭��)�̸� �ʱ�ȭ.
				arr[ch - 'a'] = i;	   // arr[b:98]-97= [1]�ڸ��� i(���°����:0) ����.
			}
		}
		for(int val : arr) {
			System.out.print(val + " "); //line12 print

		}
	}

}
