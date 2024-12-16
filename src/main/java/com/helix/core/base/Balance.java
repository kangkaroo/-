package com.helix.core.base;

import lombok.Data;

/**
 * @author: 康凯
 * @create: 2024-12-16 08:18
 * @Description:
 */

@Data
public class Balance {
    private String total;
    private String usable;

    /**
     * Constructs a new Balance with the specified amount.
     * @param amount the total and usable amount as a string.
     */
    public Balance(String amount) {
        this.total = amount;
        this.usable = amount;
    }

    /**
     * Constructs a new Balance with the specified amount.
     * @param amount the total and usable amount as an integer.
     */
    public Balance(long amount) {
        this.total = String.valueOf(amount);
        this.usable = String.valueOf(amount);
    }

    /**
     * Returns an empty Balance with total and usable set to "0".
     * @return an empty Balance.
     * @deprecated use {@link #Balance(String)} with "0" as the argument.
     */
    @Deprecated
    public static Balance emptyBalance() {
        return new Balance("0");
    }

}