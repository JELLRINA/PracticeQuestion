package IF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �˶��ð� {

	public static void main(String[] args) throws IOException {
//		Scanner scan = new Scanner(System.in);
//		
//		int H = scan.nextInt();
//		int M = scan.nextInt();
//		scan.close();
//		
//		if(M < 45) {
//			H--;
//			M = 60 - (45 - M);
//			if(H < 0) {
//				H = 23;
//			}
//			System.out.println(H + " " + M);
//		} else {
//			System.out.println(H + " " +(M - 45));
//		}

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String str = br.readLine();
//		StringTokenizer st = new StringTokenizer(str, " ");
////		StringTokenizer st = new StringTokenizer(br.readLine(), " "); ���ڿ� ���� ���� ���ϰ� �ص� �Ǵ� ��.
//		
//		int H = Integer.parseInt(st.nextToken());
//		int M = Integer.parseInt(st.nextToken());
//		
//		if (M < 45) {
//			H--;
//			M = 60 - (45 - M);
//			if(H <0) {
//				H = 23;
//			}System.out.println(H + " " + M);
//		}else {
//			System.out.println(H + " " + (M -45));
//
//		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" "); 
		// br.readLine()���� ���� ���� split("")���鳪���� �� string �迭�� ���� ����
		int H = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		
		if (M < 45) {
			H--;
			M = 60 - (45 - M);
			if(H <0) {
				H = 23;
			}System.out.println(H + " " + M);
		}else {
			System.out.println(H + " " + (M -45));

		}
		
	}

}
