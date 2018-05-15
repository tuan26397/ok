package bth1.edu.vn;

import java.util.Scanner;

public class BaiTap1 
{
	static int n,x;
	static void import_n()
	{
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
	}
	static void import_x()
	{
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
	}
	static void init_array(int[] a)
	{
		for(int i=0;i<a.length;i++)a[i]=(int)(Math.random()*100);
	}
	static void out_array(int[] a)
	{
		for(int i=0;i<a.length;i++)System.out.print(a[i]+" ");
		System.out.println();
	}
	static int min_array(int[] a)
	{
		int resul=1<<30;
		for(int i=0;i<a.length;i++)resul=Math.min(resul, a[i]);
		return resul;
	}
	static int is_prime(int n)
	{
		int m=(int)Math.sqrt(n);
		for(int i=2;i<=m;i++)
		if(n%i==0)return 0;
		return 1;
	}
	static int num_prime_array(int[] a)
	{
		int resul=0;
		for(int i=0;i<a.length;i++)resul+=is_prime(a[i]);
		return resul;
	}
	static int val(int n)
	{
		int resul=0;
		while(n>0)
		{
			resul+=n%10;
			n/=10;
		}
		return resul;
	}
	static int num_val_than_10_array(int[] a)
	{
		int resul=0;
		for(int i=0;i<a.length;i++)
		if(val(a[i])>10)resul++;
		return resul;
	}
	static void swap(int[] a,int i,int j)
	{
		int tmp=a[i];
		a[i]=a[j];
		a[j]=tmp;
	}
	static void sort_decrease(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int id=i;
			for(int j=i+1;j<a.length;j++)
			if(a[j]>a[id])id=j;
			swap(a,i,id);
		}
	}
	static void sort_ascending(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int id=i;
			for(int j=i+1;j<a.length;j++)
			if(a[j]<a[id])id=j;
			swap(a,i,id);
		}
	}
	static void sort_even_odd(int[] a)
	{
		int id;
		for(int i=0;i<a.length;i++)
		if(a[i]%2==0)
		{
			id=i;
			for(int j=i+1;j<a.length;j++)
			if(a[j]%2==0&&a[j]>a[id])id=j;
			swap(a,i,id);
		}
		else
		{
			id=i;
			for(int j=i+1;j<a.length;j++)
			if(a[j]%2!=0&&a[j]<a[id])id=j;
			swap(a,i,id);
		}
	}
	static void id_x_array(int[] a,int x)
	{
		boolean has_x=false;
		for(int i=0;i<a.length;i++)
		if(x==a[i])
		{
			System.out.print(i+" ");
			has_x=true;
		}
		if(has_x==false)System.out.print("không tìm thấy vị trí nào!");
		System.out.println();
	}
	public static void main(String[] args)
	{
		System.out.print("Nhập n: ");
		import_n();
		int[] a=new int[n];
		init_array(a);
		System.out.print("Xuất giá trị các phần tử của mảng: ");
		out_array(a);
		System.out.println("Phần tử có giá trị nhỏ nhất: "+min_array(a));
		System.out.println("Số lượng các phần tử là số nguyên tố: "+num_prime_array(a));
		System.out.println("Số phần tử có tổng các chữ số lớn hơn 10: "+num_val_than_10_array(a));
		System.out.print("Mảng sau khi sắp xếp tăng dần: ");
		sort_ascending(a);
		out_array(a);
		System.out.print("Mảng sau khi sắp xếp giảm dần: ");
		sort_decrease(a);
		out_array(a);
		System.out.print("Mảng sau khi sắp xếp số chẵn giảm dần, số lẻ tăng dần: ");
		sort_even_odd(a);
		out_array(a);
		System.out.print("Nhập x: ");
		import_x();
		System.out.print("Vị trí các phần tử có giá trị x: ");
		id_x_array(a,x);
	}
}
