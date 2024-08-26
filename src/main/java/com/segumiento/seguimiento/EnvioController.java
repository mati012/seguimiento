package com.segumiento.seguimiento;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class EnvioController{
    private List<Envio> envios = new ArrayList<>();

    public EnvioController() {
        envios = new ArrayList<>();
        envios.add(new Envio(1,  "maipu 123, santiago", "En camino", "Centro de Distribución A", Arrays.asList( new Producto("comida","ancana", 40000))));
        envios.add(new Envio(2, "alameda 456, rancagua", "Entregado", "Entregado", Arrays.asList( new Producto("juguete","peluche oso", 5000))));
        envios.add(new Envio(3, "independencia 789, santiago", "En camino", "Centro de Distribución B", Arrays.asList( new Producto("accesorio","collar generico", 2000))));
    }

 
    @GetMapping("/envios")
        public List<Envio> getEnvios(){
            return envios;

        }


    @GetMapping("/envios/{idEnvio}")
    public Envio getEnvioById(@PathVariable int idEnvio) {
       for (Envio envio: envios){
        if (envio.getIdEnvio()== idEnvio){
            return envio;
        }
       }
    return null;
    }
    
    @GetMapping("/envios/{idEnvio}/ubicacion")
    public String getEnvioEstadoById(@PathVariable int idEnvio  ) {
       for (Envio envio: envios){
        if (envio.getIdEnvio()== idEnvio){
            return"La ubicación actual del pedido con orden "+ envio.getIdEnvio()+" es: " + envio.getUbicacionActual();
        }
       }
    return null;
    }
    

}