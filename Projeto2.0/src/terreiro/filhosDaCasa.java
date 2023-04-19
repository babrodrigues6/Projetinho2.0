package terreiro;

import javax.swing.JOptionPane;

import bancoDeDados.dadosFilhos;


public class filhosDaCasa {
	
	
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String endereco = JOptionPane.showInputDialog("Qual seu endereço?");
		String registroGeral = JOptionPane.showInputDialog("Qual o RG?");
		String altura = JOptionPane.showInputDialog("Qual sua altura?");
		String numeroCpf = JOptionPane.showInputDialog("Qual o CPF?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome da Pai?");
		String dataEntradaTerreiro = JOptionPane.showInputDialog("Que dia está realizando esse cadastro?");
		String terreiroAntigo = JOptionPane.showInputDialog("Você era de algum terreiro?Se sim, qual?");
		String incorporacao = JOptionPane.showInputDialog("Você já incorpora alguma linha?Quais?");
		String guiaFrente = JOptionPane.showInputDialog("Qual seu guia de frente?");
		String orixasCabeca = JOptionPane.showInputDialog("Quais seus Orixás de cabeça?");
		
		
		dadosFilhos filho1 = new dadosFilhos();
		filho1.setNome(nome);
		filho1.setIdade(Integer.valueOf(idade));
		filho1.setDataNascimento(dataNascimento);
		filho1.setEndereco(endereco);
		filho1.setRegistroGeral(registroGeral);
		filho1.setAltura(Double.parseDouble(altura));
		filho1.setNumeroCpf(numeroCpf);
		filho1.setNomeMae(nomeMae);
		filho1.setNomePai(nomePai);
		filho1.setDataEntradaTerreiro(dataEntradaTerreiro);
		filho1.setTerreiroAntigo(terreiroAntigo);
		filho1.setIncorporacao(incorporacao);
		filho1.setGuiaFrente(guiaFrente);
		filho1.setOrixasCabeca(orixasCabeca);
		
		System.out.println("DADOS DO FILHO:");
		System.out.println("O nome do filho é " + filho1.getNome());
		System.out.println("A Idade do filho é " + filho1.getIdade());
		System.out.println("A data de nascimento do filho é  " + filho1.getDataNascimento());
		System.out.println("O endereço do filho é" + filho1.getEndereco());
		System.out.println("O RG do  é " + aluno1.getNumeroCpf());
		System.out.println("O nome da mãe é aluno é " + aluno1.getNomeMae());
		System.out.println("O nome do pai do aluno é " + aluno1.getNomePai());
		System.out.println("A data da matricula do aluno é " + aluno1.getDataMatricula());
		System.out.println("A altura do aluno é " + aluno1.getAltura());
		System.out.println("______________________________________");
	
		
	}

}
