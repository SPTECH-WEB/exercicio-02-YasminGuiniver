package atividadeDois.entregaDois.service;

import org.springframework.stereotype.Component;

@Component
public class entregaEconomicaService implements entregaStrategy {
    @Override
    public double calcular(double peso) {
        return peso += 7.0;
    }

    @Override
    public String modalidade() {
        return "Economica";
    }
}
