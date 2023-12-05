package com.ensa.identityprovider.repos;

import com.ensa.identityprovider.models.UserCredentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserCredentialsRepo extends JpaRepository<UserCredentials, String> {
    Optional<UserCredentials> findByEmail(String username);
}
