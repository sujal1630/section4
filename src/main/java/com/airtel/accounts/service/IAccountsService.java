package com.airtel.accounts.service;

import com.airtel.accounts.dto.CustomerDto;

public interface IAccountsService {

    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    /**
     *
     * @param customerDto customer dto object
     * @return boolean indicating account update is successful or not
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber input is mobile number.
     * @return delete of account is successful or not.
     */
    boolean deleteAccount(String mobileNumber);
}
