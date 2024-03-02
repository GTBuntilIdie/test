package com.tamerlanishmaev.microbank.controller.requestDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class basicUserCreateRequestDto {

    // логин, пароль, изначальную сумму, телефон и email
    @NotNull
    private String login;

    @NotNull
    private String password;

    @NotNull
    private BigDecimal startBalanceSum;

    @NotNull
    private String phone;

    @NotNull
    private String email;

}
