package com.helix.core.base;

import java.util.Optional;

public interface IAccount {

    /**
     * @return privateKey data as a byte array.
     * @throws Exception if an error occurs while retrieving the private key.
     */
    byte[] getPrivateKey() throws Exception;

    /**
     * @return privateKey as a hex string that starts with 0x.
     * @throws Exception if an error occurs while retrieving the private key.
     */
    String getPrivateKeyHex() throws Exception;

    /**
     * @return publicKey data as a byte array.
     */
    byte[] getPublicKey();

    /**
     * @return publicKey as a hex string that starts with 0x.
     */
    String getPublicKeyHex();

    /**
     * @return address as a string.
     */
    String getAddress();

    /**
     * Signs a message with the private key.
     * @param message the message to sign.
     * @param password the password for the private key.
     * @return the signed message as a byte array.
     * @throws Exception if an error occurs during signing.
     */
    byte[] sign(byte[] message, String password) throws Exception;


    /**
     * Signs a message with the private key.
     * @param messageHex the message to sign in hex format.
     * @param password the password for the private key.
     * @return an Optional containing the signed message as a String, or an empty Optional if signing fails.
     * @throws Exception if an error occurs during signing.
     */
    Optional<String> signHex(String messageHex, String password) throws Exception;
}