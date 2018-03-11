package GUI;

import javax.swing.Icon;
import javax.swing.JLabel;

public class AllometricIndexText extends JLabel {
	String a = "0";
	public AllometricIndexText() {
		super("AllometricScaleIndex");
	}
	
	public void setString(String text){
		setText(text);
	}
}
