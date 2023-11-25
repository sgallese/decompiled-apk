package x9;

import ba.m;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FirebasePerfTraceValidator.java */
/* loaded from: classes3.dex */
public final class d extends e {

    /* renamed from: b  reason: collision with root package name */
    private static final v9.a f25884b = v9.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final m f25885a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(m mVar) {
        this.f25885a = mVar;
    }

    private boolean g(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                e.d(entry.getKey(), entry.getValue());
            } catch (IllegalArgumentException e10) {
                f25884b.j(e10.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }

    private boolean h(m mVar) {
        return i(mVar, 0);
    }

    private boolean i(m mVar, int i10) {
        if (mVar == null) {
            return false;
        }
        if (i10 > 1) {
            f25884b.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry<String, Long> entry : mVar.i0().entrySet()) {
            if (!l(entry.getKey())) {
                f25884b.j("invalid CounterId:" + entry.getKey());
                return false;
            } else if (!m(entry.getValue())) {
                f25884b.j("invalid CounterValue:" + entry.getValue());
                return false;
            }
        }
        Iterator<m> it = mVar.q0().iterator();
        while (it.hasNext()) {
            if (!i(it.next(), i10 + 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean j(m mVar) {
        boolean z10;
        boolean z11;
        if (mVar.h0() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        Iterator<m> it = mVar.q0().iterator();
        while (it.hasNext()) {
            if (it.next().h0() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    private boolean k(m mVar) {
        return mVar.o0().startsWith("_st_");
    }

    private boolean l(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            f25884b.j("counterId is empty");
            return false;
        } else if (trim.length() > 100) {
            f25884b.j("counterId exceeded max length 100");
            return false;
        } else {
            return true;
        }
    }

    private boolean m(Long l10) {
        if (l10 != null) {
            return true;
        }
        return false;
    }

    private boolean n(m mVar) {
        Long l10 = mVar.i0().get(com.google.firebase.perf.util.b.FRAMES_TOTAL.toString());
        if (l10 != null && l10.compareTo((Long) 0L) > 0) {
            return true;
        }
        return false;
    }

    private boolean o(m mVar, int i10) {
        if (mVar == null) {
            f25884b.j("TraceMetric is null");
            return false;
        } else if (i10 > 1) {
            f25884b.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        } else if (!q(mVar.o0())) {
            f25884b.j("invalid TraceId:" + mVar.o0());
            return false;
        } else if (!p(mVar)) {
            f25884b.j("invalid TraceDuration:" + mVar.l0());
            return false;
        } else if (!mVar.r0()) {
            f25884b.j("clientStartTimeUs is null.");
            return false;
        } else if (k(mVar) && !n(mVar)) {
            f25884b.j("non-positive totalFrames in screen trace " + mVar.o0());
            return false;
        } else {
            Iterator<m> it = mVar.q0().iterator();
            while (it.hasNext()) {
                if (!o(it.next(), i10 + 1)) {
                    return false;
                }
            }
            if (!g(mVar.j0())) {
                return false;
            }
            return true;
        }
    }

    private boolean p(m mVar) {
        if (mVar != null && mVar.l0() > 0) {
            return true;
        }
        return false;
    }

    private boolean q(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty() || trim.length() > 100) {
            return false;
        }
        return true;
    }

    @Override // x9.e
    public boolean c() {
        if (!o(this.f25885a, 0)) {
            f25884b.j("Invalid Trace:" + this.f25885a.o0());
            return false;
        } else if (j(this.f25885a) && !h(this.f25885a)) {
            f25884b.j("Invalid Counters for Trace:" + this.f25885a.o0());
            return false;
        } else {
            return true;
        }
    }
}
