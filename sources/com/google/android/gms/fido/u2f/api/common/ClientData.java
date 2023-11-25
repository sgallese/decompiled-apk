package com.google.android.gms.fido.u2f.api.common;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@Deprecated
/* loaded from: classes.dex */
public class ClientData {
    public static final String KEY_CHALLENGE = "challenge";
    public static final String KEY_CID_PUBKEY = "cid_pubkey";
    public static final String KEY_ORIGIN = "origin";
    public static final String KEY_TYPE = "typ";
    public static final String TYPE_FINISH_ENROLLMENT = "navigator.id.finishEnrollment";
    public static final String TYPE_GET_ASSERTION = "navigator.id.getAssertion";
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final ChannelIdValue zzd;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    /* loaded from: classes.dex */
    public static class Builder implements Cloneable {
        private String zza;
        private String zzb;
        private String zzc;
        private ChannelIdValue zzd;

        Builder(String str, String str2, String str3, ChannelIdValue channelIdValue) {
            this.zza = str;
            this.zzb = str2;
            this.zzc = str3;
            this.zzd = channelIdValue;
        }

        public static Builder newInstance() {
            return new Builder();
        }

        public ClientData build() {
            return new ClientData(this.zza, this.zzb, this.zzc, this.zzd);
        }

        /* renamed from: clone  reason: merged with bridge method [inline-methods] */
        public Builder m3clone() {
            return new Builder(this.zza, this.zzb, this.zzc, this.zzd);
        }

        public Builder setChallenge(String str) {
            this.zzb = str;
            return this;
        }

        public Builder setChannelId(ChannelIdValue channelIdValue) {
            this.zzd = channelIdValue;
            return this;
        }

        public Builder setOrigin(String str) {
            this.zzc = str;
            return this;
        }

        public Builder setType(String str) {
            this.zza = str;
            return this;
        }

        Builder() {
            this.zzd = ChannelIdValue.ABSENT;
        }
    }

    ClientData(String str, String str2, String str3, ChannelIdValue channelIdValue) {
        this.zza = (String) Preconditions.checkNotNull(str);
        this.zzb = (String) Preconditions.checkNotNull(str2);
        this.zzc = (String) Preconditions.checkNotNull(str3);
        this.zzd = (ChannelIdValue) Preconditions.checkNotNull(channelIdValue);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientData)) {
            return false;
        }
        ClientData clientData = (ClientData) obj;
        if (this.zza.equals(clientData.zza) && this.zzb.equals(clientData.zzb) && this.zzc.equals(clientData.zzc) && this.zzd.equals(clientData.zzd)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.zza.hashCode() + 31) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + this.zzd.hashCode();
    }

    public String toJsonString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(KEY_TYPE, this.zza);
            jSONObject.put(KEY_CHALLENGE, this.zzb);
            jSONObject.put("origin", this.zzc);
            ChannelIdValue.ChannelIdValueType channelIdValueType = ChannelIdValue.ChannelIdValueType.ABSENT;
            int ordinal = this.zzd.getType().ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    jSONObject.put(KEY_CID_PUBKEY, this.zzd.getObjectValue());
                }
            } else {
                jSONObject.put(KEY_CID_PUBKEY, this.zzd.getStringValue());
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }
}
