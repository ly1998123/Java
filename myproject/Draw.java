package myproject;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;


@SuppressWarnings("serial")
class Draw extends Canvas implements MouseListener,MouseMotionListener{
	ArrayList<Shape>list=new ArrayList<Shape>();
	int leftx,lefty,rightx,righty;
	Color color=Color.black;
	int f=0;
	int ff=0;
	public Draw()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		}
	public void paint(Graphics g)
	{
		int X=Math.min(leftx, rightx);
		int Y=Math.min(lefty,righty);
		int Width=Math.abs(leftx-rightx);
		int Height=Math.abs(lefty-righty);
	if(color==Color.red)
	{
		g.setColor(color.red);
	}
	if(color==Color.black)
	{
		g.setColor(color.black);
	}
	if(color==Color.green)
	{
		g.setColor(color.green);
	}
	Shape s=new Shape();
	if(s.flag==0)
	{
		g.drawRect(X, Y, Width, Height);
	}
	if(s.flag==1)
	{
		g.drawOval(X, Y, Width, Height);
	}
	if(s.flag==2)
	{
		g.drawRect(X,Y,Width,Height);
	}
	if(s.flag==3)
	{
		g.drawOval(X,Y,Width,Height);
	}
	
		
	}
	
	
	public static void main(String[] args)
	{
		new Draw().setVisible(true);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		rightx=e.getX();
		righty=e.getY();
		repaint();
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		list.add(new Shape(leftx,lefty,rightx,righty,f,color));
		ff=0;
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		rightx=e.getX();
		righty=e.getY();
		repaint();
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		list.add(new Shape(leftx,lefty,rightx,righty,f,color));
		ff=0;
	}
	

}
