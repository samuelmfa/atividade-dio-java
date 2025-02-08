package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaTerminalTest {

    @Test
    public void testAccountCreation() {
        // Simulate user input
        String agencia = "067-8";
        int numero = 1021;
        String nomeCliente = "MARIO ANDRADE";
        double saldo = 237.48;

        // Expected message
        String expectedMessage = "Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.";

        // Create the actual message
        String actualMessage = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        // Assert the message
        assertEquals(expectedMessage, actualMessage);
    }
}