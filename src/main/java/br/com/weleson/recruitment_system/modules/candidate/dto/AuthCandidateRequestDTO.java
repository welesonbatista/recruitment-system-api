package br.com.weleson.recruitment_system.modules.candidate.dto;

import io.swagger.v3.oas.annotations.media.Schema;

public record AuthCandidateRequestDTO(
    @Schema(example = "johndoe", requiredMode = Schema.RequiredMode.REQUIRED) String username,
    @Schema(example = "securepassword123", requiredMode = Schema.RequiredMode.REQUIRED) String password) {
}
