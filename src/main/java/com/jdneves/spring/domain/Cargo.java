package com.jdneves.spring.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@SuppressWarnings("serial") // só para esconder warnings
@Entity                     // Informar para o Spring que essa classe é uma entidade
@Table(name = "CARGOS")     // Nome da entidade no banco
public class Cargo extends AbstractEntity<Long> {
	
	@NotBlank(message = "O campo cargo é de preenchimento obrigatório.")
	@Size(max = 60, message = "O nome do cargo deve ter entre no máximo {max} caracteres.")
	@Column(name = "nome", nullable = false, unique = true, length = 60) // Nome da coluna (atributo) e configuração que será definido no DB
	private String nome;
	
	@NotNull(message = "Selecione um departamento relativo ao cargo.")
	@ManyToOne
	@JoinColumn(name = "id_departamento_fk")
	private Departamento departamento;
	
	@OneToMany(mappedBy = "cargo")
	private List<Funcionario> funcionario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}
	
}
