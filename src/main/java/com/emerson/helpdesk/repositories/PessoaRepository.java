package com.emerson.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emerson.helpdesk.domain.Cliente;

public interface PessoaRepository extends JpaRepository<Cliente, Integer>{

}