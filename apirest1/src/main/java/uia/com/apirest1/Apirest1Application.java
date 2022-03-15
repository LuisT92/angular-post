package uia.com.apirest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uia.com.apirest1.modelo.CotizacionModelo;
import uia.com.apirest1.servicio.CotizacionServicio;

import java.io.IOException;

@SpringBootApplication
public class Apirest1Application {

    public static void main(String[] args) throws IOException {

        CotizacionModelo newCotizacion = new CotizacionModelo(1, "prueba", "1", 1,1, 0.0, 1);
        newCotizacion.print();

        CotizacionServicio newCotizacionServicio = new CotizacionServicio();
        newCotizacionServicio.getCotizaciones();
        newCotizacionServicio.print();

        SpringApplication.run(Apirest1Application.class, args);
    }

}

