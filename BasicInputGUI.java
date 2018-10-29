import javax.swing.JOptionPane;

public class BasicInputGUI {
	public static void main(String[] args) {
		String firstNum, secNum;
		int inputFirst, inputSec, sum;
		
		firstNum = JOptionPane.showInputDialog("Please enter a number");
		inputFirst = Integer.parseInt(firstNum);
		
		secNum = JOptionPane.showInputDialog("Please enter another number.");
		inputSec = Integer.parseInt(secNum);
		
		sum = inputFirst + inputSec;
		
		JOptionPane.showMessageDialog(null, "The sum is: " + sum, "Results", JOptionPane.PLAIN_MESSAGE);
	}

}
