package okio;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: -JvmPlatform.kt */
/* loaded from: classes4.dex */
public final class e1 {
    public static final byte[] a(String str) {
        qc.q.i(str, "<this>");
        byte[] bytes = str.getBytes(yc.d.f26303b);
        qc.q.h(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final ReentrantLock b() {
        return new ReentrantLock();
    }

    public static final String c(byte[] bArr) {
        qc.q.i(bArr, "<this>");
        return new String(bArr, yc.d.f26303b);
    }
}
