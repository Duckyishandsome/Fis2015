class Temp {
	static int x = 10;
	public void show(){
		System.out.println(x);
	}
	
	public static void main(String arvg[]){
		Temp t = new Temp();
		t.show();
		Temp t1 = new Temp();
		t1.x = 20;	
		t1.show();//K?t qu? ra 20, d? nhi�n r?i
		t.show();//K?t qu? v?n l� 20, v� x khai b�o l� static
	}
}