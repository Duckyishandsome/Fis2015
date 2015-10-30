public class Test {
	public static void main(String[] arvg) {
		Test t = new Test ();
		System.out.println("Tien goi 100 phut" + t.TinhTien(100));
		System.out.println("Tien goi 200 phut" + t.TinhTien(200));
		System.out.println("Tien goi 300 phut" + t.TinhTien(300));
		System.out.println("Tien goi 400 phut" + t.TinhTien(400));
		System.out.println("Tien goi 500 phut" + t.TinhTien(500));
		t.InThap();
		
	}

	public long TinhTien(int SoPhut) {
		int tong_Tien = 27000;
		if (SoPhut < 200) {
			tong_Tien += SoPhut * 120;
		} else if (SoPhut < 400) {
			tong_Tien +=  200 * 120 + (SoPhut - 200) * 80;
		}else {
			tong_Tien +=  200 * 120 + 200 * 80 + (SoPhut - 400) * 40;
		}
		return tong_Tien;
	}
	
	public void InThap(){
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(j + 1 + " ");
			}
			System.out.println("");
		}
	}
	
	public void InThapPascal(){
		
	}
}