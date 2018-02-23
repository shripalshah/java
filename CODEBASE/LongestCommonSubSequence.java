// Implementation and finding the length of longest common substring

public class LongestCommonSubSequence{
	int lo=0;
	int upp=0;
	int lower=0;
	int maxLen = 0;
	public void LCSSubStr(String s1, String t1) {
		int m= s1.length();
		int n= t1.length();
		char[]s = s1.toCharArray();
		char[]t = t1.toCharArray();
		int [][]lcs = new int [m+1][n+1];
		for(int i=0;i<=m;i++ ){
			for(int j=0; j<=n; j++){
				if(i==0 || j==0){
					lcs[i][j] = 0;
					System.out.print(lcs[i][j]);
				}
				else if(s[i-1]==t[j-1]){
					
					lcs[i][j]= lcs[i-1][j-1]+1;
					System.out.print(lcs[i][j]);c
					if(maxLen<lcs[i][j]) {
						maxLen=lcs[i][j];
						lower=j -maxLen;
						upp=j;
					}
				}
				else{
					System.out.print(lcs[i][j]);
					lcs[i][j]=0;
				}
			}
			System.out.println("");
		}
		System.out.println("j:"+ upp);
		System.out.println(maxLen);
		System.out.println(t1.substring(lower,upp));

	}
	public static void main(String [] args) {
		LongestCommonSubSequence sol = new LongestCommonSubSequence();
		String s = "abcd";
		String t = "kbcd";
		sol.LCSSubStr(s,t);

	}
}