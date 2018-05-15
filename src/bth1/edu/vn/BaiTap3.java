package bth1.edu.vn;

import java.util.Scanner;
import bth1.edu.vn.*;

public class BaiTap3 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Nhập cấp n của ma trận vuông: ");
		int n=in.nextInt();
		MaTranVuong a=new MaTranVuong(n);
		System.out.println("Nhập ma trận vuông: ");
		a.in();
		System.out.println("Xuất ma trận vuông: ");
		a.out();
		System.out.println("Tổng các phần tử thuộc tam giác trên: "+a.sum_triangle_up());
		System.out.println("Tổng các phần tử thuộc tam giác dưới: "+a.sum_triangle_down());
		if(a.check_symmetry())System.out.println("Ma trận vuông đối xứng qua đường chéo chính");
		else System.out.println("Ma trận vuông không đối xứng qua đường chéo chính");
		
	}
}
