package b4;

import android.os.Trace;

/* compiled from: TraceApi18Impl.java */
/* loaded from: classes.dex */
final class c {
    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
