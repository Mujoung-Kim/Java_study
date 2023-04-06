package sec02.exam03;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	// Field init
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("Phone call.");
		}
	};
	
	Window() {
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("Send to message.");
			}
		});
	}
}