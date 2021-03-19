package interfac;
import java.io.IOException;

public class schedulerApp {

	public static void main(String[] args) throws IOException {
		int ch = System.in.read();
		scheduler sc = null;
		
		if(ch =='R' || ch == 'r') {
			sc = new RoundRobin();
		} else if (ch=='L'||ch=='l') {
			sc = new LeastJob();
		}else if (ch =='p'||ch=='P') {
			sc = new PriorityAllocation();
		} else {
			System.out.println("¿À·ù");
			return;
		}
	sc.getNextCall();
	sc.sendCalltoAgent();
	}

}
