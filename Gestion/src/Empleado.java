public abstract  class Empleado {
    private String nombre;
    private String id;
    private double salarioBase;


    public Empleado(String nombre, String id, double salarioBase){
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public String getNombre() {
        return nombre;
    }

    public void setNomre(String nombre){
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }
    
    public void setID(String id) {
        this.id = id;
    }

    public double getSalarioBase(){
        return salarioBase;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Salario Base: " + salarioBase);
    }
  

}
