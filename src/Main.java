public class Main {
  public static void main(String[] args) {
	// Criando animais
	Animal leao = new Animal("Leão", 5, 150, "Felino");
	Mamifero elefante = new Mamifero("Elefante", 10, 3000, "Proboscidea", "Pelagem grossa");
	Ave papagaio = new Ave("Papagaio", 3, 0.5, "Psittacidae", 0.7);

	// Criando funcionários
	Funcionario funcionario1 = new Funcionario("João", "Tratador", 2000);
	Funcionario funcionario2 = new Funcionario("Miguél", "Limpeza", 1900);
	Veterinario veterinario = new Veterinario("David", "Veterinário", 3000, "Animais selvagens");

	// Atribuindo valores aos atributos usando métodos setters
	leao.setNome("Leão");
	elefante.setPeso(3500);
	papagaio.setIdade(4);
	funcionario1.setSalario(2500);

	// Imprimindo informações dos animais
	System.out.println("Informações dos animais:");
	System.out.println("Nome: " + leao.getNome() + ", Espécie: " + leao.getEspecie() + ", Idade: " + leao.getIdade());
	System.out.println("Nome: " + elefante.getNome() + ", Espécie: " + elefante.getEspecie() + ", Peso: " + elefante.getPeso());
	System.out.println("Nome: " + papagaio.getNome() + ", Espécie: " + papagaio.getEspecie() + ", Envergadura da Asa: " + papagaio.getEnvergaduraAsa());

	// Chamando métodos específicos de cada classe
	elefante.amamentar();
	papagaio.voar();

	// Realizando exame veterinário
	veterinario.realizarExame(leao);

	// Demonstrando polimorfismo
	Treinavel animalTreinavel = papagaio;
	animalTreinavel.realizarTruque();

	// Demonstrando sobrecarga de métodos
	leao.movimentar("correndo");
	leao.movimentar();

	// Criando o zoológico
	Zoo zoo = new Zoo(3, 2);

	// Adicionando animais ao zoológico
	zoo.adicionarAnimal(leao);
	zoo.adicionarAnimal(elefante);
	zoo.adicionarAnimal(papagaio);

	// Adicionando funcionários ao zoológico
	zoo.adicionarFuncionario(funcionario1);
	zoo.adicionarFuncionario(funcionario2);
	zoo.adicionarFuncionario(veterinario);
  }
}