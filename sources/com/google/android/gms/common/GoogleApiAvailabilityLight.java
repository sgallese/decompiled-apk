package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public class GoogleApiAvailabilityLight {
    @KeepForSdk
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @KeepForSdk
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    @KeepForSdk
    static final String TRACKING_SOURCE_DIALOG = "d";
    @KeepForSdk
    static final String TRACKING_SOURCE_NOTIFICATION = "n";
    @KeepForSdk
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    private static final GoogleApiAvailabilityLight zza = new GoogleApiAvailabilityLight();

    /* JADX INFO: Access modifiers changed from: package-private */
    @KeepForSdk
    public GoogleApiAvailabilityLight() {
    }

    @KeepForSdk
    public static GoogleApiAvailabilityLight getInstance() {
        return zza;
    }

    @KeepForSdk
    public void cancelAvailabilityErrorNotifications(Context context) {
        GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(context);
    }

    @ShowFirstParty
    @KeepForSdk
    public int getApkVersion(Context context) {
        return GooglePlayServicesUtilLight.getApkVersion(context);
    }

    @ShowFirstParty
    @KeepForSdk
    public int getClientVersion(Context context) {
        return GooglePlayServicesUtilLight.getClientVersion(context);
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public Intent getErrorResolutionIntent(int i10) {
        return getErrorResolutionIntent(null, i10, null);
    }

    @KeepForSdk
    public PendingIntent getErrorResolutionPendingIntent(Context context, int i10, int i11) {
        return getErrorResolutionPendingIntent(context, i10, i11, null);
    }

    @KeepForSdk
    public String getErrorString(int i10) {
        return GooglePlayServicesUtilLight.getErrorString(i10);
    }

    @ResultIgnorabilityUnspecified
    @HideFirstParty
    @KeepForSdk
    public int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPlayServicesPossiblyUpdating(Context context, int i10) {
        return GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i10);
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPlayStorePossiblyUpdating(Context context, int i10) {
        return GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i10);
    }

    @KeepForSdk
    public boolean isUninstalledAppPossiblyUpdating(Context context, String str) {
        return GooglePlayServicesUtilLight.zza(context, str);
    }

    @KeepForSdk
    public boolean isUserResolvableError(int i10) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(i10);
    }

    @KeepForSdk
    public void verifyGooglePlayServicesIsAvailable(Context context, int i10) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context, i10);
    }

    @ShowFirstParty
    @KeepForSdk
    public Intent getErrorResolutionIntent(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        } else if (context != null && DeviceProperties.isWearableWithoutPlayStore(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("gcore_");
            sb2.append(GOOGLE_PLAY_SERVICES_VERSION_CODE);
            sb2.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb2.append(str);
            }
            sb2.append("-");
            if (context != null) {
                sb2.append(context.getPackageName());
            }
            sb2.append("-");
            if (context != null) {
                try {
                    sb2.append(Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            String sb3 = sb2.toString();
            Intent intent3 = new Intent("android.intent.action.VIEW");
            Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
            if (!TextUtils.isEmpty(sb3)) {
                appendQueryParameter.appendQueryParameter("pcampaignid", sb3);
            }
            intent3.setData(appendQueryParameter.build());
            intent3.setPackage("com.android.vending");
            intent3.addFlags(524288);
            return intent3;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public PendingIntent getErrorResolutionPendingIntent(Context context, int i10, int i11, String str) {
        Intent errorResolutionIntent = getErrorResolutionIntent(context, i10, str);
        if (errorResolutionIntent == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i11, errorResolutionIntent, com.google.android.gms.internal.common.zzd.zza | 134217728);
    }

    @KeepForSdk
    public int isGooglePlayServicesAvailable(Context context, int i10) {
        int isGooglePlayServicesAvailable = GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i10);
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, isGooglePlayServicesAvailable)) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }
}