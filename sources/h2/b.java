package h2;

import dc.w;
import f0.f2;
import j0.l;
import j0.n;
import pc.p;
import qc.r;

/* compiled from: PreviewActivity.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f16445a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static p<l, Integer, w> f16446b = q0.c.c(38142554, false, a.f16447f);

    /* compiled from: PreviewActivity.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements p<l, Integer, w> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f16447f = new a();

        a() {
            super(2);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return w.f13270a;
        }

        public final void invoke(l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (n.K()) {
                n.V(38142554, i10, -1, "androidx.compose.ui.tooling.ComposableSingletons$PreviewActivityKt.lambda-1.<anonymous> (PreviewActivity.kt:124)");
            }
            f2.d("Next", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, lVar, 6, 0, 65534);
            if (n.K()) {
                n.U();
            }
        }
    }

    public final p<l, Integer, w> a() {
        return f16446b;
    }
}
