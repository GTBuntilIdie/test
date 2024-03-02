package com.tamerlanishmaev.microbank.service;

import com.tamerlanishmaev.microbank.repository.BankAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final BankAccountRepository accountRepository;




}
