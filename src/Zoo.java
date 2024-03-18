public class Zoo {
  private Animal[] animais;
  private Funcionario[] funcionarios;
  private int numAnimais;
  private int numFuncionarios;

  public Zoo(int maxAnimais, int maxFuncionarios) {
	animais = new Animal[maxAnimais];
	funcionarios = new Funcionario[maxFuncionarios];
	numAnimais = 0;
	numFuncionarios = 0;
  }

  public void adicionarAnimal(Animal animal) {
	if (numAnimais < animais.length) {
	  animais[numAnimais] = animal;
	  numAnimais++;
	} else {
	  System.out.println("Não é possível adicionar mais animais. O zoológico está lotado.");
	}
  }

  public void adicionarFuncionario(Funcionario funcionario) {
	if (numFuncionarios < funcionarios.length) {
	  funcionarios[numFuncionarios] = funcionario;
	  numFuncionarios++;
	} else {
	  System.out.println("Não é possível adicionar mais funcionários. O zoológico está com a equipe completa.");
	}
  }
}
