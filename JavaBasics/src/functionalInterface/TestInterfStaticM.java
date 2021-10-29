package functionalInterface;



/*As interface static methods by default not available to the implementation class,
 *  overriding concept is not applicable.


Based on our requirement we can define exactly same method in the implementation class, it’s 
valid but not overriding.*/

class TestInterfStaticM implements InterfStaticM {
	public static void main(String[] args) {
		Test t = new Test();
		t.sum(10, 20); // CE
		Test.sum(10, 20); // CE
		InterfStaticM.sum(10, 20);
	}
}