package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ������Ѱ��� {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		int[] arr;
		int test_case = Integer.parseInt(br.readLine()); 
		StringTokenizer st; //����
		
		for(int i = 0; i < test_case; i++) {
			st = new StringTokenizer(br.readLine()," ");
			
			int N = Integer.parseInt(st.nextToken()); //�л� ��
			arr = new int[N]; //n���� ����
			
			double sum = 0; //���� ���� ����
			
			for(int j = 0; j < N; j++) {
				int val = Integer.parseInt(st.nextToken());
				arr[j] = val;
				sum += val; //���� �հ�
			}
			double avg = (sum / N); //���
			double cnt = 0; //�� �Ѵ� �л� ��
			
			//��� �Ѵ� �л� ����
			for(int j = 0; j < N; j++) {
				if(arr[j] > avg) {
					cnt++;
				}
			}
			String result = String.format("%.3f", ((double)cnt/N)*100);
			sb.append(result + "%\n");
		}
		br.close();
		System.out.println(sb);
	}

}
