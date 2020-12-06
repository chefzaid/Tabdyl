package dev.simpleit.tabdyl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.simpleit.tabdyl.domain.BankAccount;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {

}
