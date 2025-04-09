package atividadeDois.entregaDois.service;

import org.springframework.stereotype.Service;

@Service("EntregaEstrangeira")
public class entregaAdpter implements entregaStrategy {

    private final entregaEstranService entregaEstrangeira;

    public entregaAdpter(){
        this.entregaEstrangeira = new entregaEstranService();
    }

    @Override
    public String modalidade() {
        return "EntregaEstrangeira";
    }

    @Override
    public double calcular(double peso) {
        return entregaEstrangeira.calcularEntregaEstrangeira(peso);
    }
}
