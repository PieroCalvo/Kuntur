package capanegocio;

public class DetalleReserva {
    private String fecha;
    private String formaPago;
    private String categoria;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String Detallar()
    {
        return "Metodo en proceso de implementación";
    }
}