package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@SafeParcelable.Class(creator = "BrowserPublicKeyCredentialRequestOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class BrowserPublicKeyCredentialRequestOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator<BrowserPublicKeyCredentialRequestOptions> CREATOR = new zzo();
    @SafeParcelable.Field(getter = "getPublicKeyCredentialRequestOptions", id = 2)
    private final PublicKeyCredentialRequestOptions zza;
    @SafeParcelable.Field(getter = "getOrigin", id = 3)
    private final Uri zzb;
    @SafeParcelable.Field(getter = "getClientDataHash", id = 4)
    private final byte[] zzc;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private PublicKeyCredentialRequestOptions zza;
        private Uri zzb;
        private byte[] zzc;

        public BrowserPublicKeyCredentialRequestOptions build() {
            return new BrowserPublicKeyCredentialRequestOptions(this.zza, this.zzb, this.zzc);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
            jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.zzb(byte[]):byte[]
            	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:74)
            	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:49)
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.isRegister()" because "arg" is null
            	at jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(RegisterArg.java:173)
            	at jadx.core.dex.instructions.args.InsnArg.isSameVar(InsnArg.java:269)
            	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:118)
            	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
            	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
            	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:63)
            	... 1 more
            */
        public com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.Builder setClientDataHash(byte[] r1) {
            /*
                r0 = this;
                com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.zzb(r1)
                r0.zzc = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.Builder.setClientDataHash(byte[]):com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions$Builder");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
            jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.zza(android.net.Uri):android.net.Uri
            	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:74)
            	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:49)
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.isRegister()" because "arg" is null
            	at jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(RegisterArg.java:173)
            	at jadx.core.dex.instructions.args.InsnArg.isSameVar(InsnArg.java:269)
            	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:118)
            	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
            	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
            	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:63)
            	... 1 more
            */
        public com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.Builder setOrigin(android.net.Uri r1) {
            /*
                r0 = this;
                com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.zza(r1)
                r0.zzb = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.Builder.setOrigin(android.net.Uri):com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions$Builder");
        }

        public Builder setPublicKeyCredentialRequestOptions(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
            this.zza = (PublicKeyCredentialRequestOptions) Preconditions.checkNotNull(publicKeyCredentialRequestOptions);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public BrowserPublicKeyCredentialRequestOptions(@SafeParcelable.Param(id = 2) PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, @SafeParcelable.Param(id = 3) Uri uri, @SafeParcelable.Param(id = 4) byte[] bArr) {
        this.zza = (PublicKeyCredentialRequestOptions) Preconditions.checkNotNull(publicKeyCredentialRequestOptions);
        zzc(uri);
        this.zzb = uri;
        zzd(bArr);
        this.zzc = bArr;
    }

    public static BrowserPublicKeyCredentialRequestOptions deserializeFromBytes(byte[] bArr) {
        return (BrowserPublicKeyCredentialRequestOptions) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    /*  JADX ERROR: NullPointerException in pass: MarkMethodsForInline
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.isRegister()" because "arg" is null
        	at jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(RegisterArg.java:173)
        	at jadx.core.dex.instructions.args.InsnArg.isSameVar(InsnArg.java:269)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:118)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    static /* bridge */ /* synthetic */ android.net.Uri zza(android.net.Uri r0) {
        /*
            zzc(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.zza(android.net.Uri):android.net.Uri");
    }

    /*  JADX ERROR: NullPointerException in pass: MarkMethodsForInline
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.isRegister()" because "arg" is null
        	at jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(RegisterArg.java:173)
        	at jadx.core.dex.instructions.args.InsnArg.isSameVar(InsnArg.java:269)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:118)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    static /* bridge */ /* synthetic */ byte[] zzb(byte[] r0) {
        /*
            zzd(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.zzb(byte[]):byte[]");
    }

    private static Uri zzc(Uri uri) {
        boolean z10;
        Preconditions.checkNotNull(uri);
        boolean z11 = true;
        if (uri.getScheme() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "origin scheme must be non-empty");
        if (uri.getAuthority() == null) {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "origin authority must be non-empty");
        return uri;
    }

    private static byte[] zzd(byte[] bArr) {
        boolean z10 = true;
        if (bArr != null && bArr.length != 32) {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "clientDataHash must be 32 bytes long");
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialRequestOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) obj;
        if (!Objects.equal(this.zza, browserPublicKeyCredentialRequestOptions.zza) || !Objects.equal(this.zzb, browserPublicKeyCredentialRequestOptions.zzb)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public AuthenticationExtensions getAuthenticationExtensions() {
        return this.zza.getAuthenticationExtensions();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public byte[] getChallenge() {
        return this.zza.getChallenge();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions
    public byte[] getClientDataHash() {
        return this.zzc;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions
    public Uri getOrigin() {
        return this.zzb;
    }

    public PublicKeyCredentialRequestOptions getPublicKeyCredentialRequestOptions() {
        return this.zza;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public Integer getRequestId() {
        return this.zza.getRequestId();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public Double getTimeoutSeconds() {
        return this.zza.getTimeoutSeconds();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public TokenBinding getTokenBinding() {
        return this.zza.getTokenBinding();
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getPublicKeyCredentialRequestOptions(), i10, false);
        SafeParcelWriter.writeParcelable(parcel, 3, getOrigin(), i10, false);
        SafeParcelWriter.writeByteArray(parcel, 4, getClientDataHash(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
