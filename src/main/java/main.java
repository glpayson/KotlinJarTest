import hello.JavaHello;
import whatever.Greeting;
import whatever.Salutation;


public class main {

	public static void main(String[] args) {
		JavaHello javaHello = new JavaHello();
		Greeting kotlinGreeting0 = javaHello.getKotlinGreeting();
		Greeting kotlinGreeting1 = javaHello.getKotlinGreeting();
		Greeting sailorGreeting = javaHello.getSailorGreeting();

		Salutation salutation = sailorGreeting.getSalutation();

		Boolean eq0 = kotlinGreeting0.equals(kotlinGreeting1);
		System.out.println(eq0);
		Boolean eq1 = kotlinGreeting0 == kotlinGreeting1;
		System.out.println(eq1);
		Boolean eq2 = kotlinGreeting0.equals(sailorGreeting);
		System.out.println(eq2);

		System.out.println(kotlinGreeting0.getSalutation().getMessage() + kotlinGreeting0.getWhoToGreet());
	}
}
