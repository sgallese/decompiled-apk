package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import androidx.core.content.a;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzaq extends zzgx {
    private long zza;
    private String zzb;
    private AccountManager zzc;
    private Boolean zzd;
    private long zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaq(zzgd zzgdVar) {
        super(zzgdVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zza() {
        zzg();
        return this.zze;
    }

    public final long zzb() {
        zzv();
        return this.zza;
    }

    public final String zzc() {
        zzv();
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd() {
        zzg();
        this.zzd = null;
        this.zze = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zze() {
        Account[] result;
        zzg();
        long currentTimeMillis = this.zzt.zzax().currentTimeMillis();
        if (currentTimeMillis - this.zze > 86400000) {
            this.zzd = null;
        }
        Boolean bool = this.zzd;
        if (bool == null) {
            if (a.a(this.zzt.zzaw(), "android.permission.GET_ACCOUNTS") != 0) {
                this.zzt.zzaA().zzm().zza("Permission error checking for dasher/unicorn accounts");
                this.zze = currentTimeMillis;
                this.zzd = Boolean.FALSE;
                return false;
            }
            if (this.zzc == null) {
                this.zzc = AccountManager.get(this.zzt.zzaw());
            }
            try {
                result = this.zzc.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
            } catch (AuthenticatorException | OperationCanceledException | IOException e10) {
                this.zzt.zzaA().zzh().zzb("Exception checking account types", e10);
            }
            if (result != null && result.length > 0) {
                this.zzd = Boolean.TRUE;
                this.zze = currentTimeMillis;
                return true;
            }
            Account[] result2 = this.zzc.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
            if (result2 != null && result2.length > 0) {
                this.zzd = Boolean.TRUE;
                this.zze = currentTimeMillis;
                return true;
            }
            this.zze = currentTimeMillis;
            this.zzd = Boolean.FALSE;
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzgx
    protected final boolean zzf() {
        Calendar calendar = Calendar.getInstance();
        this.zza = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.zzb = language.toLowerCase(locale2) + "-" + locale.getCountry().toLowerCase(locale2);
        return false;
    }
}