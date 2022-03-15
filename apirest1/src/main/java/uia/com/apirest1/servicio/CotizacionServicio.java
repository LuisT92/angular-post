package uia.com.apirest1.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uia.com.apirest1.compras.GestorCompras;
import uia.com.apirest1.modelo.CotizacionModelo;
import uia.com.apirest1.modelo.ItemComprasUIAModelo;

import java.io.IOException;
import java.util.ArrayList;

@Service
public class CotizacionServicio implements ICotizacionServicio {


    GestorCompras miGestorCompras = new GestorCompras();

    public CotizacionServicio() throws IOException {
    }

   //* @Autowired
    //public CotizacionServicio(GestorCompras gestorCompras) throws IOException {
      //  this.miGestorCompras = gestorCompras;
    //}

    @Override
    public ArrayList<CotizacionModelo> getCotizaciones() {
        return miGestorCompras.getCotizaciones();
    }

    @Override
    public CotizacionModelo getCotizacion(int id)
    {
        return miGestorCompras.getCotizacion(id);
    }

    @Override
    public void print()
    {
        miGestorCompras.printMiModeloCotizaciones();
    }

    @Override
    public CotizacionModelo deleteCotizacion(int id) {
        return miGestorCompras.deleteCotizacion(id);
    }

    @Override
    public CotizacionModelo putCotizacion(int id, ItemComprasUIAModelo newItem)
    {
        return miGestorCompras.putCotizacion(id, newItem);
    }
}
