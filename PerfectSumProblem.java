//@hari_karthyk
public class PerfectSumProblem{
	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 5, 2, 1, 1, 6} ;
       	int n = arr.length ;
		int totalWeight =  110 ;
		//Intially with any set we can form the sum 0 by null subset so all row of 0th column is said to be "false"
		boolean[][] PS = new boolean[n+1][totalWeight+1] ;
		for( int i=0;i<=n;i++ ) PS[i][0] = true ;
		for( int i=1;i<=n;i++ ){
			//here we check whether the j weight is greater than the arr[i] if yes then we check following Condition it both are true set the PS[i][j] = true ;

			for( int j=1;j<=totalWeight;j++ ){
				if( j>=arr[i-1] )
					PS[i][j] = PS[i-1][j] || PS[i-1][j-arr[i-1]] ;
				else 
					PS[i][j] = PS[i-1][j] ;
			}
		
		}
		System.out.println( PS[n][totalWeight] );
	}
}