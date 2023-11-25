package com.google.android.gms.internal.ads;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzgvd implements zzgru {
    static final zzgru zza = new zzgvd();

    private zzgvd() {
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    public final boolean zza(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 1999) {
            switch (i10) {
                case 1000:
                case 1001:
                case CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE /* 1002 */:
                case 1003:
                case 1004:
                case WebSocketProtocol.CLOSE_NO_STATUS_CODE /* 1005 */:
                case 1006:
                case 1007:
                case 1008:
                case 1009:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
