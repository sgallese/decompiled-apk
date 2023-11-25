package com.google.android.play.core.assetpacks;

import android.content.Context;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class q1 {

    /* renamed from: a  reason: collision with root package name */
    private static u7.a f10951a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized u7.a a(Context context) {
        u7.a aVar;
        synchronized (q1.class) {
            if (f10951a == null) {
                u0 u0Var = new u0(null);
                u0Var.b(new m3(x7.t.a(context)));
                f10951a = u0Var.a();
            }
            aVar = f10951a;
        }
        return aVar;
    }
}
