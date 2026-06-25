package colaboradores;

public class Validacao {

	public static void validarNome (String nome) {
		
		//trim() remove espaços no início e no fim.
		
		if (nome == null || nome.trim().isEmpty())
		throw new IllegalArgumentException("Nome não pode ser vazio!");
	}
	//expressao regular (principalmente email)
	public static void validarEmail (String email) {
		
		public static void validarEmail(String email) {
			if (!email.matches("^[a-zA-Z0-9 ._ %+\\-]+@[a-zA-Z0-9\\-]+(? : \\.[a-zA-Z0-9\\-]+)*\\.[a-zA-Z
			throw new IllegalArgumentException("Digite um e-mail válido!");

			}

			public static void validarSalario(double salario) {
			if (salario <= 0)
			throw new IllegalArgumentException("O Salario deve ser maior do que zero!");
	
	
	}
	
}
