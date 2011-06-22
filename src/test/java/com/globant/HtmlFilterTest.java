package com.globant;

import java.util.Arrays;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public final class HtmlFilterTest {
  @Test
  public void passThrough() {
    for (String string: Arrays.asList("plain text", "foo", "bar", "  "))
      assertEquals(string, new HTMLInputFilter().filter(string));
  }

  @Test
  public void removeTags() {
    assertEquals("I can't believe it's not butter.", new HTMLInputFilter().filter("<html><script>I can't believe it's not butter.</script></html>"));
  }
}
