package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbqz extends zzbrf {
    static final Set zza = CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    private String zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private final Object zzj;
    private final zzcfi zzk;
    private final Activity zzl;
    private zzcgx zzm;
    private ImageView zzn;
    private LinearLayout zzo;
    private final zzbrg zzp;
    private PopupWindow zzq;
    private RelativeLayout zzr;
    private ViewGroup zzs;

    public zzbqz(zzcfi zzcfiVar, zzbrg zzbrgVar) {
        super(zzcfiVar, "resize");
        this.zzb = "top-right";
        this.zzc = true;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = -1;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = -1;
        this.zzj = new Object();
        this.zzk = zzcfiVar;
        this.zzl = zzcfiVar.zzi();
        this.zzp = zzbrgVar;
    }

    public final void zza(boolean z10) {
        synchronized (this.zzj) {
            PopupWindow popupWindow = this.zzq;
            if (popupWindow != null) {
                popupWindow.dismiss();
                this.zzr.removeView((View) this.zzk);
                ViewGroup viewGroup = this.zzs;
                if (viewGroup != null) {
                    viewGroup.removeView(this.zzn);
                    this.zzs.addView((View) this.zzk);
                    this.zzk.zzag(this.zzm);
                }
                if (z10) {
                    zzk("default");
                    zzbrg zzbrgVar = this.zzp;
                    if (zzbrgVar != null) {
                        zzbrgVar.zzb();
                    }
                }
                this.zzq = null;
                this.zzr = null;
                this.zzs = null;
                this.zzo = null;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0255 A[Catch: all -> 0x047b, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:23:0x004a, B:24:0x005b, B:26:0x0069, B:27:0x007a, B:29:0x0088, B:30:0x0099, B:32:0x00a7, B:33:0x00b8, B:35:0x00c6, B:36:0x00d4, B:38:0x00e2, B:39:0x00e4, B:41:0x00e8, B:43:0x00ec, B:45:0x00f4, B:48:0x00fc, B:52:0x0122, B:58:0x012e, B:126:0x0255, B:127:0x025a, B:129:0x025c, B:131:0x027c, B:133:0x0280, B:135:0x028d, B:137:0x02c9, B:169:0x0382, B:176:0x03b1, B:177:0x03c9, B:178:0x03ea, B:180:0x03f2, B:181:0x03f9, B:182:0x0420, B:185:0x0423, B:187:0x0448, B:188:0x045d, B:170:0x0389, B:171:0x0390, B:172:0x0397, B:173:0x039e, B:174:0x03a4, B:175:0x03ab, B:136:0x02c6, B:190:0x045f, B:191:0x0464, B:59:0x0135, B:61:0x0139, B:89:0x018c, B:97:0x01dc, B:99:0x01e7, B:101:0x01ea, B:103:0x01ed, B:105:0x01f1, B:108:0x01f7, B:90:0x0197, B:92:0x01ad, B:94:0x01b8, B:91:0x01a2, B:93:0x01b0, B:95:0x01bd, B:96:0x01d1, B:98:0x01df, B:109:0x0208, B:115:0x0232, B:121:0x0242, B:118:0x0238, B:120:0x0240, B:112:0x022a, B:114:0x0230, B:122:0x0247, B:123:0x024d, B:193:0x0466, B:194:0x046b, B:196:0x046d, B:197:0x0472, B:199:0x0474, B:200:0x0479), top: B:207:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x025c A[Catch: all -> 0x047b, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:23:0x004a, B:24:0x005b, B:26:0x0069, B:27:0x007a, B:29:0x0088, B:30:0x0099, B:32:0x00a7, B:33:0x00b8, B:35:0x00c6, B:36:0x00d4, B:38:0x00e2, B:39:0x00e4, B:41:0x00e8, B:43:0x00ec, B:45:0x00f4, B:48:0x00fc, B:52:0x0122, B:58:0x012e, B:126:0x0255, B:127:0x025a, B:129:0x025c, B:131:0x027c, B:133:0x0280, B:135:0x028d, B:137:0x02c9, B:169:0x0382, B:176:0x03b1, B:177:0x03c9, B:178:0x03ea, B:180:0x03f2, B:181:0x03f9, B:182:0x0420, B:185:0x0423, B:187:0x0448, B:188:0x045d, B:170:0x0389, B:171:0x0390, B:172:0x0397, B:173:0x039e, B:174:0x03a4, B:175:0x03ab, B:136:0x02c6, B:190:0x045f, B:191:0x0464, B:59:0x0135, B:61:0x0139, B:89:0x018c, B:97:0x01dc, B:99:0x01e7, B:101:0x01ea, B:103:0x01ed, B:105:0x01f1, B:108:0x01f7, B:90:0x0197, B:92:0x01ad, B:94:0x01b8, B:91:0x01a2, B:93:0x01b0, B:95:0x01bd, B:96:0x01d1, B:98:0x01df, B:109:0x0208, B:115:0x0232, B:121:0x0242, B:118:0x0238, B:120:0x0240, B:112:0x022a, B:114:0x0230, B:122:0x0247, B:123:0x024d, B:193:0x0466, B:194:0x046b, B:196:0x046d, B:197:0x0472, B:199:0x0474, B:200:0x0479), top: B:207:0x0007, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 1202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbqz.zzb(java.util.Map):void");
    }

    public final void zzc(int i10, int i11, boolean z10) {
        synchronized (this.zzj) {
            this.zzd = i10;
            this.zze = i11;
        }
    }

    public final void zzd(int i10, int i11) {
        this.zzd = i10;
        this.zze = i11;
    }

    public final boolean zze() {
        boolean z10;
        synchronized (this.zzj) {
            if (this.zzq != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }
}
