package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
	
	/*@Transactional serve para evitar bloqueio do banco de dados pois nesse caso é apenas uma consulta,
	 *  um select e ajuda na performance da aplicação*/
	@Transactional(readOnly = true)
	Empresa findByCnpj(String cnpj);
	

}
