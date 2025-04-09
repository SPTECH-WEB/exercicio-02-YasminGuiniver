package atividadeDois.entregaDois.controller;

import atividadeDois.entregaDois.service.entregaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entrega")
public class entregaController {
    private final entregaService entregaService;

    public entregaController(entregaService entregaService) {
        this.entregaService = entregaService;
    }

    @GetMapping
    public String calcularEntrega(@RequestParam String modalidade, @RequestParam double peso) {
        double valor = entregaService.calcular(modalidade, peso);
        return "A entrega de modalidade: (" + modalidade + ") para o peso de (" + peso +")kg vai custar R$: " + valor;
    }
}
