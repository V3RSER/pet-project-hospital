package co.com.sofka.domain.hospital.atencionmedica.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Urgencia implements ValueObject<Urgencia.Props> {
    private final String nivelUrgencia;
    private final String descripcion;

    public Urgencia(String tipoAfiliacion, String cobertura) {
        this.nivelUrgencia = Objects.requireNonNull(tipoAfiliacion);
        this.descripcion = Objects.requireNonNull(cobertura);
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String tipoAfiliacion() {
                return nivelUrgencia;
            }

            @Override
            public String descripcion() {
                return descripcion;
            }
        };
    }

    public interface Props {
        String tipoAfiliacion();

        String descripcion();
    }
}
