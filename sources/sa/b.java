package sa;

import android.content.Context;
import qc.q;

/* compiled from: EntryPointAccessors.kt */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f23060a = new b();

    private b() {
    }

    public static final <T> T a(Context context, Class<T> cls) {
        q.i(context, "context");
        q.i(cls, "entryPoint");
        return (T) ra.a.a(va.a.a(context.getApplicationContext()), cls);
    }
}
