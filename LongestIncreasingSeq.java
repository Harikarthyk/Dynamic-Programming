//@hari_karthyk
public class LongestIncreasingSeq{
	static int LIS( int arr[] ){
		int[] dp = new int[ arr.length ] ;
		//Intially all dp[] are set to 1 ;
		for( int i=0;i<arr.length;i++ )dp[i] = 1 ;
		for( int i=1;i<arr.length;i++ ){
		//if the arr[i] is greater then dp[i] is incremented with dp[j] + 1 
			for( int j=0;j<i;j++ )
				if( arr[i]>arr[j] )
					dp[i] = dp[j]+1 ;
		}
		int max = 0 ;
		for( int i=0;i<arr.length;i++ )
			if( dp[i]>max ) max = dp[i] ;

		return max ;
 	}
	public static void main(String[] args) {
		int arr[] = { 3,13,12,66,43,34,51,99 } ;
		LongestIncreasingSeq obj = new LongestIncreasingSeq() ;
		System.out.println( obj.LIS( arr ) ) ;
	}
}