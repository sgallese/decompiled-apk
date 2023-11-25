package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.k1;
import androidx.compose.ui.platform.m1;
import dc.w;
import qc.q;
import qc.r;

/* compiled from: Box.kt */
/* loaded from: classes.dex */
public final class e implements w.d {

    /* renamed from: a  reason: collision with root package name */
    public static final e f2083a = new e();

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class a extends r implements pc.l<m1, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ v0.b f2084f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v0.b bVar) {
            super(1);
            this.f2084f = bVar;
        }

        public final void a(m1 m1Var) {
            q.i(m1Var, "$this$null");
            m1Var.b("align");
            m1Var.c(this.f2084f);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class b extends r implements pc.l<m1, w> {
        public b() {
            super(1);
        }

        public final void a(m1 m1Var) {
            q.i(m1Var, "$this$null");
            m1Var.b("matchParentSize");
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    private e() {
    }

    @Override // w.d
    public androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
        pc.l a10;
        q.i(eVar, "<this>");
        v0.b d10 = v0.b.f24258a.d();
        if (k1.c()) {
            a10 = new b();
        } else {
            a10 = k1.a();
        }
        return eVar.a(new BoxChildDataElement(d10, true, a10));
    }

    @Override // w.d
    public androidx.compose.ui.e b(androidx.compose.ui.e eVar, v0.b bVar) {
        pc.l a10;
        q.i(eVar, "<this>");
        q.i(bVar, "alignment");
        if (k1.c()) {
            a10 = new a(bVar);
        } else {
            a10 = k1.a();
        }
        return eVar.a(new BoxChildDataElement(bVar, false, a10));
    }
}
