import java.util.Scanner;

public class bai8 {
	private Scanner scanner;

	public static void main(String[] args) {
		bai8 b8 = new bai8();
		int task;

		while (true) {
			while ((task = b8.menu()) != 0) {
				b8.run(task);
			}
			System.out.println("Ban cho chac muon thoat? Y/N");
			b8.scanner = new Scanner(System.in);
			String ch = b8.scanner.next();
			if (ch.equalsIgnoreCase("Y")) {
				System.out.println("Bye");
				break;
			}
		}
	}

	int menu() {
		int n;
		System.out.println("Menu: ");
		System.out.println("1. Nhap vao mot chuoi van ban va in ra chuoi nghich dao ");
		System.out.println("2. Nhap vao chuoi va in ra chuoi co chu cai dau viet hoa ");
		System.out.println("3. Nhap vao chuoi va co chu dau tung tu la chu hoa ");
		System.out.println("4. Nhap vao chuoi, loc va in ra cac chu hoa trong chuoi ");
		System.out.println("5. Nhap vao chuoi va in ra chuoi ma hoa lech mot ki tu ");
		System.out.println("0. Thoat ");
		System.out.print("Ban chon: ");
		scanner = new Scanner(System.in);
		n = scanner.nextInt();
		return n;
	}

	// Duyet nguoc doan van ban nhap vao
	void reverseInput() {
		System.out.println("Nhap vao noi dung can duyet nguoc: ");
		StringBuffer bf = new StringBuffer();
		scanner = new Scanner(System.in, "UTF8");
		bf.append(scanner.nextLine());
		bf.reverse();
		System.out.println("Noi dung van ban sau khi duyet nguoc la: " + bf);
	}

	// Viet hoa chu dau cua doan van ban nhap vao
	void upcaseFirstCharacter() {
		System.out.println("Nhap vao chuoi van ban: ");
		StringBuilder builder = new StringBuilder();
		scanner = new Scanner(System.in);
		builder.append(scanner.nextLine());
		for (int i = 0; i < builder.length(); i++) {
			if (String.valueOf(builder.charAt(i)).equals(" ")) {
			} else {
				builder.replace(i, i + 1, String.valueOf(builder.charAt(i)).toUpperCase());
				break;
			}
		}
		System.out.println("Chuoi sau khi xu li la: " + builder);
	}

	// Viet hoa ki tu dau cua cac tu
	void upcaseFirstCharacterOfEachWord() {
		System.out.println("Nhap vao chuoi van ban: ");
		StringBuilder builder = new StringBuilder();
		scanner = new Scanner(System.in);
		builder.append(scanner.nextLine());
		if (!String.valueOf(builder.charAt(0)).equals(" ")) {
			builder.replace(0, 1, String.valueOf(builder.charAt(0)).toUpperCase());
		}
		for (int i = 1; i < builder.length(); i++) {
			if (!String.valueOf(builder.charAt(i)).equals(" ") && String.valueOf(builder.charAt(i - 1)).equals(" ")) {
				builder.replace(i, i + 1, String.valueOf(builder.charAt(i)).toUpperCase());
			}
		}
		System.out.println("Chuoi sau khi xu li la: " + builder);
	}

	// In ra cac chu hoa trong xau nhap vao
	void printAllUpcaseLetter() {
		System.out.println("Nhap vao chuoi van ban: ");
		StringBuilder builder = new StringBuilder();
		scanner = new Scanner(System.in);
		builder.append(scanner.nextLine());
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < builder.length(); i++) {
			if (Character.isUpperCase((builder.charAt(i)))) {
				buffer.append(String.valueOf(builder.charAt(i)));
			}
		}
		System.out.println("Chuoi sau khi xu li la: " + buffer);
	}

	// Ma hoa lech 1 ki tu
	void maHoaLech() {
		System.out.println("Nhap vao chuoi van ban: ");
		StringBuilder builder = new StringBuilder();
		scanner = new Scanner(System.in);
		builder.append(scanner.nextLine());
		StringBuffer buffer = new StringBuffer();
		char[] ch = new char[builder.length()];
		ch = builder.toString().toCharArray();
		for (int i = 0; i < builder.length(); i++) {
			ch[i]++;
			buffer.append(ch[i]);
		}
		System.out.println("Chuoi sau khi xu li la: " + buffer);
	}

	void run(int task) {
		switch (task) {
		case 1:
			reverseInput();
			break;
		case 2:
			upcaseFirstCharacter();
			break;
		case 3:
			upcaseFirstCharacterOfEachWord();
			break;
		case 4:
			printAllUpcaseLetter();
			break;
		case 5:
			maHoaLech();
			break;

		default:
			System.out.println("Nhap vao lua cho tu 1 den 5");
			break;
		}
	}
}