package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.ChannelIOException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzbx extends InputStream {
    private final InputStream zza;
    private volatile zzbi zzb;

    public zzbx(InputStream inputStream) {
        this.zza = (InputStream) Preconditions.checkNotNull(inputStream);
    }

    private final int zzb(int i10) throws ChannelIOException {
        if (i10 == -1) {
            zzbi zzbiVar = this.zzb;
            if (zzbiVar == null) {
                return -1;
            }
            throw new ChannelIOException("Channel closed unexpectedly before stream was finished", zzbiVar.zza, zzbiVar.zzb);
        }
        return i10;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.zza.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        this.zza.mark(i10);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.zza.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int read = this.zza.read();
        zzb(read);
        return read;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        this.zza.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        return this.zza.skip(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzbi zzbiVar) {
        this.zzb = (zzbi) Preconditions.checkNotNull(zzbiVar);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int read = this.zza.read(bArr);
        zzb(read);
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int read = this.zza.read(bArr, i10, i11);
        zzb(read);
        return read;
    }
}
