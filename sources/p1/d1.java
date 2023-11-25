package p1;

import androidx.compose.ui.e;

/* compiled from: ObserverModifierNode.kt */
/* loaded from: classes.dex */
public final class d1 {
    public static final <T extends e.c & c1> void a(T t10, pc.a<dc.w> aVar) {
        qc.q.i(t10, "<this>");
        qc.q.i(aVar, "block");
        e1 l12 = t10.l1();
        if (l12 == null) {
            l12 = new e1(t10);
            t10.D1(l12);
        }
        k.l(t10).getSnapshotObserver().h(l12, e1.f20783m.a(), aVar);
    }
}
