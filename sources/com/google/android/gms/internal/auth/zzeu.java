package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzes;
import com.google.android.gms.internal.auth.zzeu;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes3.dex */
public abstract class zzeu<MessageType extends zzeu<MessageType, BuilderType>, BuilderType extends zzes<MessageType, BuilderType>> extends zzdp<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzgz zzc = zzgz.zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeu zza(Class cls) {
        Map map = zzb;
        zzeu zzeuVar = (zzeu) map.get(cls);
        if (zzeuVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzeuVar = (zzeu) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzeuVar == null) {
            zzeuVar = (zzeu) ((zzeu) zzhi.zze(cls)).zzi(6, null, null);
            if (zzeuVar != null) {
                map.put(cls, zzeuVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzeuVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r1 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.auth.zzeu zzb(com.google.android.gms.internal.auth.zzeu r3, byte[] r4) throws com.google.android.gms.internal.auth.zzfa {
        /*
            int r0 = r4.length
            com.google.android.gms.internal.auth.zzek r1 = com.google.android.gms.internal.auth.zzek.zza
            r2 = 0
            com.google.android.gms.internal.auth.zzeu r3 = zzj(r3, r4, r2, r0, r1)
            if (r3 == 0) goto L44
            r4 = 1
            r0 = 0
            java.lang.Object r1 = r3.zzi(r4, r0, r0)
            java.lang.Byte r1 = (java.lang.Byte) r1
            byte r1 = r1.byteValue()
            if (r1 != r4) goto L19
            goto L44
        L19:
            if (r1 == 0) goto L37
            com.google.android.gms.internal.auth.zzge r1 = com.google.android.gms.internal.auth.zzge.zza()
            java.lang.Class r2 = r3.getClass()
            com.google.android.gms.internal.auth.zzgh r1 = r1.zzb(r2)
            boolean r1 = r1.zzi(r3)
            if (r4 == r1) goto L2f
            r4 = r0
            goto L30
        L2f:
            r4 = r3
        L30:
            r2 = 2
            r3.zzi(r2, r4, r0)
            if (r1 == 0) goto L37
            goto L44
        L37:
            com.google.android.gms.internal.auth.zzgx r4 = new com.google.android.gms.internal.auth.zzgx
            r4.<init>(r3)
            com.google.android.gms.internal.auth.zzfa r4 = r4.zza()
            r4.zze(r3)
            throw r4
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzeu.zzb(com.google.android.gms.internal.auth.zzeu, byte[]):com.google.android.gms.internal.auth.zzeu");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzey zzc() {
        return zzgf.zze();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zze(Method method, Object obj, Object... objArr) {
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
    public static Object zzf(zzfw zzfwVar, String str, Object[] objArr) {
        return new zzgg(zzfwVar, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void zzg(Class cls, zzeu zzeuVar) {
        zzb.put(cls, zzeuVar);
    }

    private static zzeu zzj(zzeu zzeuVar, byte[] bArr, int i10, int i11, zzek zzekVar) throws zzfa {
        zzeu zzeuVar2 = (zzeu) zzeuVar.zzi(4, null, null);
        try {
            zzgh zzb2 = zzge.zza().zzb(zzeuVar2.getClass());
            zzb2.zzg(zzeuVar2, bArr, 0, i11, new zzds(zzekVar));
            zzb2.zze(zzeuVar2);
            if (zzeuVar2.zza == 0) {
                return zzeuVar2;
            }
            throw new RuntimeException();
        } catch (zzfa e10) {
            e10.zze(zzeuVar2);
            throw e10;
        } catch (zzgx e11) {
            zzfa zza = e11.zza();
            zza.zze(zzeuVar2);
            throw zza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzfa) {
                throw ((zzfa) e12.getCause());
            }
            zzfa zzfaVar = new zzfa(e12);
            zzfaVar.zze(zzeuVar2);
            throw zzfaVar;
        } catch (IndexOutOfBoundsException unused) {
            zzfa zzf = zzfa.zzf();
            zzf.zze(zzeuVar2);
            throw zzf;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzge.zza().zzb(getClass()).zzh(this, (zzeu) obj);
    }

    public final int hashCode() {
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int zza = zzge.zza().zzb(getClass()).zza(this);
        this.zza = zza;
        return zza;
    }

    public final String toString() {
        return zzfy.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.auth.zzfw
    public final /* synthetic */ zzfv zzd() {
        zzes zzesVar = (zzes) zzi(5, null, null);
        zzesVar.zze(this);
        return zzesVar;
    }

    @Override // com.google.android.gms.internal.auth.zzfx
    public final /* synthetic */ zzfw zzh() {
        return (zzeu) zzi(6, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zzi(int i10, Object obj, Object obj2);
}
