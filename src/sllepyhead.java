// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class sllepyhead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		// *
		// * Ask the user for deez values using
		
	int hi = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "",JOptionPane.YES_NO_OPTION);

		 if(hi == 1){
			 JOptionPane.showMessageDialog(null, "SLEEP IN");
		 }
		 else{
			 JOptionPane.showMessageDialog(null, "WAKE UP");
		 }
		

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
		 * print “get up lazybones!” If it is a weekday, and we are on vacation,
		 * print “sleep in”.
		 */
	}
}
