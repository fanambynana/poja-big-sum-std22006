package poja.big_sum.std22006.endpoint.rest.controller.health;

import static poja.big_sum.std22006.endpoint.rest.controller.health.PingController.KO;
import static poja.big_sum.std22006.endpoint.rest.controller.health.PingController.OK;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import poja.big_sum.std22006.PojaGenerated;
import poja.big_sum.std22006.repository.DummyRepository;

@PojaGenerated
@RestController
@AllArgsConstructor
public class HealthDbController {

  DummyRepository dummyRepository;

  @GetMapping("/health/db")
  public ResponseEntity<String> dummyTable_should_not_be_empty() {
    return dummyRepository.findAll().isEmpty() ? KO : OK;
  }
}
