package NoSolid.ISP;
// import java.util.ArrayList;
// import java.util.List;
class Cliente {
    public static void main(String[] args) {
        System.out.println("Demostracion sin ISP");
        Impresora impresora = new ImpresoraAvanzada();
        impresora.printDocument();
        Fax efax = new EFax();
        impresora.sendFax( efax );

        impresora = new ImpresoraBasica();
        impresora.printDocument();
        //impresora.sendFax(efax);// Lanza un error
    }
}
