package org.example;

import io.netty.handler.ssl.OpenSsl;
import org.junit.Test;

public class NettyOpenSSLTest
{
    @Test
    public void shouldCheckOpenSSLAvailability()
    {
        OpenSsl.isAvailable();
    }
}
