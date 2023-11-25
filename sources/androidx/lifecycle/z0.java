package androidx.lifecycle;

import androidx.lifecycle.y0;

/* compiled from: ViewModelProvider.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class z0 {
    public static v0 a(y0.b bVar, Class cls) {
        qc.q.i(cls, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public static v0 b(y0.b bVar, Class cls, j3.a aVar) {
        qc.q.i(cls, "modelClass");
        qc.q.i(aVar, "extras");
        return bVar.a(cls);
    }
}
