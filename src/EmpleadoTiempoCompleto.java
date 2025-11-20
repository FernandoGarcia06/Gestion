public class EmpleadoTiempoCompleto extends Empleado  {
    private int antiguedad;
    private String departamento;
    

    public EmpleadoTiempoCompleto(String nombre, String id, double salarioBase, int antiguedad, String departamento){
        super(nombre, id, salarioBase);
        this.antiguedad = antiguedad;
        this.departamento = departamento;
    }

    public double  calcularBonificacion(){
         return  getSalarioBase() * 0.10 * antiguedad;
    }

    public double calcularSalario(){
        return getSalarioBase() + calcularBonificacion();
    }

    public double aplicarDescuentoSeguro(){
        return calcularSalario() * 0.05;
    }

     public int antiguedad() {
        return antiguedad;
    }

    public void setaAntiguedad(int antiguedad){
        this.antiguedad = antiguedad;
    }

    public String getDepartamento(){
        return departamento;
    }       

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }





    
}
