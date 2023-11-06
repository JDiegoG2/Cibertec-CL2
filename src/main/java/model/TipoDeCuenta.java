package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "TipoCuenta")
@Table(name = "TipoCuenta")
@Getter
@Setter
public class TipoDeCuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "moneda")
    private String moneda;

    @Override
    public String toString() {
        return "TipoCuenta{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", moneda='" + moneda + '\'' + '}';
    }
}