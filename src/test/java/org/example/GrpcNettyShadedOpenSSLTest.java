package org.example;

import static org.junit.Assert.assertTrue;

import io.grpc.netty.shaded.io.netty.handler.ssl.OpenSsl;
import org.junit.Test;

public class GrpcNettyShadedOpenSSLTest
{
    @Test
    public void testOpenSSL() throws Throwable {
        if (!OpenSsl.isAvailable()) {
            throw OpenSsl.unavailabilityCause();
        }
    }
}
