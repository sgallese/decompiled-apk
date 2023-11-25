package id;

import ad.m;
import dc.w;
import fd.g0;
import pc.q;
import qc.r;

/* compiled from: Select.kt */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final q<Object, Object, Object, Object> f17169a = a.f17175f;

    /* renamed from: b  reason: collision with root package name */
    private static final g0 f17170b = new g0("STATE_REG");

    /* renamed from: c  reason: collision with root package name */
    private static final g0 f17171c = new g0("STATE_COMPLETED");

    /* renamed from: d  reason: collision with root package name */
    private static final g0 f17172d = new g0("STATE_CANCELLED");

    /* renamed from: e  reason: collision with root package name */
    private static final g0 f17173e = new g0("NO_RESULT");

    /* renamed from: f  reason: collision with root package name */
    private static final g0 f17174f = new g0("PARAM_CLAUSE_0");

    /* compiled from: Select.kt */
    /* loaded from: classes4.dex */
    static final class a extends r implements q {

        /* renamed from: f  reason: collision with root package name */
        public static final a f17175f = new a();

        a() {
            super(3);
        }

        @Override // pc.q
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return l.ALREADY_SELECTED;
                    }
                    throw new IllegalStateException(("Unexpected internal result: " + i10).toString());
                }
                return l.CANCELLED;
            }
            return l.REREGISTER;
        }
        return l.SUCCESSFUL;
    }

    public static final g0 i() {
        return f17174f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(m<? super w> mVar, pc.l<? super Throwable, w> lVar) {
        Object t10 = mVar.t(w.f13270a, null, lVar);
        if (t10 == null) {
            return false;
        }
        mVar.w(t10);
        return true;
    }
}
