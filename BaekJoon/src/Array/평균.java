package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ��� {

	public static void main(String[] args) throws IOException {
		// ��� ���� ����.
		//type.1
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		//������� or ������ == double
//		double arr[] = new double[Integer.parseInt(br.readLine())];
//		StringTokenizer st = new StringTokenizer(br.readLine()," ");
//		
//		for(int i = 0; i < arr.length; i++ ) {
//			arr[i] = Double.parseDouble(st.nextToken());
//		}
//		double sum = 0;
//		//�������� ���� import arrays
//		Arrays.sort(arr);
//		
//		for (int i = 0; i < arr.length; i++) {
//			//����/�ִ�(M)*100
//			sum += ((arr[i] / arr[arr.length-1])*100);
//		}
//		System.out.print(sum / arr.length);

		//type.2 not array
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()); // �Է°���

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int max = -1; //value�� ���� �ƴ� ����, 0���� Ŀ����
		double sum = 0.0;

		for (int i = 0; i < n; i++) {
			int value = Integer.parseInt(st.nextToken());

			if (value > max) {
				max = value;
			}

			sum += value;
		}

		System.out.println(((sum / max) * 100.0) / n);

	}

}
