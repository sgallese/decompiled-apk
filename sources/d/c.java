package d;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.o;
import androidx.compose.ui.platform.j0;
import j0.l;
import j0.u;
import j0.v1;
import qc.q;
import qc.r;

/* compiled from: BackHandler.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f12966a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final v1<o> f12967b = u.c(null, a.f12968f, 1, null);

    /* compiled from: BackHandler.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements pc.a<o> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f12968f = new a();

        a() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return null;
        }
    }

    private c() {
    }

    public final o a(l lVar, int i10) {
        lVar.e(-2068013981);
        o oVar = (o) lVar.C(f12967b);
        lVar.e(1680121597);
        if (oVar == null) {
            oVar = androidx.activity.r.a((View) lVar.C(j0.k()));
        }
        lVar.N();
        if (oVar == null) {
            Context context = (Context) lVar.C(j0.g());
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof o) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                    q.h(context, "innerContext.baseContext");
                } else {
                    context = null;
                    break;
                }
            }
            oVar = (o) context;
        }
        lVar.N();
        return oVar;
    }
}
