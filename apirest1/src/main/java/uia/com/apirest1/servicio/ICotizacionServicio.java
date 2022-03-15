package uia.com.apirest1.servicio;

import uia.com.apirest1.modelo.CotizacionModelo;
import uia.com.apirest1.modelo.ItemComprasUIAModelo;

import java.util.ArrayList;

public interface ICotizacionServicio {
    ArrayList<CotizacionModelo> getCotizaciones();
    Object getCotizacion(int id);
    void print();

    CotizacionModelo deleteCotizacion(int id);
    CotizacionModelo putCotizacion(int id, ItemComprasUIAModelo newItem);
}
