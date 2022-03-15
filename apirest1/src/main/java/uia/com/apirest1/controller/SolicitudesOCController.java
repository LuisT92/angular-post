package uia.com.apirest1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import uia.com.apirest1.modelo.ItemComprasUIAModelo;
import uia.com.apirest1.modelo.SolicitudOCModelo;
import uia.com.apirest1.servicio.SolicitudOCServicio;

import java.io.IOException;
import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SolicitudesOCController
{
    private SolicitudOCServicio servicioSolicitudesOC;
    //ArrayList<SolicitudOCModelo> solicitudesOC = new ArrayList<SolicitudOCModelo>();

    @Autowired
    public SolicitudesOCController(SolicitudOCServicio servicio) throws IOException {
        this.servicioSolicitudesOC = servicio;
    }



    @GetMapping("/solicitudesOC")
    public ArrayList<SolicitudOCModelo> viewSolicitudesOC(ModelMap model)
    {
        return servicioSolicitudesOC.getSolicitudesOC();
    }

    @GetMapping("/solicitudOC/{id}")
    public SolicitudOCModelo solicitudOCById(@PathVariable int id)
    {
        return  servicioSolicitudesOC.getSolicitudOC(id);
    }

    @DeleteMapping("/solicitudOC/{id}")
    public SolicitudOCModelo deleteSolicitudOCById(@PathVariable int id)
    {
        return  servicioSolicitudesOC.deleteSolicitudOC(id);
    }

    @PutMapping("/solicitudOC/{id}")
    public SolicitudOCModelo solicitudOCPutById(@PathVariable int id, @RequestBody ItemComprasUIAModelo newItem)
    {
        return  servicioSolicitudesOC.putSolicitudOC(id, newItem);
    }

    public SolicitudOCServicio getServicioSolicitudesOC() {
        return servicioSolicitudesOC;
    }

    public void setServicioSolicitudesOC(SolicitudOCServicio servicioSolicitudesOC) {
        this.servicioSolicitudesOC = servicioSolicitudesOC;
    }
}
