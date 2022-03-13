package polyadd;
import java.util.*;
import java.io.*;
class Poly{
	public int coef;
	public int exp;
	Poly next;
}

class PolyAdd{
	public Poly ptr, eq_h1, eq_h2, ans_h;
	public Poly input() {
	Poly eq_h =null,prev=null;
	String temp;
	Scanner keyboard=new Scanner(System.in);
	while(true) {
		ptr=new Poly();
		ptr.next=null;
		System.out.print("請輸入係數");
		try {
			ptr.coef=keyboard.nextInt();}
		catch (InputMismatchException e) {
			keyboard.hasNextLine();
			System.out.printf("Not a correctly number.\n");
			System.out.printf("Try again\n\n");
		}
		if (ptr.coef==0)
			return eq_h;
		System.out.print("請輸入指數");
		try {
			ptr.exp=keyboard.nextInt();}
		catch (InputMismatchException e) {
			keyboard.hasNextLine();
			System.out.printf("Not a correctly number.\n");
			System.out.printf("Try again\n\n");
		}
		if (eq_h==null)
			eq_h=ptr;
		else
			prev.next=ptr;
		prev=ptr;
	}
}	
public void Poly_Add()
{
	Poly this1,this2,prev;
	this1=eq_h1;
	this2=eq_h2;
	prev=null;
	while(this1!=null || this2 !=null) {
		ptr=new Poly();
		ptr.next=null;
		if((this1 != null && this2 == null)|| this1 !=null && this1.exp > this2.exp) {
			ptr.coef=this1.coef;
			ptr.exp=this1.exp;
			this1=this1.next;
			}
		else
			if(this1 ==null || this1.exp <this2.exp) {
				ptr.coef=this2.coef*(-1);
				ptr.exp=this2.exp;
				this2=this2.next;
			}
			else {
				ptr.coef=this1.coef-this2.coef;
				ptr.exp=this1.exp;
				if(this1 != null)
					this1=this1.next;
				if(this2 != null)
					this2=this2.next;
				
			}
		if (ptr.coef !=0) {
			if(ans_h ==null)
				ans_h=ptr;
			else
				prev.next=ptr;
			prev=ptr;
		}
		else
			ptr=null;
	}
}
public void show_Poly (Poly head,String text)
{
	Poly node;
	node=head;
	System.out.print(text);
	while(node != null) {
		System.out.print(node.coef + "x^" + node.exp);
		if(node.next != null && node.next.coef >=0)
			System.out.print("+");
		node=node.next;	
	}
	System.out.print("\n");
}
public static void main(String args[])
{
	PolyAdd obj =new PolyAdd();
	System.out.print("*******************************\n");
	System.out.print("--多項式的格式為:ax^b --\n");
	System.out.print("*******************************\n");
	System.out.println("<<第一個多項式為0,則結束>>\n");
	obj.eq_h1=obj.input();
	System.out.println("<<第二個多項式為0,則結束>>\n");
	obj.eq_h2=obj.input();
	obj.Poly_Add();
	System.out.println("");
	obj.show_Poly(obj.eq_h1, "第一個多項式為:");
	obj.show_Poly(obj.eq_h2, "第二個多項式為:");
	obj.show_Poly(obj.ans_h, "相減結果為:");
}
}
