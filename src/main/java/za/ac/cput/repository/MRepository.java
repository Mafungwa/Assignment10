package za.ac.cput.repository;

public interface MRepository<T, ID> {

    T create(T t);
    T update(T t);
    void delete(ID id);
    T read(ID id);

}
