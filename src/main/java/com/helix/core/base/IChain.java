package com.helix.core.base;

import java.util.Optional;

import com.helix.core.base.enums.TransactionStatus;

public interface IChain {

    /**
     * Returns the main token of the chain (e.g., ETH for Ethereum).
     *
     * @return the main token.
     */
    IToken getMainToken();

    /**
     * Gets the balance of a specified address.
     *
     * @param address the address to query.
     * @return the balance information of the address.
     * @throws Exception if an error occurs while fetching the balance.
     */
    Balance getBalanceOfAddress(String address) throws Exception;

    /**
     * Gets the balance of a specified public key.
     *
     * @param publicKey the public key to query.
     * @return the balance information of the public key.
     * @throws Exception if an error occurs while fetching the balance.
     */
    Balance getBalanceOfPublicKey(String publicKey) throws Exception;

    /**
     * Gets the balance of a specified account.
     *
     * @param account the account object to query.
     * @return the balance information of the account.
     * @throws Exception if an error occurs while fetching the balance.
     */
    Balance getBalanceOfAccount(IAccount account) throws Exception;

    /**
     * Sends a signed raw transaction to the chain.
     *
     * @param signedTx the signed transaction data in hex format.
     * @return the transaction hash as a hex string.
     * @throws Exception if an error occurs while sending the transaction.
     */
    String sendRawTransaction(String signedTx) throws Exception;

    /**
     * Sends a signed transaction to the chain.
     *
     * @param signedTxn the signed transaction object.
     * @return the transaction hash as an OptionalString.
     * @throws Exception if an error occurs while sending the transaction.
     */
    Optional<String> sendSignedTransaction(SignedTransaction signedTxn) throws Exception;

    /**
     * Fetches transaction details through the transaction hash.
     *
     * @param hash the transaction hash.
     * @return the transaction details.
     * @throws Exception if an error occurs while fetching the transaction details.
     */
    TransactionDetail fetchTransactionDetail(String hash) throws Exception;

    /**
     * Fetches the transaction status through the transaction hash.
     *
     * @param hash the transaction hash.
     * @return the transaction status.
     */
    TransactionStatus fetchTransactionStatus(String hash);

    /**
     * Batch fetches transaction statuses.
     *
     * @param hashListString a comma-separated string of transaction hashes.
     * @return a string of transaction statuses corresponding to each hash.
     */
    String batchFetchTransactionStatus(String hashListString);

    /**
     * Estimates the transaction fee.
     *
     * @param transaction the transaction object to estimate the fee for.
     * @return the estimated transaction fee as an OptionalString.
     * @throws Exception if an error occurs while estimating the fee.
     */
    Optional<String> estimateTransactionFee(ITransaction transaction) throws Exception;

    /**
     * Estimates the transaction fee using a public key.
     *
     * @param transaction the transaction object to estimate the fee for.
     * @param pubkey      the public key.
     * @return the estimated transaction fee as an OptionalString.
     * @throws Exception if an error occurs while estimating the fee.
     */
    Optional<String> estimateTransactionFeeUsePublicKey(ITransaction transaction, String pubkey) throws Exception;


}