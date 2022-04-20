package estructurales.adapter;

public class BlackCreditCard implements Secure{
    @Override
    public void payWithSecureLevelA() {
        System.out.println("Tarjeta Black: pagando con seguridad ALTA");
    }

    @Override
    public void payWithSecureLevelZ() {
        // no implementar
    }
}
