package com.example.azuretest;

import com.azure.security.keyvault.secrets.SecretClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzuretestApplication implements CommandLineRunner {

    private final SecretClient secretClient;

    public AzuretestApplication(SecretClient secretClient) {
        this.secretClient = secretClient;
    }

    public static void main(String[] args) {
        SpringApplication.run(AzuretestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("TestKey: " + secretClient.getSecret("testkey").getValue());
    }
}
