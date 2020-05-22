package Adaptor;

public class SocketAdapterImplements extends Socket implements SocketAdapter{

	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return get120Volt();
	}

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		Volt volt = get12Volt();
		return convertVolt(volt, 10);
	}

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		Volt volt = get3Volt();
		return convertVolt(volt, 40);
	}

	@Override
	public Volt get1Volt() {
		// TODO Auto-generated method stub
		return get1Volt();
	}

	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}
}
