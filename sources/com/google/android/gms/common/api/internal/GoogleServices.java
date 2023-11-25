package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.R;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
@KeepForSdk
@Deprecated
/* loaded from: classes.dex */
public final class GoogleServices {
    private static final Object zza = new Object();
    private static GoogleServices zzb;
    private final String zzc;
    private final Status zzd;
    private final boolean zze;
    private final boolean zzf;

    @VisibleForTesting
    @KeepForSdk
    GoogleServices(String str, boolean z10) {
        this.zzc = str;
        this.zzd = Status.RESULT_SUCCESS;
        this.zze = z10;
        this.zzf = !z10;
    }

    @KeepForSdk
    private static GoogleServices checkInitialized(String str) {
        GoogleServices googleServices;
        synchronized (zza) {
            googleServices = zzb;
            if (googleServices == null) {
                throw new IllegalStateException("Initialize must be called before " + str + ".");
            }
        }
        return googleServices;
    }

    @VisibleForTesting
    @KeepForSdk
    static void clearInstanceForTest() {
        synchronized (zza) {
            zzb = null;
        }
    }

    @KeepForSdk
    public static String getGoogleAppId() {
        return checkInitialized("getGoogleAppId").zzc;
    }

    @KeepForSdk
    public static Status initialize(Context context) {
        Status status;
        Preconditions.checkNotNull(context, "Context must not be null.");
        synchronized (zza) {
            if (zzb == null) {
                zzb = new GoogleServices(context);
            }
            status = zzb.zzd;
        }
        return status;
    }

    @KeepForSdk
    public static boolean isMeasurementEnabled() {
        GoogleServices checkInitialized = checkInitialized("isMeasurementEnabled");
        if (checkInitialized.zzd.isSuccess() && checkInitialized.zze) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public static boolean isMeasurementExplicitlyDisabled() {
        return checkInitialized("isMeasurementExplicitlyDisabled").zzf;
    }

    @VisibleForTesting
    @KeepForSdk
    Status checkGoogleAppId(String str) {
        String str2 = this.zzc;
        if (str2 != null && !str2.equals(str)) {
            return new Status(10, "Initialize was called with two different Google App IDs.  Only the first app ID will be used: '" + this.zzc + "'.");
        }
        return Status.RESULT_SUCCESS;
    }

    @VisibleForTesting
    @KeepForSdk
    GoogleServices(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
        if (identifier != 0) {
            int integer = resources.getInteger(identifier);
            boolean z10 = integer == 0;
            r2 = integer != 0;
            this.zzf = z10;
        } else {
            this.zzf = false;
        }
        this.zze = r2;
        String zzb2 = zzah.zzb(context);
        zzb2 = zzb2 == null ? new StringResourceValueReader(context).getString("google_app_id") : zzb2;
        if (TextUtils.isEmpty(zzb2)) {
            this.zzd = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.zzc = null;
            return;
        }
        this.zzc = zzb2;
        this.zzd = Status.RESULT_SUCCESS;
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static Status initialize(Context context, String str, boolean z10) {
        Preconditions.checkNotNull(context, "Context must not be null.");
        Preconditions.checkNotEmpty(str, "App ID must be nonempty.");
        synchronized (zza) {
            GoogleServices googleServices = zzb;
            if (googleServices != null) {
                return googleServices.checkGoogleAppId(str);
            }
            GoogleServices googleServices2 = new GoogleServices(str, z10);
            zzb = googleServices2;
            return googleServices2.zzd;
        }
    }
}
