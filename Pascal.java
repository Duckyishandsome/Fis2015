public class Pascal {
	public static void main(String[] arvg) {
		Pascal p = new Pascal();
		p.TamGiacPascal(Integer.parseInt(arvg[0]));
	}
	
	public void TamGiacPascal(int k){
		for (int i = 0; i <= k; i++) {
			for (int l = 0; l < 2*k -1 - i; l++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print(C(j, i) + " ");
			}
			System.out.println();
		}
	}

	private int GiaiThua(int n) {
		if (n < 0) {
			return 0;
		} else if (n < 2) {
			return 1;
		} else
			return n * GiaiThua(n - 1);
	}

	private int C(int m, int n) {
		if (m < 0 || n < 0)
			return 0;
		else
			return GiaiThua(n)/(GiaiThua(m)*GiaiThua(n - m));
	}

}