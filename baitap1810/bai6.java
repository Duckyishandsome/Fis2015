import java.util.Scanner;

public class bai6 {
	private Scanner scanner;

	public static void main(String[] args) {
		bai6 bai6 = new bai6();
		int task;
		while ((task = bai6.menu()) != 0) {
			bai6.run(task);
		}

	}

	class SoPhuc {
		private float thuc, ao;

		public float getThuc() {
			return thuc;
		}

		public void setThuc(float thuc) {
			this.thuc = thuc;
		}

		public float getAo() {
			return ao;
		}

		public void setAo(float ao) {
			this.ao = ao;
		}

		public SoPhuc() {
			super();
			// TODO Auto-generated constructor stub
		}

		public SoPhuc(float thuc, float ao) {
			super();
			this.thuc = thuc;
			this.ao = ao;
		}

	}

	public SoPhuc nhap() {
		float thuc, ao;
		scanner = new Scanner(System.in);
		System.out.print("Nhap phan thuc: ");
		thuc = scanner.nextFloat();
		System.out.print("Nhap phan ao: ");
		ao = scanner.nextFloat();
		SoPhuc soPhuc = new SoPhuc(thuc, ao);
		return soPhuc;
	}

	public void xuat(SoPhuc soPhuc) {
		System.out.println(soPhuc.getThuc() + " + " + soPhuc.getAo() + "*i");
	}

	public SoPhuc Tong(SoPhuc s1, SoPhuc s2) {
		float thuc = s1.getThuc() + s2.getThuc();
		float ao = s1.getAo() + s2.getAo();
		return new SoPhuc(thuc, ao);
	}

	public SoPhuc Hieu(SoPhuc s1, SoPhuc s2) {
		float thuc = s1.getThuc() - s2.getThuc();
		float ao = s1.getAo() - s2.getAo();
		return new SoPhuc(thuc, ao);
	}

	public float Module(SoPhuc soPhuc) {
		float thuc = soPhuc.getThuc();
		float ao = soPhuc.getAo();
		return (float) Math.sqrt(thuc * thuc + ao * ao);
	}

	public SoPhuc Nhan(SoPhuc s1, SoPhuc s2) {
		float thuc = s1.getThuc() * s2.getThuc() - s1.getAo() * s2.getAo();
		float ao = s1.getAo() * s2.getThuc() + s2.getAo() * s1.getThuc();
		return new SoPhuc(thuc, ao);
	}

	public SoPhuc Chia(SoPhuc s1, SoPhuc s2) {
		if (Module(s2) == 0) {
			return null;
		}
		float temp = Module(s2);
		float thuc = s1.getThuc() * s2.getThuc() + s1.getAo() * s2.getAo();
		float ao = s1.getAo() * s2.getThuc() - s2.getAo() * s1.getThuc();
		return new SoPhuc(thuc / (temp * temp), ao / (temp * temp));
	}

	int menu() {
		int n;
		System.out.println("Menu: ");
		System.out.println("1. Tinh module so phuc: ");
		System.out.println("2. Tong 2 so phuc ");
		System.out.println("3. Hieu 2 so phuc ");
		System.out.println("4. Tich 2 so phuc ");
		System.out.println("5. Chia 2 so phuc ");
		System.out.println("0. Thoat ");
		System.out.print("Ban chon: ");
		scanner = new Scanner(System.in);
		n = scanner.nextInt();
		return n;
	}

	void run(int task) {
		SoPhuc soPhuc1, soPhuc2;
		switch (task) {
		case 1:
			System.out.println("Nhap so phuc: ");
			soPhuc1 = nhap();
			System.out.println("Module cua so phuc vua nhap la: " + Module(soPhuc1));
			break;
		case 2:
			System.out.println("Nhap so phuc thu nhat: ");
			soPhuc1 = nhap();
			System.out.println("Nhap so phuc thu hai: ");
			soPhuc2 = nhap();
			System.out.print("Tong 2 so phuc vua nhap la: ");
			xuat(Tong(soPhuc1, soPhuc2));
			break;
		case 3:
			System.out.println("Nhap so phuc thu nhat: ");
			soPhuc1 = nhap();
			System.out.println("Nhap so phuc thu hai: ");
			soPhuc2 = nhap();
			System.out.print("Hieu 2 so phuc vua nhap la: ");
			xuat(Hieu(soPhuc1, soPhuc2));
			break;
		case 4:
			System.out.println("Nhap so phuc thu nhat: ");
			soPhuc1 = nhap();
			System.out.println("Nhap so phuc thu hai: ");
			soPhuc2 = nhap();
			System.out.print("Tich 2 so phuc vua nhap la: ");
			xuat(Nhan(soPhuc1, soPhuc2));
			break;
		case 5:
			System.out.println("Nhap so phuc thu nhat: ");
			soPhuc1 = nhap();
			System.out.println("Nhap so phuc thu hai: ");
			soPhuc2 = nhap();
			System.out.print("Thuong 2 so phuc vua nhap la: ");
			xuat(Chia(soPhuc1, soPhuc2));
			break;
		case 0:

			break;

		default:
			System.out.println("Ban nhap chua dung");
			break;
		}
	}
}
