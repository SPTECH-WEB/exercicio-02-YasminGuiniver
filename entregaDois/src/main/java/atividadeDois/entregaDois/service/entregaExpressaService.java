package atividadeDois.entregaDois.service;

import org.springframework.stereotype.Component;

@Component
public class entregaExpressaService implements entregaStrategy {

    @Override
    public double calcular (double peso) {
        return peso * 1.5 + 7.0;
    }

    @Override
    public String modalidade() {
        return "Expressa";
    }
}
