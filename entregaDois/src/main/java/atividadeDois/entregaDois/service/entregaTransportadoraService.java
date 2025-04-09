package atividadeDois.entregaDois.service;

import org.springframework.stereotype.Component;

@Component
public class entregaTransportadoraService implements entregaStrategy {
    @Override
    public double calcular (double peso) {
        return peso * 2.0;
    }

    @Override
    public String modalidade() {
        return "Transportadora";
    }
}
