package Solid.DIP;

class InterfazUsuario {
    private BaseDatos baseDatos;

    public InterfazUsuario() {

    }
    public InterfazUsuario(BaseDatos BaseDatos) {
        this.baseDatos= BaseDatos;
    }
    public void setBaseDatos(BaseDatos baseDatos2){
        this.baseDatos=baseDatos2;
    }
    public void saveEmployee(String empId) {
        baseDatos.saveEmpIdInDatabase(empId);
    }
}
