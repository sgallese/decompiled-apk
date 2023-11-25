package com.google.firebase.crashlytics.internal.common;

import com.google.auto.value.AutoValue;
import java.io.File;

/* compiled from: CrashlyticsReportWithSessionId.java */
@AutoValue
/* loaded from: classes3.dex */
public abstract class p {
    public static p a(r8.b0 b0Var, String str, File file) {
        return new b(b0Var, str, file);
    }

    public abstract r8.b0 b();

    public abstract File c();

    public abstract String d();
}
