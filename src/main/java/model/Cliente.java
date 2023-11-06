package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "Cliente")
@Table(name = "Cliente")
@Getter
@Setter
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "apellidoMaterno")
    private String apellidoMaterno;

    @Column(name = "apellidoPaterno")
    private String apellidoPaterno;

    @Column(name = "nombres")
    private String nombres;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Rol> roles = new ArrayList<>();

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.PERSIST)
    private List<Cuenta> cuentas = new ArrayList<>();

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", nombres='" + nombres + '\'' +
                ", roles=" + roles +
                ", cuentas=" + cuentas +
                '}';
    }
}