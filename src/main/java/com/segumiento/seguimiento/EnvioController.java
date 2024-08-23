package com.segumiento.seguimiento;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class EnvioController{
    private List<Envio> envios = new ArrayList<>();

    public EnvioController() {
        envios = new ArrayList<>();
        envios.add(new Envio(1L, "Alimento para perros", "Calle 123, Ciudad", "En camino", "Centro de Distribución A"));
        envios.add(new Envio(2L, "Juguete para gatos", "Avenida 456, Ciudad", "Entregado", "Destino"));
        envios.add(new Envio(3L, "Arena para gatos", "Calle 789, Ciudad", "En camino", "Centro de Distribución B"));
    }

 
    @GetMapping("/envios")
        public List<Envio> getEnvios(){
            return envios;

        }
    


}