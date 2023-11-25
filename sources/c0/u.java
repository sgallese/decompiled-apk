package c0;

import android.view.KeyEvent;

/* compiled from: KeyMapping.android.kt */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private static final s f8595a = new a();

    /* compiled from: KeyMapping.android.kt */
    /* loaded from: classes.dex */
    public static final class a implements s {
        a() {
        }

        @Override // c0.s
        public q a(KeyEvent keyEvent) {
            qc.q.i(keyEvent, "event");
            q qVar = null;
            if (i1.d.f(keyEvent) && i1.d.d(keyEvent)) {
                long a10 = i1.d.a(keyEvent);
                z zVar = z.f8641a;
                if (i1.a.n(a10, zVar.i())) {
                    qVar = q.SELECT_LINE_LEFT;
                } else if (i1.a.n(a10, zVar.j())) {
                    qVar = q.SELECT_LINE_RIGHT;
                } else if (i1.a.n(a10, zVar.k())) {
                    qVar = q.SELECT_HOME;
                } else if (i1.a.n(a10, zVar.h())) {
                    qVar = q.SELECT_END;
                }
            } else if (i1.d.d(keyEvent)) {
                long a11 = i1.d.a(keyEvent);
                z zVar2 = z.f8641a;
                if (i1.a.n(a11, zVar2.i())) {
                    qVar = q.LINE_LEFT;
                } else if (i1.a.n(a11, zVar2.j())) {
                    qVar = q.LINE_RIGHT;
                } else if (i1.a.n(a11, zVar2.k())) {
                    qVar = q.HOME;
                } else if (i1.a.n(a11, zVar2.h())) {
                    qVar = q.END;
                }
            }
            if (qVar == null) {
                return t.b().a(keyEvent);
            }
            return qVar;
        }
    }

    public static final s a() {
        return f8595a;
    }
}
