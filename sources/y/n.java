package y;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j0.g2;
import j0.z1;

/* compiled from: LazyLayoutItemContentFactory.kt */
/* loaded from: classes.dex */
public final class n {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyLayoutItemContentFactory.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ o f26114f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f26115m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ Object f26116p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f26117q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o oVar, int i10, Object obj, int i11) {
            super(2);
            this.f26114f = oVar;
            this.f26115m = i10;
            this.f26116p = obj;
            this.f26117q = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(980966366, i10, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:133)");
            }
            o oVar = this.f26114f;
            int i11 = this.f26115m;
            Object obj = this.f26116p;
            int i12 = this.f26117q;
            oVar.g(i11, obj, lVar, ((i12 << 6) & 896) | ((i12 >> 6) & 14) | 64);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyLayoutItemContentFactory.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ o f26118f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Object f26119m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f26120p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ Object f26121q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f26122r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o oVar, Object obj, int i10, Object obj2, int i11) {
            super(2);
            this.f26118f = oVar;
            this.f26119m = obj;
            this.f26120p = i10;
            this.f26121q = obj2;
            this.f26122r = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            n.a(this.f26118f, this.f26119m, this.f26120p, this.f26121q, lVar, z1.a(this.f26122r | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(o oVar, Object obj, int i10, Object obj2, j0.l lVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        j0.l q10 = lVar.q(1439843069);
        if ((i11 & 14) == 0) {
            if (q10.Q(oVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (q10.Q(obj)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & 896) == 0) {
            if (q10.i(i10)) {
                i14 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 7168) == 0) {
            if (q10.Q(obj2)) {
                i13 = RecyclerView.m.FLAG_MOVED;
            } else {
                i13 = UserVerificationMethods.USER_VERIFY_ALL;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) == 1170 && q10.t()) {
            q10.z();
        } else {
            if (j0.n.K()) {
                j0.n.V(1439843069, i12, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:127)");
            }
            ((s0.c) obj).e(obj2, q0.c.b(q10, 980966366, true, new a(oVar, i10, obj2, i12)), q10, 568);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new b(oVar, obj, i10, obj2, i11));
        }
    }
}
