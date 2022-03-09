package co.com.sofka.domain.hospital.paciente.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Sintomas implements ValueObject<String> {
    private final String descripcionSintomas;

    public Sintomas(String descripcionSintomas) {
        this.descripcionSintomas = Objects.requireNonNull(descripcionSintomas);

        if (this.descripcionSintomas.isBlank()) {
            throw new IllegalArgumentException("La descripcion de los síntomas no puede estar vacía");
        }

        if (this.descripcionSintomas.length() <= 10) {
            throw new IllegalArgumentException("La descripcion de los síntomas no puede ser tan corta");
        }
    }

    @Override
    public String value() {
        return descripcionSintomas;
    }
}
