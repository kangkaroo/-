package com.helix.core.base;

import java.util.Optional;

public interface ITransaction {

    /**
     * Signs the transaction with the given account.
     * @param account the account to sign with.
     * @return the signed transaction as an OptionalString.
     * @throws Exception if an error occurs during signing.
     */
    Optional<String> signWithAccount(IAccount account) throws Exception;

    /**
     * Returns a signed transaction object using the given account.
     * @param account the account to sign with.
     * @return the signed transaction.
     * @throws Exception if an error occurs during signing.
     */
    SignedTransaction signedTransactionWithAccount(IAccount account) throws Exception;
}


