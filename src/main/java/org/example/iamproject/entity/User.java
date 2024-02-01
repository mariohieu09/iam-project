package org.example.iamproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.iamproject.entity.base.ImmutableIdEntity;

import java.util.Set;

/**
 * This class defines user entity
 *
 * @author [mariohieu09]
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User extends ImmutableIdEntity {

    private String username;


    private String password;


    @OneToOne
    private Role role;

    @ManyToMany
    private Set<Group> groupSet;

    @OneToOne
    private Policy userPolicy;

}
