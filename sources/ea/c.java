package ea;

import android.os.Trace;

/* compiled from: FirebaseTrace.java */
/* loaded from: classes3.dex */
public final class c {
    public static void a() {
        Trace.endSection();
    }

    public static void b(String str) {
        Trace.beginSection(str);
    }
}
