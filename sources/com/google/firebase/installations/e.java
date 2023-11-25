package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: GetIdListener.java */
/* loaded from: classes3.dex */
class e implements g {

    /* renamed from: a  reason: collision with root package name */
    final TaskCompletionSource<String> f11543a;

    public e(TaskCompletionSource<String> taskCompletionSource) {
        this.f11543a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.g
    public boolean a(l9.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f11543a.trySetResult(dVar.d());
        return true;
    }

    @Override // com.google.firebase.installations.g
    public boolean b(Exception exc) {
        return false;
    }
}
