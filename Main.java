package Adaptor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testObjectAdapter();
		testingClassAdapter();

	}
	
	private static void testingClassAdapter() {
		SocketAdapter socketAdapter = new SocketAdapterImplements();
		Volt volt3 = getVolt(socketAdapter, 3);
		Volt volt12 = getVolt(socketAdapter, 12);
		Volt volt120 = getVolt(socketAdapter, 120);
		
		System.out.println(" V3 volts is using Class Adapter " + volt3.getVolts());
		System.out.println(" V12 volts is using Class Adapter " + volt12.getVolts());
		System.out.println(" V120 volts is using Class Adapter " + volt120.getVolts());
	
		
	}
	
	private static void testObjectAdapter() {
		SocketAdapter socketAdapter = new SocketObjectAdapterImplementation();
		Volt volt3 = getVolt(socketAdapter, 3);
		Volt volt12 = getVolt(socketAdapter, 12);
		Volt volt120 = getVolt(socketAdapter, 120);
		
		System.out.println(" V3 volts is using Object Adapter " + volt3.getVolts());
		System.out.println(" V12 volts is using Object Adapter " + volt12.getVolts());
		System.out.println(" V120 volts is using Object Adapter " + volt120.getVolts());
	}
	
	private static Volt getVolt(SocketAdapter socketAdapter,int i) {
		switch (i) {
		case 3: return socketAdapter.get3Volt();
		case 12: return socketAdapter.get12Volt();
		case 120: return socketAdapter.get120Volt();
		default: return socketAdapter.get1Volt();
					}
	}

}
