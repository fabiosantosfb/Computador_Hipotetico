package controler.instance;

import view.MainComputadorHipotetico;

public class Factory {
	//Design Pattern MachineFactory
	
	private static MainComputadorHipotetico processo = null;
	public static MainComputadorHipotetico getInstance() {
		if (processo == null) {
			processo = new MainComputadorHipotetico();
		}
		return processo;
	}
}
