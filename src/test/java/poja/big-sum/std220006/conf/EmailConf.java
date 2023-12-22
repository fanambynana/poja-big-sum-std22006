package poja.big-sum.std220006.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import poja.big-sum.std220006.PojaGenerated;

@PojaGenerated
public class EmailConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.ses.source", () -> "dummy-ses-source");
  }
}
