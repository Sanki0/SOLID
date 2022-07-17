package NoSolid.ISP;
import java.util.ArrayList;
import java.util.List;
class Cliente {
    public static void main(String[] args) {
        System.out.println("Demostracion sin ISP");

        List<Impresora> impresoras = new ArrayList<Impresora>();
        impresoras.add(new ImpresoraAvanzada());
        impresoras.add(new ImpresoraBasica());

        impresoras.forEach((dispositivo) -> {
            dispositivo.printDocument();
            dispositivo.sendFax();
        });
    }
}

