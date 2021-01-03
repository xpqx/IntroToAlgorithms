#include <iostream>
#include <string>

using namespace std;

int exp(int base,int e){
  int total=1;
  while (e>0){
    e -= 1;
    total *= base;
  }
  return total;
}
int rabinKarpMatcher(string T,string P,int q);

int main(){
  string T="2359023141526739921";
  string P="31415";
  int prime=13;
  cout<<"2^5 is "<<exp(2,5)<<endl;
  int result= rabinKarpMatcher(T,P,prime);
  cout<<"the result is "<<result<<endl;
  return 0;
}

int rabinKarpMatcher(string T,string P,int q){
  int n=T.length();
  int m=P.length();
  int h=exp(10,m-1) % q;
  int tmod=0;
  int pmod=0;
  //compute hash
  for(int i=0;i<m;i++){
    pmod=(10*pmod + P[i]) % q;
    tmod=(10*tmod + T[i]) % q;
  }
  for(int index=0;index < n-m; index++){
    if (pmod == tmod) {
      //this loop checks that the pattern exists char by char
      for(int shift=0;shift<m;shift++){
	if(P[index+shift] == T[index+shift]){
	  return index;
	}//innerif
      }//innerfor
    }//outerif
    if (index < n - m){
      tmod=(10*(tmod - T[index+1]*h) + T[index+m+1])%q;
    }
  }//outerfor
  return -1;
}
