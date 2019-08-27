class Name{

	void test(int c,int n) {
System.out.println(" Name is :"+ c + " " + n);
}

	void test(int n) {
	System.out.println(" Name is :" + n);
}
}
class NameTest
{
public static void main(String[] ags)
{

Name name1 =new Name();
name1.test(20);
name1.test(20,100);


}
}

