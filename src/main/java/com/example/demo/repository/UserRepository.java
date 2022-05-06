package com.example.demo.repository;
import  com.example.demo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);


    List<User> findByEmailContaining(String email);
    List<User> findTop2ByNameStartsWith(String name);
    List<User> findUserBySurname(String surname);
    List<User> findByEmailNotContaining(String email);

    @Query(value = "select *from users",nativeQuery = true)
    List<User> findAllUser();
    @Query(value = "select *from users order by id", nativeQuery = true)
    List<User> getSortedById();
    @Query(value = "select *from users where id>1 order by id desc limit 2", nativeQuery = true)
    List<User> getInsertedDatabase();
    @Query(value = "select * from users order by name desc", nativeQuery = true)
    List<User> getSortedByNameDesc();
    @Query(value = "select *from users where surname = name",nativeQuery = true)
    List<User> getEqualNameAndSurname();
    @Query(value = "select *from users where email like '%narxoz.kz%' or email like '%mail.ru%' or email like '%gmail.com%'",nativeQuery = true)
    List<User> getUserWhichEmailContains();
    @Query(value = "select distinct on(name) *from users",nativeQuery = true)
    List<User> getUserUniqueNames();



}