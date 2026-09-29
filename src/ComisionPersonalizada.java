public class ComisionPersonalizada implements EstrategiaComision {
    private static final int LETRAS_PRIMER_NOMBRE = 5;
    private static final double PORCENTAJE = (5 + LETRAS_PRIMER_NOMBRE) / 100.0;

    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * PORCENTAJE;
    }
}
