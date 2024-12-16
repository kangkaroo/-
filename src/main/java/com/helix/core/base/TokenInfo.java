package com.helix.core.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author: 康凯
 * @create: 2024-12-16 08:37
 * @Description:
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TokenInfo {
    private String name;
    private String symbol;
    private short decimal;
}