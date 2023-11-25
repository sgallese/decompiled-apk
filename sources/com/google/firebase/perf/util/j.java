package com.google.firebase.perf.util;

import com.google.firebase.perf.metrics.Trace;
import w9.g;

/* compiled from: ScreenTraceUtil.java */
/* loaded from: classes3.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static final v9.a f11900a = v9.a.e();

    public static Trace a(Trace trace, g.a aVar) {
        if (aVar.d() > 0) {
            trace.putMetric(b.FRAMES_TOTAL.toString(), aVar.d());
        }
        if (aVar.c() > 0) {
            trace.putMetric(b.FRAMES_SLOW.toString(), aVar.c());
        }
        if (aVar.b() > 0) {
            trace.putMetric(b.FRAMES_FROZEN.toString(), aVar.b());
        }
        f11900a.a("Screen trace: " + trace.f() + " _fr_tot:" + aVar.d() + " _fr_slo:" + aVar.c() + " _fr_fzn:" + aVar.b());
        return trace;
    }
}
