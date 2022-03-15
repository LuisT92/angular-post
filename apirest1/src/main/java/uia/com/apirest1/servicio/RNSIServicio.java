package uia.com.apirest1.servicio;

import uia.com.apirest1.compras.GestorCompras;
import uia.com.apirest1.compras.InfoComprasUIA;

import java.io.IOException;

public class RNSIServicio implements IRNSIServicio
{
    private GestorCompras miGestorCompras = new GestorCompras();

    public RNSIServicio() throws IOException {
    }


    @Override
    public void agregaRNSI(InfoComprasUIA reporte) throws IOException {
        this.miGestorCompras.agregaRNSI(reporte);
    }
}
