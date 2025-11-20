public class EmpleadoFreelance extends Empleado {

    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoFreelance(String nombre, String id, double salarioBase, int horasTrabajadas, double tarifaHora){
        super(nombre, id, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    public double calcularSalario(){
        return horasTrabajadas * tarifaHora + ;
    }








    public int getHorasTrabajadas(){
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }



    
}
