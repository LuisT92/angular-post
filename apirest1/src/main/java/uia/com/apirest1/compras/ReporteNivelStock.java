package uia.com.apirest1.compras;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ReporteNivelStock extends InfoComprasUIA{

    @JsonCreator
    public ReporteNivelStock(@JsonProperty("id")int id, @JsonProperty("name")String name)
    {
        super(id, name);
    }

    public ReporteNivelStock()
    {
    }

}
