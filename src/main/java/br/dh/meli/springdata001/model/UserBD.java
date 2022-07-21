package br.dh.meli.springdata001.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name = "tb_user")
public class UserBD {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //indica geraçao sequencial 1, 2, 3, ...
    private long id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(length = 80, nullable = false, unique = true)
    private String email;

}
