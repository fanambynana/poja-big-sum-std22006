package poja.big_sum.std22006.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import poja.big_sum.std22006.PojaGenerated;

@PojaGenerated
public class BucketConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.s3.bucket", () -> "dummy-bucket");
  }
}
