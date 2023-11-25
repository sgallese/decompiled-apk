package com.google.android.gms.internal.play_billing;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.play_billing.zzbx;
import com.google.android.gms.internal.play_billing.zzcb;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes3.dex */
public abstract class zzcb<MessageType extends zzcb<MessageType, BuilderType>, BuilderType extends zzbx<MessageType, BuilderType>> extends zzak<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzeh zzc = zzeh.zzc();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzcb zzh(Class cls) {
        Map map = zzb;
        zzcb zzcbVar = (zzcb) map.get(cls);
        if (zzcbVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzcbVar = (zzcb) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzcbVar == null) {
            zzcbVar = (zzcb) ((zzcb) zzeq.zze(cls)).zzu(6, null, null);
            if (zzcbVar != null) {
                map.put(cls, zzcbVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzcbVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzcb zzj(zzcb zzcbVar, byte[] bArr, zzbn zzbnVar) throws zzci {
        zzcb zzw = zzw(zzcbVar, bArr, 0, bArr.length, zzbnVar);
        if (zzw != null && !zzw.zzs()) {
            zzci zza = new zzef(zzw).zza();
            zza.zzf(zzw);
            throw zza;
        }
        return zzw;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzl(Method method, Object obj, Object... objArr) {
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
    public static Object zzm(zzdf zzdfVar, String str, Object[] objArr) {
        return new zzdo(zzdfVar, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void zzp(Class cls, zzcb zzcbVar) {
        zzcbVar.zzo();
        zzb.put(cls, zzcbVar);
    }

    private final int zzv(zzdp zzdpVar) {
        return zzdn.zza().zzb(getClass()).zza(this);
    }

    private static zzcb zzw(zzcb zzcbVar, byte[] bArr, int i10, int i11, zzbn zzbnVar) throws zzci {
        zzcb zzi = zzcbVar.zzi();
        try {
            zzdp zzb2 = zzdn.zza().zzb(zzi.getClass());
            zzb2.zzh(zzi, bArr, 0, i11, new zzan(zzbnVar));
            zzb2.zzf(zzi);
            return zzi;
        } catch (zzci e10) {
            e10.zzf(zzi);
            throw e10;
        } catch (zzef e11) {
            zzci zza = e11.zza();
            zza.zzf(zzi);
            throw zza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzci) {
                throw ((zzci) e12.getCause());
            }
            zzci zzciVar = new zzci(e12);
            zzciVar.zzf(zzi);
            throw zzciVar;
        } catch (IndexOutOfBoundsException unused) {
            zzci zzg = zzci.zzg();
            zzg.zzf(zzi);
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
        return zzdn.zza().zzb(getClass()).zzj(this, (zzcb) obj);
    }

    public final int hashCode() {
        if (!zzt()) {
            int i10 = this.zza;
            if (i10 == 0) {
                int zzd = zzd();
                this.zza = zzd;
                return zzd;
            }
            return i10;
        }
        return zzd();
    }

    public final String toString() {
        return zzdh.zza(this, super.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzak
    public final int zza(zzdp zzdpVar) {
        if (zzt()) {
            int zza = zzdpVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 == Integer.MAX_VALUE) {
            int zza2 = zzdpVar.zza(this);
            if (zza2 >= 0) {
                this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | zza2;
                return zza2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
        }
        return i10;
    }

    final int zzd() {
        return zzdn.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdf
    public final int zze() {
        int i10;
        if (zzt()) {
            i10 = zzv(null);
            if (i10 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i10);
            }
        } else {
            i10 = this.zzd & Integer.MAX_VALUE;
            if (i10 == Integer.MAX_VALUE) {
                i10 = zzv(null);
                if (i10 >= 0) {
                    this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | i10;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i10);
                }
            }
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdg
    public final /* synthetic */ zzdf zzf() {
        return (zzcb) zzu(6, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzbx zzg() {
        return (zzbx) zzu(5, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzcb zzi() {
        return (zzcb) zzu(4, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdf
    public final /* synthetic */ zzde zzk() {
        return (zzbx) zzu(5, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzn() {
        zzdn.zza().zzb(getClass()).zzf(this);
        zzo();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzo() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzq(int i10) {
        this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdf
    public final void zzr(zzbi zzbiVar) throws IOException {
        zzdn.zza().zzb(getClass()).zzi(this, zzbj.zza(zzbiVar));
    }

    public final boolean zzs() {
        zzcb<MessageType, BuilderType> zzcbVar;
        byte byteValue = ((Byte) zzu(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzdn.zza().zzb(getClass()).zzk(this);
        if (true != zzk) {
            zzcbVar = null;
        } else {
            zzcbVar = this;
        }
        zzu(2, zzcbVar, null);
        return zzk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzt() {
        if ((this.zzd & RecyclerView.UNDEFINED_DURATION) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zzu(int i10, Object obj, Object obj2);
}
