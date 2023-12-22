package poja.big_sum.std22006.unit.objectMapper;

import static org.junit.jupiter.api.Assertions.assertThrows;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import java.time.Instant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import poja.big_sum.std22006.conf.FacadeIT;

public class ObjectMapperTest extends FacadeIT {
  @Autowired ObjectMapper injectedBean;
  ObjectMapper newInstance = new ObjectMapper();

  SomeClassWithDatetimeField someClassWithDatetimeField =
      new SomeClassWithDatetimeField(Instant.now());

  @Test
  void new_instance_throws_on_java_datetime_module() {
    String jsonString = someClassWithDatetimeField.toJsonString();
    assertThrows(
        InvalidDefinitionException.class,
        () -> newInstance.readValue(jsonString, SomeClassWithDatetimeField.class));
  }

  @Test
  void injected_bean_handles_java_datetime_module() {
    Assertions.assertDoesNotThrow(
        () ->
            injectedBean.readValue(
                someClassWithDatetimeField.toJsonString(), SomeClassWithDatetimeField.class));
  }
}
