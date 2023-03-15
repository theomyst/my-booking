package com.theomyst.mybooking.service;

import com.theomyst.mybooking.domain.BaseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

public abstract class BaseServiceImpl<T extends BaseModel> implements BaseService<T, Long> {

    public abstract JpaRepository<T, Long> getRepository();

    @Transactional(isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
    public T create(T entity) {
        return getRepository().save(entity);
    }

    @Transactional(isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
    public void update(T entity) {
        getRepository().save(entity);
    }

    public T find(Long id) {
        return getRepository().findById(id).orElseThrow(NoSuchElementException::new);
    }

    public List<T> findAll() {
        return getRepository().findAll();
    }

    @Transactional(isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
    public void deleteById(Long id) {
        getRepository().deleteById(id);
    }
}
