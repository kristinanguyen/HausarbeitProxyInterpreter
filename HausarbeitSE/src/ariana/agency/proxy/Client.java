package ariana.agency.proxy;

public class Client
{
    public static void main(String[] args)
    {
        ArianaGrande arianaGrande = new RealArianaGrande();
        ArianaGrande proxy = new Proxy(arianaGrande);
        proxy.meeting();
        proxy.signContract();
        proxy.bookFlight();
        proxy.findHotel();
        proxy.car();
        proxy.sing();
        proxy.getPayment();
    }
}

