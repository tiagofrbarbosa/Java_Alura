package br.com.empresa.banco;

import br.com.empresa.banco.sistema.Empresa;
import br.com.empresa.banco.sistema.Funcionario;

public class testaEmpresa {
		
	public static void main(String[] args){
		Empresa empresa = new Empresa();
		empresa.funcionarios = new Funcionario[10];
		
		Funcionario f1 = new Funcionario();
		f1.setSalario(100.0);
		
		empresa.adicionaFuncionarios(f1);
		
		empresa.mostraEmpregados();
	}
}
