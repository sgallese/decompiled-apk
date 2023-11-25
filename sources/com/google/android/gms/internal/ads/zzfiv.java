package com.google.android.gms.internal.ads;

import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public enum zzfiv {
    CTV("ctv"),
    MOBILE("mobile"),
    OTHER(TaskSetupFragment.TYPE_OTHER);

    private final String zze;

    zzfiv(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
