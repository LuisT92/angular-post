package uia.com.apirest1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import uia.com.apirest1.compras.InfoComprasUIA;
import uia.com.apirest1.servicio.RNSIServicio;

import java.io.IOException;

@Controller
public class RNSIController
{
    private RNSIServicio servicioRNSI = new RNSIServicio();

    public RNSIController() throws IOException {
    }

    @PostMapping("/rnsi")
    @ResponseBody
    public void rnsi(@RequestBody InfoComprasUIA reporte) throws IOException {
        System.out.println("Probando RNSIController");
        servicioRNSI.agregaRNSI(reporte);
    }

}
