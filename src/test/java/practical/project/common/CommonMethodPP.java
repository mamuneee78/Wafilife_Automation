package practical.project.common;

import practical.project.drivers.BaseDriverPP;

public class CommonMethodPP extends BaseDriverPP {
	public static void timeout() throws InterruptedException {
		Thread.sleep(300);
	}
	public static void timeout(int time) throws InterruptedException {
		Thread.sleep(time);
}
}
