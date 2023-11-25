package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzwr extends zzdd {
    public static final zzwr zzE;
    @Deprecated
    public static final zzwr zzF;
    public static final zzn zzG;
    private static final String zzU;
    private static final String zzV;
    private static final String zzW;
    private static final String zzX;
    private static final String zzY;
    private static final String zzZ;
    private static final String zzaa;
    private static final String zzab;
    private static final String zzac;
    private static final String zzad;
    private static final String zzae;
    private static final String zzaf;
    private static final String zzag;
    private static final String zzah;
    private static final String zzai;
    private static final String zzaj;
    private static final String zzak;
    private static final String zzal;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    private final SparseArray zzam;
    private final SparseBooleanArray zzan;

    static {
        zzwr zzwrVar = new zzwr(new zzwp());
        zzE = zzwrVar;
        zzF = zzwrVar;
        zzU = Integer.toString(1000, 36);
        zzV = Integer.toString(1001, 36);
        zzW = Integer.toString(CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE, 36);
        zzX = Integer.toString(1003, 36);
        zzY = Integer.toString(1004, 36);
        zzZ = Integer.toString(WebSocketProtocol.CLOSE_NO_STATUS_CODE, 36);
        zzaa = Integer.toString(1006, 36);
        zzab = Integer.toString(1007, 36);
        zzac = Integer.toString(1008, 36);
        zzad = Integer.toString(1009, 36);
        zzae = Integer.toString(1010, 36);
        zzaf = Integer.toString(1011, 36);
        zzag = Integer.toString(1012, 36);
        zzah = Integer.toString(1013, 36);
        zzai = Integer.toString(1014, 36);
        zzaj = Integer.toString(1015, 36);
        zzak = Integer.toString(1016, 36);
        zzal = Integer.toString(1017, 36);
        zzG = new zzn() { // from class: com.google.android.gms.internal.ads.zzwn
        };
    }

    public static zzwr zzd(Context context) {
        return new zzwr(new zzwp(context));
    }

    @Override // com.google.android.gms.internal.ads.zzdd
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzwr.class == obj.getClass()) {
            zzwr zzwrVar = (zzwr) obj;
            if (super.equals(zzwrVar) && this.zzH == zzwrVar.zzH && this.zzJ == zzwrVar.zzJ && this.zzL == zzwrVar.zzL && this.zzQ == zzwrVar.zzQ && this.zzR == zzwrVar.zzR && this.zzT == zzwrVar.zzT) {
                SparseBooleanArray sparseBooleanArray = this.zzan;
                SparseBooleanArray sparseBooleanArray2 = zzwrVar.zzan;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                                break;
                            }
                            i10++;
                        } else {
                            SparseArray sparseArray = this.zzam;
                            SparseArray sparseArray2 = zzwrVar.zzam;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i11 = 0; i11 < size2; i11++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i11);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzvs zzvsVar = (zzvs) entry.getKey();
                                                if (map2.containsKey(zzvsVar) && zzfk.zzD(entry.getValue(), map2.get(zzvsVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdd
    public final int hashCode() {
        return (((((((((((((super.hashCode() + 31) * 31) + (this.zzH ? 1 : 0)) * 961) + (this.zzJ ? 1 : 0)) * 961) + (this.zzL ? 1 : 0)) * 28629151) + (this.zzQ ? 1 : 0)) * 31) + (this.zzR ? 1 : 0)) * 961) + (this.zzT ? 1 : 0)) * 31;
    }

    public final zzwp zzc() {
        return new zzwp(this, null);
    }

    @Deprecated
    public final zzwt zze(int i10, zzvs zzvsVar) {
        Map map = (Map) this.zzam.get(i10);
        if (map != null) {
            return (zzwt) map.get(zzvsVar);
        }
        return null;
    }

    public final boolean zzf(int i10) {
        return this.zzan.get(i10);
    }

    @Deprecated
    public final boolean zzg(int i10, zzvs zzvsVar) {
        Map map = (Map) this.zzam.get(i10);
        if (map != null && map.containsKey(zzvsVar)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzwr(zzwp zzwpVar) {
        super(zzwpVar);
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        SparseArray sparseArray;
        SparseBooleanArray sparseBooleanArray;
        z10 = zzwpVar.zza;
        this.zzH = z10;
        this.zzI = false;
        z11 = zzwpVar.zzb;
        this.zzJ = z11;
        this.zzK = false;
        z12 = zzwpVar.zzc;
        this.zzL = z12;
        this.zzM = false;
        this.zzN = false;
        this.zzO = false;
        this.zzP = false;
        z13 = zzwpVar.zzd;
        this.zzQ = z13;
        z14 = zzwpVar.zze;
        this.zzR = z14;
        this.zzS = false;
        z15 = zzwpVar.zzf;
        this.zzT = z15;
        sparseArray = zzwpVar.zzg;
        this.zzam = sparseArray;
        sparseBooleanArray = zzwpVar.zzh;
        this.zzan = sparseBooleanArray;
    }
}
