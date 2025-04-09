package atividadeDois.entregaDois.service;

import org.springframework.stereotype.Component;

@Component("entregaEstrangeira")
public class entregaEstranService {
    public Double calcularEntregaEstrangeira(double peso) {
        return peso * 1.8 + 5;
    }

    public String modalidade() {
        return "Entrega Estrangeira";
    }
}
