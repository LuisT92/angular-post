package uia.com.apirest1.servicio;

import uia.com.apirest1.modelo.ItemComprasUIAModelo;
import uia.com.apirest1.modelo.SolicitudOCModelo;

import java.util.ArrayList;

public interface ISolicitudOCServicio {
    ArrayList<SolicitudOCModelo> getSolicitudesOC();
    Object getSolicitudOC(int id);
    void print();

    SolicitudOCModelo deleteSolicitudOC(int id);
    SolicitudOCModelo putSolicitudOC(int id, ItemComprasUIAModelo newItem);
}
