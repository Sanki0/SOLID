package NoSolid.LSP;

public class GuestUserPayment implements Payment {
    String name;

    public GuestUserPayment() {
        this.name = "guest";
    }

    @Override
    public void previousPaymentInfo() {
        System.out.println("No se puede mostrar los pagos anteriores pues es un usuario invitado");
    }

    @Override
    public void newPayment() {
        System.out.println("Procesando de " + name + " pago actual request.");
    }
}
