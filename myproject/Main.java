package myproject;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Color;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Main extends JFrame implements ActionListener{

	
	private Object jmi3;
	private JButton jmi4;
	private JButton jmi5;

	public Main()
	{
		//���ô���
		JMenuBar jmb=new JMenuBar();
		JFrame jf=new JFrame();
		jf.setSize(500,400);
		//���ò˵�
		JMenu jm1=new JMenu("�ļ�");
		JMenu jm2=new JMenu("��ɫ");
		JMenu jm3=new JMenu("����");
		JMenu jm4=new JMenu("��ͼ");
		//�����Ӳ˵�
		JMenuItem jmi1=new JMenuItem("��");
		JMenuItem jmi2=new JMenuItem("�鿴");
		JMenuItem jmi3=new JMenuItem("����");
		JMenuItem jmi4=new JMenuItem("��Բ��");
		JMenuItem jmi5=new JMenuItem("������");
		JMenuItem jmi6=new JMenuItem("Բ��");
		JMenuItem jmi7=new JMenuItem("��ɫ");
		JMenuItem jmi8=new JMenuItem("��ɫ");
		JMenuItem jmi9=new JMenuItem("��ɫ");
		
		jm1.add(jmi1);
		jm2.add(jmi7);
		jm2.add(jmi8);
		jm2.add(jmi9);
		jm3.add(jmi2);
		jm4.add(jmi3);
		jm4.add(jmi4);
		jm4.add(jmi5);
		jm4.add(jmi6);

		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);
		jmb.add(jm4);
		jf.setJMenuBar(jmb);
		jf.setVisible(true);
		
		JButton button1=new JButton("����");
		JButton button2=new JButton("��Բ��");
		JButton button3=new JButton("������");
		JButton button4=new JButton("Բ��");
		JButton button5=new JButton("��ɫ");
		JButton button6=new JButton("��ɫ");
		JButton button7=new JButton("��ɫ");
		

		
		
		jmi1.addActionListener(this);
		jmi2.addActionListener(this);
		jmi3.addActionListener(this);
		jmi4.addActionListener(this);
		jmi5.addActionListener(this);
		jmi6.addActionListener(this);
		jmi7.addActionListener(this);
		jmi8.addActionListener(this);
		jmi9.addActionListener(this);
		
	}

	public static void main(String args[])
	{
		new Main();
	}
    Shape p=new Shape();
	private JButton jmi6;
	private Object jmi7;
	private Object jmi8;
	private Object jmi9;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jbTemp=(JButton)e.getSource();
		if(jbTemp==jmi3)
		{
			p.flag=0;
		}
		if(jbTemp==jmi4)
		{
			p.flag=1;
		}
		if(jbTemp==jmi5)
		{
			p.flag=2;
		}
		if(jbTemp==jmi6)
		{
			p.flag=3;
		}
		if(e.getSource()==jmi7)
		{
			p.color=Color.red;
		}
		if(e.getSource()==jmi8)
		{
			p.color=Color.black;
		}
		if(e.getSource()==jmi9)
		{
			p.color=Color.green;
		}
	}
}


