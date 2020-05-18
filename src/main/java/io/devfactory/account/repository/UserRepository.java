package io.devfactory.account.repository;

import io.devfactory.account.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Account, Long> {
}