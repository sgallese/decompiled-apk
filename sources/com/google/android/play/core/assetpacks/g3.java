package com.google.android.play.core.assetpacks;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
abstract class g3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte[] f();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        if (c() == null) {
            return false;
        }
        return c().endsWith("/");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h() {
        if (a() == 0) {
            return true;
        }
        return false;
    }
}
