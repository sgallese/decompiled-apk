package r5;

import qc.q;
import r5.f;

/* compiled from: Plugin.kt */
/* loaded from: classes.dex */
public abstract class e implements f {

    /* renamed from: f  reason: collision with root package name */
    private final f.b f22176f = f.b.Observe;

    @Override // r5.f
    public final q5.a a(q5.a aVar) {
        q.i(aVar, "event");
        return null;
    }

    @Override // r5.f
    public void b(p5.a aVar) {
        f.a.b(this, aVar);
    }

    @Override // r5.f
    public f.b getType() {
        return this.f22176f;
    }

    public abstract void h(String str);

    public abstract void i(String str);
}
