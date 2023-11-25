package com.google.firebase.perf.metrics;

import ba.k;
import ba.m;
import com.google.firebase.perf.session.PerfSession;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TraceMetricBuilder.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Trace f11830a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Trace trace) {
        this.f11830a = trace;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m a() {
        m.b N = m.w0().O(this.f11830a.f()).M(this.f11830a.h().e()).N(this.f11830a.h().d(this.f11830a.e()));
        for (Counter counter : this.f11830a.d().values()) {
            N.K(counter.b(), counter.a());
        }
        List<Trace> i10 = this.f11830a.i();
        if (!i10.isEmpty()) {
            Iterator<Trace> it = i10.iterator();
            while (it.hasNext()) {
                N.H(new a(it.next()).a());
            }
        }
        N.J(this.f11830a.getAttributes());
        k[] b10 = PerfSession.b(this.f11830a.g());
        if (b10 != null) {
            N.E(Arrays.asList(b10));
        }
        return N.build();
    }
}
