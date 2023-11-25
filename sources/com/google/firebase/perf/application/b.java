package com.google.firebase.perf.application;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.application.a;
import java.lang.ref.WeakReference;

/* compiled from: AppStateUpdateHandler.java */
/* loaded from: classes3.dex */
public abstract class b implements a.b {
    private final WeakReference<a.b> appStateCallback;
    private final a appStateMonitor;
    private ba.d currentAppState;
    private boolean isRegisteredForAppState;

    /* JADX INFO: Access modifiers changed from: protected */
    public b() {
        this(a.b());
    }

    public ba.d getAppState() {
        return this.currentAppState;
    }

    @VisibleForTesting
    public WeakReference<a.b> getAppStateCallback() {
        return this.appStateCallback;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void incrementTsnsCount(int i10) {
        this.appStateMonitor.e(i10);
    }

    @Override // com.google.firebase.perf.application.a.b
    public void onUpdateAppState(ba.d dVar) {
        ba.d dVar2 = this.currentAppState;
        ba.d dVar3 = ba.d.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (dVar2 == dVar3) {
            this.currentAppState = dVar;
        } else if (dVar2 != dVar && dVar != dVar3) {
            this.currentAppState = ba.d.FOREGROUND_BACKGROUND;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        this.currentAppState = this.appStateMonitor.a();
        this.appStateMonitor.k(this.appStateCallback);
        this.isRegisteredForAppState = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void unregisterForAppState() {
        if (!this.isRegisteredForAppState) {
            return;
        }
        this.appStateMonitor.p(this.appStateCallback);
        this.isRegisteredForAppState = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(a aVar) {
        this.isRegisteredForAppState = false;
        this.currentAppState = ba.d.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = aVar;
        this.appStateCallback = new WeakReference<>(this);
    }
}
