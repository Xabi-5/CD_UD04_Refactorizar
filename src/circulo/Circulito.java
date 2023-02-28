package circulo;

/**
 * Pruebas de refactorización  con la clase Circulo
 * @author profesor
 */
public class Circulito {

    private int x;
    private int y;
    private double radio;

    public Circulito() {
    }

    public Circulito(int valorX, int valorY, double valorRadio) {
        x = extracted(valorX);
        y = extracted(valorY);
        establecerRadio(valorRadio);
    }

    public void establecerX(int valorX) {
        x=extracted(valorX);
    }

    private int extracted(int valorX) {
        return valorX;
    }

    public int obtenerX() {
        return x;
    }

    public void establecerY(int valorY) {
        y=extracted(valorY);
    }

    public int obtenerY() {
        return y;
    }

    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < 0.0 ? 0.0 : valorRadio);
    }

    public double obtenerRadio() {
        return radio;
    }

    public double obtenerDiametro() {
        return radio * 2;
    }


    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }

    public void trasladarCentro(){
        x=x + 5;
        y=y + 5;
    }
    
    public int a(){
        return x;
    }
}
