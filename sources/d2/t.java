package d2;

import android.graphics.Typeface;
import j0.g3;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidParagraphIntrinsics.android.kt */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final g3<Object> f13090a;

    /* renamed from: b  reason: collision with root package name */
    private final t f13091b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f13092c;

    public t(g3<? extends Object> g3Var, t tVar) {
        qc.q.i(g3Var, "resolveResult");
        this.f13090a = g3Var;
        this.f13091b = tVar;
        this.f13092c = g3Var.getValue();
    }

    public final Typeface a() {
        Object obj = this.f13092c;
        qc.q.g(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    public final boolean b() {
        t tVar;
        if (this.f13090a.getValue() == this.f13092c && ((tVar = this.f13091b) == null || !tVar.b())) {
            return false;
        }
        return true;
    }
}
