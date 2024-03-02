package com.tamerlanishmaev.microbank.entityListener;

import com.tamerlanishmaev.microbank.entity.BankAccount;
import com.tamerlanishmaev.microbank.entity.User;
import com.tamerlanishmaev.microbank.repository.BankAccountRepository;
import jakarta.persistence.PrePersist;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Configuration
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
public class UserEntityListener {

    private final BankAccountRepository accountRepository;

    @PrePersist
    public void onMainEntityCreate(User User) {
        BankAccount associatedEntity = new BankAccount();
        associatedEntity.setAccountNumber(BankAccountGenerator.generateAccountNumber());
        assert accountRepository != null;
        accountRepository.save(associatedEntity);
        User.setBankAccount(associatedEntity);
    }

    private static class BankAccountGenerator {

         static String generateAccountNumber() {
            LocalDateTime currentTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
             return "ACC" + currentTime.format(formatter);
        }
    }
}
