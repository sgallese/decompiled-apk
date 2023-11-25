package com.habitrpg.shared.habitica;

import android.os.Build;

/* compiled from: Platform.kt */
/* loaded from: classes4.dex */
public final class Platform {
    private final String platform = "Android " + Build.VERSION.SDK_INT;

    public final String getPlatform() {
        return this.platform;
    }
}
