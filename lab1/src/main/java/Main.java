import java.io.IOException;
import java.net.*;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("One argument required: Multicast address");
            return;
        }
        try{
            InetAddress address = InetAddress.getByName(args[0]);
            if (!(address.isMulticastAddress())){
                System.err.println("Specified address is not Multicast");
                return;
            }
            CopiesDetector.detectCopies(address);
        } catch (IOException exc){
            exc.printStackTrace();
        }
    }
}
