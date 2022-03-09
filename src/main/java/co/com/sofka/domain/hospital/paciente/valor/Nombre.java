package co.com.sofka.domain.hospital.paciente.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<Nombre.Props> {
    private final String nombre;
    private final String apellido;

    public Nombre(String tipoAfiliacion, String cobertura) {
        this.nombre = Objects.requireNonNull(tipoAfiliacion);
        this.apellido = Objects.requireNonNull(cobertura);
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String nombre() {
                return nombre;
            }

            @Override
            public String apellido() {
                return apellido;
            }
        };
    }

    public interface Props {
        String nombre();

        String apellido();
    }
}
