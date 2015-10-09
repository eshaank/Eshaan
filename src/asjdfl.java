import javax.swing.JOptionPane;


public class asjdfl {
public static void main(String[] args) {
	speak("size");
}
static void speak(String words) {
  	 try {
  		 Runtime.getRuntime().exec("say " + words).waitFor();
  	 } catch (Exception e) {
  		 e.printStackTrace();
  	 }
}}
