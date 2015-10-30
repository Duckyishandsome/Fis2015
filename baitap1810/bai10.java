import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai10 {

	private Scanner scanner;
	private List<Charactor> list;

	public static void main(String[] args) {
		bai10 b10 = new bai10();
		try {
			b10.ThongKe();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void ThongKe() throws FileNotFoundException {
		list = new ArrayList<Charactor>();
		try {
			File file = new File("bai10.txt");
			FileInputStream fileInputStream = new FileInputStream(file);
			InputStreamReader reader = new InputStreamReader(fileInputStream);
			scanner = new Scanner(reader);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str = null;
		while (scanner.hasNextLine())
			str += scanner.nextLine();
		for (int i = 0; i < str.toCharArray().length; i++) {
			Charactor c = new Charactor(String.valueOf(str.charAt(i)), 0);

			if (check(c) != null) {
				int count = check(c).getCount();
				check(c).setCount(++count);
			}else {
				c.setCount(1);
				list.add(c);
			}
		}
		System.out.println("Thong ke so lan xuat hien");
		for (Charactor charactor : list) {
			System.out.println("Ky tu: '" + charactor.getCharactor() + "'_ So lan xuat hien: " + charactor.getCount());
		}
		
	}

	public class Charactor {
		private String charactor;
		private int count;

		public Charactor(String charactor, int count) {
			super();
			this.charactor = charactor;
			this.count = count;
		}

		public Charactor() {
			super();
			// TODO Auto-generated constructor stub
		}

		public String getCharactor() {
			return charactor;
		}

		public void setCharactor(String charactor) {
			this.charactor = charactor;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

	}

	Charactor check(Charactor c) {
		for (Charactor charactor : list) {
			if (c.getCharactor().equalsIgnoreCase(charactor.getCharactor())) {
				return charactor;
			}
		}
		return null;
	}

}