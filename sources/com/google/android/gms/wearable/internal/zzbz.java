package com.google.android.gms.wearable.internal;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.ChannelIOException;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzbz extends OutputStream {
    private final OutputStream zza;
    private volatile zzbi zzb;

    public zzbz(OutputStream outputStream) {
        this.zza = (OutputStream) Preconditions.checkNotNull(outputStream);
    }

    private final IOException zzb(IOException iOException) {
        zzbi zzbiVar = this.zzb;
        if (zzbiVar != null) {
            if (Log.isLoggable("ChannelOutputStream", 2)) {
                Log.v("ChannelOutputStream", "Caught IOException, but channel has been closed. Translating to ChannelIOException.", iOException);
            }
            return new ChannelIOException("Channel closed unexpectedly before stream was finished", zzbiVar.zza, zzbiVar.zzb);
        }
        return iOException;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            this.zza.close();
        } catch (IOException e10) {
            throw zzb(e10);
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.zza.flush();
        } catch (IOException e10) {
            throw zzb(e10);
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        try {
            this.zza.write(i10);
        } catch (IOException e10) {
            throw zzb(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzbi zzbiVar) {
        this.zzb = zzbiVar;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        try {
            this.zza.write(bArr);
        } catch (IOException e10) {
            throw zzb(e10);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        try {
            this.zza.write(bArr, i10, i11);
        } catch (IOException e10) {
            throw zzb(e10);
        }
    }
}
