package e0;

import j0.v1;
import java.util.Map;

/* compiled from: SelectionRegistrar.kt */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private static final v1<q> f13672a = j0.u.c(null, a.f13673f, 1, null);

    /* compiled from: SelectionRegistrar.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<q> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f13673f = new a();

        a() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final q invoke() {
            return null;
        }
    }

    public static final v1<q> a() {
        return f13672a;
    }

    public static final boolean b(q qVar, long j10) {
        Map<Long, j> f10;
        if (qVar != null && (f10 = qVar.f()) != null) {
            return f10.containsKey(Long.valueOf(j10));
        }
        return false;
    }
}
