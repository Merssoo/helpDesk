package com.emerson.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emerson.helpdesk.domain.Chamado;
import com.emerson.helpdesk.domain.Cliente;
import com.emerson.helpdesk.domain.Tecnico;
import com.emerson.helpdesk.domain.enums.Perfil;
import com.emerson.helpdesk.domain.enums.Prioridade;
import com.emerson.helpdesk.domain.enums.Status;
import com.emerson.helpdesk.repositories.ChamadoRepository;
import com.emerson.helpdesk.repositories.ClienteRepository;
import com.emerson.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instaciaDB() {
		Tecnico tec1 = new Tecnico(null, "Valdir cezar", "63653230268", "valdir@gmail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Torvalds", "80527954780", "torvalds@gmail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "chamado 01", "Primeiro chamado", tec1, cli1);
		
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
