import javax.swing.JOptionPane;

public class guesstheanimal {
	// Copyright Wintriss Technical Schools 2013
	// 1. ask user if it has 4 legs. if yes, it’s a pig if no, it’s a monkey
	// 2. add zebra, pig, monkey, bird,
	// 3. add fish and spider.
	public static void main(String[] args) {
		
		int hi = JOptionPane.showConfirmDialog(null, "Does it have legs?", "",JOptionPane.YES_NO_OPTION);
		if(hi == 1)
		{
			JOptionPane.showMessageDialog(null, "Does it have Stripes?");
		}
		else
		{
			JOptionPane.showConfirmDialog(null, "Does it have stripes?", "",JOptionPane.YES_NO_OPTION);
		}
		if(hi == 0){
			JOptionPane.showConfirmDialog(null, "It is a pig then", "",JOptionPane.YES_NO_OPTION);
		}
		else{
	JOptionPane.showConfirmDialog(null, "It is a zebra then", "",JOptionPane.YES_NO_OPTION);

}
	}
}
