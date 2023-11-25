package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzam extends zzks {
    private static final String[] zza = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzb = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzc = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;"};
    private static final String[] zzd = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zze = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzg = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final zzal zzj;
    private final zzko zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzam(zzlf zzlfVar) {
        super(zzlfVar);
        this.zzk = new zzko(this.zzt.zzax());
        this.zzt.zzf();
        this.zzj = new zzal(this, this.zzt.zzaw(), "google_app_measurement.db");
    }

    static final void zzV(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    private final long zzZ(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = zzh().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j10 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j10;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e10) {
                this.zzt.zzaA().zzd().zzc("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long zzaa(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            try {
                cursor = zzh().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    long j11 = cursor.getLong(0);
                    cursor.close();
                    return j11;
                }
                cursor.close();
                return j10;
            } catch (SQLiteException e10) {
                this.zzt.zzaA().zzd().zzc("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void zzA(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            zzh().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.zzt.zzaA().zzd().zzd("Error deleting user property. appId", zzet.zzn(str), this.zzt.zzj().zzf(str2), e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0345, code lost:
    
        if (zzh().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0347, code lost:
    
        r23.zzt.zzaA().zzd().zzb("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.zzet.zzn(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x035b, code lost:
    
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x035f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0360, code lost:
    
        r23.zzt.zzaA().zzd().zzc("Error storing property filter. appId", com.google.android.gms.measurement.internal.zzet.zzn(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0373, code lost:
    
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        r0 = zzh();
        r3 = r17;
        r0.delete("property_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r17 = r3;
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03aa, code lost:
    
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0178, code lost:
    
        r11 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0184, code lost:
    
        if (r11.hasNext() == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0190, code lost:
    
        if (((com.google.android.gms.internal.measurement.zzet) r11.next()).zzj() != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0192, code lost:
    
        r23.zzt.zzaA().zzk().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.zzet.zzn(r24), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ab, code lost:
    
        r11 = r0.zzg().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c1, code lost:
    
        if (r11.hasNext() == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c3, code lost:
    
        r12 = (com.google.android.gms.internal.measurement.zzek) r11.next();
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01dd, code lost:
    
        if (r12.zzg().isEmpty() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01df, code lost:
    
        r0 = r23.zzt.zzaA().zzk();
        r9 = com.google.android.gms.measurement.internal.zzet.zzn(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01f7, code lost:
    
        if (r12.zzp() == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f9, code lost:
    
        r20 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0204, code lost:
    
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0206, code lost:
    
        r0.zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r20));
        r21 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0211, code lost:
    
        r3 = r12.zzbx();
        r21 = r7;
        r7 = new android.content.ContentValues();
        r7.put("app_id", r24);
        r7.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x022a, code lost:
    
        if (r12.zzp() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x022c, code lost:
    
        r9 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0235, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0236, code lost:
    
        r7.put("filter_id", r9);
        r7.put("event_name", r12.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0246, code lost:
    
        if (r12.zzq() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0248, code lost:
    
        r9 = java.lang.Boolean.valueOf(r12.zzn());
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0251, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0252, code lost:
    
        r7.put("session_scoped", r9);
        r7.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0266, code lost:
    
        if (zzh().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0268, code lost:
    
        r23.zzt.zzaA().zzd().zzb("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.zzet.zzn(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x027b, code lost:
    
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0281, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0282, code lost:
    
        r23.zzt.zzaA().zzd().zzc("Error storing event filter. appId", com.google.android.gms.measurement.internal.zzet.zzn(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0297, code lost:
    
        r21 = r7;
        r0 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02a5, code lost:
    
        if (r0.hasNext() == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02a7, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.zzet) r0.next();
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02c1, code lost:
    
        if (r3.zze().isEmpty() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02c3, code lost:
    
        r0 = r23.zzt.zzaA().zzk();
        r8 = com.google.android.gms.measurement.internal.zzet.zzn(r24);
        r9 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02db, code lost:
    
        if (r3.zzj() == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02dd, code lost:
    
        r3 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02e6, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02e7, code lost:
    
        r0.zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r9, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02f0, code lost:
    
        r7 = r3.zzbx();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r24);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0307, code lost:
    
        if (r3.zzj() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0309, code lost:
    
        r12 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0312, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0313, code lost:
    
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.zze());
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0325, code lost:
    
        if (r3.zzk() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0327, code lost:
    
        r0 = java.lang.Boolean.valueOf(r3.zzi());
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0330, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0331, code lost:
    
        r11.put("session_scoped", r0);
        r11.put("data", r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzB(java.lang.String r24, java.util.List r25) {
        /*
            Method dump skipped, instructions count: 1174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.zzB(java.lang.String, java.util.List):void");
    }

    public final void zzC() {
        zzW();
        zzh().setTransactionSuccessful();
    }

    public final void zzD(zzh zzhVar) {
        Preconditions.checkNotNull(zzhVar);
        zzg();
        zzW();
        String zzu = zzhVar.zzu();
        Preconditions.checkNotNull(zzu);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzu);
        contentValues.put("app_instance_id", zzhVar.zzv());
        contentValues.put("gmp_app_id", zzhVar.zzz());
        contentValues.put("resettable_device_id_hash", zzhVar.zzB());
        contentValues.put("last_bundle_index", Long.valueOf(zzhVar.zzo()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzhVar.zzp()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzhVar.zzn()));
        contentValues.put("app_version", zzhVar.zzx());
        contentValues.put("app_store", zzhVar.zzw());
        contentValues.put("gmp_version", Long.valueOf(zzhVar.zzm()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzhVar.zzj()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzhVar.zzal()));
        contentValues.put("day", Long.valueOf(zzhVar.zzi()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzhVar.zzg()));
        contentValues.put("daily_events_count", Long.valueOf(zzhVar.zzf()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzhVar.zzd()));
        contentValues.put("config_fetched_time", Long.valueOf(zzhVar.zzc()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzhVar.zzl()));
        contentValues.put("app_version_int", Long.valueOf(zzhVar.zzb()));
        contentValues.put("firebase_instance_id", zzhVar.zzy());
        contentValues.put("daily_error_events_count", Long.valueOf(zzhVar.zze()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzhVar.zzh()));
        contentValues.put("health_monitor_sample", zzhVar.zzA());
        zzhVar.zza();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzhVar.zzak()));
        contentValues.put("admob_app_id", zzhVar.zzs());
        contentValues.put("dynamite_version", Long.valueOf(zzhVar.zzk()));
        contentValues.put("session_stitching_token", zzhVar.zzC());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(zzhVar.zzan()));
        contentValues.put("target_os_version", Long.valueOf(zzhVar.zzq()));
        List zzD = zzhVar.zzD();
        if (zzD != null) {
            if (zzD.isEmpty()) {
                this.zzt.zzaA().zzk().zzb("Safelisted events should not be an empty list. appId", zzu);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", zzD));
            }
        }
        zzop.zzc();
        if (this.zzt.zzf().zzs(null, zzeg.zzak) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase zzh2 = zzh();
            if (zzh2.update("apps", contentValues, "app_id = ?", new String[]{zzu}) == 0 && zzh2.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert/update app (got -1). appId", zzet.zzn(zzu));
            }
        } catch (SQLiteException e10) {
            this.zzt.zzaA().zzd().zzc("Error storing app. appId", zzet.zzn(zzu), e10);
        }
    }

    public final void zzE(zzas zzasVar) {
        Long l10;
        Preconditions.checkNotNull(zzasVar);
        zzg();
        zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzasVar.zza);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzasVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzasVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzasVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzasVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzasVar.zzg));
        contentValues.put("last_bundled_day", zzasVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzasVar.zzi);
        contentValues.put("last_sampling_rate", zzasVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzasVar.zze));
        Boolean bool = zzasVar.zzk;
        if (bool != null && bool.booleanValue()) {
            l10 = 1L;
        } else {
            l10 = null;
        }
        contentValues.put("last_exempt_from_sampling", l10);
        try {
            if (zzh().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert/update event aggregates (got -1). appId", zzet.zzn(zzasVar.zza));
            }
        } catch (SQLiteException e10) {
            this.zzt.zzaA().zzd().zzc("Error storing event aggregates. appId", zzet.zzn(zzasVar.zza), e10);
        }
    }

    public final boolean zzF() {
        if (zzZ("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzG() {
        if (zzZ("select count(1) > 0 from queue where has_realtime = 1", null) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzH() {
        if (zzZ("select count(1) > 0 from raw_events where realtime = 1", null) != 0) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    protected final boolean zzI() {
        Context zzaw = this.zzt.zzaw();
        this.zzt.zzf();
        return zzaw.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean zzJ(String str, Long l10, long j10, com.google.android.gms.internal.measurement.zzft zzftVar) {
        zzg();
        zzW();
        Preconditions.checkNotNull(zzftVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l10);
        byte[] zzbx = zzftVar.zzbx();
        this.zzt.zzaA().zzj().zzc("Saving complex main event, appId, data size", this.zzt.zzj().zzd(str), Integer.valueOf(zzbx.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", zzbx);
        try {
            if (zzh().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert complex main event (got -1). appId", zzet.zzn(str));
                return false;
            }
            return true;
        } catch (SQLiteException e10) {
            this.zzt.zzaA().zzd().zzc("Error storing complex main event. appId", zzet.zzn(str), e10);
            return false;
        }
    }

    public final boolean zzK(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        zzg();
        zzW();
        String str = zzacVar.zza;
        Preconditions.checkNotNull(str);
        if (zzp(str, zzacVar.zzc.zzb) == null) {
            long zzZ = zzZ("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.zzt.zzf();
            if (zzZ >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzacVar.zzb);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzacVar.zzc.zzb);
        zzV(contentValues, AppMeasurementSdk.ConditionalUserProperty.VALUE, Preconditions.checkNotNull(zzacVar.zzc.zza()));
        contentValues.put("active", Boolean.valueOf(zzacVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzacVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzacVar.zzh));
        contentValues.put("timed_out_event", this.zzt.zzv().zzap(zzacVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzacVar.zzd));
        contentValues.put("triggered_event", this.zzt.zzv().zzap(zzacVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzacVar.zzc.zzc));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzacVar.zzj));
        contentValues.put("expired_event", this.zzt.zzv().zzap(zzacVar.zzk));
        try {
            if (zzh().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert/update conditional user property (got -1)", zzet.zzn(str));
                return true;
            }
            return true;
        } catch (SQLiteException e10) {
            this.zzt.zzaA().zzd().zzc("Error storing conditional user property", zzet.zzn(str), e10);
            return true;
        }
    }

    public final boolean zzL(zzlk zzlkVar) {
        Preconditions.checkNotNull(zzlkVar);
        zzg();
        zzW();
        if (zzp(zzlkVar.zza, zzlkVar.zzc) == null) {
            if (zzln.zzak(zzlkVar.zzc)) {
                if (zzZ("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzlkVar.zza}) >= this.zzt.zzf().zzf(zzlkVar.zza, zzeg.zzG, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(zzlkVar.zzc)) {
                long zzZ = zzZ("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzlkVar.zza, zzlkVar.zzb});
                this.zzt.zzf();
                if (zzZ >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzlkVar.zza);
        contentValues.put("origin", zzlkVar.zzb);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzlkVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zzlkVar.zzd));
        zzV(contentValues, AppMeasurementSdk.ConditionalUserProperty.VALUE, zzlkVar.zze);
        try {
            if (zzh().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert/update user property (got -1). appId", zzet.zzn(zzlkVar.zza));
                return true;
            }
            return true;
        } catch (SQLiteException e10) {
            this.zzt.zzaA().zzd().zzc("Error storing user property. appId", zzet.zzn(zzlkVar.zza), e10);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x022a: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:555), block:B:99:0x022a */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void zzU(String str, long j10, long j11, zzlc zzlcVar) {
        ?? r42;
        Cursor cursor;
        String[] strArr;
        Cursor rawQuery;
        String string;
        String str2;
        String[] strArr2;
        String[] strArr3;
        Preconditions.checkNotNull(zzlcVar);
        zzg();
        zzW();
        Cursor cursor2 = null;
        r3 = null;
        r3 = null;
        String str3 = null;
        try {
            try {
                SQLiteDatabase zzh2 = zzh();
                r42 = TextUtils.isEmpty(null);
                String str4 = "";
                try {
                    if (r42 != 0) {
                        if (j11 != -1) {
                            strArr3 = new String[]{String.valueOf(j11), String.valueOf(j10)};
                        } else {
                            strArr3 = new String[]{String.valueOf(j10)};
                        }
                        if (j11 != -1) {
                            str4 = "rowid <= ? and ";
                        }
                        rawQuery = zzh2.rawQuery("select app_id, metadata_fingerprint from raw_events where " + str4 + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", strArr3);
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        }
                        str3 = rawQuery.getString(0);
                        string = rawQuery.getString(1);
                        rawQuery.close();
                    } else {
                        if (j11 != -1) {
                            strArr = new String[]{null, String.valueOf(j11)};
                        } else {
                            strArr = new String[]{null};
                        }
                        if (j11 != -1) {
                            str4 = " and rowid <= ?";
                        }
                        rawQuery = zzh2.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + str4 + " order by rowid limit 1;", strArr);
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        } else {
                            string = rawQuery.getString(0);
                            rawQuery.close();
                        }
                    }
                    Cursor cursor3 = rawQuery;
                    String str5 = string;
                    try {
                        String str6 = str5;
                        Cursor query = zzh2.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, str5}, null, null, "rowid", "2");
                        try {
                            if (!query.moveToFirst()) {
                                this.zzt.zzaA().zzd().zzb("Raw event metadata record is missing. appId", zzet.zzn(str3));
                                query.close();
                                return;
                            }
                            try {
                                try {
                                    com.google.android.gms.internal.measurement.zzgd zzgdVar = (com.google.android.gms.internal.measurement.zzgd) ((com.google.android.gms.internal.measurement.zzgc) zzlh.zzl(com.google.android.gms.internal.measurement.zzgd.zzu(), query.getBlob(0))).zzaD();
                                    if (query.moveToNext()) {
                                        this.zzt.zzaA().zzk().zzb("Get multiple raw event metadata records, expected one. appId", zzet.zzn(str3));
                                    }
                                    query.close();
                                    Preconditions.checkNotNull(zzgdVar);
                                    zzlcVar.zza = zzgdVar;
                                    if (j11 != -1) {
                                        str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr2 = new String[]{str3, str6, String.valueOf(j11)};
                                    } else {
                                        str2 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr2 = new String[]{str3, str6};
                                    }
                                    Cursor query2 = zzh2.query("raw_events", new String[]{"rowid", AppMeasurementSdk.ConditionalUserProperty.NAME, "timestamp", "data"}, str2, strArr2, null, null, "rowid", null);
                                    if (!query2.moveToFirst()) {
                                        this.zzt.zzaA().zzk().zzb("Raw event data disappeared while in transaction. appId", zzet.zzn(str3));
                                        query2.close();
                                        return;
                                    }
                                    do {
                                        long j12 = query2.getLong(0);
                                        try {
                                            com.google.android.gms.internal.measurement.zzfs zzfsVar = (com.google.android.gms.internal.measurement.zzfs) zzlh.zzl(com.google.android.gms.internal.measurement.zzft.zze(), query2.getBlob(3));
                                            zzfsVar.zzi(query2.getString(1));
                                            zzfsVar.zzm(query2.getLong(2));
                                            if (!zzlcVar.zza(j12, (com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaD())) {
                                                query2.close();
                                                return;
                                            }
                                        } catch (IOException e10) {
                                            this.zzt.zzaA().zzd().zzc("Data loss. Failed to merge raw event. appId", zzet.zzn(str3), e10);
                                        }
                                    } while (query2.moveToNext());
                                    query2.close();
                                } catch (IOException e11) {
                                    this.zzt.zzaA().zzd().zzc("Data loss. Failed to merge raw event metadata. appId", zzet.zzn(str3), e11);
                                    query.close();
                                }
                            } catch (SQLiteException e12) {
                                e = e12;
                                r42 = str6;
                                this.zzt.zzaA().zzd().zzc("Data loss. Error selecting raw event. appId", zzet.zzn(str3), e);
                                if (r42 != 0) {
                                    r42.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = str6;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e13) {
                            e = e13;
                            str6 = query;
                        } catch (Throwable th2) {
                            th = th2;
                            str6 = query;
                        }
                    } catch (SQLiteException e14) {
                        e = e14;
                        r42 = cursor3;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e15) {
                    e = e15;
                }
            } catch (Throwable th4) {
                th = th4;
                cursor2 = cursor;
            }
        } catch (SQLiteException e16) {
            e = e16;
            r42 = 0;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            return zzh().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.zzt.zzaA().zzd().zzd("Error deleting conditional property", zzet.zzn(str), this.zzt.zzj().zzf(str2), e10);
            return 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzks
    protected final boolean zzb() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @VisibleForTesting
    public final long zzc(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        zzg();
        zzW();
        SQLiteDatabase zzh2 = zzh();
        zzh2.beginTransaction();
        long j10 = 0;
        try {
            try {
                long zzaa = zzaa("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (zzaa == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (zzh2.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        this.zzt.zzaA().zzd().zzc("Failed to insert column (got -1). appId", zzet.zzn(str), "first_open_count");
                        return -1L;
                    }
                    zzaa = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", Long.valueOf(1 + zzaa));
                    if (zzh2.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        this.zzt.zzaA().zzd().zzc("Failed to update column (got 0). appId", zzet.zzn(str), "first_open_count");
                        return -1L;
                    }
                    zzh2.setTransactionSuccessful();
                    return zzaa;
                } catch (SQLiteException e10) {
                    e = e10;
                    j10 = zzaa;
                    this.zzt.zzaA().zzd().zzd("Error inserting column. appId", zzet.zzn(str), "first_open_count", e);
                    zzh2.endTransaction();
                    return j10;
                }
            } finally {
                zzh2.endTransaction();
            }
        } catch (SQLiteException e11) {
            e = e11;
        }
    }

    public final long zzd() {
        return zzaa("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long zze() {
        return zzaa("select max(timestamp) from raw_events", null, 0L);
    }

    public final long zzf(String str) {
        Preconditions.checkNotEmpty(str);
        return zzaa("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final SQLiteDatabase zzh() {
        zzg();
        try {
            return this.zzj.getWritableDatabase();
        } catch (SQLiteException e10) {
            this.zzt.zzaA().zzk().zzb("Error opening database", e10);
            throw e10;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d5: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:214), block:B:45:0x00d5 */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle zzi(java.lang.String r8) {
        /*
            r7 = this;
            r7.zzg()
            r7.zzW()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.zzh()     // Catch: java.lang.Throwable -> Lbb android.database.sqlite.SQLiteException -> Lbd
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> Lbb android.database.sqlite.SQLiteException -> Lbd
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> Lbb android.database.sqlite.SQLiteException -> Lbd
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            if (r2 != 0) goto L2e
            com.google.android.gms.measurement.internal.zzgd r8 = r7.zzt     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.zzet r8 = r8.zzaA()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.zzer r8 = r8.zzj()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            java.lang.String r2 = "Default event parameters not found"
            r8.zza(r2)     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r1.close()
            return r0
        L2e:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.internal.measurement.zzfs r3 = com.google.android.gms.internal.measurement.zzft.zze()     // Catch: java.io.IOException -> La1 android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.internal.measurement.zzmh r2 = com.google.android.gms.measurement.internal.zzlh.zzl(r3, r2)     // Catch: java.io.IOException -> La1 android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.internal.measurement.zzfs r2 = (com.google.android.gms.internal.measurement.zzfs) r2     // Catch: java.io.IOException -> La1 android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.internal.measurement.zzlb r2 = r2.zzaD()     // Catch: java.io.IOException -> La1 android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.internal.measurement.zzft r2 = (com.google.android.gms.internal.measurement.zzft) r2     // Catch: java.io.IOException -> La1 android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.zzlf r8 = r7.zzf     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r8.zzu()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            java.util.List r8 = r2.zzi()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            android.os.Bundle r2 = new android.os.Bundle     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            java.util.Iterator r8 = r8.iterator()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
        L55:
            boolean r3 = r8.hasNext()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            if (r3 == 0) goto L9d
            java.lang.Object r3 = r8.next()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.internal.measurement.zzfx r3 = (com.google.android.gms.internal.measurement.zzfx) r3     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            java.lang.String r4 = r3.zzg()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            boolean r5 = r3.zzu()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            if (r5 == 0) goto L73
            double r5 = r3.zza()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r2.putDouble(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            goto L55
        L73:
            boolean r5 = r3.zzv()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            if (r5 == 0) goto L81
            float r3 = r3.zzb()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r2.putFloat(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            goto L55
        L81:
            boolean r5 = r3.zzy()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            if (r5 == 0) goto L8f
            java.lang.String r3 = r3.zzh()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r2.putString(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            goto L55
        L8f:
            boolean r5 = r3.zzw()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            if (r5 == 0) goto L55
            long r5 = r3.zzd()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r2.putLong(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            goto L55
        L9d:
            r1.close()
            return r2
        La1:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzgd r3 = r7.zzt     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.zzet r3 = r3.zzaA()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.zzer r3 = r3.zzd()     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzet.zzn(r8)     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r3.zzc(r4, r8, r2)     // Catch: android.database.sqlite.SQLiteException -> Lb9 java.lang.Throwable -> Ld4
            r1.close()
            return r0
        Lb9:
            r8 = move-exception
            goto Lbf
        Lbb:
            r8 = move-exception
            goto Ld6
        Lbd:
            r8 = move-exception
            r1 = r0
        Lbf:
            com.google.android.gms.measurement.internal.zzgd r2 = r7.zzt     // Catch: java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.zzet r2 = r2.zzaA()     // Catch: java.lang.Throwable -> Ld4
            com.google.android.gms.measurement.internal.zzer r2 = r2.zzd()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r3 = "Error selecting default event parameters"
            r2.zzb(r3, r8)     // Catch: java.lang.Throwable -> Ld4
            if (r1 == 0) goto Ld3
            r1.close()
        Ld3:
            return r0
        Ld4:
            r8 = move-exception
            r0 = r1
        Ld6:
            if (r0 == 0) goto Ldb
            r0.close()
        Ldb:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.zzi(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x02bd: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:702), block:B:65:0x02bd */
    /* JADX WARN: Removed duplicated region for block: B:17:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01a2 A[Catch: SQLiteException -> 0x029d, all -> 0x02bc, TryCatch #1 {all -> 0x02bc, blocks: (B:4:0x00e9, B:8:0x00f3, B:10:0x0153, B:15:0x015d, B:19:0x01a7, B:21:0x01d6, B:26:0x01e0, B:30:0x01fb, B:32:0x0206, B:33:0x0218, B:35:0x0229, B:38:0x0240, B:40:0x0251, B:42:0x0259, B:45:0x0260, B:46:0x0263, B:48:0x0274, B:49:0x027d, B:51:0x0286, B:37:0x0237, B:29:0x01f7, B:18:0x01a2, B:60:0x02a3), top: B:69:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01f7 A[Catch: SQLiteException -> 0x029d, all -> 0x02bc, TryCatch #1 {all -> 0x02bc, blocks: (B:4:0x00e9, B:8:0x00f3, B:10:0x0153, B:15:0x015d, B:19:0x01a7, B:21:0x01d6, B:26:0x01e0, B:30:0x01fb, B:32:0x0206, B:33:0x0218, B:35:0x0229, B:38:0x0240, B:40:0x0251, B:42:0x0259, B:45:0x0260, B:46:0x0263, B:48:0x0274, B:49:0x027d, B:51:0x0286, B:37:0x0237, B:29:0x01f7, B:18:0x01a2, B:60:0x02a3), top: B:69:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0206 A[Catch: SQLiteException -> 0x029d, all -> 0x02bc, TryCatch #1 {all -> 0x02bc, blocks: (B:4:0x00e9, B:8:0x00f3, B:10:0x0153, B:15:0x015d, B:19:0x01a7, B:21:0x01d6, B:26:0x01e0, B:30:0x01fb, B:32:0x0206, B:33:0x0218, B:35:0x0229, B:38:0x0240, B:40:0x0251, B:42:0x0259, B:45:0x0260, B:46:0x0263, B:48:0x0274, B:49:0x027d, B:51:0x0286, B:37:0x0237, B:29:0x01f7, B:18:0x01a2, B:60:0x02a3), top: B:69:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0229 A[Catch: SQLiteException -> 0x029d, all -> 0x02bc, TryCatch #1 {all -> 0x02bc, blocks: (B:4:0x00e9, B:8:0x00f3, B:10:0x0153, B:15:0x015d, B:19:0x01a7, B:21:0x01d6, B:26:0x01e0, B:30:0x01fb, B:32:0x0206, B:33:0x0218, B:35:0x0229, B:38:0x0240, B:40:0x0251, B:42:0x0259, B:45:0x0260, B:46:0x0263, B:48:0x0274, B:49:0x027d, B:51:0x0286, B:37:0x0237, B:29:0x01f7, B:18:0x01a2, B:60:0x02a3), top: B:69:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0251 A[Catch: SQLiteException -> 0x029d, all -> 0x02bc, TryCatch #1 {all -> 0x02bc, blocks: (B:4:0x00e9, B:8:0x00f3, B:10:0x0153, B:15:0x015d, B:19:0x01a7, B:21:0x01d6, B:26:0x01e0, B:30:0x01fb, B:32:0x0206, B:33:0x0218, B:35:0x0229, B:38:0x0240, B:40:0x0251, B:42:0x0259, B:45:0x0260, B:46:0x0263, B:48:0x0274, B:49:0x027d, B:51:0x0286, B:37:0x0237, B:29:0x01f7, B:18:0x01a2, B:60:0x02a3), top: B:69:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0274 A[Catch: SQLiteException -> 0x029d, all -> 0x02bc, TryCatch #1 {all -> 0x02bc, blocks: (B:4:0x00e9, B:8:0x00f3, B:10:0x0153, B:15:0x015d, B:19:0x01a7, B:21:0x01d6, B:26:0x01e0, B:30:0x01fb, B:32:0x0206, B:33:0x0218, B:35:0x0229, B:38:0x0240, B:40:0x0251, B:42:0x0259, B:45:0x0260, B:46:0x0263, B:48:0x0274, B:49:0x027d, B:51:0x0286, B:37:0x0237, B:29:0x01f7, B:18:0x01a2, B:60:0x02a3), top: B:69:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0286 A[Catch: SQLiteException -> 0x029d, all -> 0x02bc, TRY_LEAVE, TryCatch #1 {all -> 0x02bc, blocks: (B:4:0x00e9, B:8:0x00f3, B:10:0x0153, B:15:0x015d, B:19:0x01a7, B:21:0x01d6, B:26:0x01e0, B:30:0x01fb, B:32:0x0206, B:33:0x0218, B:35:0x0229, B:38:0x0240, B:40:0x0251, B:42:0x0259, B:45:0x0260, B:46:0x0263, B:48:0x0274, B:49:0x027d, B:51:0x0286, B:37:0x0237, B:29:0x01f7, B:18:0x01a2, B:60:0x02a3), top: B:69:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzh zzj(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.zzj(java.lang.String):com.google.android.gms.measurement.internal.zzh");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzac zzk(java.lang.String r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.zzk(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzac");
    }

    public final zzak zzl(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return zzm(j10, str, 1L, false, false, z12, false, z14);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzak zzm(long r23, java.lang.String r25, long r26, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.zzm(long, java.lang.String, long, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.measurement.internal.zzak");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzas zzn(java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.zzn(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzas");
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00a1: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:162), block:B:28:0x00a1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzlk zzp(java.lang.String r15, java.lang.String r16) {
        /*
            r14 = this;
            r1 = r14
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r15)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r16)
            r14.zzg()
            r14.zzW()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r14.zzh()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r4 = "user_attributes"
            r0 = 3
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r0 = "set_timestamp"
            r11 = 0
            r5[r11] = r0     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r0 = "value"
            r12 = 1
            r5[r12] = r0     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r0 = "origin"
            r13 = 2
            r5[r13] = r0     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r6 = "app_id=? and name=?"
            java.lang.String[] r7 = new java.lang.String[]{r15, r16}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            boolean r0 = r3.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            if (r0 != 0) goto L3d
            r3.close()
            return r2
        L3d:
            long r8 = r3.getLong(r11)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            java.lang.Object r10 = r14.zzq(r3, r12)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            if (r10 != 0) goto L4b
            r3.close()
            return r2
        L4b:
            java.lang.String r6 = r3.getString(r13)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            com.google.android.gms.measurement.internal.zzlk r0 = new com.google.android.gms.measurement.internal.zzlk     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            r4 = r0
            r5 = r15
            r7 = r16
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            boolean r4 = r3.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            if (r4 == 0) goto L71
            com.google.android.gms.measurement.internal.zzgd r4 = r1.zzt     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            com.google.android.gms.measurement.internal.zzet r4 = r4.zzaA()     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            com.google.android.gms.measurement.internal.zzer r4 = r4.zzd()     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            java.lang.String r5 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzet.zzn(r15)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
            r4.zzb(r5, r6)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> La0
        L71:
            r3.close()
            return r0
        L75:
            r0 = move-exception
            goto L7b
        L77:
            r0 = move-exception
            goto La2
        L79:
            r0 = move-exception
            r3 = r2
        L7b:
            com.google.android.gms.measurement.internal.zzgd r4 = r1.zzt     // Catch: java.lang.Throwable -> La0
            com.google.android.gms.measurement.internal.zzet r4 = r4.zzaA()     // Catch: java.lang.Throwable -> La0
            com.google.android.gms.measurement.internal.zzer r4 = r4.zzd()     // Catch: java.lang.Throwable -> La0
            java.lang.String r5 = "Error querying user property. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzet.zzn(r15)     // Catch: java.lang.Throwable -> La0
            com.google.android.gms.measurement.internal.zzgd r7 = r1.zzt     // Catch: java.lang.Throwable -> La0
            com.google.android.gms.measurement.internal.zzeo r7 = r7.zzj()     // Catch: java.lang.Throwable -> La0
            r8 = r16
            java.lang.String r7 = r7.zzf(r8)     // Catch: java.lang.Throwable -> La0
            r4.zzd(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> La0
            if (r3 == 0) goto L9f
            r3.close()
        L9f:
            return r2
        La0:
            r0 = move-exception
            r2 = r3
        La2:
            if (r2 == 0) goto La7
            r2.close()
        La7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.zzp(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzlk");
    }

    @VisibleForTesting
    final Object zzq(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            this.zzt.zzaA().zzd().zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                            return null;
                        }
                        this.zzt.zzaA().zzd().zza("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(i10);
                }
                return Double.valueOf(cursor.getDouble(i10));
            }
            return Long.valueOf(cursor.getLong(i10));
        }
        this.zzt.zzaA().zzd().zza("Loaded invalid null value from database");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zzr() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.zzh()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            r0.close()
            return r1
        L1a:
            r0.close()
            return r1
        L1e:
            r2 = move-exception
            goto L25
        L20:
            r0 = move-exception
            goto L3e
        L22:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L25:
            com.google.android.gms.measurement.internal.zzgd r3 = r6.zzt     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.zzet r3 = r3.zzaA()     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.zzer r3 = r3.zzd()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.zzb(r4, r2)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L3e:
            if (r1 == 0) goto L43
            r1.close()
        L43:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.zzr():java.lang.String");
    }

    public final List zzs(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return zzt(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x008f, code lost:
    
        r3 = r41.zzt.zzaA().zzd();
        r41.zzt.zzf();
        r3.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzt(java.lang.String r42, java.lang.String[] r43) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.zzt(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final List zzu(String str) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase zzh2 = zzh();
                String[] strArr = {AppMeasurementSdk.ConditionalUserProperty.NAME, "origin", "set_timestamp", AppMeasurementSdk.ConditionalUserProperty.VALUE};
                this.zzt.zzf();
                cursor = zzh2.query("user_attributes", strArr, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j10 = cursor.getLong(2);
                    Object zzq = zzq(cursor, 3);
                    if (zzq == null) {
                        this.zzt.zzaA().zzd().zzb("Read invalid user property value, ignoring it. appId", zzet.zzn(str));
                    } else {
                        arrayList.add(new zzlk(str, str2, string, j10, zzq));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e10) {
                this.zzt.zzaA().zzd().zzc("Error querying user properties. appId", zzet.zzn(str), e10);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b6, code lost:
    
        r0 = r20.zzt.zzaA().zzd();
        r20.zzt.zzf();
        r0.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzv(java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.zzv(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void zzw() {
        zzW();
        zzh().beginTransaction();
    }

    public final void zzx() {
        zzW();
        zzh().endTransaction();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzy(List list) {
        zzg();
        zzW();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (!zzI()) {
            return;
        }
        String str = "(" + TextUtils.join(",", list) + ")";
        if (zzZ("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
            this.zzt.zzaA().zzk().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            zzh().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
        } catch (SQLiteException e10) {
            this.zzt.zzaA().zzd().zzb("Error incrementing retry count. error", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzz() {
        zzg();
        zzW();
        if (zzI()) {
            long zza2 = this.zzf.zzs().zza.zza();
            long elapsedRealtime = this.zzt.zzax().elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - zza2);
            this.zzt.zzf();
            if (abs > ((Long) zzeg.zzy.zza(null)).longValue()) {
                this.zzf.zzs().zza.zzb(elapsedRealtime);
                zzg();
                zzW();
                if (zzI()) {
                    SQLiteDatabase zzh2 = zzh();
                    String valueOf = String.valueOf(this.zzt.zzax().currentTimeMillis());
                    this.zzt.zzf();
                    int delete = zzh2.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{valueOf, String.valueOf(zzag.zzA())});
                    if (delete > 0) {
                        this.zzt.zzaA().zzj().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }
}
