
public class Plant {

	public static void main(String[] args) {
//		int end = Integer.parseInt(args[0]); 
		int end = 7;
		int a = 0;
		int b = 1;
		int c = 1;
		int n = 0;
		for (int i = 1; i < end; i++) {
//			System.out.println(c);
			c = a + b;
			a = b; //
			b = c;
			n++;
			if (n % 2 == 0){
				System.out.println("Alternaternate fibonacci sequence " + c);
			}
//			System.out.println(n);
		}
	}
		
}
