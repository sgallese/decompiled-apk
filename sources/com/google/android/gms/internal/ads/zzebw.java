package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzebw {
    private final zzaxe zza;
    private final Context zzb;
    private final zzeba zzc;
    private final zzcag zzd;
    private final String zze;
    private final zzfgo zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzg = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzebw(Context context, zzcag zzcagVar, zzaxe zzaxeVar, zzeba zzebaVar, String str, zzfgo zzfgoVar) {
        this.zzb = context;
        this.zzd = zzcagVar;
        this.zza = zzaxeVar;
        this.zzc = zzebaVar;
        this.zze = str;
        this.zzf = zzfgoVar;
    }

    private static final void zzc(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            zzazn zzaznVar = (zzazn) arrayList.get(i10);
            if (zzaznVar.zzw() == 2 && zzaznVar.zze() > j10) {
                j10 = zzaznVar.zze();
            }
        }
        if (j10 != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(j10));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Void zza(boolean z10, SQLiteDatabase sQLiteDatabase) throws Exception {
        String str;
        String str2;
        String str3;
        if (z10) {
            this.zzb.deleteDatabase("OfflineUpload.db");
            return null;
        }
        int i10 = 2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzil)).booleanValue()) {
            zzfgn zzb = zzfgn.zzb("oa_upload");
            zzb.zza("oa_failed_reqs", String.valueOf(zzebp.zza(sQLiteDatabase, 0)));
            zzb.zza("oa_total_reqs", String.valueOf(zzebp.zza(sQLiteDatabase, 1)));
            zzb.zza("oa_upload_time", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            zzb.zza("oa_last_successful_time", String.valueOf(zzebp.zzb(sQLiteDatabase, 2)));
            if (this.zzg.zzQ()) {
                str = "";
            } else {
                str = this.zze;
            }
            zzb.zza("oa_session_id", str);
            this.zzf.zzb(zzb);
            ArrayList zzc = zzebp.zzc(sQLiteDatabase);
            zzc(sQLiteDatabase, zzc);
            int size = zzc.size();
            for (int i11 = 0; i11 < size; i11++) {
                zzazn zzaznVar = (zzazn) zzc.get(i11);
                zzfgn zzb2 = zzfgn.zzb("oa_signals");
                if (this.zzg.zzQ()) {
                    str2 = "";
                } else {
                    str2 = this.zze;
                }
                zzb2.zza("oa_session_id", str2);
                zzazi zzf = zzaznVar.zzf();
                if (zzf.zzf()) {
                    str3 = String.valueOf(zzf.zzh() - 1);
                } else {
                    str3 = "-1";
                }
                String obj = zzfur.zzb(zzaznVar.zzk(), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzebv
                    @Override // com.google.android.gms.internal.ads.zzfqw
                    public final Object apply(Object obj2) {
                        return ((zzayc) obj2).name();
                    }
                }).toString();
                zzb2.zza("oa_sig_ts", String.valueOf(zzaznVar.zze()));
                zzb2.zza("oa_sig_status", String.valueOf(zzaznVar.zzw() - 1));
                zzb2.zza("oa_sig_resp_lat", String.valueOf(zzaznVar.zzd()));
                zzb2.zza("oa_sig_render_lat", String.valueOf(zzaznVar.zzc()));
                zzb2.zza("oa_sig_formats", obj);
                zzb2.zza("oa_sig_nw_type", str3);
                zzb2.zza("oa_sig_wifi", String.valueOf(zzaznVar.zzx() - 1));
                zzb2.zza("oa_sig_airplane", String.valueOf(zzaznVar.zzt() - 1));
                zzb2.zza("oa_sig_data", String.valueOf(zzaznVar.zzu() - 1));
                zzb2.zza("oa_sig_nw_resp", String.valueOf(zzaznVar.zza()));
                zzb2.zza("oa_sig_offline", String.valueOf(zzaznVar.zzv() - 1));
                zzb2.zza("oa_sig_nw_state", String.valueOf(zzaznVar.zzj().zza()));
                if (zzf.zze() && zzf.zzf() && zzf.zzh() == 2) {
                    zzb2.zza("oa_sig_cell_type", String.valueOf(zzf.zzg() - 1));
                }
                this.zzf.zzb(zzb2);
            }
        } else {
            ArrayList zzc2 = zzebp.zzc(sQLiteDatabase);
            zzazo zza = zzazs.zza();
            zza.zzb(this.zzb.getPackageName());
            zza.zzd(Build.MODEL);
            zza.zze(zzebp.zza(sQLiteDatabase, 0));
            zza.zza(zzc2);
            zza.zzg(zzebp.zza(sQLiteDatabase, 1));
            zza.zzc(zzebp.zza(sQLiteDatabase, 3));
            zza.zzh(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis());
            zza.zzf(zzebp.zzb(sQLiteDatabase, 2));
            final zzazs zzazsVar = (zzazs) zza.zzal();
            zzc(sQLiteDatabase, zzc2);
            this.zza.zzb(new zzaxd() { // from class: com.google.android.gms.internal.ads.zzebt
                @Override // com.google.android.gms.internal.ads.zzaxd
                public final void zza(zzayt zzaytVar) {
                    zzaytVar.zzi(zzazs.this);
                }
            });
            zzbad zza2 = zzbae.zza();
            zza2.zza(this.zzd.zzb);
            zza2.zzc(this.zzd.zzc);
            if (true == this.zzd.zzd) {
                i10 = 0;
            }
            zza2.zzb(i10);
            final zzbae zzbaeVar = (zzbae) zza2.zzal();
            this.zza.zzb(new zzaxd() { // from class: com.google.android.gms.internal.ads.zzebu
                @Override // com.google.android.gms.internal.ads.zzaxd
                public final void zza(zzayt zzaytVar) {
                    zzbae zzbaeVar2 = zzbae.this;
                    zzayl zzaylVar = (zzayl) zzaytVar.zzb().zzaB();
                    zzaylVar.zzb(zzbaeVar2);
                    zzaytVar.zzg(zzaylVar);
                }
            });
            this.zza.zzc(10004);
        }
        zzebp.zzf(sQLiteDatabase);
        return null;
    }

    public final void zzb(final boolean z10) {
        try {
            this.zzc.zza(new zzffh() { // from class: com.google.android.gms.internal.ads.zzebs
                @Override // com.google.android.gms.internal.ads.zzffh
                public final Object zza(Object obj) {
                    zzebw.this.zza(z10, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e10) {
            zzcaa.zzg("Error in offline signals database startup: ".concat(String.valueOf(e10.getMessage())));
        }
    }
}
