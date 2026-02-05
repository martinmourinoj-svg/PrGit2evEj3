import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Empleado {
    private String nombre;
    private int edad;
    private double sueldo;

public void incrementarSueldo(int porcentajeIncremento){
 this.sueldo+=sueldo*(1+porcentajeIncremento/100.0); 
 } 
}
