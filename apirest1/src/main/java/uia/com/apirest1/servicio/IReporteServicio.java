package uia.com.apirest1.servicio;

import uia.com.apirest1.modelo.ItemComprasUIAModelo;
import uia.com.apirest1.modelo.ReporteModelo;

import java.util.ArrayList;

public interface IReporteServicio {
    ArrayList<ReporteModelo> getReportes();
    Object getReporte(int id);
    void print();

    ReporteModelo deleteReportes(int id);
    ReporteModelo putReporte(int id, ItemComprasUIAModelo newItem);
}
