package com.helix.core.base.enums;

import lombok.Getter;

/**
 * @author: 康凯
 * @create: 2024-12-16 08:32
 * @Description:
 */
@Getter
public enum TransactionStatus {
    NONE(0),
    PENDING(1),
    SUCCESS(2),
    FAILURE(3);

    private final int value;

    TransactionStatus(int value) {
        this.value = value;
    }

}
