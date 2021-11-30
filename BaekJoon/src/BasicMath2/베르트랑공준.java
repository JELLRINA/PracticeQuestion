package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ����Ʈ������ {

	public static boolean[] prime = new boolean[246913]; //n=123456 -> n2=246912+1
	public static void main(String[] args) throws IOException {
		// �Ҽ� ���� ���� 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		get_prime();//�޼ҵ� ȣ��
		
		while(true) {
			int N = Integer.parseInt(br.readLine()); //n�� �־����� �� 
			if(N == 0) break; //n�� 0�� ��� ���� : �Է��� ���������� 0�� �־�����.
			
			int cnt = 0; //���� ����
			//1 �� n �� 123,456
			for(int i = N + 1; i <=2*N; i++) {//n����ũ�� 2n���� �۰ų� ���� 
				if(!prime[i]) cnt++;
			}
			sb.append(cnt).append('\n'); //�Ҽ��� ������ ���ϴ� ���α׷� �ۼ�.

		}
		System.out.println(sb);

	}
	//�����佺�׳׽��� ü ����
	private static void get_prime() {
		// 0,1�� �Ҽ��� �ƴϹǷ� true.
		prime[0] = prime[1] = true;

		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if (prime[i])
				continue;
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}

	}

}
