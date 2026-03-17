package com.br;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Date;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name="automovel")
public class Automovel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="modelo")
	private String modelo;
	
	@Column(name="datafabricacao")
	private Date datafabricacao;
	
	@Column(name="quantidade")
	private int quantidade;
	
	@Column(name="precovenda")
	private double precovenda;
	
	@Column(name="trioEletrico")
	private boolean trioEletrico;

	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	private Marca marca;
	
	//Default Constructor
	public Automovel() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Constructor with all attributes
	public Automovel(Long codigo, String nome, String modelo, Date datafabricacao, int quantidade, double precovenda,
			boolean trioEletrico, Marca marca) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.modelo = modelo;
		this.datafabricacao = datafabricacao;
		this.quantidade = quantidade;
		this.precovenda = precovenda;
		this.trioEletrico = trioEletrico;
		this.marca = marca;
	}

	//Getters and Setters
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Date getDatafabricacao() {
		return datafabricacao;
	}

	public void setDatafabricacao(Date datafabricacao) {
		this.datafabricacao = datafabricacao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecovenda() {
		return precovenda;
	}

	public void setPrecovenda(double precovenda) {
		this.precovenda = precovenda;
	}

	public boolean isTrioEletrico() {
		return trioEletrico;
	}

	public void setTrioEletrico(boolean trioEletrico) {
		this.trioEletrico = trioEletrico;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
		
	
}
