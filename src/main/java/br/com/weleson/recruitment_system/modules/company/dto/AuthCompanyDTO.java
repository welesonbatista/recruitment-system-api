package br.com.weleson.recruitment_system.modules.company.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthCompanyDTO {

  @Schema(example = "techcorp", requiredMode = Schema.RequiredMode.REQUIRED)
  private String username;

  @Schema(example = "securepassword123", requiredMode = Schema.RequiredMode.REQUIRED)
  private String password;
}
