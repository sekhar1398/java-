import java.util.*;

public class DemoArray {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		List m =Collections.synchronizedList(l);
		l.add("sekhar");
		l.add("kiran");
		l.add("raju");
		System.out.println(l);
		l.set(1, "SEKHAR");
		System.out.println(l);
		int a = l.indexOf("raju");
		System.out.println(a);
		int b = l.size();
		System.out.println(b);
		boolean c = l.contains("sekhar");
		System.out.println(c);
		System.out.println(m);
		System.out.println("hai");
	}

};
