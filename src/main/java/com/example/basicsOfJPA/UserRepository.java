package com.example.basicsOfJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // JpaRepository<name of class whose table is being created, type of primary key>
    // UserRepository is an interface so that method can not be implemented by repository it can handle by ORM(object relational model)
    // Hibernate is the only ORM who can implement the methods because spring boot by default comes with hibernate.

    // when the implementation is done by hibernate then it is possible to call an interface using creating an object of that interface.


}