package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class g1 {

    /* renamed from: a  reason: collision with root package name */
    private final Map f10820a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized double a(String str) {
        Double d10 = (Double) this.f10820a.get(str);
        if (d10 == null) {
            return 0.0d;
        }
        return d10.doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized double b(String str, x1 x1Var) {
        double d10;
        d10 = (((w0) x1Var).f11058h + 1.0d) / ((w0) x1Var).f11059i;
        this.f10820a.put(str, Double.valueOf(d10));
        return d10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(String str) {
        this.f10820a.put(str, Double.valueOf(0.0d));
    }
}
