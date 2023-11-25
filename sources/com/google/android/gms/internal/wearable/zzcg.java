package com.google.android.gms.internal.wearable;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.wearable.zzcd;
import com.google.android.gms.internal.wearable.zzcg;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public abstract class zzcg<MessageType extends zzcg<MessageType, BuilderType>, BuilderType extends zzcd<MessageType, BuilderType>> extends zzar<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzeq zzc = zzeq.zzc();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzcg zzO(Class cls) {
        Map map = zzb;
        zzcg zzcgVar = (zzcg) map.get(cls);
        if (zzcgVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzcgVar = (zzcg) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzcgVar == null) {
            zzcgVar = (zzcg) ((zzcg) zzez.zze(cls)).zzG(6, null, null);
            if (zzcgVar != null) {
                map.put(cls, zzcgVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzcgVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzcg zzQ(zzcg zzcgVar, byte[] bArr) throws zzcq {
        zzcg zzc = zzc(zzcgVar, bArr, 0, bArr.length, zzbu.zza);
        zzb(zzc);
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzcg zzR(zzcg zzcgVar, byte[] bArr, zzbu zzbuVar) throws zzcq {
        zzcg zzc = zzc(zzcgVar, bArr, 0, bArr.length, zzbuVar);
        zzb(zzc);
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzcl zzS() {
        return zzcb.zze();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzcm zzT() {
        return zzdc.zzf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzcn zzU() {
        return zzdw.zze();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzcn zzV(zzcn zzcnVar) {
        int i10;
        int size = zzcnVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return zzcnVar.zzd(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzX(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object zzY(zzdn zzdnVar, String str, Object[] objArr) {
        return new zzdx(zzdnVar, str, objArr);
    }

    private final int zza(zzdy zzdyVar) {
        return zzdv.zza().zzb(getClass()).zza(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void zzab(Class cls, zzcg zzcgVar) {
        zzcgVar.zzaa();
        zzb.put(cls, zzcgVar);
    }

    private static zzcg zzb(zzcg zzcgVar) throws zzcq {
        if (zzcgVar != null && !zzcgVar.zzae()) {
            zzcq zza = new zzeo(zzcgVar).zza();
            zza.zzf(zzcgVar);
            throw zza;
        }
        return zzcgVar;
    }

    private static zzcg zzc(zzcg zzcgVar, byte[] bArr, int i10, int i11, zzbu zzbuVar) throws zzcq {
        zzcg zzP = zzcgVar.zzP();
        try {
            zzdy zzb2 = zzdv.zza().zzb(zzP.getClass());
            zzb2.zzh(zzP, bArr, 0, i11, new zzau(zzbuVar));
            zzb2.zzf(zzP);
            return zzP;
        } catch (zzcq e10) {
            e10.zzf(zzP);
            throw e10;
        } catch (zzeo e11) {
            zzcq zza = e11.zza();
            zza.zzf(zzP);
            throw zza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzcq) {
                throw ((zzcq) e12.getCause());
            }
            zzcq zzcqVar = new zzcq(e12);
            zzcqVar.zzf(zzP);
            throw zzcqVar;
        } catch (IndexOutOfBoundsException unused) {
            zzcq zzg = zzcq.zzg();
            zzg.zzf(zzP);
            throw zzg;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzdv.zza().zzb(getClass()).zzj(this, (zzcg) obj);
    }

    public final int hashCode() {
        if (!zzaf()) {
            int i10 = this.zza;
            if (i10 == 0) {
                int zzL = zzL();
                this.zza = zzL;
                return zzL;
            }
            return i10;
        }
        return zzL();
    }

    public final String toString() {
        return zzdp.zza(this, super.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zzG(int i10, Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.wearable.zzar
    public final int zzH(zzdy zzdyVar) {
        if (zzaf()) {
            int zza = zzdyVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 == Integer.MAX_VALUE) {
            int zza2 = zzdyVar.zza(this);
            if (zza2 >= 0) {
                this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | zza2;
                return zza2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
        }
        return i10;
    }

    final int zzL() {
        return zzdv.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.wearable.zzdn
    public final int zzM() {
        int i10;
        if (zzaf()) {
            i10 = zza(null);
            if (i10 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i10);
            }
        } else {
            i10 = this.zzd & Integer.MAX_VALUE;
            if (i10 == Integer.MAX_VALUE) {
                i10 = zza(null);
                if (i10 >= 0) {
                    this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | i10;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i10);
                }
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzcd zzN() {
        return (zzcd) zzG(5, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzcg zzP() {
        return (zzcg) zzG(4, null, null);
    }

    @Override // com.google.android.gms.internal.wearable.zzdn
    public final /* synthetic */ zzdm zzW() {
        return (zzcd) zzG(5, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzZ() {
        zzdv.zza().zzb(getClass()).zzf(this);
        zzaa();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzaa() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzac(int i10) {
        this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.wearable.zzdn
    public final void zzad(zzbp zzbpVar) throws IOException {
        zzdv.zza().zzb(getClass()).zzi(this, zzbq.zza(zzbpVar));
    }

    public final boolean zzae() {
        zzcg<MessageType, BuilderType> zzcgVar;
        byte byteValue = ((Byte) zzG(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzdv.zza().zzb(getClass()).zzk(this);
        if (true != zzk) {
            zzcgVar = null;
        } else {
            zzcgVar = this;
        }
        zzG(2, zzcgVar, null);
        return zzk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzaf() {
        if ((this.zzd & RecyclerView.UNDEFINED_DURATION) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.wearable.zzdo
    public final /* synthetic */ zzdn zzag() {
        return (zzcg) zzG(6, null, null);
    }
}
