package poja.big-sum.std220006.service.event;

import java.util.function.Consumer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import poja.big-sum.std220006.PojaGenerated;
import poja.big-sum.std220006.endpoint.event.gen.UuidCreated;
import poja.big-sum.std220006.repository.DummyUuidRepository;
import poja.big-sum.std220006.repository.model.DummyUuid;

@PojaGenerated
@Service
@AllArgsConstructor
@Slf4j
public class UuidCreatedService implements Consumer<UuidCreated> {

  private final DummyUuidRepository dummyUuidRepository;

  @Override
  public void accept(UuidCreated uuidCreated) {
    var dummyUuid = new DummyUuid();
    dummyUuid.setId(uuidCreated.getUuid());
    dummyUuidRepository.save(dummyUuid);
  }
}
