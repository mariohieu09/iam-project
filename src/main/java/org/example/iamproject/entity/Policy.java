package org.example.iamproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.iamproject.entity.base.IndexableEntity;

import java.util.Set;

/**
 * This class defines policy
 *
 * @author [mariohieu09]
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Policy extends IndexableEntity {

    private String version;

    @OneToMany(mappedBy = "policy")
    private Set<Permission> permissionSet;
}
