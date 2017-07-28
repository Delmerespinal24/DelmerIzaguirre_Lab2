
package delmerespinal24_lab2_progra2;

import java.util.Date;

/**
 *
 * @author Owner
 */
public class Mensaje {
    private String texto;
    private Usuario Emisor;
    private String Receptor;
    private Date Fecha;

    public Mensaje(String texto, Usuario Emisor, String Receptor, Date Fecha) {
        this.texto = texto;
        this.Emisor = Emisor;
        this.Receptor = Receptor;
        this.Fecha = Fecha;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Usuario getEmisor() {
        return Emisor;
    }

    public void setEmisor(Usuario Emisor) {
        this.Emisor = Emisor;
    }

    public String getReceptor() {
        return Receptor;
    }

    public void setReceptor(String Receptor) {
        this.Receptor = Receptor;
    }

    @Override
    public String toString() {
        return texto;
    }
    
}
