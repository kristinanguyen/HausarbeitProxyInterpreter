package ariana.agency.proxy;

public class Proxy implements ArianaGrande
{
    private ArianaGrande arianaGrande;

    public Proxy(ArianaGrande arianaGrande)
    {
        super();
        this.arianaGrande = arianaGrande;
    }

    @Override
    public void meeting()
    {
        System.out.println("Der Manager hat ein Meeting mit dem einem Verantwortlichen der Tagesshow");
    }

    @Override
    public void signContract() 
    {
        System.out.println("Der Manager unterschreibt einen Vertrag mit der Taggesshow");
    }

    @Override
    public void bookFlight()
    {
        System.out.println("Der Manager hat Flugtickets gebucht.");
    }
    @Override
    public void car()
    {
        System.out.println("Der Manager hat Autos gemietet.");
    }
    @Override
    public void findHotel()
    {
        System.out.println("Der Manager hat ein Hotel zum übernachten gefunden.");
    }

    @Override
    public void sing()
    {
        arianaGrande.sing();
    }

    @Override
    public void getPayment() 
    {
        System.out.println("Der Manager kümmert sich um die Bezahlung.");
    }
}

