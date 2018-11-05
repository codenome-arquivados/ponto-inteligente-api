package com.aimbra.pontoeletronico.api.services.impl;

import com.aimbra.pontoeletronico.api.entities.Funcionario;
import com.aimbra.pontoeletronico.api.repositories.FuncionarioRepository;
import com.aimbra.pontoeletronico.api.services.FuncionarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    private static final Logger log = LoggerFactory.getLogger(FuncionarioServiceImpl.class);

    @Autowired
    private FuncionarioRepository funcionarioRepository;


    @Override
    public Funcionario persistir(Funcionario funcionario) {
        log.info("Persistindo funcionario {}", funcionario);
        return this.funcionarioRepository.save(funcionario);
    }

    @Override
    public Optional<Funcionario> buscarPorCpf(String cpf) {
        log.info("Buscando funcionario com o cpf {}", cpf);
        return Optional.ofNullable(this.funcionarioRepository.findByCpf(cpf));
    }

    @Override
    public Optional<Funcionario> buscaPorEmail(String email) {
        log.info("Buscando funcionario por email {}", email);
        return Optional.ofNullable(this.funcionarioRepository.findByEmail(email));
    }

    @Override
    public Optional<Funcionario> buscarPorId(Long id) {
        log.info("Buscando funcionario por id {}", id);
        return Optional.ofNullable(this.funcionarioRepository.findById(id).orElse(null));
    }
}