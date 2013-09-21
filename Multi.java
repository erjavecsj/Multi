public class multi {

	public static void main(String[] args) {
		int[][] a = {	{1,2,3,4,5},
						{6,7,8,9,10},
						{11,12,13,14,15} };



		// print(snakeDraft(10, 3));

	}

	public static void print(int[][] a) {
		for (int r=0; r<a.length; r++ ) {
			for (int c=0; c<a[r].length ; c++ ) {
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] snakeDraft(int players, int rounds) {
		int pick = 1;
		int[][] draft = new int[rounds][players];
		for (int i=0; i<rounds; i++) {
			if (i % 2 == 0) {
				for (int i2=0; i2<players; i2++) {
				draft[i][i2] = pick;
				pick += 1;
				}
			} else {
				for (int i2=players-1; i2>=0; i2--) {
				draft[i][i2] = pick;
				pick += 1;
				}
			}
		}
		return draft;
	}

	// public static int[][] rectangularize(int[] b, int rows, int col) {
	// 	int value = 0;
	// 	for (int i=0; i<rows; i++) {
			
	// 		}		
	// 	}
	// 	return value;
	// }

	// public static int sumRow(int[][] a){
	// 	int sum = 0;
	// 	for (int n=0; n<a.length ; n++ ) {
	// 		for (int i=0; i<a[n].length; i++ ) {
	// 			sum = sum + a[n][i];
	// 		}
	// 	}
	// 	System.out.println(sum);
	// 	return sum;
	// }

	// public void sumCol(int[][] a){
	// 	int sum = 0;
	// 	for (int ; ; ) {

	// 	}
	// }