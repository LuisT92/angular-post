package uia.com.apirest1.servicio;

import uia.com.apirest1.compras.InfoComprasUIA;

import java.io.IOException;

public interface IRNSIServicio {
    void agregaRNSI(InfoComprasUIA reporte) throws IOException;
}
