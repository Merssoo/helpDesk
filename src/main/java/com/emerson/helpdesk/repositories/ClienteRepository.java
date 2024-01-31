package com.emerson.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emerson.helpdesk.domain.Pessoa;

public interface ClienteRepository extends JpaRepository<Pessoa, Integer>{

}
