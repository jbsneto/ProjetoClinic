package br.com.clinic.interfac;

import java.io.Serializable;
import java.util.List;

public interface IDAOGeneric<T> {

    void create(T objeto);

    void update(T objeto);

    void delete(T objeto);

    T getId(Long id);

    List<T> getAll();

}
