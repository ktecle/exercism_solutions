package io.zipcoder.controller;

import io.zipcoder.domain.Account;
import io.zipcoder.repositories.AccountRepository;
import io.zipcoder.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class AccountController {
    @Inject
    private AccountService accountService;

    @RequestMapping(value="/accounts", method= RequestMethod.GET)
    public ResponseEntity<Iterable<Account>> getAllAccounts() {
      return accountService.getAllAccounts();
    }

    @RequestMapping(value="/accounts/{id}", method=RequestMethod.GET)
    public Account getAccount(@PathVariable Long id) {
        return accountService.getAccount(id);
    }

    @RequestMapping(value="/accounts/{customerId}/accounts", method= RequestMethod.GET)
    public ResponseEntity<Iterable<Account>> getAllAccountsByCustomerId() {
        return accountService.getAllAccountsByCustomerId();
    }


    }





