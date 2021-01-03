#include <iostream>
#include <string>

using namespace std;

int naive_string_matcher(string Target,string Pattern);

int main(){
  string T("bcaabc");string P("aab");
  int index;
  index=naive_string_matcher(T,P);
  cout<<"the pattern occurs at "<<index<<endl;
}

int naive_string_matcher(string Target, string Pattern){
  unsigned Tlen=Target.length();
  unsigned Plen=Pattern.length();
  unsigned index=0; //will be count matches
  for(index=0;index < Tlen-Plen; index++){
    if (Pattern[0] == Target[index]) {
      //this loop checks that the pattern exists char by char
      for(int shift=0;shift<Plen;shift++){
	if(Pattern[index+shift] == Target[index+shift]){
	  continue;
	}
      }//innerfor
    }//outerif
  }//outerfor
  return index;
}
