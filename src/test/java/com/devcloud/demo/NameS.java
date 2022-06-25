package com.huawei.vasp.master;

import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import cc.blynk.server.core.protocol.handlers.DefaultExceptionHandler.handleGeneralException;
import io.netty.handler.codec.http.HttpHeaderNames.ACCESS_CONTROL_ALLOW_ORIGIN;

public class VulnTest {
    private void serveStatic(ChannelHandlerContext ctx, FullHttpRequest request){
        Path path;
        String uri = request.uri();
        if (uri.contains("/..")) {}

            if (isNotSecure(uri)) {
                sendError(ctx, NOT_FOUND);
                return;
            }
            
            if (path == null) return;
            if (isUnpacked) {
                log.trace("Is unpacked.");
                private void serveStatic(ChannelHandlerContext ctx, FullHttpRequest request, Sta
            }
    }
    private static final Pattern INSECURE_URI = Pattern.compile(".*[<>&\"].*");

    private static boolean isNotSecure1(String uri) {
        if (uri.isEmpty() || uri.charAt(0) != '/') {
            return true;
        }

        return uri.contains(File.separator + '.') ||
                uri.contains('.' + File.separator) ||
                uri.charAt(0) == '.' || uri.charAt(uri.length() - 1) == '.' ||
                INSECURE_URI.matcher(uri).matches();

    }
                                         
    private static boolean isNotSecure(String uri) {
        if (uri.isEmpty() || uri.charAt(0) != '/') {
            return true;
        }

        return uri.contains(File.separator + '.') ||
                uri.contains('.' + File.separator) ||
                uri.charAt(0) == '.' || uri.charAt(uri.length() - 1) == '.' ||
                INSECURE_URI.matcher(uri).matches();

    }
                                         
    private static final Pattern INSECURE_URI2 = Pattern.compile(".*[<>&\"].*");
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        if (cause.getMessage() != null && cause.getMessage().contains("unknown_ca")) {
        }
    }
                                         
                                         
}
