package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcbx extends FrameLayout implements zzcbo {
    final zzccl zza;
    private final zzccj zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbcj zze;
    private final long zzf;
    private final zzcbp zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcbx(Context context, zzccj zzccjVar, int i10, boolean z10, zzbcj zzbcjVar, zzcci zzcciVar) {
        super(context);
        zzcbp zzcbnVar;
        String str;
        this.zzb = zzccjVar;
        this.zze = zzbcjVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzccjVar.zzj());
        zzcbq zzcbqVar = zzccjVar.zzj().zza;
        zzcck zzcckVar = new zzcck(context, zzccjVar.zzn(), zzccjVar.zzbm(), zzbcjVar, zzccjVar.zzk());
        if (i10 == 2) {
            zzcbnVar = new zzcdb(context, zzcckVar, zzccjVar, z10, zzcbq.zza(zzccjVar), zzcciVar);
        } else {
            zzcbnVar = new zzcbn(context, zzccjVar, z10, zzcbq.zza(zzccjVar), zzcciVar, new zzcck(context, zzccjVar.zzn(), zzccjVar.zzbm(), zzbcjVar, zzccjVar.zzk()));
        }
        this.zzg = zzcbnVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcbnVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzF)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzC)).booleanValue()) {
            zzn();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzI)).longValue();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzE)).booleanValue();
        this.zzk = booleanValue;
        if (zzbcjVar != null) {
            if (true != booleanValue) {
                str = "0";
            } else {
                str = "1";
            }
            zzbcjVar.zzd("spinner_used", str);
        }
        this.zza = new zzccl(this);
        zzcbnVar.zzr(this);
    }

    private final void zzJ() {
        if (this.zzb.zzi() != null && this.zzi && !this.zzj) {
            this.zzb.zzi().getWindow().clearFlags(128);
            this.zzi = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzK(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        Integer zzl = zzl();
        if (zzl != null) {
            hashMap.put("playerId", zzl.toString());
        }
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zzd("onVideoEvent", hashMap);
    }

    private final boolean zzL() {
        if (this.zzq.getParent() != null) {
            return true;
        }
        return false;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzcbp zzcbpVar = this.zzg;
            if (zzcbpVar != null) {
                zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbr
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcbp.this.zzt();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbs
            @Override // java.lang.Runnable
            public final void run() {
                zzcbx.this.zzq(z10);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcbo
    public final void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            this.zza.zzb();
            z10 = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z10 = false;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcbw(this, z10));
    }

    public final void zzA(int i10) {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        zzcbpVar.zzz(i10);
    }

    public final void zzB(int i10) {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        zzcbpVar.zzA(i10);
    }

    public final void zzC(int i10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzF)).booleanValue()) {
            this.zzc.setBackgroundColor(i10);
            this.zzd.setBackgroundColor(i10);
        }
    }

    public final void zzD(int i10) {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        zzcbpVar.zzB(i10);
    }

    public final void zzE(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzF(int i10, int i11, int i12, int i13) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Set video bounds to x:" + i10 + ";y:" + i11 + ";w:" + i12 + ";h:" + i13);
        }
        if (i12 != 0 && i13 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
            layoutParams.setMargins(i10, i11, 0, 0);
            this.zzc.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    public final void zzG(float f10) {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        zzcbpVar.zzb.zze(f10);
        zzcbpVar.zzn();
    }

    public final void zzH(float f10, float f11) {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar != null) {
            zzcbpVar.zzu(f10, f11);
        }
    }

    public final void zzI() {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        zzcbpVar.zzb.zzd(false);
        zzcbpVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbP)).booleanValue()) {
            this.zza.zza();
        }
        zzK("ended", new String[0]);
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzb(String str, String str2) {
        zzK("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzc(String str, String str2) {
        zzK("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzd() {
        zzK("pause", new String[0]);
        zzJ();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zze() {
        boolean z10;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbP)).booleanValue()) {
            this.zza.zzb();
        }
        if (this.zzb.zzi() != null && !this.zzi) {
            if ((this.zzb.zzi().getWindow().getAttributes().flags & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.zzj = z10;
            if (!z10) {
                this.zzb.zzi().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzf() {
        if (this.zzg != null && this.zzm == 0) {
            zzK("canplaythrough", "duration", String.valueOf(r0.zzc() / 1000.0f), "videoWidth", String.valueOf(this.zzg.zze()), "videoHeight", String.valueOf(this.zzg.zzd()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzg() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbt
            @Override // java.lang.Runnable
            public final void run() {
                zzcbx.this.zzp();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzh() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcbu(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzL()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzc.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcbv(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzj(int i10, int i11) {
        if (this.zzk) {
            zzbbj zzbbjVar = zzbbr.zzH;
            int max = Math.max(i10 / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbjVar)).intValue(), 1);
            int max2 = Math.max(i11 / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbjVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == max && this.zzp.getHeight() == max2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzk() {
        if (this.zzh && zzL()) {
            this.zzc.removeView(this.zzq);
        }
        if (this.zzg != null && this.zzp != null) {
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            if (this.zzg.getBitmap(this.zzp) != null) {
                this.zzr = true;
            }
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime;
            if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                com.google.android.gms.ads.internal.util.zze.zza("Spinner frame grab took " + elapsedRealtime2 + "ms");
            }
            if (elapsedRealtime2 > this.zzf) {
                zzcaa.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.zzk = false;
                this.zzp = null;
                zzbcj zzbcjVar = this.zze;
                if (zzbcjVar != null) {
                    zzbcjVar.zzd("spinner_jank", Long.toString(elapsedRealtime2));
                }
            }
        }
    }

    public final Integer zzl() {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar != null) {
            return zzcbpVar.zzw();
        }
        return null;
    }

    public final void zzn() {
        String string;
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        TextView textView = new TextView(zzcbpVar.getContext());
        Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        if (zzd == null) {
            string = "AdMob - ";
        } else {
            string = zzd.getString(R.string.watermark_label_prefix);
        }
        textView.setText(String.valueOf(string).concat(this.zzg.zzj()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.zzc.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.zzc.bringChildToFront(textView);
    }

    public final void zzo() {
        this.zza.zza();
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar != null) {
            zzcbpVar.zzt();
        }
        zzJ();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp() {
        zzK("firstFrameRendered", new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(boolean z10) {
        zzK("windowFocusChanged", "hasWindowFocus", String.valueOf(z10));
    }

    public final void zzr(Integer num) {
        if (this.zzg == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.zzn)) {
            this.zzg.zzC(this.zzn, this.zzo, num);
        } else {
            zzK("no_src", new String[0]);
        }
    }

    public final void zzs() {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        zzcbpVar.zzb.zzd(true);
        zzcbpVar.zzn();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzt() {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        long zza = zzcbpVar.zza();
        if (this.zzl != zza && zza > 0) {
            float f10 = ((float) zza) / 1000.0f;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbN)).booleanValue()) {
                zzK("timeupdate", "time", String.valueOf(f10), "totalBytes", String.valueOf(this.zzg.zzh()), "qoeCachedBytes", String.valueOf(this.zzg.zzf()), "qoeLoadedBytes", String.valueOf(this.zzg.zzg()), "droppedFrames", String.valueOf(this.zzg.zzb()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            } else {
                zzK("timeupdate", "time", String.valueOf(f10));
            }
            this.zzl = zza;
        }
    }

    public final void zzu() {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        zzcbpVar.zzo();
    }

    public final void zzv() {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        zzcbpVar.zzp();
    }

    public final void zzw(int i10) {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        zzcbpVar.zzq(i10);
    }

    public final void zzx(MotionEvent motionEvent) {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        zzcbpVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzy(int i10) {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        zzcbpVar.zzx(i10);
    }

    public final void zzz(int i10) {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        zzcbpVar.zzy(i10);
    }
}
