package com.theomyst.mybooking.backend.controller;

import com.theomyst.mybooking.backend.domain.BaseModel;
import com.theomyst.mybooking.backend.service.BaseService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class AbstractController<T extends BaseModel> {

    protected abstract BaseService<T, Long> getBaseService();

    @GetMapping("/{id}")
    public ResponseEntity<T> get(@PathVariable("id") Long id) {
        return ResponseEntity.ok(getBaseService().find(id));
    }

    @GetMapping
    public ResponseEntity<List<T>> findAll() {
        return ResponseEntity.ok(getBaseService().findAll());
    }

    @PostMapping
    public ResponseEntity<T> create(@Valid @RequestBody T entity) {
        return new ResponseEntity<>(getBaseService().create(entity), HttpStatus.CREATED);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@Valid @RequestBody T entity) {
        getBaseService().update(entity);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
        getBaseService().deleteById(id);
    }
}
