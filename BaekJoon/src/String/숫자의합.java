package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �������� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		br.readLine(); //getbytes����ϹǷ� (��������)n�� �ʿ����.
//		
//		int sum = 0; 
//		
//		for(byte value : br.readLine().getBytes()) {
//			sum += (value - '0');
//		}
//		System.out.print(sum);

		int N = Integer.parseInt(br.readLine());
		String A = br.readLine();
		
		int sum = 0;
		
		for(int i =0; i < N; i++) {
			sum += A.charAt(i)-'0';
		}
		System.out.print(sum);

	}

}
