import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CTC extends JFrame implements ActionListener{
JFrame f;
JPanel p;
JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, ba, bs, bd, bm, be, bc;
JTextField t;
String s1, s2, s0;

public CTC(){

try{
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
}
catch(Exception e){
System.err.println(e);
}

s1=s2=s0="";

f = new JFrame("Calculate");

t = new JTextField(16);
t.setEditable(false);

p = new JPanel();

b0 = new JButton("0");
b1 = new JButton("1");
b2 = new JButton("2");
b3 = new JButton("3");
b4 = new JButton("4");
b5 = new JButton("5");
b6 = new JButton("6");
b7 = new JButton("7");
b8 = new JButton("8");
b9 = new JButton("9");
ba = new JButton("+");
bs = new JButton("-");
bm = new JButton("*");
bd = new JButton("/");
be = new JButton("=");
bc = new JButton("C");


b0.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
ba.addActionListener(this);
bs.addActionListener(this);
bm.addActionListener(this);
bd.addActionListener(this);
be.addActionListener(this);
bc.addActionListener(this);


p.add(t);
p.add(ba);
p.add(b1);
p.add(b2);
p.add(b3);
p.add(bs);
p.add(b4);
p.add(b5);
p.add(b6);
p.add(bm);
p.add(b7);
p.add(b8);
p.add(b9);
p.add(bd);
p.add(be);
p.add(b0);
p.add(bc);


p.setBackground(Color.blue);

f.add(p);
f.setSize(200,220);
f.setVisible(true);
}

public void actionPerformed(ActionEvent e){
String s = e.getActionCommand();

if(s.charAt(0) >= '0' && s.charAt(0) <= '9'){
if(!s1.equals(""))
s2 = s2+s;
else
s0 = s0+s;
t.setText(s0+s1+s2);
}
else if(s.charAt(0) == 'C'){
s0=s1=s2="";
t.setText(s0+s1+s2);
}
else if(s.charAt(0) == '='){
int te;
if(s1.equals("+"))
te = (Integer.parseInt(s0) + Integer.parseInt(s2));
else if(s1.equals("-"))
te = (Integer.parseInt(s0) - Integer.parseInt(s2));
else if(s1.equals("*"))
te = (Integer.parseInt(s0) * Integer.parseInt(s2));
else
te = (int) (Integer.parseInt(s0) / Integer.parseInt(s2));

s0 = Integer.toString(te);

t.setText(s0);
}
else{
if(s1.equals("") || s2.equals("")){
s1=s;
}
else{
int te;
if(s1.equals("+"))
te = (Integer.parseInt(s0) + Integer.parseInt(s2));
else if(s1.equals("-"))
te = (Integer.parseInt(s0) - Integer.parseInt(s2));
else if(s1.equals("*"))
te = (Integer.parseInt(s0) * Integer.parseInt(s2));
else
te = (int) (Integer.parseInt(s0) / Integer.parseInt(s2));

s0 = Integer.toString(te);
s1 = s;
s2 = "";
}
t.setText(s0+s1+s2);
}
}
public static void main(String args[]){

new CTC();
}
}