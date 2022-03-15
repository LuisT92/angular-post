package uia.com.apirest1.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uia.com.apirest1.compras.GestorCompras;
import uia.com.apirest1.modelo.ItemComprasUIAModelo;
import uia.com.apirest1.modelo.ItemReporteModelo;
import uia.com.apirest1.modelo.ReporteModelo;

import java.io.IOException;
import java.util.ArrayList;

@Service
public class ReportesServicio implements IReporteServicio {


    GestorCompras miGestorCompras;

    public ReportesServicio() throws IOException {
    }

    @Autowired
    public ReportesServicio(GestorCompras gestorCompras) throws IOException {
        this.miGestorCompras = gestorCompras;
    }

    @Override
    public ArrayList<ItemReporteModelo> getReportes() {
        return miGestorCompras.getReportes();
    }

    @Override
    public ItemReporteModelo getReporte(int id)
    {
        return miGestorCompras.getReporte(id);
    }

    @Override
    public void print()
    {
        miGestorCompras.printMiModeloReportes();
    }

    @Override
    public ReporteModelo deleteReportes(int id) {
        return miGestorCompras.deleteReporte(id);
    }

    @Override
    public ReporteModelo putReporte(int id, ItemComprasUIAModelo newItem)
    {
        return miGestorCompras.putReporte(id, newItem);
    }
}
