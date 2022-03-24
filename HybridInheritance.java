package BasicProgram;


interface a{
	void method1();
}

interface b extends a{
	void method2();
}
 
interface c extends a{
	void method3();
}

class d implements b,c{

	@Override
	public void method1() {
		System.out.println("method 1");
		
	}

	@Override
	public void method3() {
		System.out.println("method 2");
		
	}

	@Override
	public void method2() {
		System.out.println("method 3");
		
	}
	
}

public class HybridInheritance {
	public static void main(String[] args) {
		d dm =new d();
		dm.method1();
		dm.method2();
		dm.method3();

	}
}
