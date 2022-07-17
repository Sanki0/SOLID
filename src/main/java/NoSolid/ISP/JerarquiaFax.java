package NoSolid.ISP;
interface Fax {
    void typeFax( );
}

class LanFax implements Fax {
    @Override
    public void typeFax( ){
        System.out.println("El tipo de Fax es LanFax "  );
    }
}
class EFax implements Fax {
    @Override
    public void typeFax(   ){
        System.out.println("El tipo de Fax es Efax "  );
    }
}



