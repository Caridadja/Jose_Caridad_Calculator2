import java.util.ArrayList;

public class Calculator2 implements java.io.Serializable{
	private double result;
	private ArrayList<Double> operands = new ArrayList<>();
	private ArrayList<String> operations = new ArrayList<>();
	
	public Calculator2() {
	}
	public void performOperation(double operand) {
		operands.add(operand);
	}
	public void performOperation(String operation) {
		if(operation == "+" || operation == "-" || operation == "*" || operation == "/") {
			operations.add(operation);
		}
	}
	public void getResults() {
		System.out.println(this.result);
	}
}
