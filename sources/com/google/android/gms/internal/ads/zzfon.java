package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfon {
    public static final int zza;
    public static final ClipData zzb;

    static {
        int i10;
        if (Build.VERSION.SDK_INT > 22) {
            i10 = 67108864;
        } else {
            i10 = 0;
        }
        zza = i10;
        zzb = ClipData.newIntent("", new Intent());
    }

    public static PendingIntent zza(Context context, int i10, Intent intent, int i11, int i12) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16 = true;
        if ((i11 & 88) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfri.zzf(z10, "Cannot set any dangerous parts of intent to be mutable.");
        if ((i11 & 1) != 0 && !zzb(0, 3)) {
            z11 = false;
        } else {
            z11 = true;
        }
        zzfri.zzf(z11, "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        if ((i11 & 2) != 0 && !zzb(0, 5)) {
            z12 = false;
        } else {
            z12 = true;
        }
        zzfri.zzf(z12, "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        if ((i11 & 4) != 0 && !zzb(0, 9)) {
            z13 = false;
        } else {
            z13 = true;
        }
        zzfri.zzf(z13, "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        if ((i11 & 128) != 0 && !zzb(0, 17)) {
            z14 = false;
        } else {
            z14 = true;
        }
        zzfri.zzf(z14, "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        if (intent.getComponent() != null) {
            z15 = true;
        } else {
            z15 = false;
        }
        zzfri.zzf(z15, "Must set component on Intent.");
        if (zzb(0, 1)) {
            zzfri.zzf(!zzb(i11, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            if (Build.VERSION.SDK_INT >= 23 && !zzb(i11, 67108864)) {
                z16 = false;
            }
            zzfri.zzf(z16, "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (Build.VERSION.SDK_INT < 23 || !zzb(i11, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!zzb(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!zzb(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!zzb(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!zzb(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(zzb);
            }
        }
        return PendingIntent.getService(context, 0, intent2, i11);
    }

    private static boolean zzb(int i10, int i11) {
        if ((i10 & i11) == i11) {
            return true;
        }
        return false;
    }
}
