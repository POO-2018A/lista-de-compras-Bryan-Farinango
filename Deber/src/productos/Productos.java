package productos;

public class Productos {
    
    private String nombre;
    private double precio;

    public Productos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    public String imprimir() {
        String informacion = nombre+"\n"+
                             "$"+precio+"\n";
        
        return informacion;
    }
    
    
    
    
}
