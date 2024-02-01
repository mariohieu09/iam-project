package org.example.iamproject.service.base;

import org.example.iamproject.entity.base.IndexableEntity;
import org.example.iamproject.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class AbstractGeneralService<T extends IndexableEntity> implements IGeneralService<T>{

    @Autowired
    private BaseRepository<T> baseRepository;

    @Override
    public T getById(Long id) {
        Optional<T> optionalT = baseRepository.findById(id);
        if(optionalT.isEmpty()) throw new RuntimeException("The id is not exits!");
        return optionalT.get();
    }

    @Override
    public Collection<T> getAll() {
        return baseRepository.findAll();
    }

    @Override
    public T create(T t) {
        return baseRepository.save(t);
    }

    @Override
    public void delete(T t) {
        baseRepository.delete(t);
    }

    @Override
    public void deleteById(Long id) {
        baseRepository.deleteById(id);
    }
}
