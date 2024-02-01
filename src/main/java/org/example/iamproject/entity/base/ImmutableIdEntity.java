package org.example.iamproject.entity.base;

/**
 * This class define entity with an immutable id
 *
 * @author [mariohieu09]
 */
public class ImmutableIdEntity extends IndexableEntity {

    @Override
    public void setId(Long id) {
        throw new RuntimeException("Id can't be change!");
    }
}
