package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzjx extends zzf {
    private final zzjw zza;
    private zzej zzb;
    private volatile Boolean zzc;
    private final zzap zzd;
    private final zzko zze;
    private final List zzf;
    private final zzap zzg;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzjx(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzf = new ArrayList();
        this.zze = new zzko(zzgdVar.zzax());
        this.zza = new zzjw(this);
        this.zzd = new zzjh(this, zzgdVar);
        this.zzg = new zzjj(this, zzgdVar);
    }

    private final zzq zzO(boolean z10) {
        Pair zza;
        this.zzt.zzay();
        zzek zzh = this.zzt.zzh();
        String str = null;
        if (z10) {
            zzet zzaA = this.zzt.zzaA();
            if (zzaA.zzt.zzm().zzb != null && (zza = zzaA.zzt.zzm().zzb.zza()) != null && zza != zzfi.zza) {
                str = String.valueOf(zza.second) + ":" + ((String) zza.first);
            }
        }
        return zzh.zzj(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzP() {
        zzg();
        this.zzt.zzaA().zzj().zzb("Processing queued up service tasks", Integer.valueOf(this.zzf.size()));
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                this.zzt.zzaA().zzd().zzb("Task exception while flushing queue", e10);
            }
        }
        this.zzf.clear();
        this.zzg.zzb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzQ() {
        zzg();
        this.zze.zzb();
        zzap zzapVar = this.zzd;
        this.zzt.zzf();
        zzapVar.zzd(((Long) zzeg.zzJ.zza(null)).longValue());
    }

    private final void zzR(Runnable runnable) throws IllegalStateException {
        zzg();
        if (zzL()) {
            runnable.run();
            return;
        }
        long size = this.zzf.size();
        this.zzt.zzf();
        if (size >= 1000) {
            this.zzt.zzaA().zzd().zza("Discarding data. Max runnable queue size reached");
            return;
        }
        this.zzf.add(runnable);
        this.zzg.zzd(60000L);
        zzr();
    }

    private final boolean zzS() {
        this.zzt.zzay();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzo(zzjx zzjxVar, ComponentName componentName) {
        zzjxVar.zzg();
        if (zzjxVar.zzb != null) {
            zzjxVar.zzb = null;
            zzjxVar.zzt.zzaA().zzj().zzb("Disconnected from device MeasurementService", componentName);
            zzjxVar.zzg();
            zzjxVar.zzr();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzA(zzaw zzawVar, String str) {
        Preconditions.checkNotNull(zzawVar);
        zzg();
        zza();
        zzS();
        zzR(new zzjm(this, true, zzO(true), this.zzt.zzi().zzo(zzawVar), zzawVar, str));
    }

    public final void zzB(com.google.android.gms.internal.measurement.zzcf zzcfVar, zzaw zzawVar, String str) {
        zzg();
        zza();
        if (this.zzt.zzv().zzo(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) != 0) {
            this.zzt.zzaA().zzk().zza("Not bundling data. Service unavailable or out of date");
            this.zzt.zzv().zzT(zzcfVar, new byte[0]);
            return;
        }
        zzR(new zzji(this, zzawVar, str, zzcfVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzC() {
        zzg();
        zza();
        zzq zzO = zzO(false);
        zzS();
        this.zzt.zzi().zzj();
        zzR(new zzjb(this, zzO));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzD(zzej zzejVar, AbstractSafeParcelable abstractSafeParcelable, zzq zzqVar) {
        int i10;
        zzg();
        zza();
        zzS();
        this.zzt.zzf();
        int i11 = 0;
        int i12 = 100;
        while (i11 < 1001 && i12 == 100) {
            ArrayList arrayList = new ArrayList();
            List zzi = this.zzt.zzi().zzi(100);
            if (zzi != null) {
                arrayList.addAll(zzi);
                i10 = zzi.size();
            } else {
                i10 = 0;
            }
            if (abstractSafeParcelable != null && i10 < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i13);
                if (abstractSafeParcelable2 instanceof zzaw) {
                    try {
                        zzejVar.zzk((zzaw) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e10) {
                        this.zzt.zzaA().zzd().zzb("Failed to send event to the service", e10);
                    }
                } else if (abstractSafeParcelable2 instanceof zzli) {
                    try {
                        zzejVar.zzt((zzli) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e11) {
                        this.zzt.zzaA().zzd().zzb("Failed to send user property to the service", e11);
                    }
                } else if (abstractSafeParcelable2 instanceof zzac) {
                    try {
                        zzejVar.zzn((zzac) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e12) {
                        this.zzt.zzaA().zzd().zzb("Failed to send conditional user property to the service", e12);
                    }
                } else {
                    this.zzt.zzaA().zzd().zza("Discarding data. Unrecognized parcel type.");
                }
            }
            i11++;
            i12 = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzE(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        zzg();
        zza();
        this.zzt.zzay();
        zzR(new zzjn(this, true, zzO(true), this.zzt.zzi().zzn(zzacVar), new zzac(zzacVar), zzacVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzF(boolean z10) {
        zzg();
        zza();
        if (z10) {
            zzS();
            this.zzt.zzi().zzj();
        }
        if (zzM()) {
            zzR(new zzjl(this, zzO(false)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzG(zzip zzipVar) {
        zzg();
        zza();
        zzR(new zzjf(this, zzipVar));
    }

    public final void zzH(Bundle bundle) {
        zzg();
        zza();
        zzR(new zzjg(this, zzO(false), bundle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzI() {
        zzg();
        zza();
        zzR(new zzjk(this, zzO(true)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @VisibleForTesting
    public final void zzJ(zzej zzejVar) {
        zzg();
        Preconditions.checkNotNull(zzejVar);
        this.zzb = zzejVar;
        zzQ();
        zzP();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzK(zzli zzliVar) {
        zzg();
        zza();
        zzS();
        zzR(new zzja(this, zzO(true), this.zzt.zzi().zzp(zzliVar), zzliVar));
    }

    public final boolean zzL() {
        zzg();
        zza();
        if (this.zzb != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzM() {
        zzg();
        zza();
        if (!zzN() || this.zzt.zzv().zzm() >= ((Integer) zzeg.zzah.zza(null)).intValue()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzN() {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjx.zzN():boolean");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean zzj() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzq() {
        zzg();
        zza();
        zzq zzO = zzO(true);
        this.zzt.zzi().zzk();
        zzR(new zzje(this, zzO));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzr() {
        zzg();
        zza();
        if (zzL()) {
            return;
        }
        if (!zzN()) {
            if (!this.zzt.zzf().zzx()) {
                this.zzt.zzay();
                List<ResolveInfo> queryIntentServices = this.zzt.zzaw().getPackageManager().queryIntentServices(new Intent().setClassName(this.zzt.zzaw(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    Context zzaw = this.zzt.zzaw();
                    this.zzt.zzay();
                    intent.setComponent(new ComponentName(zzaw, "com.google.android.gms.measurement.AppMeasurementService"));
                    this.zza.zzb(intent);
                    return;
                }
                this.zzt.zzaA().zzd().zza("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                return;
            }
            return;
        }
        this.zza.zzc();
    }

    public final void zzs() {
        zzg();
        zza();
        this.zza.zzd();
        try {
            ConnectionTracker.getInstance().unbindService(this.zzt.zzaw(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzb = null;
    }

    public final void zzt(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzg();
        zza();
        zzR(new zzjd(this, zzO(false), zzcfVar));
    }

    public final void zzu(AtomicReference atomicReference) {
        zzg();
        zza();
        zzR(new zzjc(this, atomicReference, zzO(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzv(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2) {
        zzg();
        zza();
        zzR(new zzjp(this, str, str2, zzO(false), zzcfVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzw(AtomicReference atomicReference, String str, String str2, String str3) {
        zzg();
        zza();
        zzR(new zzjo(this, atomicReference, null, str2, str3, zzO(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzx(AtomicReference atomicReference, boolean z10) {
        zzg();
        zza();
        zzR(new zziz(this, atomicReference, zzO(false), z10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzy(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2, boolean z10) {
        zzg();
        zza();
        zzR(new zziy(this, str, str2, zzO(false), z10, zzcfVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzz(AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        zzg();
        zza();
        zzR(new zzjq(this, atomicReference, null, str2, str3, zzO(false), z10));
    }
}
