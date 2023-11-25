package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfig {
    private final zzehc zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfbs zzf;
    private final zzfbt zzg;
    private final Clock zzh;
    private final zzaqx zzi;

    public zzfig(zzehc zzehcVar, zzcag zzcagVar, String str, String str2, Context context, zzfbs zzfbsVar, zzfbt zzfbtVar, Clock clock, zzaqx zzaqxVar) {
        this.zza = zzehcVar;
        this.zzb = zzcagVar.zza;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfbsVar;
        this.zzg = zzfbtVar;
        this.zzh = clock;
        this.zzi = zzaqxVar;
    }

    public static final List zzf(int i10, int i11, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzi((String) it.next(), "@gw_mpe@", "2." + i11));
        }
        return arrayList;
    }

    public static final List zzg(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzi((String) it.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzh(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (zzbzz.zzk()) {
            return "fakeForAdDebugLog";
        }
        return str;
    }

    private static String zzi(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List zzc(zzfbr zzfbrVar, zzfbe zzfbeVar, List list) {
        return zzd(zzfbrVar, zzfbeVar, false, "", "", list);
    }

    public final List zzd(zzfbr zzfbrVar, zzfbe zzfbeVar, boolean z10, String str, String str2, List list) {
        String str3;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z11 = true;
            if (true != z10) {
                str3 = "0";
            } else {
                str3 = "1";
            }
            String zzi = zzi(zzi(zzi((String) it.next(), "@gw_adlocid@", zzfbrVar.zza.zza.zzf), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.zzb);
            if (zzfbeVar != null) {
                zzi = zzbyh.zzc(zzi(zzi(zzi(zzi, "@gw_qdata@", zzfbeVar.zzz), "@gw_adnetid@", zzfbeVar.zzy), "@gw_allocid@", zzfbeVar.zzx), this.zze, zzfbeVar.zzX);
            }
            String zzi2 = zzi(zzi(zzi(zzi, "@gw_adnetstatus@", this.zza.zzf()), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z12 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdl)).booleanValue() && !TextUtils.isEmpty(str)) {
                z12 = true;
            }
            boolean z13 = !TextUtils.isEmpty(str2);
            if (!z12) {
                if (!z13) {
                    arrayList.add(zzi2);
                }
            } else {
                z11 = z13;
            }
            if (this.zzi.zzf(Uri.parse(zzi2))) {
                Uri.Builder buildUpon = Uri.parse(zzi2).buildUpon();
                if (z12) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z11) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                zzi2 = buildUpon.build().toString();
            }
            arrayList.add(zzi2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[LOOP:0: B:13:0x0059->B:15:0x005f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zze(com.google.android.gms.internal.ads.zzfbe r10, java.util.List r11, com.google.android.gms.internal.ads.zzbvd r12) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.common.util.Clock r1 = r9.zzh
            long r1 = r1.currentTimeMillis()
            java.lang.String r3 = r12.zzc()     // Catch: android.os.RemoteException -> La8
            int r12 = r12.zzb()     // Catch: android.os.RemoteException -> La8
            java.lang.String r12 = java.lang.Integer.toString(r12)     // Catch: android.os.RemoteException -> La8
            com.google.android.gms.internal.ads.zzbbj r4 = com.google.android.gms.internal.ads.zzbbr.zzdm
            com.google.android.gms.internal.ads.zzbbp r5 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L35
            com.google.android.gms.internal.ads.zzfbt r4 = r9.zzg
            if (r4 != 0) goto L32
            com.google.android.gms.internal.ads.zzfre r4 = com.google.android.gms.internal.ads.zzfre.zzc()
            goto L3b
        L32:
            com.google.android.gms.internal.ads.zzfbs r4 = r4.zza
            goto L37
        L35:
            com.google.android.gms.internal.ads.zzfbs r4 = r9.zzf
        L37:
            com.google.android.gms.internal.ads.zzfre r4 = com.google.android.gms.internal.ads.zzfre.zzd(r4)
        L3b:
            com.google.android.gms.internal.ads.zzfie r5 = new com.google.android.gms.internal.ads.zzfqw() { // from class: com.google.android.gms.internal.ads.zzfie
                static {
                    /*
                        com.google.android.gms.internal.ads.zzfie r0 = new com.google.android.gms.internal.ads.zzfie
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.google.android.gms.internal.ads.zzfie) com.google.android.gms.internal.ads.zzfie.zza com.google.android.gms.internal.ads.zzfie
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfie.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfie.<init>():void");
                }

                @Override // com.google.android.gms.internal.ads.zzfqw
                public final java.lang.Object apply(java.lang.Object r1) {
                    /*
                        r0 = this;
                        com.google.android.gms.internal.ads.zzfbs r1 = (com.google.android.gms.internal.ads.zzfbs) r1
                        java.lang.String r1 = com.google.android.gms.internal.ads.zzfig.zza(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfie.apply(java.lang.Object):java.lang.Object");
                }
            }
            com.google.android.gms.internal.ads.zzfre r5 = r4.zza(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.zzb(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzfif r7 = new com.google.android.gms.internal.ads.zzfqw() { // from class: com.google.android.gms.internal.ads.zzfif
                static {
                    /*
                        com.google.android.gms.internal.ads.zzfif r0 = new com.google.android.gms.internal.ads.zzfif
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.google.android.gms.internal.ads.zzfif) com.google.android.gms.internal.ads.zzfif.zza com.google.android.gms.internal.ads.zzfif
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfif.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfif.<init>():void");
                }

                @Override // com.google.android.gms.internal.ads.zzfqw
                public final java.lang.Object apply(java.lang.Object r1) {
                    /*
                        r0 = this;
                        com.google.android.gms.internal.ads.zzfbs r1 = (com.google.android.gms.internal.ads.zzfbs) r1
                        java.lang.String r1 = com.google.android.gms.internal.ads.zzfig.zzb(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfif.apply(java.lang.Object):java.lang.Object");
                }
            }
            com.google.android.gms.internal.ads.zzfre r4 = r4.zza(r7)
            java.lang.Object r4 = r4.zzb(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r11 = r11.iterator()
        L59:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto La7
            java.lang.Object r6 = r11.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = zzi(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = zzi(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = zzi(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = zzi(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = zzi(r6, r7, r12)
            java.lang.String r7 = r9.zzb
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = zzi(r6, r8, r7)
            android.content.Context r7 = r9.zze
            boolean r8 = r10.zzX
            java.lang.String r6 = com.google.android.gms.internal.ads.zzbyh.zzc(r6, r7, r8)
            r0.add(r6)
            goto L59
        La7:
            return r0
        La8:
            r10 = move-exception
            java.lang.String r11 = "Unable to determine award type and amount."
            com.google.android.gms.internal.ads.zzcaa.zzh(r11, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfig.zze(com.google.android.gms.internal.ads.zzfbe, java.util.List, com.google.android.gms.internal.ads.zzbvd):java.util.List");
    }
}
