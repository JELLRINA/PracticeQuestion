package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class �ּ��ִ밪ã�� {

	public static void main(String[] args) throws IOException {
		// type.1
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		int n = Integer.parseInt(br.readLine());
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//		int index = 0;
//		int[] arr = new int[n];
//		while (st.hasMoreTokens()) { // st�� ��ū�� ������ true, �ƴϸ� false�� ��ȯ.
//			arr[index] = Integer.parseInt(st.nextToken());
//			index++;
//		}
//		Arrays.sort(arr);
//		System.out.print(arr[0] + " " + arr[n - 1]);

		// type.2 not array
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// ex.��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
		int max = -1000001;
		int min = 1000001;

		while (st.hasMoreTokens()) {
			int n = Integer.parseInt(st.nextToken());
			if (n > max) {
				max = n;
			}
			if (n < min) {
				min = n;
			}
		}
		System.out.println(min + " " + max);


	}

}
