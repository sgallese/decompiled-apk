package androidx.compose.ui.platform;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import s0.f;

/* compiled from: DisposableSaveableStateRegistry.android.kt */
/* loaded from: classes.dex */
public final class c1 implements s0.f {

    /* renamed from: a  reason: collision with root package name */
    private final pc.a<dc.w> f2620a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ s0.f f2621b;

    public c1(s0.f fVar, pc.a<dc.w> aVar) {
        qc.q.i(fVar, "saveableStateRegistry");
        qc.q.i(aVar, "onDispose");
        this.f2620a = aVar;
        this.f2621b = fVar;
    }

    @Override // s0.f
    public boolean a(Object obj) {
        qc.q.i(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return this.f2621b.a(obj);
    }

    @Override // s0.f
    public Map<String, List<Object>> b() {
        return this.f2621b.b();
    }

    @Override // s0.f
    public Object c(String str) {
        qc.q.i(str, "key");
        return this.f2621b.c(str);
    }

    @Override // s0.f
    public f.a d(String str, pc.a<? extends Object> aVar) {
        qc.q.i(str, "key");
        qc.q.i(aVar, "valueProvider");
        return this.f2621b.d(str, aVar);
    }

    public final void e() {
        this.f2620a.invoke();
    }
}
