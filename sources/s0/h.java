package s0;

import j0.u;
import j0.v1;
import java.util.List;
import java.util.Map;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: SaveableStateRegistry.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final v1<f> f22931a = u.d(a.f22932f);

    /* compiled from: SaveableStateRegistry.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements pc.a<f> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f22932f = new a();

        a() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final f invoke() {
            return null;
        }
    }

    public static final f a(Map<String, ? extends List<? extends Object>> map, l<Object, Boolean> lVar) {
        q.i(lVar, "canBeSaved");
        return new g(map, lVar);
    }

    public static final v1<f> b() {
        return f22931a;
    }
}
