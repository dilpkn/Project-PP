package com.example.project_industrial_programming_app;

import encryption.AESUtil;
import expression.Regular;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControllerTest {
    private Controller controller;

    @BeforeEach
    void setUp() {
        controller = new Controller();
    }

    @Test
    void testEncryptDecrypt() {
        // Пример тестирования шифрования и дешифрования
        String originalText = "Test encryption";
        String encryptedText = AESUtil.encrypt(originalText, "key");
        String decryptedText = AESUtil.decrypt(encryptedText);

        Assertions.assertEquals(originalText, decryptedText, "Шифрование/дешифрование работает некорректно.");
    }

    @Test
    void testRegularExpression() {
        // Пример тестирования обработки выражений
        Regular reg = new Regular();
        String input = "2 + 2";
        String output = reg.EvaluateExpression(input);

        String expectedOutput = "2 + 2 = 4.0"; // Учитываем реальный формат результата
        Assertions.assertEquals(expectedOutput, output, "Обработка выражений работает некорректно.");
    }

}