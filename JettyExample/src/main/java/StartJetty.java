import org.eclipse.jetty.server.Server;


public class StartJetty {

	public static void main(String[] args) throws Exception {
		Server server = new Server(6000);
		server.start();
	}
}
