package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: ConfigRealtimeHandler.java */
/* loaded from: classes3.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private final Set<da.c> f12031a;

    /* renamed from: b  reason: collision with root package name */
    private final s f12032b;

    /* renamed from: c  reason: collision with root package name */
    private final m f12033c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.firebase.e f12034d;

    /* renamed from: e  reason: collision with root package name */
    private final j9.e f12035e;

    /* renamed from: f  reason: collision with root package name */
    private final f f12036f;

    /* renamed from: g  reason: collision with root package name */
    private final Context f12037g;

    /* renamed from: h  reason: collision with root package name */
    private final String f12038h;

    /* renamed from: i  reason: collision with root package name */
    private final p f12039i;

    /* renamed from: j  reason: collision with root package name */
    private final ScheduledExecutorService f12040j;

    public q(com.google.firebase.e eVar, j9.e eVar2, m mVar, f fVar, Context context, String str, p pVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f12031a = linkedHashSet;
        this.f12032b = new s(eVar, eVar2, mVar, fVar, context, str, linkedHashSet, pVar, scheduledExecutorService);
        this.f12034d = eVar;
        this.f12033c = mVar;
        this.f12035e = eVar2;
        this.f12036f = fVar;
        this.f12037g = context;
        this.f12038h = str;
        this.f12039i = pVar;
        this.f12040j = scheduledExecutorService;
    }

    private synchronized void a() {
        if (!this.f12031a.isEmpty()) {
            this.f12032b.B();
        }
    }

    public synchronized void b(boolean z10) {
        this.f12032b.y(z10);
        if (!z10) {
            a();
        }
    }
}
