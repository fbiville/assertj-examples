package com.google.common.net;


/**
 * {@link HostAndPort} specific assertions - Generated by me.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractHostAndPortAssert} instead.
 */
public class HostAndPortAssert extends AbstractHostAndPortAssert<HostAndPortAssert, HostAndPort> {

  /**
   * Creates a new <code>{@link HostAndPortAssert}</code> to make assertions on actual HostAndPort.
   * @param actual the HostAndPort we want to make assertions on.
   */
  public HostAndPortAssert(HostAndPort actual) {
    super(actual, HostAndPortAssert.class);
  }

  /**
   * factory method for HostAndPort assertions.
   * @return a new <code>{@link HostAndPortAssert}</code>
   */
  public static HostAndPortAssert assertThat(HostAndPort actual) {
    return new HostAndPortAssert(actual);
  }
}
