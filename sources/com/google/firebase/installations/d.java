package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: GetAuthTokenListener.java */
/* loaded from: classes3.dex */
class d implements g {

    /* renamed from: a  reason: collision with root package name */
    private final h f11541a;

    /* renamed from: b  reason: collision with root package name */
    private final TaskCompletionSource<f> f11542b;

    public d(h hVar, TaskCompletionSource<f> taskCompletionSource) {
        this.f11541a = hVar;
        this.f11542b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.g
    public boolean a(l9.d dVar) {
        if (dVar.k() && !this.f11541a.f(dVar)) {
            this.f11542b.setResult(f.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.installations.g
    public boolean b(Exception exc) {
        this.f11542b.trySetException(exc);
        return true;
    }
}
