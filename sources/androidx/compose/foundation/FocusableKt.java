package androidx.compose.foundation;

import androidx.compose.ui.platform.j1;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.platform.m1;
import dc.w;
import p1.u0;

/* compiled from: Focusable.kt */
/* loaded from: classes.dex */
public final class FocusableKt {

    /* renamed from: a  reason: collision with root package name */
    private static final j1 f1836a;

    /* renamed from: b  reason: collision with root package name */
    private static final FocusableKt$FocusableInNonTouchModeElement$1 f1837b;

    /* compiled from: Focusable.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<androidx.compose.ui.focus.g, w> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f1838f = new a();

        a() {
            super(1);
        }

        public final void a(androidx.compose.ui.focus.g gVar) {
            qc.q.i(gVar, "$this$focusProperties");
            gVar.m(false);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(androidx.compose.ui.focus.g gVar) {
            a(gVar);
            return w.f13270a;
        }
    }

    /* compiled from: Focusable.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<m1, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f1839f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ v.m f1840m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, v.m mVar) {
            super(1);
            this.f1839f = z10;
            this.f1840m = mVar;
        }

        public final void a(m1 m1Var) {
            qc.q.i(m1Var, "$this$inspectable");
            m1Var.b("focusableInNonTouchMode");
            m1Var.a().c("enabled", Boolean.valueOf(this.f1839f));
            m1Var.a().c("interactionSource", this.f1840m);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.l<m1, w> {
        public c() {
            super(1);
        }

        public final void a(m1 m1Var) {
            qc.q.i(m1Var, "$this$null");
            m1Var.b("focusGroup");
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1] */
    static {
        pc.l a10;
        if (k1.c()) {
            a10 = new c();
        } else {
            a10 = k1.a();
        }
        f1836a = new j1(a10);
        f1837b = new u0<i>() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return false;
            }

            @Override // p1.u0
            public int hashCode() {
                return System.identityHashCode(this);
            }

            @Override // p1.u0
            /* renamed from: v  reason: merged with bridge method [inline-methods] */
            public i e() {
                return new i();
            }

            @Override // p1.u0
            /* renamed from: x  reason: merged with bridge method [inline-methods] */
            public void m(i iVar) {
                qc.q.i(iVar, "node");
            }
        };
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
        qc.q.i(eVar, "<this>");
        return androidx.compose.ui.focus.e.a(androidx.compose.ui.focus.i.a(eVar.a(f1836a), a.f1838f));
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, boolean z10, v.m mVar) {
        androidx.compose.ui.e eVar2;
        qc.q.i(eVar, "<this>");
        if (z10) {
            eVar2 = androidx.compose.ui.focus.e.a(new FocusableElement(mVar));
        } else {
            eVar2 = androidx.compose.ui.e.f2335a;
        }
        return eVar.a(eVar2);
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, boolean z10, v.m mVar) {
        qc.q.i(eVar, "<this>");
        return k1.b(eVar, new b(z10, mVar), b(androidx.compose.ui.e.f2335a.a(f1837b), z10, mVar));
    }
}
