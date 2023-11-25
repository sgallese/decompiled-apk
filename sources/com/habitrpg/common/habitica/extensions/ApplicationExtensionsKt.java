package com.habitrpg.common.habitica.extensions;

import android.app.Application;
import android.os.Build;
import q4.b;
import q4.g;
import qc.h;
import qc.q;
import t4.g0;
import t4.r;

/* compiled from: ApplicationExtensions.kt */
/* loaded from: classes4.dex */
public final class ApplicationExtensionsKt {
    public static final void setupCoil(Application application) {
        q.i(application, "<this>");
        g.a aVar = new g.a(application);
        boolean z10 = false;
        g.a f10 = aVar.b(false).f(false);
        b.a aVar2 = new b.a();
        h hVar = null;
        int i10 = 1;
        if (Build.VERSION.SDK_INT >= 28) {
            aVar2.a(new g0.a(z10, i10, hVar));
        } else {
            aVar2.a(new r.b(z10, i10, hVar));
        }
        q4.a.c(f10.d(aVar2.e()).c());
    }
}
