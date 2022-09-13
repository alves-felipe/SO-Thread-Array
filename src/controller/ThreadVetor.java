package controller;

public class ThreadVetor extends Thread {
	
	int num;
	int[] array;
	
	public ThreadVetor(int num, int[] array) {
		this.num = num;
		this.array = array;
	}
	
	 @Override
	public void run() {
		 if ((num%2) == 0) {
			 normalFor(array);
		 }
		 
		if ((num%2) == 1) {
			forEach(array);
		 }
	}
	 
	 private void normalFor(int[] array) {
		 double start = System.nanoTime();
		 for(int i = 0; i < array.length; i++) {
			 
		 }
		 
		 double time = (System.nanoTime() - start);
		 
		 System.out.println(getId()+" - "+time+" s");
		 
	 }
	 
	 private void forEach(int[] array) {
		 double start = System.nanoTime();
		 for(int num : array) {
			 
		 }
		 
		 double time = (System.nanoTime() - start);
		 
		 System.out.println(getId()+" - "+time+" s");

	 }

}
