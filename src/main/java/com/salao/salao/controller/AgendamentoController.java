package com.salao.salao.controller;

import com.salao.salao.model.Agendamento;
import com.salao.salao.repository.AgendamentoRepository;

@Controller
public class AgendamentoController {

    private final AgendamentoRepository repository;

    public AgendamentoController(AgendamentoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/agendar")
    public String formAgendamento(Model model) {
        model.addAttribute("agendamento", new Agendamento());
        return "agendamento"; // formulário de agendamento
    }

    @PostMapping("/agendar")
    public String salvarAgendamento(@ModelAttribute Agendamento agendamento, RedirectAttributes redirectAttributes) {
        repository.save(agendamento);
        redirectAttributes.addFlashAttribute("mensagem", "Agendamento realizado com sucesso!");
        return "redirect:/";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("agendamentos", repository.findAll());
        return "listar"; // lista de agendamentos
    }
}
