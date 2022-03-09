package co.com.sofka.domain.hospital.doctor.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<Nombre.Props> {
    private final String nombre;
    private final String apellido;

    public Nombre(String tipoAfiliacion, String cobertura) {
        this.nombre = Objects.requireNonNull(tipoAfiliacion);
        this.apellido = Objects.requireNonNull(cobertura);

        if (this.nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

        if (this.nombre.length() <= 5) {
            throw new IllegalArgumentException("El nombre no puede ser tan corto");
        }

        if (this.apellido.isBlank()) {
            throw new IllegalArgumentException("El apellido no puede estar vacío");
        }

        if (this.apellido.length() <= 5) {
            throw new IllegalArgumentException("El apellido no puede ser tan corto");
        }
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