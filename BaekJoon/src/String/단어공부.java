package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �ܾ���� {

	public static void main(String[] args) throws IOException {
		// �־��� �ܾ�� ���� ���� ���� ���ĺ��� ����ϴ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[26]; //a-z,A-Z
		String str = br.readLine(); //�־����� �ܾ��� ���̴� 1,000,000�� ���� �ʴ´�.

		for (int i = 0; i < str.length(); i++) {
			if (65 <= str.charAt(i) && str.charAt(i) <= 90) {
				arr[str.charAt(i) - 65]++; // �빮�� (65-90) ,++:�ε����� +1����
			} else {
				arr[str.charAt(i) - 97]++; // �ҹ��� (97-122)
			}
		}

		int max = -1; 
		char ch = '?';

		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i]; // ���� ���� ���� ���ĺ�
				ch = (char) (i + 65); // �빮�ڷ� ���(ĳ����)
			} else if (arr[i] == max) {
				ch = '?'; //������ ���� �� ��� 
			}
		}
		System.out.print(ch);

	}

}
