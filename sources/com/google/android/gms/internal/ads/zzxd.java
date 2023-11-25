package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzxd extends zzxi implements zzlo {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfvm zzc = zzfvm.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzwj
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i10 = zzxd.zzb;
            if (num.intValue() == -1) {
                if (num2.intValue() != -1) {
                    return -1;
                }
                return 0;
            } else if (num2.intValue() == -1) {
                return 1;
            } else {
                return num.intValue() - num2.intValue();
            }
        }
    });
    private static final zzfvm zzd = zzfvm.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzwk
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i10 = zzxd.zzb;
            return 0;
        }
    });
    public final Context zza;
    private final Object zze;
    private final boolean zzf;
    private zzwr zzg;
    private zzww zzh;
    private zzk zzi;
    private final zzvy zzj;

    public zzxd(Context context) {
        Context context2;
        zzvy zzvyVar = new zzvy();
        zzwr zzd2 = zzwr.zzd(context);
        this.zze = new Object();
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.zza = context2;
        this.zzj = zzvyVar;
        this.zzg = zzd2;
        this.zzi = zzk.zza;
        boolean z10 = false;
        if (context != null && zzfk.zzF(context)) {
            z10 = true;
        }
        this.zzf = z10;
        if (!z10 && context != null && zzfk.zza >= 32) {
            this.zzh = zzww.zza(context);
        }
        if (this.zzg.zzQ && context == null) {
            zzes.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int zza(zzam zzamVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(zzamVar.zzd)) {
            return 4;
        }
        String zzg = zzg(str);
        String zzg2 = zzg(zzamVar.zzd);
        if (zzg2 != null && zzg != null) {
            if (!zzg2.startsWith(zzg) && !zzg.startsWith(zzg2)) {
                int i10 = zzfk.zza;
                if (!zzg2.split("-", 2)[0].equals(zzg.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        } else if (!z10 || zzg2 != null) {
            return 0;
        } else {
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String zzg(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "und")) {
            return str;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        if (r1 != 3) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ boolean zzl(com.google.android.gms.internal.ads.zzxd r8, com.google.android.gms.internal.ads.zzam r9) {
        /*
            java.lang.Object r0 = r8.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzwr r1 = r8.zzg     // Catch: java.lang.Throwable -> L8f
            boolean r1 = r1.zzQ     // Catch: java.lang.Throwable -> L8f
            r2 = 1
            if (r1 == 0) goto L8d
            boolean r1 = r8.zzf     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L8d
            int r1 = r9.zzz     // Catch: java.lang.Throwable -> L8f
            r3 = 2
            if (r1 <= r3) goto L8d
            java.lang.String r1 = r9.zzm     // Catch: java.lang.Throwable -> L8f
            r4 = 32
            r5 = 0
            if (r1 != 0) goto L1b
            goto L65
        L1b:
            int r6 = r1.hashCode()     // Catch: java.lang.Throwable -> L8f
            r7 = 3
            switch(r6) {
                case -2123537834: goto L42;
                case 187078296: goto L38;
                case 187078297: goto L2e;
                case 1504578661: goto L24;
                default: goto L23;
            }
        L23:
            goto L4c
        L24:
            java.lang.String r6 = "audio/eac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 1
            goto L4d
        L2e:
            java.lang.String r6 = "audio/ac4"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 3
            goto L4d
        L38:
            java.lang.String r6 = "audio/ac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 0
            goto L4d
        L42:
            java.lang.String r6 = "audio/eac3-joc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = 2
            goto L4d
        L4c:
            r1 = -1
        L4d:
            if (r1 == 0) goto L56
            if (r1 == r2) goto L56
            if (r1 == r3) goto L56
            if (r1 == r7) goto L56
            goto L65
        L56:
            int r1 = com.google.android.gms.internal.ads.zzfk.zza     // Catch: java.lang.Throwable -> L8f
            if (r1 < r4) goto L8d
            com.google.android.gms.internal.ads.zzww r1 = r8.zzh     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8d
            boolean r1 = r1.zzg()     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L65
            goto L8d
        L65:
            int r1 = com.google.android.gms.internal.ads.zzfk.zza     // Catch: java.lang.Throwable -> L8f
            if (r1 < r4) goto L8c
            com.google.android.gms.internal.ads.zzww r1 = r8.zzh     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8c
            boolean r3 = r1.zzg()     // Catch: java.lang.Throwable -> L8f
            if (r3 == 0) goto L8c
            boolean r1 = r1.zze()     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzww r1 = r8.zzh     // Catch: java.lang.Throwable -> L8f
            boolean r1 = r1.zzf()     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzww r1 = r8.zzh     // Catch: java.lang.Throwable -> L8f
            com.google.android.gms.internal.ads.zzk r8 = r8.zzi     // Catch: java.lang.Throwable -> L8f
            boolean r8 = r1.zzd(r8, r9)     // Catch: java.lang.Throwable -> L8f
            if (r8 == 0) goto L8c
            goto L8d
        L8c:
            r2 = 0
        L8d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            return r2
        L8f:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxd.zzl(com.google.android.gms.internal.ads.zzxd, com.google.android.gms.internal.ads.zzam):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean zzn(int i10, boolean z10) {
        int i11 = i10 & 7;
        if (i11 == 4) {
            return true;
        }
        if (z10 && i11 == 3) {
            return true;
        }
        return false;
    }

    private static void zzt(zzvs zzvsVar, zzdd zzddVar, Map map) {
        for (int i10 = 0; i10 < zzvsVar.zzc; i10++) {
            if (((zzda) zzddVar.zzC.get(zzvsVar.zzb(i10))) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzu() {
        boolean z10;
        zzww zzwwVar;
        synchronized (this.zze) {
            z10 = false;
            if (this.zzg.zzQ && !this.zzf && zzfk.zza >= 32 && (zzwwVar = this.zzh) != null && zzwwVar.zzg()) {
                z10 = true;
            }
        }
        if (z10) {
            zzs();
        }
    }

    private static final Pair zzv(int i10, zzxh zzxhVar, int[][][] iArr, zzwy zzwyVar, Comparator comparator) {
        RandomAccess randomAccess;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 2; i11++) {
            if (i10 == zzxhVar.zzc(i11)) {
                zzvs zzd2 = zzxhVar.zzd(i11);
                for (int i12 = 0; i12 < zzd2.zzc; i12++) {
                    zzcy zzb2 = zzd2.zzb(i12);
                    List zza = zzwyVar.zza(i11, zzb2, iArr[i11][i12]);
                    int i13 = zzb2.zzb;
                    int i14 = 1;
                    boolean[] zArr = new boolean[1];
                    int i15 = 0;
                    while (i15 <= 0) {
                        zzwz zzwzVar = (zzwz) zza.get(i15);
                        int zzb3 = zzwzVar.zzb();
                        if (!zArr[i15] && zzb3 != 0) {
                            if (zzb3 == i14) {
                                randomAccess = zzfud.zzm(zzwzVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzwzVar);
                                for (int i16 = i15 + 1; i16 <= 0; i16++) {
                                    zzwz zzwzVar2 = (zzwz) zza.get(i16);
                                    if (zzwzVar2.zzb() == 2 && zzwzVar.zzc(zzwzVar2)) {
                                        arrayList2.add(zzwzVar2);
                                        zArr[i16] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i15++;
                        i14 = 1;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((zzwz) list.get(i17)).zzc;
        }
        zzwz zzwzVar3 = (zzwz) list.get(0);
        return Pair.create(new zzxe(zzwzVar3.zzb, iArr2, 0), Integer.valueOf(zzwzVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    protected final Pair zzb(zzxh zzxhVar, int[][][] iArr, final int[] iArr2, zzts zztsVar, zzcw zzcwVar) throws zzil {
        final zzwr zzwrVar;
        int i10;
        final boolean z10;
        final String str;
        int[] iArr3;
        int length;
        zzxf zza;
        zzww zzwwVar;
        int[][][] iArr4 = iArr;
        synchronized (this.zze) {
            zzwrVar = this.zzg;
            if (zzwrVar.zzQ && zzfk.zza >= 32 && (zzwwVar = this.zzh) != null) {
                Looper myLooper = Looper.myLooper();
                zzdy.zzb(myLooper);
                zzwwVar.zzb(this, myLooper);
            }
        }
        int i11 = 2;
        zzxe[] zzxeVarArr = new zzxe[2];
        Pair zzv = zzv(2, zzxhVar, iArr4, new zzwy() { // from class: com.google.android.gms.internal.ads.zzwf
            /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
            @Override // com.google.android.gms.internal.ads.zzwy
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List zza(int r20, com.google.android.gms.internal.ads.zzcy r21, int[] r22) {
                /*
                    Method dump skipped, instructions count: 205
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwf.zza(int, com.google.android.gms.internal.ads.zzcy, int[]):java.util.List");
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwg
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                zzfts zzj = zzfts.zzj();
                zzxa zzxaVar = new Comparator() { // from class: com.google.android.gms.internal.ads.zzxa
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxc.zzd((zzxc) obj3, (zzxc) obj4);
                    }
                };
                zzfts zzb2 = zzj.zzc((zzxc) Collections.max(list, zzxaVar), (zzxc) Collections.max(list2, zzxaVar), zzxaVar).zzb(list.size(), list2.size());
                zzxb zzxbVar = new Comparator() { // from class: com.google.android.gms.internal.ads.zzxb
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxc.zza((zzxc) obj3, (zzxc) obj4);
                    }
                };
                return zzb2.zzc((zzxc) Collections.max(list, zzxbVar), (zzxc) Collections.max(list2, zzxbVar), zzxbVar).zza();
            }
        });
        if (zzv != null) {
            zzxeVarArr[((Integer) zzv.second).intValue()] = (zzxe) zzv.first;
        }
        int i12 = 0;
        while (true) {
            i10 = 1;
            if (i12 >= 2) {
                z10 = false;
                break;
            } else if (zzxhVar.zzc(i12) == 2 && zzxhVar.zzd(i12).zzc > 0) {
                z10 = true;
                break;
            } else {
                i12++;
            }
        }
        Pair zzv2 = zzv(1, zzxhVar, iArr4, new zzwy() { // from class: com.google.android.gms.internal.ads.zzwd
            @Override // com.google.android.gms.internal.ads.zzwy
            public final List zza(int i13, zzcy zzcyVar, int[] iArr5) {
                final zzxd zzxdVar = zzxd.this;
                zzwr zzwrVar2 = zzwrVar;
                boolean z11 = z10;
                zzfrj zzfrjVar = new zzfrj() { // from class: com.google.android.gms.internal.ads.zzwc
                    @Override // com.google.android.gms.internal.ads.zzfrj
                    public final boolean zza(Object obj) {
                        return zzxd.zzl(zzxd.this, (zzam) obj);
                    }
                };
                zzfua zzfuaVar = new zzfua();
                int i14 = 0;
                while (true) {
                    int i15 = zzcyVar.zzb;
                    if (i14 <= 0) {
                        zzfuaVar.zzf(new zzwl(i13, zzcyVar, i14, zzwrVar2, iArr5[i14], z11, zzfrjVar));
                        i14++;
                    } else {
                        return zzfuaVar.zzi();
                    }
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwe
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzwl) Collections.max((List) obj)).zza((zzwl) Collections.max((List) obj2));
            }
        });
        if (zzv2 != null) {
            zzxeVarArr[((Integer) zzv2.second).intValue()] = (zzxe) zzv2.first;
        }
        if (zzv2 == null) {
            str = null;
        } else {
            Object obj = zzv2.first;
            str = ((zzxe) obj).zza.zzb(((zzxe) obj).zzb[0]).zzd;
        }
        int i13 = 3;
        Pair zzv3 = zzv(3, zzxhVar, iArr4, new zzwy() { // from class: com.google.android.gms.internal.ads.zzwh
            @Override // com.google.android.gms.internal.ads.zzwy
            public final List zza(int i14, zzcy zzcyVar, int[] iArr5) {
                zzwr zzwrVar2 = zzwr.this;
                String str2 = str;
                int i15 = zzxd.zzb;
                zzfua zzfuaVar = new zzfua();
                int i16 = 0;
                while (true) {
                    int i17 = zzcyVar.zzb;
                    if (i16 <= 0) {
                        zzfuaVar.zzf(new zzwx(i14, zzcyVar, i16, zzwrVar2, iArr5[i16], str2));
                        i16++;
                    } else {
                        return zzfuaVar.zzi();
                    }
                }
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwi
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((zzwx) ((List) obj2).get(0)).zza((zzwx) ((List) obj3).get(0));
            }
        });
        if (zzv3 != null) {
            zzxeVarArr[((Integer) zzv3.second).intValue()] = (zzxe) zzv3.first;
        }
        int i14 = 0;
        while (i14 < i11) {
            int zzc2 = zzxhVar.zzc(i14);
            if (zzc2 != i11 && zzc2 != i10 && zzc2 != i13) {
                zzvs zzd2 = zzxhVar.zzd(i14);
                int[][] iArr5 = iArr4[i14];
                int i15 = 0;
                zzcy zzcyVar = null;
                int i16 = 0;
                zzwm zzwmVar = null;
                while (i15 < zzd2.zzc) {
                    zzcy zzb2 = zzd2.zzb(i15);
                    int[] iArr6 = iArr5[i15];
                    zzwm zzwmVar2 = zzwmVar;
                    int i17 = 0;
                    while (true) {
                        int i18 = zzb2.zzb;
                        if (i17 <= 0) {
                            if (zzn(iArr6[i17], zzwrVar.zzR)) {
                                zzwm zzwmVar3 = new zzwm(zzb2.zzb(i17), iArr6[i17]);
                                if (zzwmVar2 == null || zzwmVar3.compareTo(zzwmVar2) > 0) {
                                    zzwmVar2 = zzwmVar3;
                                    i16 = i17;
                                    zzcyVar = zzb2;
                                }
                            }
                            i17++;
                        }
                    }
                    i15++;
                    zzwmVar = zzwmVar2;
                }
                zzxeVarArr[i14] = zzcyVar == null ? null : new zzxe(zzcyVar, new int[]{i16}, 0);
            }
            i14++;
            iArr4 = iArr;
            i11 = 2;
            i10 = 1;
            i13 = 3;
        }
        HashMap hashMap = new HashMap();
        for (int i19 = 0; i19 < 2; i19++) {
            zzt(zzxhVar.zzd(i19), zzwrVar, hashMap);
        }
        zzt(zzxhVar.zze(), zzwrVar, hashMap);
        for (int i20 = 0; i20 < 2; i20++) {
            if (((zzda) hashMap.get(Integer.valueOf(zzxhVar.zzc(i20)))) != null) {
                throw null;
            }
        }
        int i21 = 0;
        for (int i22 = 2; i21 < i22; i22 = 2) {
            zzvs zzd3 = zzxhVar.zzd(i21);
            if (zzwrVar.zzg(i21, zzd3)) {
                if (zzwrVar.zze(i21, zzd3) == null) {
                    zzxeVarArr[i21] = null;
                } else {
                    throw null;
                }
            }
            i21++;
        }
        int i23 = 0;
        for (int i24 = 2; i23 < i24; i24 = 2) {
            int zzc3 = zzxhVar.zzc(i23);
            if (zzwrVar.zzf(i23) || zzwrVar.zzD.contains(Integer.valueOf(zzc3))) {
                zzxeVarArr[i23] = null;
            }
            i23++;
        }
        zzvy zzvyVar = this.zzj;
        zzxt zzq = zzq();
        zzfud zzf = zzvz.zzf(zzxeVarArr);
        int i25 = 2;
        zzxf[] zzxfVarArr = new zzxf[2];
        int i26 = 0;
        while (i26 < i25) {
            zzxe zzxeVar = zzxeVarArr[i26];
            if (zzxeVar != null && (length = (iArr3 = zzxeVar.zzb).length) != 0) {
                if (length == 1) {
                    zza = new zzxg(zzxeVar.zza, iArr3[0], 0, 0, null);
                } else {
                    zza = zzvyVar.zza(zzxeVar.zza, iArr3, 0, zzq, (zzfud) zzf.get(i26));
                }
                zzxfVarArr[i26] = zza;
            }
            i26++;
            i25 = 2;
        }
        zzlq[] zzlqVarArr = new zzlq[i25];
        for (int i27 = 0; i27 < i25; i27++) {
            zzlqVarArr[i27] = (zzwrVar.zzf(i27) || zzwrVar.zzD.contains(Integer.valueOf(zzxhVar.zzc(i27))) || (zzxhVar.zzc(i27) != -2 && zzxfVarArr[i27] == null)) ? null : zzlq.zza;
        }
        return Pair.create(zzlqVarArr, zzxfVarArr);
    }

    public final zzwr zzd() {
        zzwr zzwrVar;
        synchronized (this.zze) {
            zzwrVar = this.zzg;
        }
        return zzwrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final void zzi() {
        zzww zzwwVar;
        synchronized (this.zze) {
            if (zzfk.zza >= 32 && (zzwwVar = this.zzh) != null) {
                zzwwVar.zzc();
            }
        }
        super.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final void zzj(zzk zzkVar) {
        boolean z10;
        synchronized (this.zze) {
            z10 = !this.zzi.equals(zzkVar);
            this.zzi = zzkVar;
        }
        if (z10) {
            zzu();
        }
    }

    public final void zzk(zzwp zzwpVar) {
        boolean z10;
        zzwr zzwrVar = new zzwr(zzwpVar);
        synchronized (this.zze) {
            z10 = !this.zzg.equals(zzwrVar);
            this.zzg = zzwrVar;
        }
        if (z10) {
            if (zzwrVar.zzQ && this.zza == null) {
                zzes.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final boolean zzm() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final zzlo zzc() {
        return this;
    }
}
