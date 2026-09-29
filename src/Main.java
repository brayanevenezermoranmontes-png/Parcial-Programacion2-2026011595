public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Perla Esmeralda López Barrientos", 1000.00);
        EstrategiaComision estrategiaInicial = new ComisionEstandar();
        vendedor.cambiarEstrategia(estrategiaInicial);
        vendedor.mostrarDetalle();
    }
}
