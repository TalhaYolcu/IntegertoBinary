#include <iostream>
#include <string>
using namespace std;
int main() {
    int y=56;     //YOU CAN CHANGE THE NUMBER FROM HERE
    string s;
    char temp;
    //divide 2 until number is 1
    while(true) {         
      if(y%2==0) {
        s+="0";
      }
      else {
        if(y==1) {
          s+="1";
          break;
        }
        else {
          s+="1";
        }
		  } 
		  y=y/2;
    }//we have reverse of the number here, we have to convert it
    for(int i=0;i<s.length()/2;i++) {
    	temp=s[i];
    	s[i]=s[s.length()-i-1];
    	s[s.length()-i-1]=temp;
    }
    cout<<s;
    return 0;
}

