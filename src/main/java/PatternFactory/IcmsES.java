

package PatternFactory;

import modelo.Orçamento;
import java.math.BigDecimal;

    public class IcmsES implements CalculoPorRegiao{
        @Override
        public BigDecimal CalculoPorRegiao(Orçamento orçamento){
            return orçamento.valorOrçamento.multiply(new BigDecimal("0.12"));
        }
   }

