package org.example.iamproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.iamproject.entity.base.ImmutableIdEntity;

import java.util.Set;

/**
 * This class defines Group entity
 *
 * @author [mariohieu09]
 */
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Group extends ImmutableIdEntity {

    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "group_id"),
                inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> userSet;


    @OneToOne
    private Policy groupPolicy;
}
