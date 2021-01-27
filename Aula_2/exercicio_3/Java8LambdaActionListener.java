import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Java8LambdaActionListener {

	public static void main(String[] args) {

		JButton jButton = new JButton();
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("odnuM àlO");
			}
		});

		JButton jButton2 = new JButton();
		jButton2.addActionListener(e -> System.out.println("odnuM àlO"));

	}

}
