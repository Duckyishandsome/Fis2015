public class TinhTien {
	public static void main(String[] arvg) {
		TinhTien t = new TinhTien ();
		System.out.println("Tien goi la: " + 						t.TinhTien(Integer.parseInt(arvg[0])));
				
	}

	public long TinhTien(int SoPhut) {
		int tong_Tien = 27000;
		if (SoPhut < 200) {
			tong_Tien += SoPhut * 120;
		} else if (SoPhut < 400) {
			tong_Tien +=  200 * 120 + (SoPhut - 200) * 80;
		}else {
			tong_Tien +=  200 * 120 + 200 * 80 + (SoPhut - 				400) * 40;
		}
		return tong_Tien;
	}
	
}