// @hari_karthyk 
public class EditDistance{
	// Edit Distance using Dynamic Programming Concepts .
	public static void main(String[] args) {
		String str1 = "MARCH";
		String str2 = "MAY" ;
		int Ed[][] = new int[str1.length()+1][str2.length()+1];
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		for( int i=0;i<=s1.length;i++ ){
			for( int j=0;j<=s2.length;j++ ){
				if( i==0 )
					//making the first row and column with an increasing order from 0 to n and m ;
					Ed[i][j] = i;
				else if( j==0 )
					Ed[i][j] = j ;
				else if( s1[i-1]==s2[j-1] )
					//here if both char string1[i] and string2[j] matches then Ed = digonal ;
					Ed[i][j] = Ed[i-1][j-1];
				else
					//here if char of string1[i] and string2[j] does not match then min( left,right,digonal ) ;
					Ed[i][j] = 1+Math.min( Math.min( Ed[i-1][j],Ed[i][j-1] ),Ed[i-1][j-1] );
			}
		}
		//the last row and column of the Ed is distance required .
		System.out.println( "Distance from String1 to String2 is " + Ed[str1.length()][str2.length()] );	
	}
}