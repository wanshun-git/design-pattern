package example02;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LoginValidatorA extends JFrame implements LoginEventListener {

	private JPanel p;
	private LoginBean lb;			// 定义具体目标
	private JLabel lblLogo;
	
	public LoginValidatorA() {
		super("Bank of China");
		p = new JPanel();
		this.getContentPane().add(p);
		lb = new LoginBean();
		lb.addLoginEventListener(this);		// 调用目标对象的注册方法
		
		Font f = new Font("Times New Roman", Font.BOLD, 30);
		lblLogo = new JLabel("Bank of China");
		lblLogo.setFont(f);
		lblLogo.setForeground(Color.red);
		
		p.setLayout(new GridLayout(2, 1));
		p.add(lblLogo);
		p.add(lb);
		p.setBackground(Color.pink);
		this.setSize(600, 200);
		this.setVisible(true);
	}
	
	
	// 实现在抽象观察者中声明的响应方法
	@Override
	public void validateLogin(LoginEvent event) {
		String userName = event.getUserName();
		String password = event.getPassword();
		
		if (0 == userName.trim().length() || 0 == password.trim().length()) {
			JOptionPane.showMessageDialog(this, new String("Username or Password is empty!"), "alert", JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(this, new String("Valid Login Info"), "alert", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public static void main(String[] args) {
		
		new LoginValidatorA().setVisible(true);
	}

}
