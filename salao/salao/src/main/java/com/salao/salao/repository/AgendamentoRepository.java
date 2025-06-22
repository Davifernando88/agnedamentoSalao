package com.salao.salao.repository;

import com.salao.salao.model.Agendamento;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class AgendamentoRepository {
    private List<Agendamento> agendamentos = new ArrayList<>();
    private AtomicLong idGenerator = new AtomicLong();

    public List<Agendamento> findAll() {
        return agendamentos;
    }

    public void save(Agendamento agendamento) {
        agendamento.setId(idGenerator.incrementAndGet());
        agendamentos.add(agendamento);
    }
}

