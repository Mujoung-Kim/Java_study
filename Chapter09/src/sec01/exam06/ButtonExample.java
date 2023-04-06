package sec01.exam06;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		// Dependency injection 적용됨
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}
}