



import PatternFactory.IcmsFactory;
import java.math.BigDecimal;
import modelo.Orçamento;


public class Main{
    
public static void main(String[] args) {
Orçamento orçamento = new Orçamento(new
BigDecimal("800.0"), "ICMS_MG");
IcmsFactory icmsFactory = new IcmsFactory();
BigDecimal resultado = icmsFactory.getIcmsPorEstado(
"ICMS_SP").CalculoPorRegiao(orçamento);
System.out.println(resultado);
}
}
