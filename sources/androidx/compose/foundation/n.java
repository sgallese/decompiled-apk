package androidx.compose.foundation;

import dc.w;

/* compiled from: FocusedBounds.kt */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final o1.m<pc.l<n1.s, w>> f2153a = o1.e.a(a.f2154f);

    /* compiled from: FocusedBounds.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<pc.l<? super n1.s, ? extends w>> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f2154f = new a();

        a() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final pc.l<n1.s, w> invoke() {
            return null;
        }
    }

    public static final o1.m<pc.l<n1.s, w>> a() {
        return f2153a;
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, pc.l<? super n1.s, w> lVar) {
        qc.q.i(eVar, "<this>");
        qc.q.i(lVar, "onPositioned");
        return eVar.a(new FocusedBoundsObserverElement(lVar));
    }
}
