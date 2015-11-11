package week2;

public class Calculator {

	public static double eval(String expr) {

		String trim = expr.replaceAll("[^\\^\\*\\+\\-\\d/\\s]", "");

		Stack stack = new Stack(expr.length());

				
		String [] tokens = trim.split("\\s");
		String token ="";
		
		for (int i=0;i<tokens.length;i++) {

			token = tokens[i];
			
			Double tokenNumber = null;
			try {
				tokenNumber = Double.parseDouble(token);
			} catch (NumberFormatException e) {
			}
			if (tokenNumber != null) {

				stack.push(Double.parseDouble(token + ""));
			} else if (token.equals("*")) {

				double Operand2 = (double) stack.pop();
				double Operand1 = (double) stack.pop();
				stack.push(Operand1 * Operand2);
			} else if (token.equals("/")) {

				double Operand2 = (double) stack.pop();
				double Operand1 = (double) stack.pop();
				stack.push(Operand1 / Operand2);
			} else if (token.equals("-")) {

				double Operand2 = (double) stack.pop();
				double Operand1 = (double) stack.pop();
				stack.push(Operand1 - Operand2);
			} else if (token.equals("+")) {

				double Operand2 = (double) stack.pop();
				double Operand1 = (double) stack.pop();
				stack.push(Operand1 + Operand2);
			} else if (token.equals("^")) {

				double Operand2 = (double) stack.pop();
				double Operand1 = (double) stack.pop();
				stack.push(Math.pow(Operand1, Operand2));
			} else {
				return 0.0;
			}

		}
		
		
		return (Double) stack.pop();
	}

	
}
