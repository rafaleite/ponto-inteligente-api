package br.com.rleite.pontointeligente.api.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="empresa")
public class Empresa extends AbstractEntity<Long> {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "razao_social", nullable = false)
	private String razaoSocial;
	
	@Column(name = "cnpj", nullable = false)
	private String cnpj;
	
	
	@OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Funcionario> funcionarios;
	
	@Override
	public String toString() {
		return "Empresa [id=" + this.getId() + ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", dataCriacao=" + this.getDataCriacao()
				+ ", dataAtualizacao=" + this.getDataAtualizacao() + "]";
	}

}
