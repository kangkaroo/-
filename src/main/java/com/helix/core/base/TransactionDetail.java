package com.helix.core.base;

import com.helix.core.base.enums.TransactionStatus;
import lombok.Data;

/**
 * @author: 康凯
 * @create: 2024-12-16 08:33
 * @Description:
 */

@Data
public class TransactionDetail {

    private String hashString;
    private String amount;
    private String estimateFees;
    private String fromAddress;
    private String toAddress;
    private TransactionStatus status;
    private long finishTimestamp;
    private String failureMessage;
    private String cidNumber;
    private String tokenName;

    // Getters and setters for each field

    public boolean isCIDTransfer() {
        return cidNumber != null && !cidNumber.trim().isEmpty();
    }

    public boolean isNFTTransfer() {
        return tokenName != null && !tokenName.trim().isEmpty();
    }

}