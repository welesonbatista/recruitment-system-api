package br.com.weleson.recruitment_system.modules.candidate.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.weleson.recruitment_system.exceptions.UserFoundException;
import br.com.weleson.recruitment_system.modules.candidate.CandidateEntity;
import br.com.weleson.recruitment_system.modules.candidate.CandidateRepository;

@Service
public class CreateCandidateUseCase {

  @Autowired
  private CandidateRepository candidateRepository;

  public CandidateEntity execute(CandidateEntity candidateEntity) {
    this.candidateRepository.findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail()).ifPresent(
        (user) -> {
          throw new UserFoundException();
        });

    return this.candidateRepository.save(candidateEntity);
  }

}
