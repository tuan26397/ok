package bth1.edu.vn;

import java.util.Scanner;
import bth1.edu.vn.*;

public class BaiTap2 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Nhập số dòng: ");
		int n=in.nextInt();
		System.out.print("Nhập số cột: ");
		int m=in.nextInt();
		MaTran a=new MaTran(n,m);
		System.out.println("Nhập ma trận:");
		a.in();
		System.out.println("Xuất ma trận:");
		a.out();
		System.out.println("Phần tử nhỏ nhất trong ma trận là: "+a.min());
		System.out.print("Phần tử lẻ lớn nhất trong ma trận là: ");
		if(a.odd_max()!=-1)System.out.println(a.odd_max());
		else System.out.println("Không có phần tử lẻ nào!");
		System.out.println("Dòng có tổng lớn nhất là dòng thứ: "+(int)(a.id_row_max()+1));
		System.out.println("Tổng các số không phải là số nguyên tố: "+a.sum_not_prime());
		
		
	}
}
