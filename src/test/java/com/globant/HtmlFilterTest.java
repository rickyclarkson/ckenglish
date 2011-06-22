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

  @Test
  public void removeTags() {
    assertEquals("<html></html>", HtmlFilter.filter("<html><script>I can't believe it's not butter.</script></html>"));
  }
}
