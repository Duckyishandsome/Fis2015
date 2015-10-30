import java.util.Scanner;

public class bai7 {

	private Scanner scanner;

	public static void main(String[] args) {
		int task;
		bai7 b = new bai7();
		if (b.login()) {
			while (true) {
				while ((task = b.menu1()) != 0)
					b.run(task);
				System.out.println("Ban cho chac muon thoat? Y/N");
				b.scanner = new Scanner(System.in);
				String ch = b.scanner.next();
				if (ch.equalsIgnoreCase("Y")) {
					System.out.println("Bye");
					break;
				}
			}
		}
	}

	int menu1() {
		int n;
		System.out.println("Menu1: ");
		System.out.println("1. Nhap kho ");
		System.out.println("2. Xuat kho ");
		System.out.println("3. Quan li gia ");
		System.out.println("4. In hoa don ");
		System.out.println("0. Thoat ");
		System.out.print("Ban chon: ");
		scanner = new Scanner(System.in);
		n = scanner.nextInt();
		return n;
	}

	int menuNhapKho() {
		int n;
		System.out.println("Menu nhap kho: ");
		System.out.println("1. Nhap kho so luong 1 don vi ");
		System.out.println("2. Nhap kho theo thung 20 don vi ");
		System.out.println("3. Nhap kho theo ta 10 don vi ");
		System.out.println("4. Chinh sua so luong ");
		System.out.println("0. Quay lai menu1 ");
		System.out.print("Ban chon: ");
		scanner = new Scanner(System.in);
		n = scanner.nextInt();
		return n;
	}

	int menuXuatKho() {
		int n;
		System.out.println("Menu xuat kho: ");
		System.out.println("1. Xuat kho theo 1 don vi ");
		System.out.println("2. Xuat kho theo thung ");
		System.out.println("3. Xuat kho theo ta ");
		System.out.println("4. Chinh sua so luong ");
		System.out.println("5. Kiem tra so luong ");
		System.out.println("0. Quay lai menu1. ");
		System.out.print("Ban chon: ");
		scanner = new Scanner(System.in);
		n = scanner.nextInt();
		return n;
	}

	int menuQuanLiGia() {
		int n;
		System.out.println("Menu quan li gia: ");
		System.out.println("1. Hien thi gia ");
		System.out.println("2. Sua gia ");
		System.out.println("3. Tong tien hang ");
		System.out.println("0. Quay lai menu buoc 1 ");
		System.out.print("Ban chon: ");
		scanner = new Scanner(System.in);
		n = scanner.nextInt();
		return n;
	}

	int menuInHoaDon() {
		int n;
		System.out.println("Menu in hoa don: ");
		System.out.println("1. In theo luong hang ");
		System.out.println("2. In theo gia ");
		System.out.println("3. In theo ca hang va gia ");
		System.out.println("0. Quay lai menu 1 ");
		System.out.print("Ban chon: ");
		scanner = new Scanner(System.in);
		n = scanner.nextInt();
		return n;
	}

	void run(int task) {
		switch (task) {
		case 1:
			int task1;
			while ((task1 = menuNhapKho()) != 0) {
				switch (task1) {
				case 1:
					System.out.println("Dang nhap 1 don vi");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Done");
					break;
				case 2:
					System.out.println("Dang nhap theo thung 20 don vi");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Done");
					break;
				case 3:
					System.out.println("Dang nhap theo ta 10 don vi");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Done");
					break;
				case 4:
					System.out.println("Dang chinh sua so luong");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Done");
					break;

				default:
					System.out.println("Nhap lua chon tu 1-4");
					break;
				}
			}

			break;
		case 2:
			int task2;
			while ((task2 = menuXuatKho()) != 0) {
				switch (task2) {
				case 1:
					System.out.println("Xuat theo 1 don vi");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Done");
					break;
				case 2:
					System.out.println("Xuat theo thung");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Done");
					break;
				case 3:
					System.out.println("Xuat theo ta");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Done");
					break;
				case 4:
					System.out.println("Chinh sua so luong");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Done");
					break;
				case 5:
					System.out.println("Kiem tra so luong");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Done");
					break;

				default:
					System.out.println("Nhap lua chon tu 1 den 5");
					break;
				}
			}

			break;
		case 3:
			int task3;
			while ((task3 = menuQuanLiGia()) != 0) {
				switch (task3) {
				case 1:
					System.out.println("Hien thi gia");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Done");
					break;
				case 2:
					System.out.println("Sua gia");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Done");
					break;
				case 3:
					System.out.println("Tong tien hang");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Done");
					break;

				default:
					System.out.println("Nhap lua chon tu 11 den 3");
					break;
				}
			}

			break;
		case 4:
			int task4;
			while ((task4 = menuInHoaDon()) != 0) {
				switch (task4) {
				case 1:
					System.out.println("In theo luong hang");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Done");
					break;
				case 2:
					System.out.println("In theo gia");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Done");
					break;
				case 3:
					System.out.println("In theo ca hang va gia");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Done");
					break;

				default:
					System.out.println("Nhap lua chon tu 1 den 3");
					break;
				}
			}

			break;
		default:
			System.out.println("Ban da nhap sai! Nhap lua cho tu 0-4");
			break;
		}
	}

	boolean login() {
		scanner = new Scanner(System.in);
		String userName, passWord;
		int times = 0;
		while (true) {
			while (times < 3) {
				System.out.print("Nhap vao username: ");
				userName = scanner.next();
				System.out.println();
				System.out.print("Nhap vao password: ");
				passWord = scanner.next();
				System.out.println();
				if (userName.equalsIgnoreCase("Ducky") && passWord.equalsIgnoreCase("MonkeyDDucky")) {
					System.out.println("Ban da dang nhap thanh cong");
					return true;
				} else {
					System.out.println("Ban da dang nhap sai " + ++times + " lan");
					System.out.println("Ban co muon nhap lai? Y/N");
					String ch = scanner.next();
					if (!ch.equalsIgnoreCase("y")) {
						System.out.println("Are u sure to want to quit? Y/N");
						String ch1 = scanner.next();
						if (ch1.equalsIgnoreCase("Y")) {
							System.out.println("Bye");
							return false;
						}
					}
				}
			}
			System.out.println("Ban da nhap sai qua 3 lan, ban phai doi 30s de dang nhap lai or press '0' de quit!");
			String c = scanner.next();
			if (!c.equals("0")) {
				System.out.println("Waiting...");
				for (int i = 0; i < 30; i++) {
					try {
						System.out.println("Waiting for " + (30 - i) + "s!");
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				times = 0;
			} else {
				return false;
			}
		}
	}
}