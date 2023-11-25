package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.Http2Stream;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public class zzaqv extends zzaqu {
    private static zzash zzA = null;
    private static zzarz zzB = null;
    protected static final Object zzs = new Object();
    static boolean zzt = false;
    private static final String zzx = "zzaqv";
    private static long zzy;
    private static zzarb zzz;
    private final Map zzC;
    protected boolean zzu;
    protected final String zzv;
    zzasf zzw;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzaqv(Context context, String str, boolean z10) {
        super(context);
        this.zzu = false;
        this.zzC = new HashMap();
        this.zzv = str;
        this.zzu = z10;
    }

    protected static zzary zzj(Context context, boolean z10) {
        if (zzaqu.zza == null) {
            synchronized (zzs) {
                if (zzaqu.zza == null) {
                    zzary zzg = zzary.zzg(context, "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", z10);
                    if (zzg.zzr()) {
                        try {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcX)).booleanValue()) {
                                zzg.zzt("zahwJ4oRFMB+Gn9BGkfZDZ8TzDEfKTB8Y6I4bT4vlwkVFXvqlnkWd7htbiUzWQyR", "ZVHCdOeJUA1S4bCrFb9VMsUCP8Sf65wDnbBE+q4M36k=", new Class[0]);
                            }
                        } catch (IllegalStateException unused) {
                        }
                        zzg.zzt("9mv9Ihk+HlE8P3WJWSjhrxWrdB7cEu1gaxdteA5kBJ6DKumpWYk1Q5Vf8aocVg4i", "s7rU1m4XsqJ83s2reIjdkboWJYkg+gYouDrDcn3Ghpw=", Context.class);
                        zzg.zzt("gL88T2vBvJS+jBemUvhPpVS5IeaU7cU4wFVgyT6PJl7pFldWXOd3mZxVZlQUSll5", "bObXLZFRWAdU6+me08AeNX2ciqxi45ddv3QSqAplzos=", Context.class);
                        zzg.zzt("y3yRmC/kyT5sblAh6MVmMMe529YDQrbaaQxNMdjlDdcJ+gZ0vSS7aY/hNYvCePEW", "Y0trGqGVEUAa7A3LYgSQFKe4N9h1BuTC7OKFYCHfLSg=", Context.class);
                        zzg.zzt("ZHFOx+FjaOsul7gEkIcfA8auDnyRWXmT0qbiHVEO6U1RLulNSOFK3tPEgm+pvQxr", "RSyr2AK130nKbepDTsaNV0Uv17TWUb4O6ebIiV3GgVs=", Context.class);
                        zzg.zzt("jjg2LREBZ6Uexk1F+/xvygfAXYATBvQHfsOfWOGMPQM53g793pJFEG1AwAYG3/Of", "aC7c3pDenGsdb0eFildzKOBrhobw8fKkmd52rTlBEKM=", Context.class);
                        Class cls = Boolean.TYPE;
                        zzg.zzt("zmLnsak1Fo/LHy30EeWswBCxcOoFKuH08l3DkSTUgzb476o6nI+C8ZUC+d8tLJwZ", "sK9i540XcONymgaiZVMKYXr1VbNcwMhjwo2LFhhSCFg=", Context.class, cls);
                        zzg.zzt("1OxyLDHu2cwu0U7XKtDO3q+DghLeQ8xcTgpGCDWDuEeCcfs+HPxSt8kldIfiq1K0", "Ee4p/yPQz67p3LoSNbpt1G8K9rDuoWxBYT8E4CbWyr8=", Context.class);
                        zzg.zzt("Q+fOnDUQnIPH75lusFutOgWOI4DeJ6z7X13oo1pZ5m19Kfyi56UOJglWSBqO3AzA", "Hu+f/NX/SE2ncwqgjWboivCw8sh0xmVI9uGBmdlJpc4=", Context.class);
                        zzg.zzt("DtIPi5sE8OGAkX2vdWCDjXNrgqzO0lFe3Ja6SZSAwi/aT592ne6/tQc6OV2axJNE", "A3EfeXObjqx38Tdc4wdTZSQNpfpw6YVck+944M4A/m0=", MotionEvent.class, DisplayMetrics.class);
                        zzg.zzt("s1ejGoWFNJedDDJqGqL3B22F5ZMvy0oaymBcWJepS9Hv4/6KtsHBpmbtFfwgqqen", "r6m9xWOlfK6iHuNH3QiJQf71aQCKDM6NhABQId+yaKg=", MotionEvent.class, DisplayMetrics.class);
                        zzg.zzt("MbAcGuLi+XGl3MsgqAiQYLikemL120ZFxn+dIhaD+rHWJuTeO/M8+1c58cczHjCs", "Eg2eC3eNesWzbAUINzxj1mXRcYgmzS654CxZFoVQbAM=", new Class[0]);
                        zzg.zzt("pfTqFlR1an7kDUBzP8CmJZynZFAzKap0OWhefexY5E+9LoDEPq/g9ouqCw4/+GOX", "y+BEEb1lYOUGwTehZ9VIg/2gibmtEOjDZzKXHhs5BV0=", new Class[0]);
                        zzg.zzt("hMVcCX1S6+m7rVEDNdCHhVgXRFILMOQ9RgLSmTdPHeNgAU8CbmBsymKBuqLQcQaU", "3PwoDnm3HnsskB+3ZnJHoZ7BzV0InxUqaAwJBlSwKFs=", new Class[0]);
                        zzg.zzt("ttuIHg/yfWDxJlotLoMLf9WBnVTbWFFKY03C8KHR8FAhIQHccw4LaDLJatYkpo23", "xLOAO7msIR4UFUyldUn5stL2wwbLdISu2CSlTLg4f6Q=", new Class[0]);
                        zzg.zzt("1eWk7vHD3Ee+FybzKEoWLH07Pvdxo5flYR768ntLvpJZNSFjE7xgNzi+al9tiZC4", "w5tjCRfZfXWJzckDvIkXwf5aGJEVejLzfxhnwyqJH5E=", new Class[0]);
                        zzg.zzt("4/SMeJXpDEQUjIN8ctjvaq+191KHQFpFbvfik3xx/Qb+eWbRMHKpllc1rI0p7EXQ", "Jz2tk/JKeGJKcc4wwXH5Pf6ZM64fYgV4wWxByPOgNQE=", new Class[0]);
                        zzg.zzt("p0JEft1H0Ux+/zQoofBGK8/hHhAdN3veKIjNmetX6I2+7J67s0tf2NBKaWy11XvI", "yaxGJhC1WxugM+8EfEc/xAIuDWtPkz77G//hU7f/vWw=", Context.class, cls, String.class);
                        zzg.zzt("fxU2A2MjpZ4aJWGzXeMNURilSCaKosw3oXImrqnhSVmXB+tMi32JakdNlHCV3t0c", "+EF+l1eHEjuR445L5ETgD58eDQCcfhCypNm97kN1L/4=", StackTraceElement[].class);
                        zzg.zzt("0+zdyC6VPJhTjPaEoqOWHTMOFQN+wcQzU7Oc0uK1pdETw1P+GgKsW//19LiWUDiB", "beFEMZ/YBSUug4MSXb2BKymKiM6ZxOOlxExWa37jMlM=", View.class, DisplayMetrics.class, cls, cls);
                        zzg.zzt("geU/I/uTOXqxXXxxH3B6ynfHIlx2RWpE/VU5AsRbtoXFRkvhLNXNLZCaFDUfdv6y", "1ZhioNexfONxLbr8oNixHPTbX/qv3RsJiyYoeeb0m+g=", Context.class, cls);
                        zzg.zzt("XCj6cS5OVeEeObzd394PGDbjTuQh+vSye2UT6221ugsKtO2/oznWOSes2cnebrVR", "/UZ99NhZDGBVc8wZVXmC2wC/MG54XdFcRWhDAwHbwWE=", View.class, Activity.class, cls);
                        zzg.zzt("nIX5dAPvXYWFIvHlyxyLt0TnZ91UnAjFxZwf2qcoWSGcs+p5B5p88VCOzepPfMpE", "qUEdP6yfmpdCkPVqoE8EyrX/MPjGh4YKRo5g3kOeMoc=", Long.TYPE);
                        zzg.zzt("iibTgWRTbrwM2W7HZGJP5cjM0DLiCyA9TVVy1genRaa4nvgE3+CiRN/Fx87DVDsO", "iU9T/JU0akui7k4x/WtKPjyPVCtA+9ztaziSj2SwIy0=", new Class[0]);
                        try {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdc)).booleanValue()) {
                                zzg.zzt("gcg2RhRsG0R6zuf6iT0eSF6U6iabmBM/me4U4ELIi5QicHmCf/u4OJEW9LFUXGGL", "I5l5b06e/m6OPcJVryww5aceHDWuWNMRDm4mYVrBvJQ=", Context.class);
                            }
                        } catch (IllegalStateException unused2) {
                        }
                        zzg.zzt("gzR6fJL0MpYPfJ/UkFL9UHjS7jlytQ+eyVRsQJTsxzK4yqDaskM4UtldyBDUp+Z9", "BkxOKZDOMH8NUFJEmpCq1X+PtIP0kLI1Ua0ujwsrkUE=", Context.class);
                        try {
                            if (Build.VERSION.SDK_INT >= 26) {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzde)).booleanValue()) {
                                    Class cls2 = Long.TYPE;
                                    zzg.zzt("KHu8Xbxzr2mu9S25CNgKE5zXBf18Zj2waiAPYoFRjyhOXCyg+mYLv2x/JjCH7GjX", "NOrE2caDXO4nkFR2Fjy7NgGPKtPlIg1WAorknI/US68=", NetworkCapabilities.class, cls2, cls2);
                                }
                            }
                        } catch (IllegalStateException unused3) {
                        }
                        try {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcv)).booleanValue()) {
                                zzg.zzt("tfuuP59pzWN+H8zv1geT3jADiBKBGMQRjmCPoIvL5f45Lvl5qgJ0PgBqZF4WPnQj", "MIrDuKB7N0O22daoYjLtFOJg5TtVRHK1+0ktwmGNtdU=", List.class);
                            }
                        } catch (IllegalStateException unused4) {
                        }
                        try {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzct)).booleanValue()) {
                                Class cls3 = Long.TYPE;
                                zzg.zzt("8UC+BMIoCN+KAKrN9TZmuJsGMmo3RUHS+FjVMSp9QfgjxjGZ10kqO/oSdOn5Rw29", "L3kn/AgbpZo67rOPPyFD0YaeqBdfOWuRWDM5lgBYp0M=", cls3, cls3, cls3, cls3);
                            }
                        } catch (IllegalStateException unused5) {
                        }
                        try {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcs)).booleanValue()) {
                                zzg.zzt("7qOZVP58PfP3kLkbSBo98onihlohkIEpZC40FvE5nnCJ8ryn0NERK9JAnlww55zq", "SMfJnKfhfLLyTw7dzHC+3CXVRNFLWK4N2mQHKB3gm/o=", long[].class, Context.class, View.class);
                            }
                        } catch (IllegalStateException unused6) {
                        }
                    }
                    zzaqu.zza = zzg;
                }
            }
        }
        return zzaqu.zza;
    }

    static zzasa zzm(zzary zzaryVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws zzaro {
        Method zzj = zzaryVar.zzj("DtIPi5sE8OGAkX2vdWCDjXNrgqzO0lFe3Ja6SZSAwi/aT592ne6/tQc6OV2axJNE", "A3EfeXObjqx38Tdc4wdTZSQNpfpw6YVck+944M4A/m0=");
        if (zzj != null && motionEvent != null) {
            try {
                return new zzasa((String) zzj.invoke(null, motionEvent, displayMetrics));
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new zzaro(e10);
            }
        }
        throw new zzaro();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized void zzr(Context context, boolean z10) {
        synchronized (zzaqv.class) {
            if (!zzt) {
                zzy = System.currentTimeMillis() / 1000;
                zzaqu.zza = zzj(context, z10);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzde)).booleanValue()) {
                    zzz = zzarb.zzc(context);
                }
                ExecutorService zzk = zzaqu.zza.zzk();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdf)).booleanValue() && zzk != null) {
                    zzA = zzash.zzd(context, zzk);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzct)).booleanValue()) {
                    zzB = new zzarz();
                }
                zzt = true;
            }
        }
    }

    protected static final void zzs(List list) {
        ExecutorService zzk;
        if (zzaqu.zza != null && (zzk = zzaqu.zza.zzk()) != null && !list.isEmpty()) {
            try {
                zzk.invokeAll(list, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzco)).longValue(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                String str = zzx;
                StringWriter stringWriter = new StringWriter();
                e10.printStackTrace(new PrintWriter(stringWriter));
                Log.d(str, String.format("class methods got exception: %s", stringWriter.toString()));
            }
        }
    }

    private final synchronized void zzt(zzary zzaryVar, zzanv zzanvVar) {
        Long l10;
        int i10;
        MotionEvent motionEvent;
        try {
            zzasa zzm = zzm(zzaryVar, this.zzb, this.zzq);
            Long l11 = zzm.zza;
            if (l11 != null) {
                zzanvVar.zzN(l11.longValue());
            }
            Long l12 = zzm.zzb;
            if (l12 != null) {
                zzanvVar.zzO(l12.longValue());
            }
            Long l13 = zzm.zzc;
            if (l13 != null) {
                zzanvVar.zzL(l13.longValue());
            }
            if (this.zzp) {
                Long l14 = zzm.zzd;
                if (l14 != null) {
                    zzanvVar.zzK(l14.longValue());
                }
                Long l15 = zzm.zze;
                if (l15 != null) {
                    zzanvVar.zzH(l15.longValue());
                }
            }
        } catch (zzaro unused) {
        }
        zzaoo zza = zzaop.zza();
        int i11 = 1;
        if (this.zzd > 0 && zzasb.zze(this.zzq)) {
            zza.zzd(zzasb.zza(this.zzk, 1, this.zzq));
            zza.zzq(zzasb.zza(this.zzn - this.zzl, 1, this.zzq));
            zza.zzr(zzasb.zza(this.zzo - this.zzm, 1, this.zzq));
            zza.zzj(zzasb.zza(this.zzl, 1, this.zzq));
            zza.zzl(zzasb.zza(this.zzm, 1, this.zzq));
            if (this.zzp && (motionEvent = this.zzb) != null) {
                long zza2 = zzasb.zza(((this.zzl - this.zzn) + motionEvent.getRawX()) - this.zzb.getX(), 1, this.zzq);
                if (zza2 != 0) {
                    zza.zzo(zza2);
                }
                long zza3 = zzasb.zza(((this.zzm - this.zzo) + this.zzb.getRawY()) - this.zzb.getY(), 1, this.zzq);
                if (zza3 != 0) {
                    zza.zzp(zza3);
                }
            }
        }
        try {
            zzasa zzi = zzi(this.zzb);
            Long l16 = zzi.zza;
            if (l16 != null) {
                zza.zzk(l16.longValue());
            }
            Long l17 = zzi.zzb;
            if (l17 != null) {
                zza.zzm(l17.longValue());
            }
            zza.zzi(zzi.zzc.longValue());
            if (this.zzp) {
                Long l18 = zzi.zze;
                if (l18 != null) {
                    zza.zzg(l18.longValue());
                }
                Long l19 = zzi.zzd;
                if (l19 != null) {
                    zza.zzh(l19.longValue());
                }
                Long l20 = zzi.zzf;
                if (l20 != null) {
                    if (l20.longValue() != 0) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    zza.zzt(i10);
                }
                if (this.zze > 0) {
                    if (zzasb.zze(this.zzq)) {
                        l10 = Long.valueOf(Math.round(this.zzj / this.zze));
                    } else {
                        l10 = null;
                    }
                    if (l10 != null) {
                        zza.zzb(l10.longValue());
                    } else {
                        zza.zza();
                    }
                    zza.zzc(Math.round(this.zzi / this.zze));
                }
                Long l21 = zzi.zzi;
                if (l21 != null) {
                    zza.zze(l21.longValue());
                }
                Long l22 = zzi.zzj;
                if (l22 != null) {
                    zza.zzn(l22.longValue());
                }
                Long l23 = zzi.zzk;
                if (l23 != null) {
                    if (l23.longValue() != 0) {
                        i11 = 2;
                    }
                    zza.zzs(i11);
                }
            }
        } catch (zzaro unused2) {
        }
        long j10 = this.zzh;
        if (j10 > 0) {
            zza.zzf(j10);
        }
        zzanvVar.zzR((zzaop) zza.zzal());
        long j11 = this.zzd;
        if (j11 > 0) {
            zzanvVar.zzI(j11);
        }
        long j12 = this.zze;
        if (j12 > 0) {
            zzanvVar.zzJ(j12);
        }
        long j13 = this.zzf;
        if (j13 > 0) {
            zzanvVar.zzM(j13);
        }
        long j14 = this.zzg;
        if (j14 > 0) {
            zzanvVar.zzG(j14);
        }
        try {
            int size = this.zzc.size() - 1;
            if (size > 0) {
                zzanvVar.zzb();
                for (int i12 = 0; i12 < size; i12++) {
                    zzasa zzm2 = zzm(zzaqu.zza, (MotionEvent) this.zzc.get(i12), this.zzq);
                    zzaoo zza4 = zzaop.zza();
                    zza4.zzk(zzm2.zza.longValue());
                    zza4.zzm(zzm2.zzb.longValue());
                    zzanvVar.zza((zzaop) zza4.zzal());
                }
            }
        } catch (zzaro unused3) {
            zzanvVar.zzb();
        }
    }

    private static final void zzu() {
        zzash zzashVar = zzA;
        if (zzashVar != null) {
            zzashVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqu
    protected final long zza(StackTraceElement[] stackTraceElementArr) throws zzaro {
        Method zzj = zzaqu.zza.zzj("fxU2A2MjpZ4aJWGzXeMNURilSCaKosw3oXImrqnhSVmXB+tMi32JakdNlHCV3t0c", "+EF+l1eHEjuR445L5ETgD58eDQCcfhCypNm97kN1L/4=");
        if (zzj != null && stackTraceElementArr != null) {
            try {
                return new zzarp((String) zzj.invoke(null, stackTraceElementArr)).zza.longValue();
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new zzaro(e10);
            }
        }
        throw new zzaro();
    }

    @Override // com.google.android.gms.internal.ads.zzaqu
    protected final zzanv zzb(Context context, View view, Activity activity) {
        zzu();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzct)).booleanValue()) {
            zzB.zzi();
        }
        zzanv zza = zzaos.zza();
        if (!TextUtils.isEmpty(this.zzv)) {
            zza.zzh(this.zzv);
        }
        zzq(zzj(context, this.zzu), zza, view, activity, true, context);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaqu
    protected final zzanv zzc(Context context, zzano zzanoVar) {
        zzu();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzct)).booleanValue()) {
            zzB.zzj();
        }
        zzanv zza = zzaos.zza();
        if (!TextUtils.isEmpty(this.zzv)) {
            zza.zzh(this.zzv);
        }
        zzary zzj = zzj(context, this.zzu);
        if (zzj.zzk() != null) {
            zzs(zzp(zzj, context, zza, null));
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaqu
    protected final zzanv zzd(Context context, View view, Activity activity) {
        zzu();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzct)).booleanValue()) {
            zzB.zzk(context, view);
        }
        zzanv zza = zzaos.zza();
        zza.zzh(this.zzv);
        zzq(zzj(context, this.zzu), zza, view, activity, false, context);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaqu
    protected final zzasa zzi(MotionEvent motionEvent) throws zzaro {
        Method zzj = zzaqu.zza.zzj("s1ejGoWFNJedDDJqGqL3B22F5ZMvy0oaymBcWJepS9Hv4/6KtsHBpmbtFfwgqqen", "r6m9xWOlfK6iHuNH3QiJQf71aQCKDM6NhABQId+yaKg=");
        if (zzj != null && motionEvent != null) {
            try {
                return new zzasa((String) zzj.invoke(null, motionEvent, this.zzq));
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new zzaro(e10);
            }
        }
        throw new zzaro();
    }

    @Override // com.google.android.gms.internal.ads.zzaqu, com.google.android.gms.internal.ads.zzaqt
    public final void zzo(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcr)).booleanValue()) {
            return;
        }
        if (this.zzw == null) {
            zzary zzaryVar = zzaqu.zza;
            this.zzw = new zzasf(zzaryVar.zza, zzaryVar.zzf());
        }
        this.zzw.zzd(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List zzp(zzary zzaryVar, Context context, zzanv zzanvVar, zzano zzanoVar) {
        long j10;
        long j11;
        int zza = zzaryVar.zza();
        ArrayList arrayList = new ArrayList();
        if (!zzaryVar.zzr()) {
            zzanvVar.zzD(Http2Stream.EMIT_BUFFER_SIZE);
            return arrayList;
        }
        arrayList.add(new zzasm(zzaryVar, "p0JEft1H0Ux+/zQoofBGK8/hHhAdN3veKIjNmetX6I2+7J67s0tf2NBKaWy11XvI", "yaxGJhC1WxugM+8EfEc/xAIuDWtPkz77G//hU7f/vWw=", zzanvVar, zza, 27, context, null));
        arrayList.add(new zzasp(zzaryVar, "MbAcGuLi+XGl3MsgqAiQYLikemL120ZFxn+dIhaD+rHWJuTeO/M8+1c58cczHjCs", "Eg2eC3eNesWzbAUINzxj1mXRcYgmzS654CxZFoVQbAM=", zzanvVar, zzy, zza, 25));
        arrayList.add(new zzasz(zzaryVar, "hMVcCX1S6+m7rVEDNdCHhVgXRFILMOQ9RgLSmTdPHeNgAU8CbmBsymKBuqLQcQaU", "3PwoDnm3HnsskB+3ZnJHoZ7BzV0InxUqaAwJBlSwKFs=", zzanvVar, zza, 1));
        arrayList.add(new zzatc(zzaryVar, "y3yRmC/kyT5sblAh6MVmMMe529YDQrbaaQxNMdjlDdcJ+gZ0vSS7aY/hNYvCePEW", "Y0trGqGVEUAa7A3LYgSQFKe4N9h1BuTC7OKFYCHfLSg=", zzanvVar, zza, 31, context));
        arrayList.add(new zzath(zzaryVar, "pfTqFlR1an7kDUBzP8CmJZynZFAzKap0OWhefexY5E+9LoDEPq/g9ouqCw4/+GOX", "y+BEEb1lYOUGwTehZ9VIg/2gibmtEOjDZzKXHhs5BV0=", zzanvVar, zza, 33));
        arrayList.add(new zzasl(zzaryVar, "gL88T2vBvJS+jBemUvhPpVS5IeaU7cU4wFVgyT6PJl7pFldWXOd3mZxVZlQUSll5", "bObXLZFRWAdU6+me08AeNX2ciqxi45ddv3QSqAplzos=", zzanvVar, zza, 29, context));
        arrayList.add(new zzasn(zzaryVar, "ZHFOx+FjaOsul7gEkIcfA8auDnyRWXmT0qbiHVEO6U1RLulNSOFK3tPEgm+pvQxr", "RSyr2AK130nKbepDTsaNV0Uv17TWUb4O6ebIiV3GgVs=", zzanvVar, zza, 5));
        arrayList.add(new zzasy(zzaryVar, "jjg2LREBZ6Uexk1F+/xvygfAXYATBvQHfsOfWOGMPQM53g793pJFEG1AwAYG3/Of", "aC7c3pDenGsdb0eFildzKOBrhobw8fKkmd52rTlBEKM=", zzanvVar, zza, 12));
        arrayList.add(new zzata(zzaryVar, "zmLnsak1Fo/LHy30EeWswBCxcOoFKuH08l3DkSTUgzb476o6nI+C8ZUC+d8tLJwZ", "sK9i540XcONymgaiZVMKYXr1VbNcwMhjwo2LFhhSCFg=", zzanvVar, zza, 3));
        arrayList.add(new zzaso(zzaryVar, "ttuIHg/yfWDxJlotLoMLf9WBnVTbWFFKY03C8KHR8FAhIQHccw4LaDLJatYkpo23", "xLOAO7msIR4UFUyldUn5stL2wwbLdISu2CSlTLg4f6Q=", zzanvVar, zza, 44));
        arrayList.add(new zzasu(zzaryVar, "1eWk7vHD3Ee+FybzKEoWLH07Pvdxo5flYR768ntLvpJZNSFjE7xgNzi+al9tiZC4", "w5tjCRfZfXWJzckDvIkXwf5aGJEVejLzfxhnwyqJH5E=", zzanvVar, zza, 22));
        arrayList.add(new zzati(zzaryVar, "1OxyLDHu2cwu0U7XKtDO3q+DghLeQ8xcTgpGCDWDuEeCcfs+HPxSt8kldIfiq1K0", "Ee4p/yPQz67p3LoSNbpt1G8K9rDuoWxBYT8E4CbWyr8=", zzanvVar, zza, 48));
        arrayList.add(new zzask(zzaryVar, "Q+fOnDUQnIPH75lusFutOgWOI4DeJ6z7X13oo1pZ5m19Kfyi56UOJglWSBqO3AzA", "Hu+f/NX/SE2ncwqgjWboivCw8sh0xmVI9uGBmdlJpc4=", zzanvVar, zza, 49));
        arrayList.add(new zzatf(zzaryVar, "4/SMeJXpDEQUjIN8ctjvaq+191KHQFpFbvfik3xx/Qb+eWbRMHKpllc1rI0p7EXQ", "Jz2tk/JKeGJKcc4wwXH5Pf6ZM64fYgV4wWxByPOgNQE=", zzanvVar, zza, 51));
        arrayList.add(new zzatd(zzaryVar, "geU/I/uTOXqxXXxxH3B6ynfHIlx2RWpE/VU5AsRbtoXFRkvhLNXNLZCaFDUfdv6y", "1ZhioNexfONxLbr8oNixHPTbX/qv3RsJiyYoeeb0m+g=", zzanvVar, zza, 61));
        if (Build.VERSION.SDK_INT >= 24) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzde)).booleanValue()) {
                zzash zzashVar = zzA;
                if (zzashVar != null) {
                    j10 = zzashVar.zzc();
                    j11 = zzashVar.zzb();
                } else {
                    j10 = -1;
                    j11 = -1;
                }
                arrayList.add(new zzasx(zzaryVar, "KHu8Xbxzr2mu9S25CNgKE5zXBf18Zj2waiAPYoFRjyhOXCyg+mYLv2x/JjCH7GjX", "NOrE2caDXO4nkFR2Fjy7NgGPKtPlIg1WAorknI/US68=", zzanvVar, zza, 11, zzz, j10, j11));
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdc)).booleanValue()) {
            arrayList.add(new zzatb(zzaryVar, "gcg2RhRsG0R6zuf6iT0eSF6U6iabmBM/me4U4ELIi5QicHmCf/u4OJEW9LFUXGGL", "I5l5b06e/m6OPcJVryww5aceHDWuWNMRDm4mYVrBvJQ=", zzanvVar, zza, 73));
        }
        arrayList.add(new zzasv(zzaryVar, "gzR6fJL0MpYPfJ/UkFL9UHjS7jlytQ+eyVRsQJTsxzK4yqDaskM4UtldyBDUp+Z9", "BkxOKZDOMH8NUFJEmpCq1X+PtIP0kLI1Ua0ujwsrkUE=", zzanvVar, zza, 76));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdh)).booleanValue()) {
            arrayList.add(new zzasj(zzaryVar, "iibTgWRTbrwM2W7HZGJP5cjM0DLiCyA9TVVy1genRaa4nvgE3+CiRN/Fx87DVDsO", "iU9T/JU0akui7k4x/WtKPjyPVCtA+9ztaziSj2SwIy0=", zzanvVar, zza, 89));
        }
        return arrayList;
    }

    protected final void zzq(zzary zzaryVar, zzanv zzanvVar, View view, Activity activity, boolean z10, Context context) {
        List list;
        if (!zzaryVar.zzr()) {
            zzanvVar.zzD(Http2Stream.EMIT_BUFFER_SIZE);
            list = Arrays.asList(new zzasr(zzaryVar, zzanvVar));
        } else {
            zzt(zzaryVar, zzanvVar);
            ArrayList arrayList = new ArrayList();
            if (zzaryVar.zzk() != null) {
                int zza = zzaryVar.zza();
                arrayList.add(new zzasr(zzaryVar, zzanvVar));
                arrayList.add(new zzasz(zzaryVar, "hMVcCX1S6+m7rVEDNdCHhVgXRFILMOQ9RgLSmTdPHeNgAU8CbmBsymKBuqLQcQaU", "3PwoDnm3HnsskB+3ZnJHoZ7BzV0InxUqaAwJBlSwKFs=", zzanvVar, zza, 1));
                arrayList.add(new zzasp(zzaryVar, "MbAcGuLi+XGl3MsgqAiQYLikemL120ZFxn+dIhaD+rHWJuTeO/M8+1c58cczHjCs", "Eg2eC3eNesWzbAUINzxj1mXRcYgmzS654CxZFoVQbAM=", zzanvVar, zzy, zza, 25));
                arrayList.add(new zzaso(zzaryVar, "ttuIHg/yfWDxJlotLoMLf9WBnVTbWFFKY03C8KHR8FAhIQHccw4LaDLJatYkpo23", "xLOAO7msIR4UFUyldUn5stL2wwbLdISu2CSlTLg4f6Q=", zzanvVar, zza, 44));
                arrayList.add(new zzasy(zzaryVar, "jjg2LREBZ6Uexk1F+/xvygfAXYATBvQHfsOfWOGMPQM53g793pJFEG1AwAYG3/Of", "aC7c3pDenGsdb0eFildzKOBrhobw8fKkmd52rTlBEKM=", zzanvVar, zza, 12));
                arrayList.add(new zzata(zzaryVar, "zmLnsak1Fo/LHy30EeWswBCxcOoFKuH08l3DkSTUgzb476o6nI+C8ZUC+d8tLJwZ", "sK9i540XcONymgaiZVMKYXr1VbNcwMhjwo2LFhhSCFg=", zzanvVar, zza, 3));
                arrayList.add(new zzasu(zzaryVar, "1eWk7vHD3Ee+FybzKEoWLH07Pvdxo5flYR768ntLvpJZNSFjE7xgNzi+al9tiZC4", "w5tjCRfZfXWJzckDvIkXwf5aGJEVejLzfxhnwyqJH5E=", zzanvVar, zza, 22));
                arrayList.add(new zzasn(zzaryVar, "ZHFOx+FjaOsul7gEkIcfA8auDnyRWXmT0qbiHVEO6U1RLulNSOFK3tPEgm+pvQxr", "RSyr2AK130nKbepDTsaNV0Uv17TWUb4O6ebIiV3GgVs=", zzanvVar, zza, 5));
                arrayList.add(new zzati(zzaryVar, "1OxyLDHu2cwu0U7XKtDO3q+DghLeQ8xcTgpGCDWDuEeCcfs+HPxSt8kldIfiq1K0", "Ee4p/yPQz67p3LoSNbpt1G8K9rDuoWxBYT8E4CbWyr8=", zzanvVar, zza, 48));
                arrayList.add(new zzask(zzaryVar, "Q+fOnDUQnIPH75lusFutOgWOI4DeJ6z7X13oo1pZ5m19Kfyi56UOJglWSBqO3AzA", "Hu+f/NX/SE2ncwqgjWboivCw8sh0xmVI9uGBmdlJpc4=", zzanvVar, zza, 49));
                arrayList.add(new zzatf(zzaryVar, "4/SMeJXpDEQUjIN8ctjvaq+191KHQFpFbvfik3xx/Qb+eWbRMHKpllc1rI0p7EXQ", "Jz2tk/JKeGJKcc4wwXH5Pf6ZM64fYgV4wWxByPOgNQE=", zzanvVar, zza, 51));
                arrayList.add(new zzate(zzaryVar, "fxU2A2MjpZ4aJWGzXeMNURilSCaKosw3oXImrqnhSVmXB+tMi32JakdNlHCV3t0c", "+EF+l1eHEjuR445L5ETgD58eDQCcfhCypNm97kN1L/4=", zzanvVar, zza, 45, new Throwable().getStackTrace()));
                arrayList.add(new zzatj(zzaryVar, "0+zdyC6VPJhTjPaEoqOWHTMOFQN+wcQzU7Oc0uK1pdETw1P+GgKsW//19LiWUDiB", "beFEMZ/YBSUug4MSXb2BKymKiM6ZxOOlxExWa37jMlM=", zzanvVar, zza, 57, view));
                arrayList.add(new zzatd(zzaryVar, "geU/I/uTOXqxXXxxH3B6ynfHIlx2RWpE/VU5AsRbtoXFRkvhLNXNLZCaFDUfdv6y", "1ZhioNexfONxLbr8oNixHPTbX/qv3RsJiyYoeeb0m+g=", zzanvVar, zza, 61));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcp)).booleanValue()) {
                    arrayList.add(new zzasi(zzaryVar, "XCj6cS5OVeEeObzd394PGDbjTuQh+vSye2UT6221ugsKtO2/oznWOSes2cnebrVR", "/UZ99NhZDGBVc8wZVXmC2wC/MG54XdFcRWhDAwHbwWE=", zzanvVar, zza, 62, view, activity));
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdh)).booleanValue()) {
                    arrayList.add(new zzasj(zzaryVar, "iibTgWRTbrwM2W7HZGJP5cjM0DLiCyA9TVVy1genRaa4nvgE3+CiRN/Fx87DVDsO", "iU9T/JU0akui7k4x/WtKPjyPVCtA+9ztaziSj2SwIy0=", zzanvVar, zza, 89));
                }
                if (z10) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcr)).booleanValue()) {
                        arrayList.add(new zzatg(zzaryVar, "nIX5dAPvXYWFIvHlyxyLt0TnZ91UnAjFxZwf2qcoWSGcs+p5B5p88VCOzepPfMpE", "qUEdP6yfmpdCkPVqoE8EyrX/MPjGh4YKRo5g3kOeMoc=", zzanvVar, zza, 53, this.zzw));
                    }
                } else {
                    try {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcs)).booleanValue()) {
                            arrayList.add(new zzast(zzaryVar, "7qOZVP58PfP3kLkbSBo98onihlohkIEpZC40FvE5nnCJ8ryn0NERK9JAnlww55zq", "SMfJnKfhfLLyTw7dzHC+3CXVRNFLWK4N2mQHKB3gm/o=", zzanvVar, zza, 85, this.zzC, view, context));
                        }
                    } catch (IllegalStateException unused) {
                    }
                    try {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzct)).booleanValue()) {
                            arrayList.add(new zzass(zzaryVar, "8UC+BMIoCN+KAKrN9TZmuJsGMmo3RUHS+FjVMSp9QfgjxjGZ10kqO/oSdOn5Rw29", "L3kn/AgbpZo67rOPPyFD0YaeqBdfOWuRWDM5lgBYp0M=", zzanvVar, zza, 85, zzB));
                        }
                    } catch (IllegalStateException unused2) {
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcv)).booleanValue()) {
                        arrayList.add(new zzasw(zzaryVar, "tfuuP59pzWN+H8zv1geT3jADiBKBGMQRjmCPoIvL5f45Lvl5qgJ0PgBqZF4WPnQj", "MIrDuKB7N0O22daoYjLtFOJg5TtVRHK1+0ktwmGNtdU=", zzanvVar, zza, 94, this.zzr));
                    }
                }
            }
            list = arrayList;
        }
        zzs(list);
    }
}
