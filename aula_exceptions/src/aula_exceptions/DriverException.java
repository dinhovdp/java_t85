package aula_exceptions;

//add default serial default
public class DriverException extends Exception {

	/** desserialização
	 * classe com excessão tem serialização
	 */
	private static final long serialVersionUID = 1L;

	

	//criando excessao
	
	public DriverException() {
		
	}
	//sobrecarga
	public DriverException(String mensagem) {
			super(mensagem);
	}
}
