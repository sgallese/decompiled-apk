package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public abstract class AssetPackState {
    public static AssetPackState h(String str, int i10, int i11, long j10, long j11, double d10, int i12, String str2, String str3) {
        return new i0(str, i10, i11, j10, j11, (int) Math.rint(100.0d * d10), i12, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AssetPackState i(Bundle bundle, String str, g1 g1Var, o2 o2Var, a0 a0Var) {
        int zza = a0Var.zza(bundle.getInt(v7.b.a("status", str)), str);
        int i10 = bundle.getInt(v7.b.a("error_code", str));
        long j10 = bundle.getLong(v7.b.a("bytes_downloaded", str));
        long j11 = bundle.getLong(v7.b.a("total_bytes_to_download", str));
        double a10 = g1Var.a(str);
        long j12 = bundle.getLong(v7.b.a("pack_version", str));
        long j13 = bundle.getLong(v7.b.a("pack_base_version", str));
        int i11 = 1;
        int i12 = 4;
        if (zza == 4) {
            if (j13 != 0 && j13 != j12) {
                i11 = 2;
            }
        } else {
            i12 = zza;
        }
        return h(str, i12, i10, j10, j11, a10, i11, bundle.getString(v7.b.a("pack_version_tag", str), String.valueOf(bundle.getInt("app_version_code"))), o2Var.a(str));
    }

    public abstract long a();

    public abstract int b();

    public abstract String c();

    public abstract int d();

    public abstract long e();

    public abstract int f();

    public abstract int g();

    public abstract String j();

    public abstract String k();
}
