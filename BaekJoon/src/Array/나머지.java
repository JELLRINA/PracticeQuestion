package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class ������ {

	public static void main(String[] args) throws IOException {
		//*���� �ٸ� ������*�� �� �� �ִ��� ����Ѵ�. == *hashset*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		int[] arr = new int[10];
//		boolean bl;
//		int cnt = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = Integer.parseInt(br.readLine()) % 42;
//		}
//		for (int i = 0; i < 10; i++) {
//			bl = false;
//			for (int k = i + 1; k < arr.length; k++) {
//				if(arr[i] == arr[k]) {
//					bl = true;
//					break;
//				}
//			}
//			if(bl == false) {
//				cnt++;
//			}
//		}
//		System.out.println(cnt);
		
		//�ؽ����� �ߺ��Ǵ� ���� ���x only one save. but,���ı�� �޼ҵ� ���Ұ�. �Ϸ��� ����Ʈ�� ��ȯ �� ����.
		HashSet<Integer> hs = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			hs.add(Integer.parseInt(br.readLine()) % 42);
		}
		br.close();
		System.out.println(hs.size());

	}

}
