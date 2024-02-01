package org.example.iamproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.iamproject.entity.base.EntityEnum;
import org.example.iamproject.entity.base.ImmutableIdEntity;

/**
 * This class defines permission
 *
 * @author [mariohieu09]
 */

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Permission extends ImmutableIdEntity {

    private String sid;


    @Enumerated(EnumType.STRING)
    private EntityEnum effect;

    private String action;

    private String resource;

    @ManyToOne
    private Policy policy;
}
