package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public class zzgye implements Iterator, Closeable, zzanc {
    private static final zzanb zza = new zzgyd("eof ");
    private static final zzgyl zzb = zzgyl.zzb(zzgye.class);
    protected zzamy zzc;
    protected zzgyf zzd;
    zzanb zze = null;
    long zzf = 0;
    long zzg = 0;
    private final List zzh = new ArrayList();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzanb zzanbVar = this.zze;
        if (zzanbVar == zza) {
            return false;
        }
        if (zzanbVar != null) {
            return true;
        }
        try {
            this.zze = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zze = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[");
        for (int i10 = 0; i10 < this.zzh.size(); i10++) {
            if (i10 > 0) {
                sb2.append(";");
            }
            sb2.append(((zzanb) this.zzh.get(i10)).toString());
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.Iterator
    /* renamed from: zzd  reason: merged with bridge method [inline-methods] */
    public final zzanb next() {
        zzanb zzb2;
        zzanb zzanbVar = this.zze;
        if (zzanbVar != null && zzanbVar != zza) {
            this.zze = null;
            return zzanbVar;
        }
        zzgyf zzgyfVar = this.zzd;
        if (zzgyfVar != null && this.zzf < this.zzg) {
            try {
                synchronized (zzgyfVar) {
                    this.zzd.zze(this.zzf);
                    zzb2 = this.zzc.zzb(this.zzd, this);
                    this.zzf = this.zzd.zzb();
                }
                return zzb2;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        }
        this.zze = zza;
        throw new NoSuchElementException();
    }

    public final List zze() {
        if (this.zzd != null && this.zze != zza) {
            return new zzgyk(this.zzh, this);
        }
        return this.zzh;
    }

    public final void zzf(zzgyf zzgyfVar, long j10, zzamy zzamyVar) throws IOException {
        this.zzd = zzgyfVar;
        this.zzf = zzgyfVar.zzb();
        zzgyfVar.zze(zzgyfVar.zzb() + j10);
        this.zzg = zzgyfVar.zzb();
        this.zzc = zzamyVar;
    }

    public void close() throws IOException {
    }
}
