package bth1.edu.vn;

import java.util.Scanner;

public class MaTranVuong 
{
	private int level;
	private int a[][];
	MaTranVuong(int n)
	{
		level=n;
		a=new int[n][n];
	}
	public void in()
	{
		Scanner in=new Scanner(System.in);
		for(int i=0;i<level;i++)
			for(int j=0;j<level;j++)
			{
				System.out.print("a["+i+"]["+j+"]= ");
				a[i][j]=in.nextInt();
			}
	}
	public void out()
	{
		for(int i=0;i<level;i++)
		{
			for(int j=0;j<level;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
	public int sum_triangle_up()
	{
		int resul=0;
		for(int i=0;i<level;i++)
			for(int j=i+1;j<level;j++)resul+=a[i][j];
		return resul;
	}
	public int sum_triangle_down()
	{
		int resul=0;
		for(int i=0;i<level;i++)
			for(int j=i+1;j<level;j++)resul+=a[j][i];
		return resul;
	}
	public boolean check_symmetry()
	{
		for(int i=0;i<level;i++)
			for(int j=i+1;j<level;j++)
				if(a[i][j]!=a[j][i])return false;
		return true;
	}

}
