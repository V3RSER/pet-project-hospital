package co.com.sofka.domain.hospital.atencionmedica.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Paso implements ValueObject<String> {
    private final String descripcion;

    public Paso(String descripcion) {
        this.descripcion = Objects.requireNonNull(descripcion);

        if (this.descripcion.isBlank()) {
            throw new IllegalArgumentException("La descripcion no puede estar vacía");
        }
    }

    @Override
    public String value() {
        return descripcion;
    }
}
