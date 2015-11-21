
public class stephenhawking {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			speak("hi eshaan"
					+ "");
		}

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
