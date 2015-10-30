public class bai1 {
	public static void main(String[] arvg){
		int n = Integer.parseInt(arvg[0]);
		int[] dayso = new int[n];
		for(int i = 0; i < n; i++){
			dayso[i] = Integer.parseInt(arvg[i + 1]);
		}
		show(dayso);
	}
	
	private static int[] sortTang(int [] dayso){
		int temp;
		for (int i = 0; i < dayso.length - 1; i++) {
			for (int j = i + 1; j < dayso.length; j++) {
				if (dayso[i]> dayso[j]) {
					temp = dayso[i];
					dayso[i] = dayso[j];
					dayso[j] = temp;
				}
			}
		}
		return dayso;
	}
	
	private static int[] sortGiam(int [] dayso){
		int temp;
		for (int i = 0; i < dayso.length - 1; i++) {
			for (int j = i + 1; j < dayso.length; j++) {
				if (dayso[i]< dayso[j]) {
					temp = dayso[i];
					dayso[i] = dayso[j];
					dayso[j] = temp;
				}
			}
		}
		return dayso;
	}
	private static void show(int[] dayso){
		sortTang(dayso);
		System.out.println(dayso[dayso.length - 1] + " " + dayso[0]);
		for (int i = 0; i < dayso.length; i++) {
			System.out.print(dayso[i] + " ");
		}
		System.out.println();
		sortGiam(dayso);
		for (int i = 0; i < dayso.length; i++) {
			System.out.print(dayso[i] + " ");
		}
	}
	
}