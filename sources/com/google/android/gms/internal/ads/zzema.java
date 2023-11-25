package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzema implements zzesj {
    private final zzfyo zza;
    private final zzfyo zzb;
    private final Context zzc;
    private final zzfca zzd;
    private final View zze;

    public zzema(zzfyo zzfyoVar, zzfyo zzfyoVar2, Context context, zzfca zzfcaVar, ViewGroup viewGroup) {
        this.zza = zzfyoVar;
        this.zzb = zzfyoVar2;
        this.zzc = context;
        this.zzd = zzfcaVar;
        this.zze = viewGroup;
    }

    private final List zze() {
        int i10;
        ArrayList arrayList = new ArrayList();
        View view = this.zze;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            if (parent instanceof ViewGroup) {
                i10 = ((ViewGroup) parent).indexOfChild(view);
            } else {
                i10 = -1;
            }
            Bundle bundle = new Bundle();
            bundle.putString(TaskFormActivity.TASK_TYPE_KEY, parent.getClass().getName());
            bundle.putInt("index_of_child", i10);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        zzbbr.zza(this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjW)).booleanValue()) {
            return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzely
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzema.this.zzc();
                }
            });
        }
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzelz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzema.this.zzd();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzemb zzc() throws Exception {
        return new zzemb(this.zzc, this.zzd.zze, zze());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzemb zzd() throws Exception {
        return new zzemb(this.zzc, this.zzd.zze, zze());
    }
}
