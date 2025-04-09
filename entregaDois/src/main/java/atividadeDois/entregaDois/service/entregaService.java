package atividadeDois.entregaDois.service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class entregaService {
    private final List<entregaStrategy> entregaCusto;

    public entregaService(List<entregaStrategy> entregaCusto) {
        this.entregaCusto = entregaCusto;
    }

    public double calcular(String modalidade, double peso) {
        return entregaCusto.stream().filter(e -> e.modalidade().equalsIgnoreCase(modalidade)).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Modalidade de entrega não encontrada")).calcular(peso);
    }
}
