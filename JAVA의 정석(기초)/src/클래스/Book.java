package Ŭ����;

public class Book {
	String tittle;
	String autor;
	
	public void show() {
		System.out.println(tittle + " "+autor);
	}
	
	public Book() {
		this("","");
		System.out.println("������ ȣ��");
	}
	public Book(String tittle) {
		this(tittle,"���ڹ̻�");
	}
	
	public Book(String tittle,String autor) {
		this.tittle = tittle;
		this.autor = autor;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book littlePrince = new Book("�����","�������丮");
		Book loveStory = new Book("������");
		Book empotyBook = new Book();
		
		loveStory.show();
		littlePrince.show();
		empotyBook.show();
	}

}
