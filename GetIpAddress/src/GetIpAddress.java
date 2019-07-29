import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIpAddress {


    public static void main(String[] args) throws UnknownHostException {

        InetAddress inetaddress = InetAddress.getLocalHost();

        System.out.println(inetaddress.getHostName());
        System.out.println(inetaddress.getHostAddress());
        System.out.println("=========================");

        InetAddress showIPAddress = InetAddress.getByName("_COMPUTERNAME_");

        System.out.println(showIPAddress.toString());
        System.out.println(showIPAddress.getHostAddress());
    }

}
