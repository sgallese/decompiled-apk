package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaay {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, 224, UserVerificationMethods.USER_VERIFY_HANDPRINT, 384, 448, 512, 640, 768, 896, UserVerificationMethods.USER_VERIFY_ALL, 1152, 1280, 1536, 1920, RecyclerView.m.FLAG_MOVED, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, 6144, 7680};

    public static zzam zza(byte[] bArr, String str, String str2, zzad zzadVar) {
        zzfa zzfaVar;
        int i10 = 0;
        int i11 = -1;
        if (bArr[0] == Byte.MAX_VALUE) {
            zzfaVar = new zzfa(bArr, bArr.length);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b10 = copyOf[0];
            if (b10 == -2 || b10 == -1) {
                for (int i12 = 0; i12 < copyOf.length - 1; i12 += 2) {
                    byte b11 = copyOf[i12];
                    int i13 = i12 + 1;
                    copyOf[i12] = copyOf[i13];
                    copyOf[i13] = b11;
                }
            }
            int length = copyOf.length;
            zzfaVar = new zzfa(copyOf, length);
            if (copyOf[0] == 31) {
                zzfa zzfaVar2 = new zzfa(copyOf, length);
                while (zzfaVar2.zza() >= 16) {
                    zzfaVar2.zzl(2);
                    zzfaVar.zzf(zzfaVar2.zzd(14), 14);
                }
            }
            zzfaVar.zzi(copyOf, copyOf.length);
        }
        zzfaVar.zzl(60);
        int i14 = zzb[zzfaVar.zzd(6)];
        int i15 = zzc[zzfaVar.zzd(4)];
        int zzd2 = zzfaVar.zzd(5);
        if (zzd2 < 29) {
            i11 = (zzd[zzd2] * 1000) / 2;
        }
        zzfaVar.zzl(10);
        if (zzfaVar.zzd(2) > 0) {
            i10 = 1;
        }
        int i16 = i14 + i10;
        zzak zzakVar = new zzak();
        zzakVar.zzH(str);
        zzakVar.zzS("audio/vnd.dts");
        zzakVar.zzv(i11);
        zzakVar.zzw(i16);
        zzakVar.zzT(i15);
        zzakVar.zzB(null);
        zzakVar.zzK(str2);
        return zzakVar.zzY();
    }
}
