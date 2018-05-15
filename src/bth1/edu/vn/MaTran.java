package bth1.edu.vn;

import java.util.Scanner;

public class MaTran 
{
	private int row,column;
	private int[][] a;
	MaTran(int n,int m)
	{
		row=n;
		column=m;
		a=new int[n][m];
	}
	public void in()
	{
		Scanner in=new Scanner(System.in);
		for(int i=0;i<row;i++)
			for(int j=0;j<column;j++)
			{
				System.out.print("a["+i+"]["+j+"]= ");
				a[i][j]=in.nextInt();
			}
	}
	public void out()
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
	public int min()
	{
		int resul=1<<30;
		for(int i=0;i<row;i++)
			for(int j=0;j<column;j++)
				resul=Math.min(resul, a[i][j]);
		return resul;
	}
	public int odd_max()
	{
		int resul=-1;
		for(int i=0;i<row;i++)
			for(int j=0;j<column;j++)
				if(a[i][j]%2!=0)
				resul=Math.max(resul, a[i][j]);
		return resul;
	}
	public int id_row_max()
	{
		int max=0,id=0;
		for(int i=0;i<row;i++)
		{
			int tmp=0;
			for(int j=0;j<column;j++)
				tmp+=a[i][j];
			if(max<tmp)
			{
				id=i;
				max=tmp;
			}
		}
		return id;
	}
	public boolean is_not_prime(int n)
	{
		if(n==1)return true;
		int m=(int)Math.sqrt(n);
		for(int i=2;i<=m;i++)
		if(n%i==0)return true;
		return false;
	}
	public int sum_not_prime()
	{
		int resul=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			if(is_not_prime(a[i][j]))
				resul+=a[i][j];
		}
		return resul;
	}
}
