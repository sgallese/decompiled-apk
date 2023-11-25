package com.google.firebase.perf.application;

import android.app.Activity;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.core.app.i;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import w9.g;

/* compiled from: FrameMetricsRecorder.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: e  reason: collision with root package name */
    private static final v9.a f11761e = v9.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final Activity f11762a;

    /* renamed from: b  reason: collision with root package name */
    private final i f11763b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Fragment, g.a> f11764c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11765d;

    public d(Activity activity) {
        this(activity, new i(), new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        return true;
    }

    private com.google.firebase.perf.util.g<g.a> b() {
        if (!this.f11765d) {
            f11761e.a("No recording has been started.");
            return com.google.firebase.perf.util.g.a();
        }
        SparseIntArray[] b10 = this.f11763b.b();
        if (b10 == null) {
            f11761e.a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return com.google.firebase.perf.util.g.a();
        } else if (b10[0] == null) {
            f11761e.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return com.google.firebase.perf.util.g.a();
        } else {
            return com.google.firebase.perf.util.g.e(g.a(b10));
        }
    }

    public void c() {
        if (this.f11765d) {
            f11761e.b("FrameMetricsAggregator is already recording %s", this.f11762a.getClass().getSimpleName());
            return;
        }
        this.f11763b.a(this.f11762a);
        this.f11765d = true;
    }

    public void d(Fragment fragment) {
        if (!this.f11765d) {
            f11761e.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
        } else if (this.f11764c.containsKey(fragment)) {
            f11761e.b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
        } else {
            com.google.firebase.perf.util.g<g.a> b10 = b();
            if (!b10.d()) {
                f11761e.b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
            } else {
                this.f11764c.put(fragment, b10.c());
            }
        }
    }

    public com.google.firebase.perf.util.g<g.a> e() {
        if (!this.f11765d) {
            f11761e.a("Cannot stop because no recording was started");
            return com.google.firebase.perf.util.g.a();
        }
        if (!this.f11764c.isEmpty()) {
            f11761e.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.f11764c.clear();
        }
        com.google.firebase.perf.util.g<g.a> b10 = b();
        try {
            this.f11763b.c(this.f11762a);
        } catch (IllegalArgumentException | NullPointerException e10) {
            if ((e10 instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                throw e10;
            }
            f11761e.k("View not hardware accelerated. Unable to collect FrameMetrics. %s", e10.toString());
            b10 = com.google.firebase.perf.util.g.a();
        }
        this.f11763b.d();
        this.f11765d = false;
        return b10;
    }

    public com.google.firebase.perf.util.g<g.a> f(Fragment fragment) {
        if (!this.f11765d) {
            f11761e.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return com.google.firebase.perf.util.g.a();
        } else if (!this.f11764c.containsKey(fragment)) {
            f11761e.b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            return com.google.firebase.perf.util.g.a();
        } else {
            g.a remove = this.f11764c.remove(fragment);
            com.google.firebase.perf.util.g<g.a> b10 = b();
            if (!b10.d()) {
                f11761e.b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
                return com.google.firebase.perf.util.g.a();
            }
            return com.google.firebase.perf.util.g.e(b10.c().a(remove));
        }
    }

    @VisibleForTesting
    d(Activity activity, i iVar, Map<Fragment, g.a> map) {
        this.f11765d = false;
        this.f11762a = activity;
        this.f11763b = iVar;
        this.f11764c = map;
    }
}
