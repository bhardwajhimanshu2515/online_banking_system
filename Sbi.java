import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Sbi  implements ActionListener
{
	/*
	This program uses Awt and Swing packages of java to create and user
    GUI.
    I have made an application which pretends like online banking app.
    It includes features like signup,login,check balance,transfer,deposit
    money.
	*/
	int bal=5000;
	String res=String.valueOf(bal);
//frame and their objects...............................................	
Frame ob=new Frame();
Frame bb=new Frame();
Frame cc=new Frame();
Frame dd=new Frame();
Frame ee=new Frame();
Frame ff=new Frame();
Frame gg=new Frame();
Frame hh=new Frame();
Frame ii=new Frame();
//.......................................................................
TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
Button b1,b2,b3,reg,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
JRadioButton z1,z2;
JCheckBox c1,c2,c3;
Sbi()
{
	//DECLARATION ...........................................................
	
	//...........................................................
ob.setTitle("SBI BANK");
//frame1.....................................................................

bb.setTitle("SBI BANK");
b1=new Button("signup");
b1.setBounds(50,100,90,20);
b2=new Button("login");
b2.setBounds(200,100,90,20);
bb.add(b1);bb.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
bb.setLayout(null);
bb.setVisible(true);
bb.setSize(500,500);

//...........................................................................
//Frame2.....................................................................

l1=new Label("username:");
l1.setBounds(50,150,90,20);
l2=new Label("password:");
l2.setBounds(50,170,90,20);
t1=new TextField();
t1.setBounds(120,150,90,20);

t2=new TextField();
t2.setBounds(120,170,90,20);
t2.setEchoChar('*');
l3=new Label("gender:");
l3.setBounds(50,200,90,20);
z1=new JRadioButton("male");
z1.setBounds(150,200,90,20);
z2=new JRadioButton("female");
z2.setBounds(150,220,90,20);
l4=new Label("college:");
l4.setBounds(50,270,90,20);
t3=new TextField();
t3.setBounds(150,270,90,20);
l5=new Label("qualification:");
l5.setBounds(50,300,90,20);
c1=new JCheckBox("10th");
c1.setBounds(150,300,90,20);
c2=new JCheckBox("12th");
c2.setBounds(150,320,90,20);
c3=new JCheckBox("graduation",true);
c3.setBounds(150,340,90,20);
b3=new Button("register");
b3.setBounds(150,380,90,20);
ButtonGroup bg=new ButtonGroup();
bg.add(z1);bg.add(z2);
ob.add(t1);ob.add(t2);ob.add(t3);ob.add(l1);ob.add(l2);ob.add(l3);ob.add(l4);ob.add(l5);ob.add(c1);ob.add(c2);ob.add(c3);ob.add(z1);ob.add(z2);
ob.add(b3);
ob.setLayout(null);

ob.setVisible(false);
ob.setSize(500,500);
b3.addActionListener(this);
//..................................................................
//Frame3............................................................
cc.setTitle("SBI BANK");
l6=new Label("username:");
l6.setBounds(50,150,90,20);
l7=new Label("password:");
l7.setBounds(50,170,90,20);
t4=new TextField();
t4.setBounds(150,150,90,20);

t5=new TextField();
t5.setBounds(150,170,90,20);
t5.setEchoChar('*');
b4=new Button("login");
b4.setBounds(150,250,90,20);

cc.add(l6);cc.add(l7);cc.add(t4);cc.add(t5);
cc.add(b4);
b4.addActionListener(this);
cc.setLayout(null);
cc.setVisible(false);
cc.setSize(500,500);
//........................................................................
//Frame4..................................................................
dd.setTitle("SBI BANK");
b5=new Button("CHECKbal");
b5.setBounds(150,200,90,20);
b6=new Button("DEPOSIT");
b6.setBounds(150,250,90,20);
b7=new Button("TRANSFER");
b7.setBounds(150,300,90,20);
b13=new Button("EXIT");
b13.setBounds(150,350,90,20);
dd.add(b5);dd.add(b6);dd.add(b7);dd.add(b13);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b13.addActionListener(this);
dd.setLayout(null);
dd.setVisible(false);
dd.setSize(500,500);
//..........................................................................
//frame5....................................................................
ee.setTitle("SBI BANK");
l8=new Label("Not-user");
l8.setBounds(50,200,90,20);
ee.add(l8);
ee.setLayout(null);
ee.setVisible(false);
ee.setSize(700,700);
//..........................................................................
//frame6....................................................................
ff.setTitle("SBI BANK");
l9=new Label("BALANCE:");
l9.setBounds(100,200,90,20);
t6=new TextField();
t6.setBounds(170,200,90,20);
t6.setEditable(false);
t6.setText(res);
b8=new Button("BACK");
b8.setBounds(150,270,90,20);
ff.add(t6);ff.add(l9);ff.add(b8);
b8.addActionListener(this);
ff.setLayout(null);
ff.setVisible(false);
ff.setSize(500,500);
//.........................................................................
//Frame7...................................................................
gg.setTitle("SBI BANK");

l10=new Label("DEPOSIT:");
l10.setBounds(100,200,90,20);
l11=new Label("UPDTbal:");
l11.setBounds(100,230,90,20);
t7=new TextField();
t7.setBounds(200,200,90,20);

t8=new TextField();
t8.setBounds(200,230,90,20);

b9=new Button("CONFIRM");
b9.setBounds(150,250,90,20);
b10=new Button("BACK");
b10.setBounds(150,290,90,20);
gg.add(l10);gg.add(l11);gg.add(b10);gg.add(b9);gg.add(t7);gg.add(t8);
b10.addActionListener(this);
b9.addActionListener(this);
gg.setLayout(null);
gg.setVisible(false);
gg.setSize(500,500);
//.......................................................................
//frame8.................................................................
hh.setTitle("SBI BANK");
l15=new Label("Trnsfr ACC:");
l15.setBounds(100,150,90,20);
t11=new TextField();
t11.setBounds(200,150,90,20);
l12=new Label("TRANSFER:");
l12.setBounds(100,200,90,20);
l13=new Label("UPDTbal:");
l13.setBounds(100,230,90,20);
t9=new TextField();
t9.setBounds(200,200,90,20);

t10=new TextField();
t10.setBounds(200,230,90,20);
b11=new Button("CONFIRM");
b11.setBounds(150,250,90,20);
b12=new Button("BACK");
b12.setBounds(150,290,90,20);
hh.add(l12);hh.add(l13);hh.add(t9);hh.add(t10);hh.add(b11);hh.add(b12);hh.add(l15);hh.add(t11);
b11.addActionListener(this);
b12.addActionListener(this);
hh.setLayout(null);
hh.setVisible(false);
hh.setSize(500,500);
//......................................................................
//frame9.................................................................
ii.setTitle("SBI BANK");
l14=new Label("CANT WITHDRAW");
l14.setBounds(100,250,120,20);
b14=new Button("EXIT");
b14.setBounds(150,300,90,20);
ii.add(l14);ii.add(b14);
b14.addActionListener(this);
ii.setLayout(null);
ii.setVisible(false);
ii.setSize(500,500);

}
public void actionPerformed(ActionEvent e)
{
	//actionPerformed per button........................................................
	String s1=t1.getText();
	String s2=t2.getText();
	String s3=t4.getText();
	String s4=t5.getText();
	
	
	String s5=t7.getText();
	String s6=t9.getText();
if(e.getSource()==b1)
{
ob.setVisible(true);

}
if(e.getSource()==b2)
{
	

	cc.setVisible(true);
}
if(e.getSource()==b3)
{
	cc.setVisible(true);
}
if(e.getSource()==b4)
{
	if(s1.equals(s3) && s2.equals(s4))
	{
		dd.setVisible(true);
	}
	else
	{
		ee.setVisible(true);
		System.exit(0);
	}
	
}
if(e.getSource()==b5)
{
	ff.setVisible(true);
}
if(e.getSource()==b8)
{
	
	dd.setVisible(true);
}
if(e.getSource()==b6)
{
	gg.setVisible(true);
}
if(e.getSource()==b10)
{
dd.setVisible(true);
}
if(e.getSource()==b9)
{
int a=Integer.parseInt(s5);
bal=bal+a;
String result=String.valueOf(bal);
gg.setVisible(true);
t8.setText(result);
t6.setText(result);
}
if(e.getSource()==b7)
{
	hh.setVisible(true);
}
if(e.getSource()==b11)
{
	int z=Integer.parseInt(s6);
	if(z<=bal)
	{
bal=bal-z;
String result=String.valueOf(bal);
	t10.setText(result);
	t6.setText(result);
hh.setVisible(true);
	}
	else
	{
		ii.setVisible(true);
		
	}
}



if(e.getSource()==b12)
{
dd.setVisible(true);
}
if(e.getSource()==b13)
{
System.exit(0);
}
if(e.getSource()==b14)
{
System.exit(0);
}
//.......................................................................
}
public static void main(String args[])
{
new Sbi();
}
}
