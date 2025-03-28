package com.codegym.utility;

import io.github.cdimascio.dotenv.Dotenv;
import lombok.Getter;

public class DotEnvUtility {
    @Getter
    private static final Dotenv dotenv = Dotenv.configure()
            .filename(".env")
            .load();

}