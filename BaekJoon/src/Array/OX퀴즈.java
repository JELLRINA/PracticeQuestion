package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OX���� {

	public static void main(String[] args) throws IOException {
		//OX ������ ����� ������ �迭�� �Է¹޾� ������ ����ϴ� ����
		//type.1
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		StringBuilder sb = new StringBuilder();
//		int test_case = Integer.parseInt(br.readLine()); // bufferedReader�� ���ڿ��� �Է� �ǹǷ� int��ȯ
//		String arr[] = new String[test_case]; // ���̰�... 0 < 80 array
//
//		for (int i = 0; i < test_case; i++) {
//			arr[i] = br.readLine();
//		}
//		for (int i = 0; i < test_case; i++) {
//			int cnt = 0; // ����
//			int sum = 0; // ����
//
//			for (int j = 0; j < arr[i].length(); j++) {
//				if (arr[i].charAt(j) == 'O') { 
//					cnt++;
//				} else {
//					cnt = 0;
//				}
//				sum += cnt; // if or else ���� ������.
//			}
//			sb.append(sum).append("\n"); // sb�� ���ڿ� �̾��ְ� ����.
//		}
//		System.out.print(sb); //31�� ���.

		//type.2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int test_case = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < test_case; i++) {
			
			int cnt = 0;
			int sum = 0;
			
			for(byte value : br.readLine().getBytes()) {
			//for-each ����	 getBytes():���ڿ��� byte ������ �迭�� ��ȯ
				if (value == 'O') {
					cnt++;
					sum += cnt;
				}
				else {
					cnt = 0;
				}
			}
			sb.append(sum).append('\n');
		}
		System.out.print(sb);

	}

}
