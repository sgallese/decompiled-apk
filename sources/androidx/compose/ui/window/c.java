package androidx.compose.ui.window;

import dc.w;
import j0.n;
import pc.p;
import qc.r;

/* compiled from: AndroidPopup.android.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f3149a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static p<j0.l, Integer, w> f3150b = q0.c.c(-1131826196, false, a.f3151f);

    /* compiled from: AndroidPopup.android.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements p<j0.l, Integer, w> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f3151f = new a();

        a() {
            super(2);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (n.K()) {
                n.V(-1131826196, i10, -1, "androidx.compose.ui.window.ComposableSingletons$AndroidPopup_androidKt.lambda-1.<anonymous> (AndroidPopup.android.kt:446)");
            }
            if (n.K()) {
                n.U();
            }
        }
    }

    public final p<j0.l, Integer, w> a() {
        return f3150b;
    }
}
