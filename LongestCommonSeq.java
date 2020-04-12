//@hari_karthyk
public class LongestCommonSeq{
	static int  LCS( char[] str1,char[] str2 ){
		int[][] dp = new int[ str1.length ][ str2.length ] ;
		//Longest Common Seq code in dp but without extra row column used .
		for( int i=0;i<str1.length;i++ ){
			for( int j=0;j<str2.length;j++ ){
				//  first 3 loops for the 1st row and column so that we check either match 1 else the left if i==0 , the top if j==0
				if( i==0 && j==0 )
					if( str1[i]==str2[j] ) 
						dp[i][j] = 1 ;
					else 
						dp[i][j] = 0 ;
				else if( i==0 )
					if( str1[i]==str2[j] ) 
						dp[i][j] = 1 ;
					else 
						dp[i][j] = dp[i][j-1] ;
				else if( j==0 )
					if( str1[i]==str2[j] ) 
						dp[i][j] = 1 ;
					else 
						dp[i][j] = dp[i-1][j] ;
				else
					//here asusual if matches digonal + 1 else the max of letf and top adjcent .
					if( str1[i]==str2[j] )
						dp[i][j] = dp[i-1][j-1]+1 ;
					else 
						dp[i][j] = Math.max( dp[i-1][j],dp[i][j-1] );
			}
		}
		return dp[str1.length-1][str2.length-1] ;
 	}
	public static void main(String[] args) {
		String str1 = "XAC" ;
		String str2 = "BXADC" ;
	 	System.out.println( LCS( str1.toCharArray(),str2.toCharArray() ) ) ;
	}
}