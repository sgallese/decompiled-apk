package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.zzgpq;
import com.google.android.gms.internal.ads.zzgpr;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzgpr<MessageType extends zzgpr<MessageType, BuilderType>, BuilderType extends zzgpq<MessageType, BuilderType>> implements zzgta {
    protected int zza = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public static void zzav(Iterable iterable, List list) {
        byte[] bArr = zzgsa.zzd;
        iterable.getClass();
        if (iterable instanceof zzgsi) {
            List zzh = ((zzgsi) iterable).zzh();
            zzgsi zzgsiVar = (zzgsi) list;
            int size = list.size();
            for (Object obj : zzh) {
                if (obj == null) {
                    String str = "Element at index " + (zzgsiVar.size() - size) + " is null.";
                    int size2 = zzgsiVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        }
                        zzgsiVar.remove(size2);
                    }
                    throw new NullPointerException(str);
                } else if (obj instanceof zzgqi) {
                    zzgsiVar.zzi((zzgqi) obj);
                } else {
                    zzgsiVar.add((String) obj);
                }
            }
        } else if (!(iterable instanceof zzgth)) {
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
            }
            int size3 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    String str2 = "Element at index " + (list.size() - size3) + " is null.";
                    int size4 = list.size();
                    while (true) {
                        size4--;
                        if (size4 < size3) {
                            break;
                        }
                        list.remove(size4);
                    }
                    throw new NullPointerException(str2);
                }
                list.add(obj2);
            }
        } else {
            list.addAll(iterable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zzat(zzgtt zzgttVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgta
    public final zzgqi zzau() {
        try {
            int zzaz = zzaz();
            zzgqi zzgqiVar = zzgqi.zzb;
            byte[] bArr = new byte[zzaz];
            zzgqx zzC = zzgqx.zzC(bArr, 0, zzaz);
            zzaW(zzC);
            zzC.zzD();
            return new zzgqe(bArr);
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }

    public final void zzaw(OutputStream outputStream) throws IOException {
        int zzaz = zzaz();
        int i10 = zzgqx.zzf;
        if (zzaz > 4096) {
            zzaz = RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
        }
        zzgqv zzgqvVar = new zzgqv(outputStream, zzaz);
        zzaW(zzgqvVar);
        zzgqvVar.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzgta
    public final byte[] zzax() {
        try {
            int zzaz = zzaz();
            byte[] bArr = new byte[zzaz];
            zzgqx zzC = zzgqx.zzC(bArr, 0, zzaz);
            zzaW(zzC);
            zzC.zzD();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }
}
