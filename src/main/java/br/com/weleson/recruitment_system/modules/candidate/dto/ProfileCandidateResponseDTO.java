package br.com.weleson.recruitment_system.modules.candidate.dto;

import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileCandidateResponseDTO {

  private UUID id;

  @Schema(example = "John Doe")
  private String name;

  @Schema(example = "johndoe")
  private String username;

  @Schema(example = "john.doe@email.com")
  private String email;

  @Schema(example = "Java developer with 3 years of experience")
  private String description;

}
