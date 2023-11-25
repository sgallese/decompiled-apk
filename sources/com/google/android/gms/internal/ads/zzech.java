package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzech extends SQLiteOpenHelper {
    private final Context zza;
    private final zzfyo zzb;

    public zzech(Context context, zzfyo zzfyoVar) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhZ)).intValue());
        this.zza = context;
        this.zzb = zzfyoVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Void zzb(zzcaf zzcafVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        zzj(sQLiteDatabase, zzcafVar);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(SQLiteDatabase sQLiteDatabase, String str, zzcaf zzcafVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzcafVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, zzcaf zzcafVar) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{ImagesContract.URL}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i10 = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex(ImagesContract.URL);
                if (columnIndex != -1) {
                    strArr[i10] = query.getString(columnIndex);
                }
                i10++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i11 = 0; i11 < count; i11++) {
                zzcafVar.zza(strArr[i11]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Void zza(zzecj zzecjVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzecjVar.zza));
        contentValues.put("gws_query_id", zzecjVar.zzb);
        contentValues.put(ImagesContract.URL, zzecjVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzecjVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.util.zzbr zzw = com.google.android.gms.ads.internal.util.zzs.zzw(this.zza);
        if (zzw != null) {
            try {
                zzw.zze(ObjectWrapper.wrap(this.zza));
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to schedule offline ping sender.", e10);
            }
        }
        return null;
    }

    public final void zzc(final String str) {
        zze(new zzffh() { // from class: com.google.android.gms.internal.ads.zzece
            @Override // com.google.android.gms.internal.ads.zzffh
            public final Object zza(Object obj) {
                zzech.zzi((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zzd(final zzecj zzecjVar) {
        zze(new zzffh() { // from class: com.google.android.gms.internal.ads.zzecc
            @Override // com.google.android.gms.internal.ads.zzffh
            public final Object zza(Object obj) {
                zzech.this.zza(zzecjVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(zzffh zzffhVar) {
        zzfye.zzr(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeca
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzech.this.getWritableDatabase();
            }
        }), new zzecg(this, zzffhVar), this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzg(final SQLiteDatabase sQLiteDatabase, final zzcaf zzcafVar, final String str) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecb
            @Override // java.lang.Runnable
            public final void run() {
                zzech.zzf(sQLiteDatabase, str, zzcafVar);
            }
        });
    }

    public final void zzh(final zzcaf zzcafVar, final String str) {
        zze(new zzffh() { // from class: com.google.android.gms.internal.ads.zzecf
            @Override // com.google.android.gms.internal.ads.zzffh
            public final Object zza(Object obj) {
                zzech.this.zzg((SQLiteDatabase) obj, zzcafVar, str);
                return null;
            }
        });
    }
}
