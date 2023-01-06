import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyFrame extends JFrame
{
	JTextField t,t1;
	JLabel l,l1;
	int x,y;
	Panel p;
	MyFrame(String title)
	{
		super(title);
		setLayout(new FlowLayout());
		
		p=new Panel();
		p.setLayout(new GridLayout(2,2,5,5));
		t=new JTextField(20);
		l= new JLabel("Co-ordinates of clicking");
		l1= new JLabel("Co-ordinates of movement");
		t1=new JTextField(20);
		p.add(l);
		p.add(t);
		p.add(l1);
		p.add(t1);
		add(p);
		addMouseListener(new MyClick());
		addMouseMotionListener(new MyMove());
		setSize(500,500);
		setVisible(true);
	}
	class MyClick extends MouseAdapter
	{
		public void mouseClicked(MouseEvent me)
		{
			x=me.getX();
			y=me.getY();
			t.setText("X="+x+" Y="+y);
		}
	}
	class MyMove extends MouseMotionAdapter
	{
		public void mouseMoved(MouseEvent me)
		{
			x=me.getX();
			y=me.getY();
			t1.setText("X="+ x +" Y="+y);
		}
	}
}
class slip8a
{
	public static void main(String args[])
	{
		MyFrame f = new MyFrame("Slip Number 4");
	}
}






