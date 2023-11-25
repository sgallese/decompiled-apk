package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.j0;
import java.util.List;

/* compiled from: ProcessLifecycleInitializer.kt */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements z3.a<v> {
    @Override // z3.a
    public List<Class<? extends z3.a<?>>> a() {
        List<Class<? extends z3.a<?>>> i10;
        i10 = ec.t.i();
        return i10;
    }

    @Override // z3.a
    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public v b(Context context) {
        qc.q.i(context, "context");
        androidx.startup.a e10 = androidx.startup.a.e(context);
        qc.q.h(e10, "getInstance(context)");
        if (e10.g(ProcessLifecycleInitializer.class)) {
            r.a(context);
            j0.b bVar = j0.f4975v;
            bVar.b(context);
            return bVar.a();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}
