package colaboradores;

public class Gerente extends Funcionarios {

	private double bonus;
	
	public Gerente(String nome, String email, double salario, double bonus) {
		super(nome, email, salario);
		this.setBonus(bonus);
		
		
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public void visualizar() {
	super.visualizar();
	System.out.printf("Bônus: R$ %.2f", this.bonus);
	}
	
}
