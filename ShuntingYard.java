package week2;

public class ShuntingYard {
 
    static String postfix(String infix) {
        String operators = "-+/*^";
       
        String str = "";
        Stack stack = new Stack(infix.length());
 
       
        
        String [] tokens = infix.split("\\s");
        String strToken = "";
        
        for (int i=0;i<tokens.length;i++) {
        	strToken = tokens[i];
            if (strToken.isEmpty())
                continue;
            char c = strToken.charAt(0);
            int index = operators.indexOf(c);
 
           
            if (index != -1) {
                if (stack.empty())
                	stack.push( index);
 
                else {
                    while (stack.empty() == false) {
                        int precedence2 = (int)((int)stack.peek() / 2);
                        int precedence1 = index / 2;
                        if (precedence2 > precedence1 || (precedence2 == precedence1 && c != '^'))
                        	
                        	str += operators.charAt((int)stack.pop()) + " "; 
                        else break;
                    }
                    stack.push(index);
                }
            } 
            else if (c == '(') {
            	stack.push(-2); 
            } 
            else if (c == ')') {
                
                while ((int)stack.peek() != -2)
                	
                	str += operators.charAt((int)stack.pop()) + " ";
                stack.pop();
            }
            else {
            	
            	str += strToken + " ";
            }
        }
        
        
       
        while (stack.empty() == false)
        	
        	str += operators.charAt((int)stack.pop()) + " ";
        return str;
    }
}
