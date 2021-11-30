package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class �Ҽ����ϱ� {

	public static boolean prime[];

	public static void main(String[] args) throws IOException {
		// �����佺�׳׽��� ü�� Ǯ�� ���ô�.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		prime = new boolean[N + 1];
		get_prime(); 
		
		for (int i = M; i <= N; i++) {
			//
			if(!prime[i]) sb.append(i).append('\n');
		}
		System.out.println(sb);

	}

	//�����佺�׳׽��� ü
	private static void get_prime() {
		prime[0] = prime[1] = true; //0��1�� �Ҽ��� �ƴϹǷ� true.
		//�Ҽ��� 2���� ��Ʈ�� ���ϱ��� �ݺ� ���� -> i��� ���ܽ�Ŵ
		for(int i = 2; i <= Math.sqrt(prime.length); i++) { 
			if(prime[i]) continue; 
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true; 
			}
		}

	}

}
