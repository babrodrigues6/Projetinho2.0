package terreiro;

import javax.swing.JOptionPane;

import bancoDeDados.dadosFilhos;


public class filhosDaCasa {
	
	
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String endereco = JOptionPane.showInputDialog("Qual seu endere�o?");
		String registroGeral = JOptionPane.showInputDialog("Qual o RG?");
		String altura = JOptionPane.showInputDialog("Qual sua altura?");
		String numeroCpf = JOptionPane.showInputDialog("Qual o CPF?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da m�e?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome da Pai?");
		String dataEntradaTerreiro = JOptionPane.showInputDialog("Que dia est� realizando esse cadastro?");
		String terreiroAntigo = JOptionPane.showInputDialog("Voc� era de algum terreiro?Se sim, qual?");
		String incorporacao = JOptionPane.showInputDialog("Voc� j� incorpora alguma linha?Quais?");
		String guiaFrente = JOptionPane.showInputDialog("Qual seu guia de frente?");
		String orixasCabeca = JOptionPane.showInputDialog("Quais seus Orix�s de cabe�a?");
		
		
		dadosFilhos filho1 = new dadosFilhos();
		filho1.setNome(nome);
		filho1.setIdade(Integer.valueOf(idade));
		filho1.setDataNascimento(dataNascimento);
		filho1.setEndereco(endereco);
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
		System.out.println("O nome do filho � : " + filho1.getNome());
		System.out.println("A Idade do filho � : " + filho1.getIdade());
		System.out.println("A data de nascimento do filho �:   " + filho1.getDataNascimento());
		System.out.println("O endere�o do filho � : " + filho1.getEndereco());
		System.out.println("O CPF do filho  � : " + filho1.getNumeroCpf());
		System.out.println("O nome da m�e � : " + filho1.getNomeMae());
		System.out.println("O nome do pai � : " + filho1.getNomePai());
		System.out.println("A data de entrada do filho � : " + filho1.getDataEntradaTerreiro());
		System.out.println("O filho veio do terreiro : " + filho1.getTerreiroAntigo());
		System.out.println("O filho incorpora :  " + filho1.getIncorporacao());
		System.out.println("O guia de frente � : " + filho1.getGuiaFrente());
		System.out.println("O orix� de frente � :  " + filho1.getOrixasCabeca());
		System.out.println("______________________________________");
	
		
	}

}
