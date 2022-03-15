package uia.com.apirest1.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uia.com.apirest1.compras.GestorCompras;
import uia.com.apirest1.modelo.ItemComprasUIAModelo;
import uia.com.apirest1.modelo.SolicitudOCModelo;

import java.io.IOException;
import java.util.ArrayList;

@Service
public class SolicitudOCServicio implements ISolicitudOCServicio {


    GestorCompras miGestorCompras;

    public SolicitudOCServicio() throws IOException {
    }

    @Autowired
    public SolicitudOCServicio(GestorCompras gestorCompras) throws IOException {
        this.miGestorCompras = gestorCompras;
    }

    @Override
    public ArrayList<SolicitudOCModelo> getSolicitudesOC() {
        return miGestorCompras.getSolicitudesOC();
    }

    @Override
    public SolicitudOCModelo getSolicitudOC(int id)
    {
        return miGestorCompras.getSolicitudOC(id);
    }

    @Override
    public void print()
    {
        miGestorCompras.printMiModeloSolicitudesOC();
    }

    @Override
    public SolicitudOCModelo deleteSolicitudOC(int id) {
        return miGestorCompras.deleteSolicitudOC(id);
    }

    @Override
    public SolicitudOCModelo putSolicitudOC(int id, ItemComprasUIAModelo newItem)
    {
        return miGestorCompras.putSolicitudOC(id, newItem);
    }
}
