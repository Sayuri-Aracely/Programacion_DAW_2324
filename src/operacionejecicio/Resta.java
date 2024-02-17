package operacionejecicio;

public class Resta extends Operacion {
	public void operar() {
		setResultado(getValor1() - getValor2());
	}

	// métodos de la clase
	public void cargar1(int valorIngresado) {
		setValor1(valorIngresado);
	}

	public void carga2(int valorIngresado) {
		setValor2(valorIngresado);
	}

	public int mostrarResultado() {
		return getResultado();
	}
}
