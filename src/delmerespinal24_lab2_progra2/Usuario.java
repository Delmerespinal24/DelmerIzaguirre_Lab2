
package delmerespinal24_lab2_progra2;

import java.util.ArrayList;

/**
 *
 * @author Owner
 */


public class Usuario {
    private String nombre;
    private int edad;
    private String LugarNacimiento;
    private String nick;
    private String password;
    private ArrayList<Usuario> ListaAmigos = new ArrayList();
    private ArrayList<Usuario> ListaSolicitudes = new ArrayList();
    private ArrayList<Mensaje> BandejaEntrada = new ArrayList();
    private ArrayList<Mensaje> BandejaSalida = new ArrayList();

    public Usuario(String nombre, int edad, String LugarNacimiento, String nick, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.LugarNacimiento = LugarNacimiento;
        this.nick = nick;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLugarNacimiento() {
        return LugarNacimiento;
    }

    public void setLugarNacimiento(String LugarNacimiento) {
        this.LugarNacimiento = LugarNacimiento;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Usuario> getListaAmigos() {
        return ListaAmigos;
    }

    public void setListaAmigos(ArrayList<Usuario> ListaAmigos) {
        this.ListaAmigos = ListaAmigos;
    }

    public ArrayList<Usuario> getListaSolicitudes() {
        return ListaSolicitudes;
    }

    public void setListaSolicitudes(ArrayList<Usuario> ListaSolicitudes) {
        this.ListaSolicitudes = ListaSolicitudes;
    }

    public ArrayList<Mensaje> getBandejaEntrada() {
        return BandejaEntrada;
    }

    public void setBandejaEntrada(ArrayList<Mensaje> BandejaEntrada) {
        this.BandejaEntrada = BandejaEntrada;
    }

    public ArrayList<Mensaje> getBandejaSalida() {
        return BandejaSalida;
    }

    public void setBandejaSalida(ArrayList<Mensaje> BandejaSalida) {
        this.BandejaSalida = BandejaSalida;
    }

   

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
