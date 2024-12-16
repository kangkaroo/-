package com.helix.core.base;

/**
 * @author: 康凯
 * @create: 2024-12-16 08:11
 * @Description:
 */

public interface IAddressUtil {

    /**
     * Encodes a public key to an address.
     * @param publicKey the public key, which can start with 0x or not.
     * @return the encoded address as a string.
     * @throws Exception if an error occurs during encoding.
     */
    String encodePublicKeyToAddress(String publicKey) throws Exception;

    /**
     * Decodes an address to a public key.
     * @param address the address to decode.
     * @return the public key as a string that starts with 0x.
     * @throws Exception if an error occurs during decoding.
     */
    String decodeAddressToPublicKey(String address) throws Exception;

    /**
     * Checks if the given address is valid.
     * @param address the address to validate.
     * @return true if the address is valid, false otherwise.
     */
    boolean isValidAddress(String address);
}