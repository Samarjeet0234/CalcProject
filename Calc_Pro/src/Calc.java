import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calc extends JFrame implements ActionListener
{
	JButton one,two,three,four,five,six,seven,eight,nine,zero,dot;
	int x,y,res;
	JTextField tf1;
	JButton b[] = new JButton[10];
	JButton add,sub,mul,div,clear,mod,Eq;
	char o;
	
	Calc()
	{
		setLayout(null);
		setVisible(true);
		setTitle("My Calculator");
		tf1 = new JTextField(10);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		setResizable(true);
		getContentPane().setBackground(Color.gray);
		
		for(int i=0;i<10;i++)
		{
			b[i]=new JButton(""+i);
		}
		add = new JButton("+");
		sub = new JButton("-");
		mul = new JButton("x");
		div = new JButton("/");
		mod = new JButton("%");
		clear = new JButton("clr");
		Eq = new JButton("=");
		
		tf1.addActionListener(this);
		add(tf1);
		
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		dot = new JButton(".");
		
		one.setBounds(50,65,50,30);
		two.setBounds(105,65,50,30);
		mul.setBounds(160,65,50,30);
		div.setBounds(215,65,50,30);
		three.setBounds(50,100,50,30);
		four.setBounds(105,100,50,30);
		add.setBounds(160,100,50,30);
		sub.setBounds(215,100,50,30);
		five.setBounds(50,135,50,30);
		six.setBounds(105,135,50,30);
		
		tf1.setBounds(50,30,220,25);
		
		mod.setBounds(160,135,50,30);
		dot.setBounds(215,135,50,30);
		seven.setBounds(50,170,50,30);
		eight.setBounds(105,170,50,30);
		clear.setBounds(160,170,50,30);
		Eq.setBounds(215,170,50,65);
		nine.setBounds(50,205,50,30);
		zero.setBounds(105,205,50,30);
		
		add(one);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(seven);
		add(eight);
		add(nine);
		add(zero);
		
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(mod);
		add(clear);
		add(Eq);
		add(dot);
		
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		zero.addActionListener(this);
		dot.addActionListener(this);
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		clear.addActionListener(this);
		Eq.addActionListener(this);
	}
	public static void main(String[] args) 
	{
		new Calc();
	}
	public void actionPerformed(ActionEvent ae) 
	{
		String str = ae.getActionCommand();
		
		char ch = str.charAt(0);
		if(str.equals("+"))
		{
			x = Integer.parseInt(tf1.getText());
			o='+';
			tf1.setText("");
		}
		else if(str.equals("-"))
		{
			x = Integer.parseInt(tf1.getText());
			o='-';
			tf1.setText("");
		}
		else if(str.equals("x"))
		{
			x = Integer.parseInt(tf1.getText());
			o='*';
			tf1.setText("");
		}
		else if(str.equals("/"))
		{
			x = Integer.parseInt(tf1.getText());
			o='/';
			tf1.setText("");
		}
		else if(str.equals("%"))
		{
			x = Integer.parseInt(tf1.getText());
			o='%';
			tf1.setText("");
		}
		if(str.equals("="))
		{
			y = Integer.parseInt(tf1.getText());
			if(o=='+')
				res = x+y;
			else if(o=='-')
				res = x-y;
			else if(o=='*')
				res = x*y;
			else if(o=='/')
				res = x/y;
			else if(o=='%')
				res = x%y;
			tf1.setText(""+res);
		}
		if(str.equals("clr"))
		{
			tf1.setText("");
		}
	}
}
