import java.util.*;
class Solution {
    public boolean isValid(String s) {
    Stack<Character> sta = new Stack<Character>();
	for (char c : s.toCharArray()) {
		if (c == '(')
			sta.push(')');
		else if (c == '{')
			sta.push('}');
		else if (c == '[')
			sta.push(']');
		else if (sta.isEmpty() || sta.pop() != c)
			return false;
	}
	return sta.isEmpty();
    }
    public staic void main(){
    	Scanner sc=new Scanner(System.in);
    	String s;
	System.out.println("Enter The String of parenthesis whose validityis to be checked\n");
	s=sc.next();
	if(isValid(s))
	System.out.println("String is valid");
    	else
	System.out.println("String is not valid");
    }
}
