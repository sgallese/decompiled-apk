package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzavi {
    ByteArrayOutputStream zza = new ByteArrayOutputStream(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
    Base64OutputStream zzb = new Base64OutputStream(this.zza, 10);

    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.ByteArrayOutputStream, android.util.Base64OutputStream] */
    public final String toString() {
        try {
            this.zzb.close();
        } catch (IOException e10) {
            zzcaa.zzh("HashManager: Unable to convert to Base64.", e10);
        }
        try {
            this.zza.close();
            return this.zza.toString();
        } catch (IOException e11) {
            zzcaa.zzh("HashManager: Unable to convert to Base64.", e11);
            return "";
        } finally {
            this.zza = null;
            this.zzb = null;
        }
    }
}
