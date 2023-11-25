package z;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.platform.j0;
import dc.w;
import kotlin.coroutines.Continuation;
import n1.s;
import n1.t;
import p1.h;
import p1.i;
import qc.q;

/* compiled from: BringIntoViewResponder.android.kt */
/* loaded from: classes.dex */
public final class f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BringIntoViewResponder.android.kt */
    /* loaded from: classes.dex */
    public static final class a implements b {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h f26347f;

        a(h hVar) {
            this.f26347f = hVar;
        }

        @Override // z.b
        public final Object R(s sVar, pc.a<z0.h> aVar, Continuation<? super w> continuation) {
            z0.h hVar;
            View view = (View) i.a(this.f26347f, j0.k());
            long e10 = t.e(sVar);
            z0.h invoke = aVar.invoke();
            if (invoke != null) {
                hVar = invoke.r(e10);
            } else {
                hVar = null;
            }
            if (hVar != null) {
                view.requestRectangleOnScreen(f.c(hVar), false);
            }
            return w.f13270a;
        }
    }

    public static final b b(h hVar) {
        q.i(hVar, "<this>");
        return new a(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect c(z0.h hVar) {
        return new Rect((int) hVar.i(), (int) hVar.l(), (int) hVar.j(), (int) hVar.e());
    }
}
