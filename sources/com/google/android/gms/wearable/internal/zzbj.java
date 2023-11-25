package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.ChannelApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
@SafeParcelable.Class(creator = "ChannelEventParcelableCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzbj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbj> CREATOR = new zzbk();
    @SafeParcelable.Field(id = 2)
    final zzbu zza;
    @SafeParcelable.Field(id = 3)
    final int zzb;
    @SafeParcelable.Field(id = 4)
    final int zzc;
    @SafeParcelable.Field(id = 5)
    final int zzd;

    @SafeParcelable.Constructor
    public zzbj(@SafeParcelable.Param(id = 2) zzbu zzbuVar, @SafeParcelable.Param(id = 3) int i10, @SafeParcelable.Param(id = 4) int i11, @SafeParcelable.Param(id = 5) int i12) {
        this.zza = zzbuVar;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
    }

    public final String toString() {
        String str;
        String str2;
        String valueOf = String.valueOf(this.zza);
        int i10 = this.zzb;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        str = Integer.toString(i10);
                    } else {
                        str = "OUTPUT_CLOSED";
                    }
                } else {
                    str = "INPUT_CLOSED";
                }
            } else {
                str = "CHANNEL_CLOSED";
            }
        } else {
            str = "CHANNEL_OPENED";
        }
        int i11 = this.zzc;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        str2 = Integer.toString(i11);
                    } else {
                        str2 = "CLOSE_REASON_LOCAL_CLOSE";
                    }
                } else {
                    str2 = "CLOSE_REASON_REMOTE_CLOSE";
                }
            } else {
                str2 = "CLOSE_REASON_DISCONNECTED";
            }
        } else {
            str2 = "CLOSE_REASON_NORMAL";
        }
        return "ChannelEventParcelable[, channel=" + valueOf + ", type=" + str + ", closeReason=" + str2 + ", appErrorCode=" + this.zzd + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i10, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final void zza(ChannelApi.ChannelListener channelListener) {
        int i10 = this.zzb;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        Log.w("ChannelEventParcelable", "Unknown type: " + i10);
                        return;
                    }
                    channelListener.onOutputClosed(this.zza, this.zzc, this.zzd);
                    return;
                }
                channelListener.onInputClosed(this.zza, this.zzc, this.zzd);
                return;
            }
            channelListener.onChannelClosed(this.zza, this.zzc, this.zzd);
            return;
        }
        channelListener.onChannelOpened(this.zza);
    }
}
