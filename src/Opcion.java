
import java.util.Objects;

public class Opcion {
    public String Tipo;
    public String Hora;
    public String Volumen;
    public String Ultimo;
    public String Compra_Vol;
    public String Compra_Precio;
    public String Venta_Vol;
    public String Venta_Precio;
    public String Vencimiento;
    public String Ejercicio;
    public String DiaDeCompra;

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Opcion other = (Opcion) obj;
        if (!Objects.equals(this.Tipo, other.Tipo)) {
            return false;
        }
        if (!Objects.equals(this.Vencimiento, other.Vencimiento)) {
            return false;
        }
        if (!Objects.equals(this.Ejercicio, other.Ejercicio)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.Tipo);
        hash = 89 * hash + Objects.hashCode(this.Vencimiento);
        hash = 89 * hash + Objects.hashCode(this.Ejercicio);
        return hash;
    }
    
    
}



