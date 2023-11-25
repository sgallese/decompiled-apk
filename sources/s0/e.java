package s0;

import j0.l;
import j0.n;
import qc.r;

/* compiled from: SaveableStateHolder.kt */
/* loaded from: classes.dex */
public final class e {

    /* compiled from: SaveableStateHolder.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements pc.a<d> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f22924f = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, qc.h] */
        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final d invoke() {
            ?? r12 = 0;
            return new d(r12, 1, r12);
        }
    }

    public static final c a(l lVar, int i10) {
        lVar.e(15454635);
        if (n.K()) {
            n.V(15454635, i10, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:58)");
        }
        d dVar = (d) b.b(new Object[0], d.f22902d.a(), null, a.f22924f, lVar, 3080, 4);
        dVar.i((f) lVar.C(h.b()));
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return dVar;
    }
}
