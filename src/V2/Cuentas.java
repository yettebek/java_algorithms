package V2;

public class Cuentas {
    //Variables
    public String usuario;
    public int saldo;

    //Constructor
    public Cuentas(String usuario, int saldo){
        this.usuario = usuario;
        this.saldo = saldo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
