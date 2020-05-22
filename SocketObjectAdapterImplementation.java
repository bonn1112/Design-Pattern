package Adaptor;

public class SocketObjectAdapterImplementation implements SocketAdapter{

	private Socket socket =  new Socket();
	
	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return socket.getVolt();
	}

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		Volt volt = socket.getVolt();
		return convertVolt(volt, 10);
	}

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		Volt volt = socket.getVolt();
		return convertVolt(volt, 40);
	}

	@Override
	public Volt get1Volt() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}

}
