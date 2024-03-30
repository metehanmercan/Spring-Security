package com.springsecurityjwtexample.repository;

import com.springsecurityjwtexample.entitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long > {

    Optional<User> findByUsername(String username);  // list ve optional arasındaki fark -- optinal null dönmek yerine bir optional sarmacında bir user nesnesi döndürür
}
