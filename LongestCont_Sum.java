public class LongestCont_Sum{
	static int LCS( int arr[] ){
		int n = arr.length ;
		if(n!=1){
        	int[] dp = new int[n] ;
			for( int i=0;i<n;i++ ){
				if(i==0)
        	        dp[i] = arr[i] ;
        	    else if( dp[i-1]+arr[i] > arr[i] )
					dp[i] = dp[i-1]+arr[i] ;
				else
					dp[i] = arr[i] ;
			}
			int max = -9999 ;
			for( int i=0;i<n;i++ )
				if( max<dp[i] ) max = dp[i] ;
	        return max ;
        }
        return arr[0] ;
	} 
	public static void main(String[] args) {
		int[] arr = { -2,1,-3,4,-1,2,1,-5,4 } ;
		System.out.println( LCS( arr ) ) ;		
	}	
}