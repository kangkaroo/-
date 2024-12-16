package com.helix.core.base;

import com.helix.core.base.ITransaction;
/**
 * @author: 康凯
 * @create: 2024-12-16 08:39
 * @Description:
 */
public interface IToken {
    /**
     * Returns the chain associated with this token.
     * @return the chain.
     */
    IChain getChain();

    /**
     * Returns the token information.
     * @return the token information.
     * @throws Exception if an error occurs while retrieving the token info.
     */
    TokenInfo getTokenInfo() throws Exception;

    /**
     * Gets the balance of a specified address.
     * @param address the address to query.
     * @return the balance information of the address.
     * @throws Exception if an error occurs while fetching the balance.
     */
    Balance getBalanceOfAddress(String address) throws Exception;

    /**
     * Gets the balance of a specified public key.
     * @param publicKey the public key to query.
     * @return the balance information of the public key.
     * @throws Exception if an error occurs while fetching the balance.
     */
    Balance getBalanceOfPublicKey(String publicKey) throws Exception;

    /**
     * Gets the balance of a specified account.
     * @param account the account object to query.
     * @return the balance information of the account.
     * @throws Exception if an error occurs while fetching the balance.
     */
    Balance getBalanceOfAccount(IAccount account) throws Exception;

    /**
     * Builds a transfer transaction.
     * @param sender the sender's address.
     * @param receiver the receiver's address.
     * @param amount the amount to transfer.
     * @return the transaction.
     * @throws Exception if an error occurs while building the transaction.
     */
    ITransaction buildTransfer(String sender, String receiver, String amount) throws Exception;

    /**
     * Checks if transferring all tokens is possible.
     * @return true if transferring all is possible, false otherwise.
     */
    boolean canTransferAll();

    /**
     * Builds a transfer all transaction.
     * @param sender the sender's address.
     * @param receiver the receiver's address.
     * @return the transaction.
     * @throws Exception if an error occurs while building the transaction.
     */
    ITransaction buildTransferAll(String sender, String receiver) throws Exception;
}
