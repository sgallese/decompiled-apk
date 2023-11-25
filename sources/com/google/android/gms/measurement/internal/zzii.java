package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.collection.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.internal.measurement.zzpe;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzii extends zzf {
    @VisibleForTesting
    protected zzih zza;
    final zzs zzb;
    @VisibleForTesting
    protected boolean zzc;
    private zzhd zzd;
    private final Set zze;
    private boolean zzf;
    private final AtomicReference zzg;
    private final Object zzh;
    private zzai zzi;
    private int zzj;
    private final AtomicLong zzk;
    private long zzl;
    private int zzm;
    private final zzlm zzn;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzii(zzgd zzgdVar) {
        super(zzgdVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzc = true;
        this.zzn = new zzhx(this);
        this.zzg = new AtomicReference();
        this.zzi = new zzai(null, null);
        this.zzj = 100;
        this.zzl = -1L;
        this.zzm = 100;
        this.zzk = new AtomicLong(0L);
        this.zzb = new zzs(zzgdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaa(Boolean bool, boolean z10) {
        zzg();
        zza();
        this.zzt.zzaA().zzc().zzb("Setting app measurement enabled (FE)", bool);
        this.zzt.zzm().zzh(bool);
        if (z10) {
            zzfi zzm = this.zzt.zzm();
            zzgd zzgdVar = zzm.zzt;
            zzm.zzg();
            SharedPreferences.Editor edit = zzm.zza().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (!this.zzt.zzK() && (bool == null || bool.booleanValue())) {
            return;
        }
        zzab();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzab() {
        long j10;
        zzg();
        String zza = this.zzt.zzm().zzh.zza();
        if (zza != null) {
            if ("unset".equals(zza)) {
                zzY("app", "_npa", null, this.zzt.zzax().currentTimeMillis());
            } else {
                if (true != "true".equals(zza)) {
                    j10 = 0;
                } else {
                    j10 = 1;
                }
                zzY("app", "_npa", Long.valueOf(j10), this.zzt.zzax().currentTimeMillis());
            }
        }
        if (this.zzt.zzJ() && this.zzc) {
            this.zzt.zzaA().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
            zzz();
            zzpe.zzc();
            if (this.zzt.zzf().zzs(null, zzeg.zzaf)) {
                this.zzt.zzu().zza.zza();
            }
            this.zzt.zzaB().zzp(new zzhl(this));
            return;
        }
        this.zzt.zzaA().zzc().zza("Updating Scion state (FE)");
        this.zzt.zzt().zzI();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzv(zzii zziiVar, zzai zzaiVar, zzai zzaiVar2) {
        boolean z10;
        zzah[] zzahVarArr = {zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE};
        int i10 = 0;
        while (true) {
            if (i10 < 2) {
                zzah zzahVar = zzahVarArr[i10];
                if (!zzaiVar2.zzi(zzahVar) && zzaiVar.zzi(zzahVar)) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        boolean zzl = zzaiVar.zzl(zzaiVar2, zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE);
        if (!z10 && !zzl) {
            return;
        }
        zziiVar.zzt.zzh().zzo();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzw(zzii zziiVar, zzai zzaiVar, int i10, long j10, boolean z10, boolean z11) {
        zziiVar.zzg();
        zziiVar.zza();
        if (j10 <= zziiVar.zzl && zzai.zzj(zziiVar.zzm, i10)) {
            zziiVar.zzt.zzaA().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzaiVar);
            return;
        }
        zzfi zzm = zziiVar.zzt.zzm();
        zzgd zzgdVar = zzm.zzt;
        zzm.zzg();
        if (zzm.zzl(i10)) {
            SharedPreferences.Editor edit = zzm.zza().edit();
            edit.putString("consent_settings", zzaiVar.zzh());
            edit.putInt("consent_source", i10);
            edit.apply();
            zziiVar.zzl = j10;
            zziiVar.zzm = i10;
            zziiVar.zzt.zzt().zzF(z10);
            if (z11) {
                zziiVar.zzt.zzt().zzu(new AtomicReference());
                return;
            }
            return;
        }
        zziiVar.zzt.zzaA().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(i10));
    }

    public final void zzA(String str, String str2, Bundle bundle) {
        long currentTimeMillis = this.zzt.zzax().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        this.zzt.zzaB().zzp(new zzhs(this, bundle2));
    }

    public final void zzB() {
        if ((this.zzt.zzaw().getApplicationContext() instanceof Application) && this.zza != null) {
            ((Application) this.zzt.zzaw().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzC(Bundle bundle) {
        if (bundle == null) {
            this.zzt.zzm().zzs.zzb(new Bundle());
            return;
        }
        Bundle zza = this.zzt.zzm().zzs.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.zzt.zzv().zzag(obj)) {
                    this.zzt.zzv().zzO(this.zzn, null, 27, null, null, 0);
                }
                this.zzt.zzaA().zzl().zzc("Invalid default event parameter type. Name, value", str, obj);
            } else if (zzln.zzaj(str)) {
                this.zzt.zzaA().zzl().zzb("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                zza.remove(str);
            } else {
                zzln zzv = this.zzt.zzv();
                this.zzt.zzf();
                if (zzv.zzab("param", str, 100, obj)) {
                    this.zzt.zzv().zzP(zza, str, obj);
                }
            }
        }
        this.zzt.zzv();
        int zzc = this.zzt.zzf().zzc();
        if (zza.size() > zzc) {
            int i10 = 0;
            for (String str2 : new TreeSet(zza.keySet())) {
                i10++;
                if (i10 > zzc) {
                    zza.remove(str2);
                }
            }
            this.zzt.zzv().zzO(this.zzn, null, 26, null, null, 0);
            this.zzt.zzaA().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.zzt.zzm().zzs.zzb(zza);
        this.zzt.zzt().zzH(zza);
    }

    public final void zzD(String str, String str2, Bundle bundle) {
        zzE(str, str2, bundle, true, true, this.zzt.zzax().currentTimeMillis());
    }

    public final void zzE(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        Bundle bundle2;
        boolean z12;
        String str3;
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        if (str2 != "screen_view" && (str2 == null || !str2.equals("screen_view"))) {
            if (z11 && this.zzd != null && !zzln.zzaj(str2)) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (str == null) {
                str3 = "app";
            } else {
                str3 = str;
            }
            zzM(str3, str2, j10, bundle2, z11, z12, z10, null);
            return;
        }
        this.zzt.zzs().zzx(bundle2, j10);
    }

    public final void zzF(String str, String str2, Bundle bundle, String str3) {
        zzgd.zzO();
        zzM("auto", str2, this.zzt.zzax().currentTimeMillis(), bundle, false, true, true, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzG(String str, String str2, Bundle bundle) {
        zzg();
        zzH(str, str2, this.zzt.zzax().currentTimeMillis(), bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzH(String str, String str2, long j10, Bundle bundle) {
        boolean z10;
        zzg();
        if (this.zzd != null && !zzln.zzaj(str2)) {
            z10 = false;
        } else {
            z10 = true;
        }
        zzI(str, str2, j10, bundle, true, z10, true, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzI(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        boolean z13;
        boolean z14;
        String str4;
        ArrayList arrayList;
        long j11;
        String str5;
        Bundle[] bundleArr;
        Class<?> cls;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(bundle);
        zzg();
        zza();
        if (this.zzt.zzJ()) {
            List zzn = this.zzt.zzh().zzn();
            if (zzn != null && !zzn.contains(str2)) {
                this.zzt.zzaA().zzc().zzc("Dropping non-safelisted event. event name, origin", str2, str);
                return;
            }
            int i10 = 0;
            if (!this.zzf) {
                this.zzf = true;
                try {
                    if (!this.zzt.zzN()) {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzt.zzaw().getClassLoader());
                    } else {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                    }
                    try {
                        cls.getDeclaredMethod("initialize", Context.class).invoke(null, this.zzt.zzaw());
                    } catch (Exception e10) {
                        this.zzt.zzaA().zzk().zzb("Failed to invoke Tag Manager's initialize() method", e10);
                    }
                } catch (ClassNotFoundException unused) {
                    this.zzt.zzaA().zzi().zza("Tag Manager is not found and thus will not be used");
                }
            }
            if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
                this.zzt.zzay();
                zzY("auto", "_lgclid", bundle.getString("gclid"), this.zzt.zzax().currentTimeMillis());
            }
            this.zzt.zzay();
            if (z10 && zzln.zzan(str2)) {
                this.zzt.zzv().zzL(bundle, this.zzt.zzm().zzs.zza());
            }
            if (!z12) {
                this.zzt.zzay();
                if (!"_iap".equals(str2)) {
                    zzln zzv = this.zzt.zzv();
                    int i11 = 2;
                    if (zzv.zzad("event", str2)) {
                        if (!zzv.zzaa("event", zzha.zza, zzha.zzb, str2)) {
                            i11 = 13;
                        } else {
                            zzv.zzt.zzf();
                            if (zzv.zzZ("event", 40, str2)) {
                                i11 = 0;
                            }
                        }
                    }
                    if (i11 != 0) {
                        this.zzt.zzaA().zze().zzb("Invalid public event name. Event will not be logged (FE)", this.zzt.zzj().zzd(str2));
                        zzln zzv2 = this.zzt.zzv();
                        this.zzt.zzf();
                        String zzD = zzv2.zzD(str2, 40, true);
                        if (str2 != null) {
                            i10 = str2.length();
                        }
                        this.zzt.zzv().zzO(this.zzn, null, i11, "_ev", zzD, i10);
                        return;
                    }
                }
            }
            this.zzt.zzay();
            zzip zzj = this.zzt.zzs().zzj(false);
            if (zzj != null && !bundle.containsKey("_sc")) {
                zzj.zzd = true;
            }
            if (z10 && !z12) {
                z13 = true;
            } else {
                z13 = false;
            }
            zzln.zzK(zzj, bundle, z13);
            boolean equals = "am".equals(str);
            boolean zzaj = zzln.zzaj(str2);
            if (z10 && this.zzd != null && !zzaj) {
                if (equals) {
                    z14 = true;
                } else {
                    this.zzt.zzaA().zzc().zzc("Passing event to registered event handler (FE)", this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                    Preconditions.checkNotNull(this.zzd);
                    this.zzd.interceptEvent(str, str2, bundle, j10);
                    return;
                }
            } else {
                z14 = equals;
            }
            if (this.zzt.zzM()) {
                int zzh = this.zzt.zzv().zzh(str2);
                if (zzh != 0) {
                    this.zzt.zzaA().zze().zzb("Invalid event name. Event will not be logged (FE)", this.zzt.zzj().zzd(str2));
                    zzln zzv3 = this.zzt.zzv();
                    this.zzt.zzf();
                    String zzD2 = zzv3.zzD(str2, 40, true);
                    if (str2 != null) {
                        i10 = str2.length();
                    }
                    this.zzt.zzv().zzO(this.zzn, str3, zzh, "_ev", zzD2, i10);
                    return;
                }
                String str6 = "_o";
                Bundle zzu = this.zzt.zzv().zzu(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z12);
                Preconditions.checkNotNull(zzu);
                this.zzt.zzay();
                if (this.zzt.zzs().zzj(false) != null && "_ae".equals(str2)) {
                    zzkl zzklVar = this.zzt.zzu().zzb;
                    long elapsedRealtime = zzklVar.zzc.zzt.zzax().elapsedRealtime();
                    long j12 = elapsedRealtime - zzklVar.zzb;
                    zzklVar.zzb = elapsedRealtime;
                    if (j12 > 0) {
                        this.zzt.zzv().zzI(zzu, j12);
                    }
                }
                zzos.zzc();
                if (this.zzt.zzf().zzs(null, zzeg.zzae)) {
                    if (!"auto".equals(str) && "_ssr".equals(str2)) {
                        zzln zzv4 = this.zzt.zzv();
                        String string = zzu.getString("_ffr");
                        if (Strings.isEmptyOrWhitespace(string)) {
                            string = null;
                        } else if (string != null) {
                            string = string.trim();
                        }
                        if (!zzll.zza(string, zzv4.zzt.zzm().zzp.zza())) {
                            zzv4.zzt.zzm().zzp.zzb(string);
                        } else {
                            zzv4.zzt.zzaA().zzc().zza("Not logging duplicate session_start_with_rollout event");
                            return;
                        }
                    } else if ("_ae".equals(str2)) {
                        String zza = this.zzt.zzv().zzt.zzm().zzp.zza();
                        if (!TextUtils.isEmpty(zza)) {
                            zzu.putString("_ffr", zza);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(zzu);
                if (this.zzt.zzm().zzj.zza() <= 0 || !this.zzt.zzm().zzk(j10) || !this.zzt.zzm().zzm.zzb()) {
                    str4 = "_ae";
                    arrayList = arrayList2;
                    j11 = 0;
                } else {
                    this.zzt.zzaA().zzj().zza("Current session is expired, remove the session number, ID, and engagement time");
                    arrayList = arrayList2;
                    j11 = 0;
                    str4 = "_ae";
                    zzY("auto", "_sid", null, this.zzt.zzax().currentTimeMillis());
                    zzY("auto", "_sno", null, this.zzt.zzax().currentTimeMillis());
                    zzY("auto", "_se", null, this.zzt.zzax().currentTimeMillis());
                    this.zzt.zzm().zzk.zzb(0L);
                }
                if (zzu.getLong("extend_session", j11) == 1) {
                    this.zzt.zzaA().zzj().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    this.zzt.zzu().zza.zzb(j10, true);
                }
                ArrayList arrayList3 = new ArrayList(zzu.keySet());
                Collections.sort(arrayList3);
                int size = arrayList3.size();
                for (int i12 = 0; i12 < size; i12++) {
                    String str7 = (String) arrayList3.get(i12);
                    if (str7 != null) {
                        this.zzt.zzv();
                        Object obj = zzu.get(str7);
                        if (obj instanceof Bundle) {
                            bundleArr = new Bundle[]{(Bundle) obj};
                        } else if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList4 = (ArrayList) obj;
                            bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                        } else {
                            bundleArr = null;
                        }
                        if (bundleArr != null) {
                            zzu.putParcelableArray(str7, bundleArr);
                        }
                    }
                }
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    ArrayList arrayList5 = arrayList;
                    Bundle bundle2 = (Bundle) arrayList5.get(i13);
                    if (i13 != 0) {
                        str5 = "_ep";
                    } else {
                        str5 = str2;
                    }
                    bundle2.putString(str6, str);
                    if (z11) {
                        bundle2 = this.zzt.zzv().zzt(bundle2);
                    }
                    Bundle bundle3 = bundle2;
                    String str8 = str6;
                    this.zzt.zzt().zzA(new zzaw(str5, new zzau(bundle3), str, j10), str3);
                    if (!z14) {
                        Iterator it = this.zze.iterator();
                        while (it.hasNext()) {
                            ((zzhe) it.next()).onEvent(str, str2, new Bundle(bundle3), j10);
                        }
                    }
                    i13++;
                    arrayList = arrayList5;
                    str6 = str8;
                }
                this.zzt.zzay();
                if (this.zzt.zzs().zzj(false) != null && str4.equals(str2)) {
                    this.zzt.zzu().zzb.zzd(true, true, this.zzt.zzax().elapsedRealtime());
                    return;
                }
                return;
            }
            return;
        }
        this.zzt.zzaA().zzc().zza("Event not sent since app measurement is disabled");
    }

    public final void zzJ(zzhe zzheVar) {
        zza();
        Preconditions.checkNotNull(zzheVar);
        if (!this.zze.add(zzheVar)) {
            this.zzt.zzaA().zzk().zza("OnEventListener already registered");
        }
    }

    public final void zzK(long j10) {
        this.zzg.set(null);
        this.zzt.zzaB().zzp(new zzhq(this, j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzL(long j10, boolean z10) {
        zzg();
        zza();
        this.zzt.zzaA().zzc().zza("Resetting analytics data (FE)");
        zzkn zzu = this.zzt.zzu();
        zzu.zzg();
        zzu.zzb.zza();
        zzqr.zzc();
        if (this.zzt.zzf().zzs(null, zzeg.zzan)) {
            this.zzt.zzh().zzo();
        }
        boolean zzJ = this.zzt.zzJ();
        zzfi zzm = this.zzt.zzm();
        zzm.zzc.zzb(j10);
        if (!TextUtils.isEmpty(zzm.zzt.zzm().zzp.zza())) {
            zzm.zzp.zzb(null);
        }
        zzpe.zzc();
        zzag zzf = zzm.zzt.zzf();
        zzef zzefVar = zzeg.zzaf;
        if (zzf.zzs(null, zzefVar)) {
            zzm.zzj.zzb(0L);
        }
        zzm.zzk.zzb(0L);
        if (!zzm.zzt.zzf().zzv()) {
            zzm.zzi(!zzJ);
        }
        zzm.zzq.zzb(null);
        zzm.zzr.zzb(0L);
        zzm.zzs.zzb(null);
        if (z10) {
            this.zzt.zzt().zzC();
        }
        zzpe.zzc();
        if (this.zzt.zzf().zzs(null, zzefVar)) {
            this.zzt.zzu().zza.zza();
        }
        this.zzc = !zzJ;
    }

    protected final void zzM(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i10];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelable);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        this.zzt.zzaB().zzp(new zzhn(this, str, str2, j10, bundle2, z10, z11, z12, str3));
    }

    final void zzN(String str, String str2, long j10, Object obj) {
        this.zzt.zzaB().zzp(new zzho(this, str, str2, obj, j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzO(String str) {
        this.zzg.set(str);
    }

    public final void zzP(Bundle bundle) {
        zzQ(bundle, this.zzt.zzax().currentTimeMillis());
    }

    public final void zzQ(Bundle bundle, long j10) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.zzt.zzaA().zzk().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzgz.zza(bundle2, "app_id", String.class, null);
        zzgz.zza(bundle2, "origin", String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.VALUE, Object.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j10);
        String string = bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        Object obj = bundle2.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (this.zzt.zzv().zzl(string) == 0) {
            if (this.zzt.zzv().zzd(string, obj) == 0) {
                Object zzB = this.zzt.zzv().zzB(string, obj);
                if (zzB == null) {
                    this.zzt.zzaA().zzd().zzc("Unable to normalize conditional user property value", this.zzt.zzj().zzf(string), obj);
                    return;
                }
                zzgz.zzb(bundle2, zzB);
                long j11 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
                if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
                    this.zzt.zzf();
                    if (j11 > 15552000000L || j11 < 1) {
                        this.zzt.zzaA().zzd().zzc("Invalid conditional user property timeout", this.zzt.zzj().zzf(string), Long.valueOf(j11));
                        return;
                    }
                }
                long j12 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
                this.zzt.zzf();
                if (j12 <= 15552000000L && j12 >= 1) {
                    this.zzt.zzaB().zzp(new zzhr(this, bundle2));
                    return;
                } else {
                    this.zzt.zzaA().zzd().zzc("Invalid conditional user property time to live", this.zzt.zzj().zzf(string), Long.valueOf(j12));
                    return;
                }
            }
            this.zzt.zzaA().zzd().zzc("Invalid conditional user property value", this.zzt.zzj().zzf(string), obj);
            return;
        }
        this.zzt.zzaA().zzd().zzb("Invalid conditional user property name", this.zzt.zzj().zzf(string));
    }

    public final void zzR(Bundle bundle, int i10, long j10) {
        zza();
        String zzg = zzai.zzg(bundle);
        if (zzg != null) {
            this.zzt.zzaA().zzl().zzb("Ignoring invalid consent setting", zzg);
            this.zzt.zzaA().zzl().zza("Valid consent values are 'granted', 'denied'");
        }
        zzS(zzai.zza(bundle), i10, j10);
    }

    public final void zzS(zzai zzaiVar, int i10, long j10) {
        zzai zzaiVar2;
        boolean z10;
        boolean z11;
        boolean z12;
        zzai zzaiVar3 = zzaiVar;
        zza();
        if (i10 != -10 && zzaiVar.zze() == null && zzaiVar.zzf() == null) {
            this.zzt.zzaA().zzl().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.zzh) {
            zzaiVar2 = this.zzi;
            z10 = false;
            if (zzai.zzj(i10, this.zzj)) {
                z11 = zzaiVar3.zzk(this.zzi);
                zzah zzahVar = zzah.ANALYTICS_STORAGE;
                if (zzaiVar3.zzi(zzahVar) && !this.zzi.zzi(zzahVar)) {
                    z10 = true;
                }
                zzaiVar3 = zzaiVar3.zzd(this.zzi);
                this.zzi = zzaiVar3;
                this.zzj = i10;
                z12 = z10;
                z10 = true;
            } else {
                z11 = false;
                z12 = false;
            }
        }
        if (!z10) {
            this.zzt.zzaA().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzaiVar3);
            return;
        }
        long andIncrement = this.zzk.getAndIncrement();
        if (z11) {
            this.zzg.set(null);
            this.zzt.zzaB().zzq(new zzid(this, zzaiVar3, j10, i10, andIncrement, z12, zzaiVar2));
            return;
        }
        zzie zzieVar = new zzie(this, zzaiVar3, i10, andIncrement, z12, zzaiVar2);
        if (i10 != 30 && i10 != -10) {
            this.zzt.zzaB().zzp(zzieVar);
        } else {
            this.zzt.zzaB().zzq(zzieVar);
        }
    }

    public final void zzT(zzhd zzhdVar) {
        zzhd zzhdVar2;
        boolean z10;
        zzg();
        zza();
        if (zzhdVar != null && zzhdVar != (zzhdVar2 = this.zzd)) {
            if (zzhdVar2 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkState(z10, "EventInterceptor already set.");
        }
        this.zzd = zzhdVar;
    }

    public final void zzU(Boolean bool) {
        zza();
        this.zzt.zzaB().zzp(new zzic(this, bool));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzV(zzai zzaiVar) {
        boolean z10;
        Boolean bool;
        zzg();
        if ((zzaiVar.zzi(zzah.ANALYTICS_STORAGE) && zzaiVar.zzi(zzah.AD_STORAGE)) || this.zzt.zzt().zzM()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.zzt.zzK()) {
            this.zzt.zzG(z10);
            zzfi zzm = this.zzt.zzm();
            zzgd zzgdVar = zzm.zzt;
            zzm.zzg();
            if (zzm.zza().contains("measurement_enabled_from_api")) {
                bool = Boolean.valueOf(zzm.zza().getBoolean("measurement_enabled_from_api", true));
            } else {
                bool = null;
            }
            if (!z10 || bool == null || bool.booleanValue()) {
                zzaa(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void zzW(String str, String str2, Object obj, boolean z10) {
        zzX("auto", "_ldl", obj, true, this.zzt.zzax().currentTimeMillis());
    }

    public final void zzX(String str, String str2, Object obj, boolean z10, long j10) {
        int i10;
        String str3;
        int length;
        int i11;
        if (z10) {
            i10 = this.zzt.zzv().zzl(str2);
        } else {
            zzln zzv = this.zzt.zzv();
            if (zzv.zzad("user property", str2)) {
                if (!zzv.zzaa("user property", zzhc.zza, null, str2)) {
                    i10 = 15;
                } else {
                    zzv.zzt.zzf();
                    if (zzv.zzZ("user property", 24, str2)) {
                        i10 = 0;
                    }
                }
            }
            i10 = 6;
        }
        if (i10 != 0) {
            zzln zzv2 = this.zzt.zzv();
            this.zzt.zzf();
            String zzD = zzv2.zzD(str2, 24, true);
            if (str2 != null) {
                i11 = str2.length();
            } else {
                i11 = 0;
            }
            this.zzt.zzv().zzO(this.zzn, null, i10, "_ev", zzD, i11);
            return;
        }
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (obj != null) {
            int zzd = this.zzt.zzv().zzd(str2, obj);
            if (zzd != 0) {
                zzln zzv3 = this.zzt.zzv();
                this.zzt.zzf();
                String zzD2 = zzv3.zzD(str2, 24, true);
                if (!(obj instanceof String) && !(obj instanceof CharSequence)) {
                    length = 0;
                } else {
                    length = obj.toString().length();
                }
                this.zzt.zzv().zzO(this.zzn, null, zzd, "_ev", zzD2, length);
                return;
            }
            Object zzB = this.zzt.zzv().zzB(str2, obj);
            if (zzB != null) {
                zzN(str3, str2, j10, zzB);
                return;
            }
            return;
        }
        zzN(str3, str2, j10, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzY(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            r8.zzg()
            r8.zza()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L64
            boolean r0 = r11 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L52
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L52
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            r11 = 1
            java.lang.String r0 = "false"
            boolean r10 = r0.equals(r10)
            r2 = 1
            if (r11 == r10) goto L37
            r10 = 0
            goto L38
        L37:
            r10 = r2
        L38:
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            com.google.android.gms.measurement.internal.zzgd r10 = r8.zzt
            com.google.android.gms.measurement.internal.zzfi r10 = r10.zzm()
            com.google.android.gms.measurement.internal.zzfh r10 = r10.zzh
            long r4 = r11.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L4e
            java.lang.String r0 = "true"
        L4e:
            r10.zzb(r0)
            goto L61
        L52:
            if (r11 != 0) goto L64
            com.google.android.gms.measurement.internal.zzgd r10 = r8.zzt
            com.google.android.gms.measurement.internal.zzfi r10 = r10.zzm()
            com.google.android.gms.measurement.internal.zzfh r10 = r10.zzh
            java.lang.String r0 = "unset"
            r10.zzb(r0)
        L61:
            r6 = r11
            r3 = r1
            goto L66
        L64:
            r3 = r10
            r6 = r11
        L66:
            com.google.android.gms.measurement.internal.zzgd r10 = r8.zzt
            boolean r10 = r10.zzJ()
            if (r10 != 0) goto L7e
            com.google.android.gms.measurement.internal.zzgd r9 = r8.zzt
            com.google.android.gms.measurement.internal.zzet r9 = r9.zzaA()
            com.google.android.gms.measurement.internal.zzer r9 = r9.zzj()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.zza(r10)
            return
        L7e:
            com.google.android.gms.measurement.internal.zzgd r10 = r8.zzt
            boolean r10 = r10.zzM()
            if (r10 != 0) goto L87
            return
        L87:
            com.google.android.gms.measurement.internal.zzli r10 = new com.google.android.gms.measurement.internal.zzli
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.zzgd r9 = r8.zzt
            com.google.android.gms.measurement.internal.zzjx r9 = r9.zzt()
            r9.zzK(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzii.zzY(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void zzZ(zzhe zzheVar) {
        zza();
        Preconditions.checkNotNull(zzheVar);
        if (!this.zze.remove(zzheVar)) {
            this.zzt.zzaA().zzk().zza("OnEventListener had not been registered");
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

    public final int zzh(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzt.zzf();
        return 25;
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzt.zzaB().zzd(atomicReference, 15000L, "boolean test flag value", new zzhu(this, atomicReference));
    }

    public final Double zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzt.zzaB().zzd(atomicReference, 15000L, "double test flag value", new zzib(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzt.zzaB().zzd(atomicReference, 15000L, "int test flag value", new zzia(this, atomicReference));
    }

    public final Long zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzt.zzaB().zzd(atomicReference, 15000L, "long test flag value", new zzhz(this, atomicReference));
    }

    public final String zzo() {
        return (String) this.zzg.get();
    }

    public final String zzp() {
        zzip zzi = this.zzt.zzs().zzi();
        if (zzi != null) {
            return zzi.zzb;
        }
        return null;
    }

    public final String zzq() {
        zzip zzi = this.zzt.zzs().zzi();
        if (zzi != null) {
            return zzi.zza;
        }
        return null;
    }

    public final String zzr() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzt.zzaB().zzd(atomicReference, 15000L, "String test flag value", new zzhy(this, atomicReference));
    }

    public final ArrayList zzs(String str, String str2) {
        if (this.zzt.zzaB().zzs()) {
            this.zzt.zzaA().zzd().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.zzt.zzay();
        if (zzab.zza()) {
            this.zzt.zzaA().zzd().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzt.zzaB().zzd(atomicReference, 5000L, "get conditional user properties", new zzht(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            this.zzt.zzaA().zzd().zzb("Timed out waiting for get conditional user properties", null);
            return new ArrayList();
        }
        return zzln.zzH(list);
    }

    public final List zzt(boolean z10) {
        zza();
        this.zzt.zzaA().zzj().zza("Getting user properties (FE)");
        if (!this.zzt.zzaB().zzs()) {
            this.zzt.zzay();
            if (zzab.zza()) {
                this.zzt.zzaA().zzd().zza("Cannot get all user properties from main thread");
                return Collections.emptyList();
            }
            AtomicReference atomicReference = new AtomicReference();
            this.zzt.zzaB().zzd(atomicReference, 5000L, "get user properties", new zzhp(this, atomicReference, z10));
            List list = (List) atomicReference.get();
            if (list == null) {
                this.zzt.zzaA().zzd().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z10));
                return Collections.emptyList();
            }
            return list;
        }
        this.zzt.zzaA().zzd().zza("Cannot get all user properties from analytics worker thread");
        return Collections.emptyList();
    }

    public final Map zzu(String str, String str2, boolean z10) {
        if (this.zzt.zzaB().zzs()) {
            this.zzt.zzaA().zzd().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.zzt.zzay();
        if (zzab.zza()) {
            this.zzt.zzaA().zzd().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzt.zzaB().zzd(atomicReference, 5000L, "get user properties", new zzhv(this, atomicReference, null, str, str2, z10));
        List<zzli> list = (List) atomicReference.get();
        if (list == null) {
            this.zzt.zzaA().zzd().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.emptyMap();
        }
        a aVar = new a(list.size());
        for (zzli zzliVar : list) {
            Object zza = zzliVar.zza();
            if (zza != null) {
                aVar.put(zzliVar.zzb, zza);
            }
        }
        return aVar;
    }

    public final void zzz() {
        zzg();
        zza();
        if (this.zzt.zzM()) {
            if (this.zzt.zzf().zzs(null, zzeg.zzZ)) {
                zzag zzf = this.zzt.zzf();
                zzf.zzt.zzay();
                Boolean zzk = zzf.zzk("google_analytics_deferred_deep_link_enabled");
                if (zzk != null && zzk.booleanValue()) {
                    this.zzt.zzaA().zzc().zza("Deferred Deep Link feature enabled.");
                    this.zzt.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhk
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzii zziiVar = zzii.this;
                            zziiVar.zzg();
                            if (!zziiVar.zzt.zzm().zzn.zzb()) {
                                long zza = zziiVar.zzt.zzm().zzo.zza();
                                zziiVar.zzt.zzm().zzo.zzb(1 + zza);
                                zziiVar.zzt.zzf();
                                if (zza >= 5) {
                                    zziiVar.zzt.zzaA().zzk().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                    zziiVar.zzt.zzm().zzn.zza(true);
                                    return;
                                }
                                zziiVar.zzt.zzE();
                                return;
                            }
                            zziiVar.zzt.zzaA().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
                        }
                    });
                }
            }
            this.zzt.zzt().zzq();
            this.zzc = false;
            zzfi zzm = this.zzt.zzm();
            zzm.zzg();
            String string = zzm.zza().getString("previous_os_version", null);
            zzm.zzt.zzg().zzv();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = zzm.zza().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.zzt.zzg().zzv();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    zzG("auto", "_ou", bundle);
                }
            }
        }
    }
}
