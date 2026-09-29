public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Perla Esmeralda López Barrientos", 1000.00);
        vendedor.cambiarEstrategia(new ComisionEstandar());
        vendedor.mostrarDetalle();
    }
}
