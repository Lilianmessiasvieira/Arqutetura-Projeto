package PatternFactory;

import modelo.Orçamento;
import java.math.BigDecimal;

public interface CalculoPorRegiao {

    public BigDecimal CalculoPorRegiao(Orçamento orçamento);

}
