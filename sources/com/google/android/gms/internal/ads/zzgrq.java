package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.zzgrm;
import com.google.android.gms.internal.ads.zzgrq;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzgrq<MessageType extends zzgrq<MessageType, BuilderType>, BuilderType extends zzgrm<MessageType, BuilderType>> extends zzgpr<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzgul zzc = zzgul.zzc();

    private final int zza(zzgtt zzgttVar) {
        return zzgti.zza().zzb(getClass()).zza(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgrq zzaC(Class cls) {
        Map map = zzb;
        zzgrq zzgrqVar = (zzgrq) map.get(cls);
        if (zzgrqVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgrqVar = (zzgrq) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzgrqVar == null) {
            zzgrqVar = (zzgrq) ((zzgrq) zzguu.zzg(cls)).zzb(6, null, null);
            if (zzgrqVar != null) {
                map.put(cls, zzgrqVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzgrqVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzgrq zzaE(zzgrq zzgrqVar, zzgqi zzgqiVar) throws zzgsc {
        zzgrc zzgrcVar = zzgrc.zza;
        zzgqq zzl = zzgqiVar.zzl();
        zzgrq zzaD = zzgrqVar.zzaD();
        try {
            zzgtt zzb2 = zzgti.zza().zzb(zzaD.getClass());
            zzb2.zzh(zzaD, zzgqr.zzq(zzl), zzgrcVar);
            zzb2.zzf(zzaD);
            try {
                zzl.zzz(0);
                zzc(zzaD);
                zzc(zzaD);
                return zzaD;
            } catch (zzgsc e10) {
                e10.zzh(zzaD);
                throw e10;
            }
        } catch (zzgsc e11) {
            e = e11;
            if (e.zzl()) {
                e = new zzgsc(e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzguj e12) {
            zzgsc zza = e12.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e13) {
            if (e13.getCause() instanceof zzgsc) {
                throw ((zzgsc) e13.getCause());
            }
            zzgsc zzgscVar = new zzgsc(e13);
            zzgscVar.zzh(zzaD);
            throw zzgscVar;
        } catch (RuntimeException e14) {
            if (e14.getCause() instanceof zzgsc) {
                throw ((zzgsc) e14.getCause());
            }
            throw e14;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzgrq zzaF(zzgrq zzgrqVar, byte[] bArr) throws zzgsc {
        zzgrq zzd = zzd(zzgrqVar, bArr, 0, bArr.length, zzgrc.zza);
        zzc(zzd);
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzgrq zzaG(zzgrq zzgrqVar, zzgqi zzgqiVar, zzgrc zzgrcVar) throws zzgsc {
        zzgqq zzl = zzgqiVar.zzl();
        zzgrq zzaD = zzgrqVar.zzaD();
        try {
            zzgtt zzb2 = zzgti.zza().zzb(zzaD.getClass());
            zzb2.zzh(zzaD, zzgqr.zzq(zzl), zzgrcVar);
            zzb2.zzf(zzaD);
            try {
                zzl.zzz(0);
                zzc(zzaD);
                return zzaD;
            } catch (zzgsc e10) {
                e10.zzh(zzaD);
                throw e10;
            }
        } catch (zzgsc e11) {
            e = e11;
            if (e.zzl()) {
                e = new zzgsc(e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzguj e12) {
            zzgsc zza = e12.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e13) {
            if (e13.getCause() instanceof zzgsc) {
                throw ((zzgsc) e13.getCause());
            }
            zzgsc zzgscVar = new zzgsc(e13);
            zzgscVar.zzh(zzaD);
            throw zzgscVar;
        } catch (RuntimeException e14) {
            if (e14.getCause() instanceof zzgsc) {
                throw ((zzgsc) e14.getCause());
            }
            throw e14;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzgrq zzaH(zzgrq zzgrqVar, InputStream inputStream, zzgrc zzgrcVar) throws zzgsc {
        zzgqq zzH = zzgqq.zzH(inputStream, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
        zzgrq zzaD = zzgrqVar.zzaD();
        try {
            zzgtt zzb2 = zzgti.zza().zzb(zzaD.getClass());
            zzb2.zzh(zzaD, zzgqr.zzq(zzH), zzgrcVar);
            zzb2.zzf(zzaD);
            zzc(zzaD);
            return zzaD;
        } catch (zzgsc e10) {
            e = e10;
            if (e.zzl()) {
                e = new zzgsc(e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzguj e11) {
            zzgsc zza = e11.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzgsc) {
                throw ((zzgsc) e12.getCause());
            }
            zzgsc zzgscVar = new zzgsc(e12);
            zzgscVar.zzh(zzaD);
            throw zzgscVar;
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzgsc) {
                throw ((zzgsc) e13.getCause());
            }
            throw e13;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzgrq zzaI(zzgrq zzgrqVar, byte[] bArr, zzgrc zzgrcVar) throws zzgsc {
        zzgrq zzd = zzd(zzgrqVar, bArr, 0, bArr.length, zzgrcVar);
        zzc(zzd);
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzgrv zzaJ() {
        return zzgrr.zzf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzgrv zzaK(zzgrv zzgrvVar) {
        int i10;
        int size = zzgrvVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return zzgrvVar.zzd(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzgry zzaL() {
        return zzgsp.zzf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzgry zzaM(zzgry zzgryVar) {
        int i10;
        int size = zzgryVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return zzgryVar.zzd(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzgrz zzaN() {
        return zzgtj.zze();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzgrz zzaO(zzgrz zzgrzVar) {
        int i10;
        int size = zzgrzVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return zzgrzVar.zzd(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzaQ(Method method, Object obj, Object... objArr) {
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
    public static Object zzaR(zzgta zzgtaVar, String str, Object[] objArr) {
        return new zzgtk(zzgtaVar, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void zzaU(Class cls, zzgrq zzgrqVar) {
        zzgrqVar.zzaT();
        zzb.put(cls, zzgrqVar);
    }

    private static zzgrq zzc(zzgrq zzgrqVar) throws zzgsc {
        if (zzgrqVar != null && !zzgrqVar.zzaX()) {
            zzgsc zza = new zzguj(zzgrqVar).zza();
            zza.zzh(zzgrqVar);
            throw zza;
        }
        return zzgrqVar;
    }

    private static zzgrq zzd(zzgrq zzgrqVar, byte[] bArr, int i10, int i11, zzgrc zzgrcVar) throws zzgsc {
        zzgrq zzaD = zzgrqVar.zzaD();
        try {
            zzgtt zzb2 = zzgti.zza().zzb(zzaD.getClass());
            zzb2.zzi(zzaD, bArr, 0, i11, new zzgpu(zzgrcVar));
            zzb2.zzf(zzaD);
            return zzaD;
        } catch (zzgsc e10) {
            e = e10;
            if (e.zzl()) {
                e = new zzgsc(e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzguj e11) {
            zzgsc zza = e11.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzgsc) {
                throw ((zzgsc) e12.getCause());
            }
            zzgsc zzgscVar = new zzgsc(e12);
            zzgscVar.zzh(zzaD);
            throw zzgscVar;
        } catch (IndexOutOfBoundsException unused) {
            zzgsc zzj = zzgsc.zzj();
            zzj.zzh(zzaD);
            throw zzj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzgti.zza().zzb(getClass()).zzj(this, (zzgrq) obj);
    }

    public final int hashCode() {
        if (!zzaY()) {
            int i10 = this.zza;
            if (i10 == 0) {
                int zzay = zzay();
                this.zza = zzay;
                return zzay;
            }
            return i10;
        }
        return zzay();
    }

    public final String toString() {
        return zzgtc.zza(this, super.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzgrm zzaA() {
        return (zzgrm) zzb(5, null, null);
    }

    public final zzgrm zzaB() {
        zzgrm zzgrmVar = (zzgrm) zzb(5, null, null);
        zzgrmVar.zzaj(this);
        return zzgrmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzgrq zzaD() {
        return (zzgrq) zzb(4, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgta
    public final /* synthetic */ zzgsz zzaP() {
        return (zzgrm) zzb(5, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzaS() {
        zzgti.zza().zzb(getClass()).zzf(this);
        zzaT();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzaT() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzaV(int i10) {
        this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzgta
    public final void zzaW(zzgqx zzgqxVar) throws IOException {
        zzgti.zza().zzb(getClass()).zzm(this, zzgqy.zza(zzgqxVar));
    }

    public final boolean zzaX() {
        zzgrq<MessageType, BuilderType> zzgrqVar;
        byte byteValue = ((Byte) zzb(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzgti.zza().zzb(getClass()).zzk(this);
        if (true != zzk) {
            zzgrqVar = null;
        } else {
            zzgrqVar = this;
        }
        zzb(2, zzgrqVar, null);
        return zzk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzaY() {
        if ((this.zzd & RecyclerView.UNDEFINED_DURATION) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgpr
    public final int zzat(zzgtt zzgttVar) {
        if (zzaY()) {
            int zza = zzgttVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 == Integer.MAX_VALUE) {
            int zza2 = zzgttVar.zza(this);
            if (zza2 >= 0) {
                this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | zza2;
                return zza2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
        }
        return i10;
    }

    final int zzay() {
        return zzgti.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgta
    public final int zzaz() {
        int i10;
        if (zzaY()) {
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
    public abstract Object zzb(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.zzgtb
    public final /* synthetic */ zzgta zzbf() {
        return (zzgrq) zzb(6, null, null);
    }
}
