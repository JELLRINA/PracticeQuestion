package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ũ�ξ�Ƽ�ƾ��ĺ� {

	public static void main(String[] args) throws IOException {
		// ũ�ξ�Ƽ�� ���ĺ��� ������ ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int cnt = 0; //�� ��?
		int len = str.length(); //�Է� ���ڿ�

		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);

			// ���� ch�� c �̰�, ���ڿ����� ��¿� -1�̸�(�� ���ϸ� ���� ���� ��� �ݺ��� ����x->error),
			if (ch == 'c' && i < len - 1) { 
				// ch(i+1)�� ���� ���ڰ� '=' or '-' �̸�,
				if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
					// ���� ���ڸ� �Ѿ� +1
					i++;
				}
			} else if (ch == 'd' && i < len - 1) {
				if (str.charAt(i + 1) == '-') { // d-
					i++;
				} else if (str.charAt(i + 1) == 'z' && i < len - 2) {
					if (str.charAt(i + 2) == '=') { // dz=
						i += 2;
					}
				}
			} else if ((ch == 'l' || ch == 'n') && i < len - 1) {
				if (str.charAt(i + 1) == 'j') { // lj or nj
					i++;
				}
			} else if ((ch == 's' || ch == 'z') && i < len - 1) {
				if (str.charAt(i + 1) == '=') { //s= or z=
					i++;
				}
			}
			cnt++; //for���� ��;
		}
		System.out.print(cnt);

	}

}
