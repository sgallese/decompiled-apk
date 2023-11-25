package s4;

import android.content.Context;
import androidx.compose.ui.platform.j0;
import j0.l;
import j0.n;
import j0.u;
import j0.v1;
import qc.r;

/* compiled from: LocalImageLoader.kt */
/* loaded from: classes.dex */
public final class g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalImageLoader.kt */
    /* loaded from: classes.dex */
    public static final class a extends r implements pc.a<q4.g> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f23025f = new a();

        a() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final q4.g invoke() {
            return null;
        }
    }

    public static /* synthetic */ v1 b(v1 v1Var, int i10, qc.h hVar) {
        if ((i10 & 1) != 0) {
            v1Var = u.d(a.f23025f);
        }
        return a(v1Var);
    }

    public static final q4.g c(v1<q4.g> v1Var, l lVar, int i10) {
        if (n.K()) {
            n.V(-617597678, i10, -1, "coil.compose.ImageLoaderProvidableCompositionLocal.<get-current> (LocalImageLoader.kt:49)");
        }
        q4.g gVar = (q4.g) lVar.C(v1Var);
        if (gVar == null) {
            gVar = q4.a.a((Context) lVar.C(j0.g()));
        }
        if (n.K()) {
            n.U();
        }
        return gVar;
    }

    public static v1<q4.g> a(v1<q4.g> v1Var) {
        return v1Var;
    }
}
