package com.google.android.gms.internal.wearable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
final class zzbz {
    private static final zzbz zzb = new zzbz(true);
    final zzel zza = new zzeb(16);
    private boolean zzc;
    private boolean zzd;

    private zzbz() {
    }

    public static zzbz zza() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void zzd(com.google.android.gms.internal.wearable.zzby r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.wearable.zzff r0 = r4.zzb()
            byte[] r1 = com.google.android.gms.internal.wearable.zzco.zzd
            r5.getClass()
            com.google.android.gms.internal.wearable.zzff r1 = com.google.android.gms.internal.wearable.zzff.zza
            com.google.android.gms.internal.wearable.zzfg r1 = com.google.android.gms.internal.wearable.zzfg.INT
            com.google.android.gms.internal.wearable.zzfg r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L43;
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L2b;
                case 7: goto L22;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L48
        L19:
            boolean r0 = r5 instanceof com.google.android.gms.internal.wearable.zzdn
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof com.google.android.gms.internal.wearable.zzcs
            if (r0 == 0) goto L48
            goto L47
        L22:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof com.google.android.gms.internal.wearable.zzci
            if (r0 == 0) goto L48
            goto L47
        L2b:
            boolean r0 = r5 instanceof com.google.android.gms.internal.wearable.zzbh
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L48
            goto L47
        L34:
            boolean r0 = r5 instanceof java.lang.String
            goto L45
        L37:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L45
        L3a:
            boolean r0 = r5 instanceof java.lang.Double
            goto L45
        L3d:
            boolean r0 = r5 instanceof java.lang.Float
            goto L45
        L40:
            boolean r0 = r5 instanceof java.lang.Long
            goto L45
        L43:
            boolean r0 = r5 instanceof java.lang.Integer
        L45:
            if (r0 == 0) goto L48
        L47:
            return
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r4.zza()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.internal.wearable.zzff r4 = r4.zzb()
            com.google.android.gms.internal.wearable.zzfg r4 = r4.zza()
            r2 = 1
            r1[r2] = r4
            java.lang.Class r4 = r5.getClass()
            java.lang.String r4 = r4.getName()
            r5 = 2
            r1[r5] = r4
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.zzbz.zzd(com.google.android.gms.internal.wearable.zzby, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzbz zzbzVar = new zzbz();
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry zzg = this.zza.zzg(i10);
            zzbzVar.zzc((zzby) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzbzVar.zzc((zzby) entry.getKey(), entry.getValue());
        }
        zzbzVar.zzd = this.zzd;
        return zzbzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbz)) {
            return false;
        }
        return this.zza.equals(((zzbz) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (!this.zzc) {
            for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
                Map.Entry zzg = this.zza.zzg(i10);
                if (zzg.getValue() instanceof zzcg) {
                    ((zzcg) zzg.getValue()).zzZ();
                }
            }
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final void zzc(zzby zzbyVar, Object obj) {
        if (zzbyVar.zzc()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    zzd(zzbyVar, arrayList.get(i10));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzd(zzbyVar, obj);
        }
        if (obj instanceof zzcs) {
            this.zzd = true;
        }
        this.zza.put(zzbyVar, obj);
    }

    private zzbz(boolean z10) {
        zzb();
        zzb();
    }
}
