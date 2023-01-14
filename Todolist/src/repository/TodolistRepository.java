package repository;

import Entity.Todolist;
public interface TodolistRepository {

    Todolist[] findAll();

    void add(Todolist todolist);

    boolean remove(Integer number);

}
