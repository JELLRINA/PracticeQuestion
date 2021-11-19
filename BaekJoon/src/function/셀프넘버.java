package function;

public class �����ѹ� {

	public static void main(String[] args) {
		// 10,000���� �۰ų� ���� ���� �ѹ��� �� �ٿ� �ϳ��� �����ϴ� ������ ����Ѵ�.
		
		boolean[] check = new boolean[10001]; //1 - 10000
		
		for (int i = 1; i <= 10000; i++) {
			int n = d(i); // n�� d(n)�� ������

			if (n <= 10000) {
				check[n] = true; // return�� �� n �� boolean�迭�� true�κ���.
			}
		}
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= 10000; i++) {
			if(!check[i]) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);

	}

	public static int d(int number) {
		int sum = number; // ���� �� �ʱ�ȭ.

		while (number != 0) { // number�� 0�� �� �� ���� ���
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}
}
