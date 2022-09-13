package view;

import controller.ThreadVetor;

public class Main {
	
	public static void main(String[] args) {
		int[] array = createArray();
		
		for(int i = 1; i <= 2; i++) {
			ThreadVetor tv = new ThreadVetor(i, array);
			tv.start();
		}
		
		
	}
	
	
	private static int[] createArray() {
		int[] array = new int[1000];
		for(int i = 0; i < 1000; i++) {
			array[i] = (int) ((Math.random() * 101) + 1);
		}
		
		return array;
	}

}
