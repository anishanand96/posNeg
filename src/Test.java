//Anisha anand   10-07-2017
public class Test {
	public boolean posNeg(int a, int b, boolean negative) {
		if (negative == false) {
			if ((a < 0 && b > 0) || (a > 0 && b < 0))
				return true;
			else
				return false;
		} else {
			if ((a < 0) && (b < 0))
				return true;
			else
				return false;
		}
	}

	public static void main(String[] args) {
		Test c1 = new Test();
		boolean a = c1.posNeg(1, -1, false);
		boolean b = c1.posNeg(1, -1, true);
		boolean c = c1.posNeg(-1, 1, false);
		boolean d = c1.posNeg(-1, 1, true);
		boolean f = c1.posNeg(-1, -1, false);
		boolean g = c1.posNeg(-1, -1, true);
		boolean h = c1.posNeg(1, 1, false);
		boolean i = c1.posNeg(1, 1, true);
		boolean j = c1.posNeg(1, 0, true);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);

	}
}
