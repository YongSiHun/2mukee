class Sub{
	public Sub(){
		
	}
	public static void test1(){
		System.out.print("test");
	}
	public void test1(int i){
		System.out.print("test" + i);
	}
}
class Sub2 extends Sub{
	public Sub2(){
		
	}
	public static void test1(){
		System.out.print("overwriting");
	}
}
public class Test_Static_OverLoading {

	public static void main(String[] args) {
		Sub a = new Sub2();
		a.test1();
		Sub2 b = new Sub2();
		b.test1();
		
	}

}
