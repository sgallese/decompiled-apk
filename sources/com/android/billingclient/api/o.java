package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private boolean f9240a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ o(x5.e0 e0Var) {
    }

    public final o a() {
        this.f9240a = true;
        return this;
    }

    public final p b() {
        if (this.f9240a) {
            return new p(true, false, null);
        }
        throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
    }
}
