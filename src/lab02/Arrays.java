package lab02;

public class Arrays {
	public Arrays() {}
	public void Sort(int[] array ) {
		for (int i=0; i< array.length;i++) {
			for (int j=i+1; j< array.length;j++) {
				if(array[i]>array[j]) {
					int temp;
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	public int Sum(int[] array){
		int sum =0;
		for(int i=0; i<array.length;i++) {
			sum+=array[i];
		}
		return sum;
	}
	
	public int Avg(int[] array) {
		Arrays a = new Arrays();
		return a.Sum(array)/array.length;
	}
	
	public static void main(String[] args) {
		int a[]= {1789,2035,2899,1456,2013};
		Arrays test = new Arrays();
		test.Sort(a);
		for(int i : a) {
			System.out.print(i+" ");
		}
	}
}
