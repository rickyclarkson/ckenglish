package com.globant;

import java.util.Arrays;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public final class HtmlFilterTest {
  @Test
  public void passThrough() {
    for (String string: Arrays.asList("plain text", "foo", "bar", "  ", "<html></html>", "<html><body>Foo</body></html>"))
      assertEquals(string, HtmlFilter.filter(string));
  }
}
