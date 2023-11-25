package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzff;
import com.google.android.gms.internal.play_billing.zzfm;
import com.google.android.gms.internal.play_billing.zzfy;
import com.google.android.gms.internal.play_billing.zzfz;
import com.google.android.gms.internal.play_billing.zzgd;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
final class m implements k {

    /* renamed from: a  reason: collision with root package name */
    private final zzfm f9236a;

    /* renamed from: b  reason: collision with root package name */
    private final n f9237b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Context context, zzfm zzfmVar) {
        this.f9237b = new n(context);
        this.f9236a = zzfmVar;
    }

    @Override // com.android.billingclient.api.k
    public final void a(zzgd zzgdVar) {
        try {
            zzfy zzv = zzfz.zzv();
            zzfm zzfmVar = this.f9236a;
            if (zzfmVar != null) {
                zzv.zzk(zzfmVar);
            }
            zzv.zzl(zzgdVar);
            this.f9237b.a((zzfz) zzv.zzc());
        } catch (Throwable unused) {
            zzb.zzj("BillingLogger", "Unable to log.");
        }
    }

    @Override // com.android.billingclient.api.k
    public final void b(zzfb zzfbVar) {
        try {
            zzfy zzv = zzfz.zzv();
            zzfm zzfmVar = this.f9236a;
            if (zzfmVar != null) {
                zzv.zzk(zzfmVar);
            }
            zzv.zzi(zzfbVar);
            this.f9237b.a((zzfz) zzv.zzc());
        } catch (Throwable unused) {
            zzb.zzj("BillingLogger", "Unable to log.");
        }
    }

    @Override // com.android.billingclient.api.k
    public final void c(zzff zzffVar) {
        try {
            zzfy zzv = zzfz.zzv();
            zzfm zzfmVar = this.f9236a;
            if (zzfmVar != null) {
                zzv.zzk(zzfmVar);
            }
            zzv.zzj(zzffVar);
            this.f9237b.a((zzfz) zzv.zzc());
        } catch (Throwable unused) {
            zzb.zzj("BillingLogger", "Unable to log.");
        }
    }
}
