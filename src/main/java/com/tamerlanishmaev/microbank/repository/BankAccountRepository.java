package com.tamerlanishmaev.microbank.repository;

import com.tamerlanishmaev.microbank.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BankAccountRepository extends JpaRepository<BankAccount, UUID> {

}
