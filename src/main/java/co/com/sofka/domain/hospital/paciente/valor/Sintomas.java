package co.com.sofka.domain.hospital.paciente.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Sintomas implements ValueObject<String> {
    private final String descripcionSintomas;

    public Sintomas(String descripcionSintomas) {
        this.descripcionSintomas = Objects.requireNonNull(descripcionSintomas);
    }

    @Override
    public String value() {
        return descripcionSintomas;
    }
}
