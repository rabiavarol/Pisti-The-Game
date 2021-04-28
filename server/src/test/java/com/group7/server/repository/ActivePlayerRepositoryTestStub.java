package com.group7.server.repository;

import com.group7.server.model.ActivePlayer;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public class ActivePlayerRepositoryTestStub implements ActivePlayerRepository{

    @Override
    public void deleteById(long sessionId) {

    }

    @Override
    public List<ActivePlayer> findAll() {
        return null;
    }

    @Override
    public List<ActivePlayer> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<ActivePlayer> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<ActivePlayer> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(ActivePlayer activePlayer) {

    }

    @Override
    public void deleteAll(Iterable<? extends ActivePlayer> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends ActivePlayer> S save(S s) {
        return null;
    }

    @Override
    public <S extends ActivePlayer> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<ActivePlayer> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends ActivePlayer> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<ActivePlayer> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public ActivePlayer getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends ActivePlayer> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends ActivePlayer> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends ActivePlayer> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends ActivePlayer> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends ActivePlayer> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends ActivePlayer> boolean exists(Example<S> example) {
        return false;
    }
}
