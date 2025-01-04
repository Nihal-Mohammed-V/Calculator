package calculatorfram;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	
	
	boolean isOperatorClicked=false;
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton divButton;
	JButton mulButton;
	JButton minusButton;
	JButton plusButton,clearButton;
	String oldValue;
	char operator;
	float result;
	String storeNum[];
	
	
	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(460,570);
		jf.setLocation(300, 150);
		
		
		displayLabel =new JLabel();
		displayLabel.setBounds(130,20,280,80);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		displayLabel.setFont(new Font("Ariel", Font.PLAIN,50));
		
		jf.add(displayLabel);
		
	    sevenButton=new JButton("7");
		sevenButton.setBounds(30,130,80,80);
		sevenButton.setFont(new Font("Ariel", Font.PLAIN,30));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		
		eightButton=new JButton("8");
		eightButton.setBounds(130,130,80,80);
		eightButton.setFont(new Font("Ariel", Font.PLAIN,30));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
	    nineButton=new JButton("9");
		nineButton.setBounds(230,130,80,80);
		nineButton.setFont(new Font("Ariel", Font.PLAIN,30));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30,230,80,80);
		fourButton.setFont(new Font("Ariel", Font.PLAIN,30));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(130,230,80,80);
		fiveButton.setFont(new Font("Ariel", Font.PLAIN,30));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(230,230,80,80);
		sixButton.setFont(new Font("Ariel", Font.PLAIN,30));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30,330,80,80);
		oneButton.setFont(new Font("Ariel", Font.PLAIN,30));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(130,330,80,80);
		twoButton.setFont(new Font("Ariel", Font.PLAIN,30));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(230,330,80,80);
		threeButton.setFont(new Font("Ariel", Font.PLAIN,30));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(30,430,80,80);
		dotButton.setFont(new Font("Ariel", Font.PLAIN,30));
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(130,430,80,80);
		zeroButton.setFont(new Font("Ariel", Font.PLAIN,30));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(230,430,80,80);
		equalButton.setFont(new Font("Ariel", Font.PLAIN,30));
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		divButton=new JButton("/");
		divButton.setBounds(330,130,80,80);
		divButton.setFont(new Font("Ariel", Font.PLAIN,30));
		divButton.addActionListener(this);
		jf.add(divButton);
		
		mulButton=new JButton("x");
		mulButton.setBounds(330,230,80,80);
		mulButton.setFont(new Font("Ariel", Font.PLAIN,30));
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
	    minusButton=new JButton("-");
		minusButton.setBounds(330,330,80,80);
		minusButton.setFont(new Font("Ariel", Font.PLAIN,30));
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		plusButton=new JButton("+");
		plusButton.setBounds(330,430,80,80);
		plusButton.setFont(new Font("Ariel", Font.PLAIN,30));
		plusButton.addActionListener(this);
		jf.add(plusButton);
		
		clearButton=new JButton("C");
		clearButton.setBounds(30,20,80,80);
		clearButton.setFont(new Font("Ariel", Font.PLAIN,30));
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== sevenButton) {
           if(isOperatorClicked) {
        	   displayLabel.setText("7");
        	   isOperatorClicked=false;
			}else {
				 displayLabel.setText(displayLabel.getText()+"7");
			}
		       
		}else if(e.getSource()== eightButton) {	
			 if(isOperatorClicked) {
	        	   displayLabel.setText("8");
	        	   isOperatorClicked=false;
				}else {
					 displayLabel.setText(displayLabel.getText()+"8");
				}
			 
		}else if(e.getSource()== nineButton) {
			 if(isOperatorClicked) {
	        	   displayLabel.setText("9");
	        	   isOperatorClicked=false;
				}else {
					 displayLabel.setText(displayLabel.getText()+"9");
				}
		}else if(e.getSource()== fourButton) {
			 if(isOperatorClicked) {
	        	   displayLabel.setText("4");
	        	   isOperatorClicked=false;
				}else {
					 displayLabel.setText(displayLabel.getText()+"4");
				}
		}else if(e.getSource()== fiveButton) {
			 if(isOperatorClicked) {
	        	   displayLabel.setText("5");
	        	   isOperatorClicked=false;
				}else {
					 displayLabel.setText(displayLabel.getText()+"5");
				}
		}else if(e.getSource()== sixButton) {
			 if(isOperatorClicked) {
	        	   displayLabel.setText("6");
	        	   isOperatorClicked=false;
				}else {
					 displayLabel.setText(displayLabel.getText()+"6");
				}
		}else if(e.getSource()== oneButton) {
			 if(isOperatorClicked) {
	        	   displayLabel.setText("1");
	        	   isOperatorClicked=false;
				}else {
					 displayLabel.setText(displayLabel.getText()+"1");
				}
		}else if(e.getSource()== twoButton) {
			 if(isOperatorClicked) {
	        	   displayLabel.setText("2");
	        	   isOperatorClicked=false;
				}else {
					 displayLabel.setText(displayLabel.getText()+"2");
				}
		}else if(e.getSource()== threeButton) {
			 if(isOperatorClicked) {
	        	   displayLabel.setText("3");
	        	   isOperatorClicked=false;
				}else {
					 displayLabel.setText(displayLabel.getText()+"3");
				}
		}else if(e.getSource()== zeroButton) {
			 if(isOperatorClicked) {
	        	   displayLabel.setText("0");
	        	   isOperatorClicked=false;
				}else {
					 displayLabel.setText(displayLabel.getText()+"0");
				}
		}else if(e.getSource()== dotButton) {		
			 if(isOperatorClicked) {
	        	   displayLabel.setText(".");
	        	   isOperatorClicked=false;
				}else {
					 displayLabel.setText(displayLabel.getText()+".");
				}
		}else if(e.getSource()== equalButton) {
			String newValue=displayLabel.getText();
			
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
			
			
			
			
			switch(operator) {
			case '+':result=oldValueF+newValueF;
			case '-':result=oldValueF-newValueF;
			case '/':result=oldValueF/newValueF;
			case 'x':result=oldValueF*newValueF;
			
			}
			
			displayLabel.setText(result+"");
			
		
		}else if(e.getSource()== divButton) {
			
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			operator='/';
		
		}else if(e.getSource()== mulButton) {
			
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			operator='*';
		
		}else if(e.getSource()== minusButton) {
			
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			operator='-';
		
		}else if(e.getSource()== plusButton) {
			
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			operator='+';
		
		}else if(e.getSource()== clearButton) {		
			displayLabel.setText("");
		}
		

}
}


