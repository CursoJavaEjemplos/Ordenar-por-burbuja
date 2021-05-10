package app;

public class EntrarSistema {
    public EntrarSistema() {
        super();
    }
    private static Sistema sistema = null;
    public static void main(String[] args) {
        EntrarSistema entrarSistema = new EntrarSistema();
        sistema = new Sistema();
        sistema.miMain();
    }
}
