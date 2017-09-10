package com.relesi.pontointeligente.api.services;

import java.util.Optional;

import com.relesi.pontointeligente.api.entities.Empresa;

public interface EmpresaService {

	/**
	 * Retorna uma empresa dado um CNPJ.
	 * @author Renato
	 * @Param cnpj
	 * @return Optional<Empresa>
	 */
	
	Optional<Empresa>buscarPorCnpj(String cnpj);
	
	/**
	 * Cadastra uma nova empresa na base de dados
	 * @author Renato
	 * @Param Empresa
	 * @return Empresa
	 */
	Empresa persistir(Empresa empresa);

	

	
}
