package org.example.iamproject.repository;

import org.example.iamproject.entity.base.IndexableEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository<T extends IndexableEntity> extends JpaRepository<T, Long> {
}
