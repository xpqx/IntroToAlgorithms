public class NaiveMatcher {
    public static int naiveStringMatcher(char[] T,char[] P){
	int m=T.length;
	int n=P.length;
	for(int i=0;i<m;i++){
	    if (T[i]==P[0]){
		for(int j=0;j<n;j++){
		    if (P[j] != T[i+j]){
			break;
		    }
		    return i;
		}
	    }
	}
	return -1;
    }
    public static void main(String[] Args){
	char[] T={'b','c','c','a','a','b'};
	char[] P={'a','a','b'};
	int result = naiveStringMatcher(T,P);
	System.out.println("the result is " + result);
    }
}
