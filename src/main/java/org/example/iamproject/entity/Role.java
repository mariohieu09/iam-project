package org.example.iamproject.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.iamproject.entity.base.ImmutableIdEntity;

/**
 * @author [mariohieu09]
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Role extends ImmutableIdEntity {

    private String name;

}
