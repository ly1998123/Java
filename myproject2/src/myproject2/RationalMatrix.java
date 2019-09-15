package myproject2;

public class RationalMatrix extends GenericMatrix <Rational>{

	@Override
	protected Rational add(Rational m1, Rational m2) {
		// TODO Auto-generated method stub
		return m1.add(m2);
	}

	@Override
	protected Rational multiply(Rational m1, Rational m2) {
		// TODO Auto-generated method stub
		return m1.multiply(m2);
	}

	@Override
	protected Rational zero() {
		// TODO Auto-generated method stub
		return new Rational(0,1);
	}

}
