package pagoapp.service;

import pagoapp.dto.PagoDto;

public class PagoService {
    
    //método
    public void procesar(PagoDto pagoDto){
        
        //variable
        double ingresos, renta, neto;
        //procesos
        ingresos = pagoDto.getHorasDia() * pagoDto.getDias();
        if(ingresos > 1500.00){
            renta = ingresos * 0.08;
        }else{
            renta = 0.0;
        }
        if(ingresos > 3000.00){
            renta = ingresos * 0.13;
        }else{
            renta = 0.13;
        }

        
            
        
        neto = ingresos - renta;
        //valores de salida
        pagoDto.setIngresos(ingresos);
        pagoDto.setRenta(renta);
        pagoDto.setNeto(neto);
    }
    
}
