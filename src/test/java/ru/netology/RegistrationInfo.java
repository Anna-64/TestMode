package ru.netology;

import lombok.*;
import org.junit.jupiter.api.Test;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class RegistrationInfo {
    private String login;
    private String password;
    private String status;
}

