package poja.big-sum.std220006.endpoint.rest.controller.health;

import poja.big-sum.std220006.PojaGenerated;
import poja.big-sum.std220006.repository.DummyRepository;
import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static poja.big-sum.std220006.endpoint.rest.controller.health.PingController.KO;
import static poja.big-sum.std220006.endpoint.rest.controller.health.PingController.OK;

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
