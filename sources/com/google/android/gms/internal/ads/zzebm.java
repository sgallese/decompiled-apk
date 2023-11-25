package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzebm extends zzebn {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzcvm zzd;
    private final TelephonyManager zze;
    private final zzebe zzf;
    private int zzg;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzazr.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzazr zzazrVar = zzazr.CONNECTING;
        sparseArray.put(ordinal, zzazrVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzazrVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzazrVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzazr.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzazr zzazrVar2 = zzazr.DISCONNECTED;
        sparseArray.put(ordinal2, zzazrVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzazrVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzazrVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzazrVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzazrVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzazr.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzazrVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzazrVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzebm(Context context, zzcvm zzcvmVar, zzebe zzebeVar, zzeba zzebaVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzebaVar, zzgVar);
        this.zzc = context;
        this.zzd = zzcvmVar;
        this.zzf = zzebeVar;
        this.zze = (TelephonyManager) context.getSystemService("phone");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzazi zza(zzebm zzebmVar, Bundle bundle) {
        zzazb zza = zzazi.zza();
        int i10 = bundle.getInt("cnt", -2);
        int i11 = bundle.getInt("gnt", 0);
        int i12 = 2;
        if (i10 == -1) {
            zzebmVar.zzg = 2;
        } else {
            zzebmVar.zzg = 1;
            if (i10 != 0) {
                if (i10 != 1) {
                    zza.zzb(1);
                } else {
                    zza.zzb(3);
                }
            } else {
                zza.zzb(2);
            }
            switch (i11) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i12 = 3;
                    break;
                case 13:
                    i12 = 5;
                    break;
                default:
                    i12 = 1;
                    break;
            }
            zza.zza(i12);
        }
        return (zzazi) zza.zzal();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzazr zzb(zzebm zzebmVar, Bundle bundle) {
        return (zzazr) zzb.get(zzfcm.zza(zzfcm.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzazr.UNSPECIFIED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ byte[] zze(zzebm zzebmVar, boolean z10, ArrayList arrayList, zzazi zzaziVar, zzazr zzazrVar) {
        boolean z11;
        zzazm zzg = zzazn.zzg();
        zzg.zza(arrayList);
        boolean z12 = false;
        if (Settings.Global.getInt(zzebmVar.zzc.getContentResolver(), "airplane_mode_on", 0) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzg.zzi(zzg(z11));
        zzg.zzj(com.google.android.gms.ads.internal.zzt.zzq().zzj(zzebmVar.zzc, zzebmVar.zze));
        zzg.zzf(zzebmVar.zzf.zze());
        zzg.zze(zzebmVar.zzf.zzb());
        zzg.zzb(zzebmVar.zzf.zza());
        zzg.zzc(zzazrVar);
        zzg.zzd(zzaziVar);
        zzg.zzk(zzebmVar.zzg);
        zzg.zzl(zzg(z10));
        zzg.zzh(zzebmVar.zzf.zzd());
        zzg.zzg(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis());
        if (Settings.Global.getInt(zzebmVar.zzc.getContentResolver(), "wifi_on", 0) != 0) {
            z12 = true;
        }
        zzg.zzm(zzg(z12));
        return ((zzazn) zzg.zzal()).zzax();
    }

    private static final int zzg(boolean z10) {
        if (z10) {
            return 2;
        }
        return 1;
    }

    public final void zzd(boolean z10) {
        zzfye.zzr(this.zzd.zzb(), new zzebl(this, z10), zzcan.zzf);
    }
}
