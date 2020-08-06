package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    private Account account = new Account();


    @Test
    public void depositZeroAccountBalance(){
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void depositAmountToAccount(){
        account.deposit(10);
        account.deposit(20);
        assertThat(account.balance()).isEqualTo(30);
    }
}
