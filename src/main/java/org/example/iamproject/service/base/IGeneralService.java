package org.example.iamproject.service.base;

import org.example.iamproject.entity.base.IndexableEntity;

import java.util.Collection;

public interface IGeneralService<T extends IndexableEntity> {

    T getById(Long id);

    Collection<T> getAll();

    T create(T t);

    void delete(T t);
    void deleteById(Long id);
}
