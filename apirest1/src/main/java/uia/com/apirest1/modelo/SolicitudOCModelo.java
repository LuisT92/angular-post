package uia.com.apirest1.modelo;


public class SolicitudOCModelo extends ReporteModelo {

    public SolicitudOCModelo(int id, String name, String codigo, int vendedor, int clasificacion, int existenciaMinima, int existencia, int consumo) {
        super(id, name, codigo, vendedor, clasificacion, existenciaMinima, existencia, consumo);
    }

    public SolicitudOCModelo(int id, String name, String codigo, int vendedor, int clasificacionVendedor, double total, int entrega) {
        super(id, name, codigo, vendedor, clasificacionVendedor, total, entrega);
    }

}
