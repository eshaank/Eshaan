public class fibonacci {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		for (int i = 1; i < 13; i++) {
			int tmp = b;
			System.out.println(a);
			b = a+b;
			a = tmp;
		}
	}
}
