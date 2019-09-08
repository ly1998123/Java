package myproject;

import java.awt.Color;

public class Shape {
	int leftx,lefty,rightx,righty,flag;
	Color color;
	Shape(int leftx,int lefty,int rightx,int righty,int flag,Color color)
	{
		this.leftx=leftx;
		this.lefty=lefty;
		this.rightx=rightx;
		this.righty=righty;
		this.flag=flag;
		this.color=color;
	}
	void setColor(Color color)
	{
		this.color=color;
	
	}
	Color getColor()
	{
		return color;
	}
	int getLeftx()
	{
		return leftx;
	}
	void setLeftx()
	{
		this.leftx=leftx;
	}
	int getLefty()
	{
		return lefty;
	}
	void setLefty()
	{
		this.lefty=lefty;
	}
	int getRightx()
	{
		return rightx;
	}
	void setRightx()
	{
		this.rightx=rightx;
	}
	int getRighty()
	{
		return righty;
	}
	void setRight()
	{
		this.righty=righty;
	}
	int getFlag()
	{
		return flag;
	}
	void setFlag()
	{
		this.flag=flag;
	}
	public Shape()
	{
		
	}
}
