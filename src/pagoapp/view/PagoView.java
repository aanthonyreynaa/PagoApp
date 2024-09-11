package pagoapp.view;

import pagoapp.dto.PagoDto;
import pagoapp.service.PagoService;

public class PagoView {
    
        
    public static void main(String[] args) {
            
        //invocar a la clase
        PagoDto pagoDto = new PagoDto();
        pagoDto.setHorasDia(6);
        pagoDto.setDias(15);
        pagoDto.setPagoHora(10);
            
        PagoService pagoService = new PagoService();
        pagoService.procesar(pagoDto);
            
            System.out.println("Tus ingresos son: " + pagoDto.getIngresos());
            System.out.println("Tus impuestos son: " + pagoDto.getRenta());
            System.out.println("Sueldo neto es: " + pagoDto.getNeto());
             
    }
}
   
