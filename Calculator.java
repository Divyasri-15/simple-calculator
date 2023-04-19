import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame implements ActionListener {
	
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bBack,bC,bEqual,bAdd,bSub,bMul,bDiv,bDot,b00,bPercent; 
	String s0="",s1="",s2=""; //s0=operand1, s1=operator, s2=operand2
	JTextField res;
	
	public Calculator()
	{
		super("Calculator");  //calls the superclass constructor by passing the parameter Calculator --> JFrame("Calculator")
		                      //it creates a new, initially invisible frame with the specified title.
		                           
		setLayout(new BorderLayout()); //it will construct a new borderlayout with no gaps between the components
		JPanel p=new JPanel(); //panel object p is created. it is a container that can store a group of components
		p.setLayout(new GridLayout(5,4)); //it creates a grid layout with the specified no.of rows and columns
		
		bBack=new JButton("\uF0E7"); //creates a button with the specified icon
		p.add(bBack); //adds the button to the panel
		bBack.addActionListener(this); //it adds action listener to that button
		
		bC=new JButton("C");
		bC.setFont(new Font("Tahoma",Font.BOLD,18)); //style,font and size
		p.add(bC);
		bC.addActionListener(this);
		
		b00=new JButton("00");
		b00.setFont(new Font("Tahoma",Font.BOLD,18));
		p.add(b00);
		b00.addActionListener(this);
		
		bPercent=new JButton("%");
		bPercent.setFont(new Font("Tahoma",Font.BOLD,18));
		p.add(bPercent);
		bPercent.addActionListener(this);
		
		b7=new JButton("7");
		b7.setFont(new Font("Tahoma",Font.BOLD,18));
		p.add(b7);
		b7.addActionListener(this);
		
		b8=new JButton("8");
		b8.setFont(new Font("Tahoma",Font.BOLD,18));
		p.add(b8);
		b8.addActionListener(this);
		
		b9=new JButton("9");
		b9.setFont(new Font("Tahoma",Font.BOLD,18));
		p.add(b9);
		b9.addActionListener(this);
		
		bAdd=new JButton("+");
		bAdd.setFont(new Font("Tahoma",Font.BOLD,18));
		p.add(bAdd);
		bAdd.addActionListener(this);
		
		b4=new JButton("4");
		b4.setFont(new Font("Tahoma",Font.BOLD,18));
		p.add(b4);
		b4.addActionListener(this);
		
		
		b5=new JButton("5");
		b5.setFont(new Font("Tahoma",Font.BOLD,18));
		p.add(b5);
		b5.addActionListener(this);
		
		b6=new JButton("6");
		b6.setFont(new Font("Tahoma",Font.BOLD,18));
		p.add(b6);
		b6.addActionListener(this);
		
		bSub=new JButton("-");
		bSub.setFont(new Font("Tahoma",Font.BOLD,18));
		p.add(bSub);
		bSub.addActionListener(this);
		
		b1=new JButton("1");
		b1.setFont(new Font("Tahoma",Font.BOLD,18));
		p.add(b1);
		b1.addActionListener(this);
		
		b2=new JButton("2");
		b2.setFont(new Font("Tahoma",Font.BOLD,18));
		p.add(b2);
		b2.addActionListener(this);
		
		b3=new JButton("3");
		b3.setFont(new Font("Tahoma",Font.BOLD,18));
		p.add(b3);
		b3.addActionListener(this);
		
		bMul=new JButton("*");
		bMul.setFont(new Font("Tahoma",Font.BOLD,18));
		p.add(bMul);
		bMul.addActionListener(this);
		
		b0=new JButton("0");
		b0.setFont(new Font("Tahoma",Font.BOLD,18));
		p.add(b0);
		b0.addActionListener(this);
		
		bDot=new JButton(".");
		bDot.setFont(new Font("Tahoma",Font.BOLD,18));
		p.add(bDot);
		bDot.addActionListener(this);
		
		bEqual=new JButton("=");
		bEqual.setFont(new Font("Tahoma",Font.BOLD,18));
		p.add(bEqual);
		bEqual.addActionListener(this);
		
		bDiv=new JButton("/");
		bDiv.setFont(new Font("Tahoma",Font.BOLD,18));
		p.add(bDiv);
		bDiv.addActionListener(this);
		
		res=new JTextField();  //constructor that creates a new textfield
		res.setFont(new Font("Tahoma",Font.BOLD,20));  //giving style,font and size to the numbers that will display on the textfield
		res.setColumns(10);  //set the no.of columns to the text field
		
		add(p,BorderLayout.CENTER); //fits the components of the panel to the center region
		add(res,BorderLayout.NORTH); //fits the textfield in the north region
		setVisible(true); //it makes the frame appear on the screen
		setSize(380,440); //sets the size with the specified dimensions
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		
	    if ((s.charAt(0)>='0' && s.charAt(0)<='9') || s.charAt(0)=='.' || s.equals("00")) 
	    {
	        if (!s1.equals("")) //if operator string i.e s1 is not empty then add the number to the second operand s2
	        {
        	    if(s2.equals("") && s.equals("00"))
        	    {
        	    	s2=s2+"0";
        	    }
        	    else if(s2.contains(".") && s.equals("."))
        	    {
        	    	res.setText(s0+s1+s2);
        	    }
        	    else if(s2.equals("0") && s.equals("00"))
        	    {
        	    	res.setText(s0+s1+s2);
        	    }
        	    else
        	    {
	        		s2=s2+s;
	        		res.setText(s0+s1+s2);
        	    }
	        }
	             
	        else //else add to first operand s0
	        {
	        	if(s0.equals("") && s.equals("00"))
	        	{
	        		s0=s0+"0";
	        		res.setText(s0+s1+s2);
	        	}
	        	else if(s0.equals("0") && s.equals("00"))
	        	{
	        		res.setText(s0+s1+s2);
	        	}
	        	else if(s0.contains(".") && s.equals("."))
	        	{
	        		res.setText(s0+s1+s2);
	        	}
	        	else
	        	{
	        		s0=s0+s;
	        		res.setText(s0+s1+s2);
	        	}
	        }
	    }
	     
	    else if (s.charAt(0)=='C') 
	    {
	    	s0=s1=s2=""; //if the clear button is pressed then make all strings empty
	        res.setText(s0+s1+s2); //display empty 
	    }
	     
	    else if (s.charAt(0)=='=') 
	    {
	        double te=0;
	        if(s1.equals(""))
	        {
	        	res.setText(s0+s1+s2);
	        }
	        else if(!s1.equals("") && s2.equals("") && !s1.equals("%"))
	        {
	        	res.setText(s0+s1+s2);
	        }
	        else if (s1.equals("+"))
	        {
	            te=(Double.parseDouble(s0)+Double.parseDouble(s2));
	            res.setText(""+te);
	            s0=Double.toString(te);
		        s1=s2="";
	        }
	        else if (s1.equals("-"))
	        {
	            te=(Double.parseDouble(s0)-Double.parseDouble(s2));
	            res.setText(""+te);
	            s0=Double.toString(te);
		        s1=s2="";
	        }
	        else if (s1.equals("/"))
	        {
	        	te=(Double.parseDouble(s0)/Double.parseDouble(s2));
	        	res.setText(""+te);
	        	s0=Double.toString(te);
		        s1=s2="";
	        }
	        else if (s1.equals("*"))
	        {
	            te=(Double.parseDouble(s0)*Double.parseDouble(s2));
	            res.setText(""+te);
	            s0=Double.toString(te);
		        s1=s2="";
	        }
	        else if (s1.equals("%") && s2.equals(""))
	        {
	        	te=(Double.parseDouble(s0)/100);
	        	res.setText(""+te);
	        	s0=Double.toString(te);
		        s1=s2="";
	        }
	        else if(s1.equals("%") && !s2.equals(""))
	        {
	        	te=(Double.parseDouble(s0)/100)*(Double.parseDouble(s2));
	        	res.setText(""+te);
	        	s0=Double.toString(te);
		        s1=s2="";
	        }
	    }
	     
	    else if(s.equals("\uF0E7"))
	    {
	    	String backSpace=null;
			if(res.getText().length()>0)
			{
				StringBuilder str=new StringBuilder(res.getText());
				str.deleteCharAt(res.getText().length()-1);
				backSpace=str.toString();
				//res.setText(backSpace);
				s0="";
				s1="";
				s2="";
				if(backSpace.contains("+") || backSpace.contains("-") || backSpace.contains("/") || backSpace.contains("*") || backSpace.contains("%"))
				{ 
					int i=0;
					if(backSpace.contains("+"))
					{
						i=backSpace.indexOf('+');
						s1="+";
					}
					else if(backSpace.contains("-"))
					{
						i=backSpace.indexOf('-');
						s1="-";
					}
					else if(backSpace.contains("*"))
					{
						i=backSpace.indexOf('*');
						s1="*";
					}
					else if(backSpace.contains("/"))
					{
						i=backSpace.indexOf('/');
						s1="/";
					}
					else if(backSpace.contains("%"))
					{
						i=backSpace.indexOf('%');
						s1="%";
					}
					for(int j=0;j<i;j++)
					{
						s0+=backSpace.charAt(j);
					}
					for(int k=i+1;k<backSpace.length();k++)
					{
						s2+=backSpace.charAt(k);
					}
				}
				else
				{
					s0=backSpace;
				}
			}
			res.setText(s0+s1+s2);
	    }
	    else //if operator button is pressed
	    { 
	    	if(s0.equals("-"))
	        {
	        	res.setText("Expression Error");
	        }
	    	else if (s1.equals("") && !s0.equals(""))
	        {
	            s1=s;
	            res.setText(s0+s1+s2);
	        }
	        else if (!s1.equals("") && s2.equals(""))
	        {
	        	res.setText("Expression Error");
	        }
	        else if(s0.equals("") && s.equals("-"))
	        {
	        	s0=s0+s;
	        	res.setText(s0+s1+s2);
	        }
	        
	        else if(s0.equals("") && !s.equals("-"))
	        {
	        	res.setText("Expression Error");
	        }
	        else // else evaluate
	        {
	            double te=0;

	            // store the value in 1st
	            if (s1.equals("+"))
	                te=(Double.parseDouble(s0)+Double.parseDouble(s2));
	            else if (s1.equals("-"))
	                te=(Double.parseDouble(s0)-Double.parseDouble(s2));
	            else if (s1.equals("/"))
	                te=(Double.parseDouble(s0)/Double.parseDouble(s2));
	            else if (s1.equals("*"))
	                te=(Double.parseDouble(s0)*Double.parseDouble(s2));
	            else if (s1.equals("%"))
	            	te=(Double.parseDouble(s0)%Double.parseDouble(s2));
	             
	            // convert it to string
	            s0=Double.toString(te);

	            // place the operator
	            s1=s;
	            // make the operand blank
	            s2="";
	             
	            res.setText(s0+s1+s2);
	        }
	         
	     }
	}
	public static void main(String arg[])
	{
		new Calculator();
	}
}

