package com.github.cao.awa.viburnum.util.bytes;

public class BytesUtil {
    public static void xor(byte[] target, byte[] xor) {
        for (int i = 0; i < target.length; i++) {
            target[i] ^= xor[i];
        }
    }
}
