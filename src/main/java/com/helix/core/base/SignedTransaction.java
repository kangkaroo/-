package com.helix.core.base;

import java.util.Optional;

public interface SignedTransaction {

    /**
     * Returns the transaction as a hex string.
     * @return the hex string of the transaction as an OptionalString.
     * @throws Exception if an error occurs during conversion.
     */
    Optional<String> hexString() throws Exception;
}