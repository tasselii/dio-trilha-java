package projeto.design_pattern.controller;

import jakarta.validation.constraints.NotBlank;

public record NotificationRequest(
        @NotBlank
        String channel,
        @NotBlank
        String destination,
        @NotBlank
        String message
) {
}
