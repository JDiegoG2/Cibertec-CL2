package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "Cuenta")
@Table(name = "Cuenta")
@Getter
@Setter
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "activa")
    private boolean activa;

    @Column(name = "saldo")
    private Double saldo;

    @Column(name = "numeroCuenta")
    private String numeroCuenta;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToMany(mappedBy = "cuenta", cascade = CascadeType.PERSIST)
    private List<Movimiento> movimientos = new ArrayList<>();

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "tipoCuenta_id")
    private TipoDeCuenta tipoCuenta;

    @Override
    public String toString() {
        return "Cuenta{" +
                "id=" + id +
                ", activa=" + activa +
                ", saldo=" + saldo +
                ", numeroCuenta='" + numeroCuenta + '\'' + ", movimientos=" + movimientos +
                ", tipoCuenta=" + tipoCuenta + '}';
    }
}