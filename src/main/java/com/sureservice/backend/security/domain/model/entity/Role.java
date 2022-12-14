package com.sureservice.backend.security.domain.model.entity;

import com.sureservice.backend.security.domain.model.enumeration.Roles;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@With
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //For connection
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private Roles name;
}
