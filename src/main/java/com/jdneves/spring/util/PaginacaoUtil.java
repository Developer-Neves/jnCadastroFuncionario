package com.jdneves.spring.util;

import java.util.List;

public class PaginacaoUtil<T> {
	
	private Integer tamanho;
	private Integer pagina;
	private Long totalDePaginas;
	private String ordenacao;
	private List<T> registros;
		
	public PaginacaoUtil(Integer tamanho, Integer pagina, Long totalDePaginas, String ordenacao, List<T> registros) {
		super();
		this.tamanho = tamanho;
		this.pagina = pagina;
		this.totalDePaginas = totalDePaginas;
		this.ordenacao = ordenacao;
		this.registros = registros;
	}
	
	public Integer getTamanho() {
		return tamanho;
	}
	
	public Integer getPagina() {
		return pagina;
	}
	
	public Long getTotalDePaginas() {
		return totalDePaginas;
	}
	
	public List<T> getRegistros() {
		return registros;
	}

	public String getOrdenacao() {
		return ordenacao;
	}

}
