
public class Operation{

	private String input = " ", operation = " ";
	private double num1 = 0, num2 = 0, result = 0;
	
	public void setValues(String userInp, 
							String userOp,
							double userNum1,
							double userNum2) {
		input = userInp;
		operation = userOp;
		num1 = userNum1;
		num2 = userNum2;
	}

	public String opSign() {
		if (input == "m") {
			operation = "*";
		} else if (input == "d") {
			operation = "/";			
		} else if (input == "a") {
			operation = "+";			
		} else if (input == "s") {
			operation = "-";			
		}
		return operation;
	}

	public double opResult() {
		if (input == "m") {
			result = num1 * num2;
		} else if (input == "d") {
			result = num1 / num2;
		} else if (input == "a") {
			result = num1 + num2;
		} else if (input == "s") {
			result = num1 - num2;
		}
		return result;
	}
	
	public int round() {
		return (int)Math.round(result*1)/1;
	}
	
	public void pr(String str) {
		System.out.print(str);
	}
}
