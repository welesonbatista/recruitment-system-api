package br.com.weleson.recruitment_system.modules.candidate.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import io.swagger.v3.oas.annotations.media.Schema;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

@Data
@Entity(name = "candidates")
public class CandidateEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Schema(example = "John Doe")
  private String name;

  @NotBlank
  @Pattern(regexp = "\\S+", message = "the username must not contain whitespace")
  @Schema(example = "johndoe", requiredMode = Schema.RequiredMode.REQUIRED)
  private String username;

  @Email(message = "the email must be a valid email address")
  @Schema(example = "john.doe@email.com", requiredMode = Schema.RequiredMode.REQUIRED)
  private String email;

  @Length(min = 10, max = 100, message = "the password must be between 10 and 100 characters")
  @Schema(example = "securepassword123", minLength = 10, maxLength = 100, requiredMode = Schema.RequiredMode.REQUIRED)
  private String password;

  @Schema(example = "Java developer with 3 years of experience")
  private String description;

  @Schema(example = "https://linkedin.com/in/johndoe")
  private String curriculum;

  @CreationTimestamp
  private LocalDateTime createdAt;

}
