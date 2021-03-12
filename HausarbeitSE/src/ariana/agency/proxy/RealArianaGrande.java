package ariana.agency.proxy;

public class RealArianaGrande implements ArianaGrande
{

    @Override
    public void meeting()
    {
        System.out.println("RealArianaGrande.meeting()");
    }

    @Override
    public void signContract()
    {
        System.out.println("RealArianaGrande.signContract()");
    }

    @Override
    public void bookFlight()
    {
        System.out.println("RealArianaGrande.bookFlight()");
    }
    @Override
    public void findHotel()
    {
        System.out.println("RealArianaGrande.findHotel()");
    }
    @Override
    public void car()
    {
        System.out.println("RealArianaGrande.car()");
    }
    @Override
    public void sing()
    {
        System.out.println("Ariana Grande singt: "+ "Dangerous Woman");
    }

    @Override
    public void getPayment()
    {
        System.out.println("RealArianaGrande.getPayment()");
    }

}