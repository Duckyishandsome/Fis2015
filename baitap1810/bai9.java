import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai9 {
	private Scanner scanner;
	private List<Word> words = new ArrayList<Word>();

	public static void main(String[] args) {
		bai9 b = new bai9();
		int task;
		while (true) {
			while ((task = b.menu()) != 0)
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

	boolean checkExit(Word w) {
		for (Word word : words) {
			if (w.getWord().trim().equalsIgnoreCase(word.getWord().trim())
					&& w.getMean().trim().equalsIgnoreCase(word.getMean().trim())) {
				return true;
			}
		}
		return false;
	}

	void addWord() {
		scanner = new Scanner(System.in);
		System.out.println("Them tu");
		System.out.print("Nhap vao tu: ");
		String word = scanner.next();
		System.out.println();
		System.out.print("Nhap vao nghia cua tu: ");
		String mean = scanner.next();
		Word w = new Word(word, mean);
		if (checkExit(w)) {
			System.out.println("Tu da ton tai");
		} else {
			words.add(w);
			System.out.println("Tu da dc them");
		}
	}

	void show(List<Word> list) {
		if (list.isEmpty()) {
			System.out.println("Khong co ket qua de hien thi");
		} else {
			System.out.println("----------Word--------||----------Mean----------");
			for (Word word : list) {
				System.out.println("     " + word.getWord() + "                   " + word.getMean());
			}
		}
	}

	void searchWord() {
		scanner = new Scanner(System.in);
		System.out.println("Tim kiem");
		List<Word> list = new ArrayList<Word>();
		System.out.print("Nhap vao tu: ");
		String wordString = scanner.next();
		for (Word word : words) {
			if (word.getWord().trim().equalsIgnoreCase(wordString)) {
				list.add(word);
			}
		}
		show(list);
	}
	
	void modify(){
		scanner = new Scanner(System.in);
		System.out.println("Chinh sua");
		System.out.print("Nhap vao tu: ");
		String word = scanner.next();
		System.out.println();
		System.out.print("Nhap vao nghia cua tu: ");
		String mean = scanner.next();
		System.out.println();
		Word w = new Word(word, mean);
		if (checkExit(w)) {
			System.out.print("Nhap vao nghia can chinh sua");
			String meanfixed = scanner.next();
			System.out.println();
			w.setMean(meanfixed);
			System.out.println("Tu da duoc chinh sua");
		}else {
			System.out.println("Tu khong ton tai");
		}
	}

	class Word {
		private String word;
		private String mean;

		public String getWord() {
			return word;
		}

		public void setWord(String word) {
			this.word = word;
		}

		public String getMean() {
			return mean;
		}

		public void setMean(String mean) {
			this.mean = mean;
		}

		public Word(String word, String mean) {
			super();
			this.word = word;
			this.mean = mean;
		}

	}

	int menu() {
		int n;
		System.out.println("Menu: ");
		System.out.println("1. Them tu ");
		System.out.println("2. Tra tu ");
		System.out.println("3. Chinh tu ");
		System.out.println("0. Thoat ");
		System.out.print("Ban chon: ");
		scanner = new Scanner(System.in);
		n = scanner.nextInt();
		return n;
	}

	void run(int task) {
		switch (task) {
		case 1:
			addWord();
			break;
		case 2:
			searchWord();
			break;
		case 3:
			modify();
			break;
		default:
			System.out.println("Nhap vao lua cho tu 1 den 5");
			break;
		}
	}
}
