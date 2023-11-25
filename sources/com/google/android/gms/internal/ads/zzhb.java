package com.google.android.gms.internal.ads;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public class zzhb extends zzgj {
    public final zzgn zzb;
    public final int zzc;

    public zzhb(zzgn zzgnVar, int i10, int i11) {
        super(zzb(2008, 1));
        this.zzb = zzgnVar;
        this.zzc = 1;
    }

    public static zzhb zza(IOException iOException, zzgn zzgnVar, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else if (message != null && zzfqo.zza(message).matches("cleartext.*not permitted.*")) {
            i11 = 2007;
        } else {
            i11 = 2001;
        }
        if (i11 == 2007) {
            return new zzha(iOException, zzgnVar);
        }
        return new zzhb(iOException, zzgnVar, i11, i10);
    }

    private static int zzb(int i10, int i11) {
        if (i10 == 2000) {
            if (i11 != 1) {
                return CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
            }
            return 2001;
        }
        return i10;
    }

    public zzhb(IOException iOException, zzgn zzgnVar, int i10, int i11) {
        super(iOException, zzb(i10, i11));
        this.zzb = zzgnVar;
        this.zzc = i11;
    }

    public zzhb(String str, zzgn zzgnVar, int i10, int i11) {
        super(str, zzb(i10, i11));
        this.zzb = zzgnVar;
        this.zzc = i11;
    }

    public zzhb(String str, IOException iOException, zzgn zzgnVar, int i10, int i11) {
        super(str, iOException, zzb(i10, i11));
        this.zzb = zzgnVar;
        this.zzc = i11;
    }
}
