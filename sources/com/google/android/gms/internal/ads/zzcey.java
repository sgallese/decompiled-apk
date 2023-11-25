package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzcey extends zzgc implements zzhf {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzhe zzf;
    private zzgn zzg;
    private HttpURLConnection zzh;
    private final Queue zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private final long zzr;
    private final long zzs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcey(String str, zzhk zzhkVar, int i10, int i11, long j10, long j11) {
        super(true);
        zzdy.zzc(str);
        this.zze = str;
        this.zzf = new zzhe();
        this.zzc = i10;
        this.zzd = i11;
        this.zzi = new ArrayDeque();
        this.zzr = j10;
        this.zzs = j11;
        if (zzhkVar != null) {
            zzf(zzhkVar);
        }
    }

    private final void zzl() {
        while (!this.zzi.isEmpty()) {
            try {
                ((HttpURLConnection) this.zzi.remove()).disconnect();
            } catch (Exception e10) {
                zzcaa.zzh("Unexpected error while disconnecting", e10);
            }
        }
        this.zzh = null;
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i10, int i11) throws zzhb {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.zzm;
            long j11 = this.zzn;
            if (j10 - j11 == 0) {
                return -1;
            }
            long j12 = this.zzo + j11;
            long j13 = i11;
            long j14 = j12 + j13 + this.zzs;
            long j15 = this.zzq;
            long j16 = j15 + 1;
            if (j14 > j16) {
                long j17 = this.zzp;
                if (j15 < j17) {
                    long min = Math.min(j17, Math.max(((this.zzr + j16) - r3) - 1, (-1) + j16 + j13));
                    zzk(j16, min, 2);
                    this.zzq = min;
                    j15 = min;
                }
            }
            int read = this.zzj.read(bArr, i10, (int) Math.min(j13, ((j15 + 1) - this.zzo) - this.zzn));
            if (read != -1) {
                this.zzn += read;
                zzg(read);
                return read;
            }
            throw new EOFException();
        } catch (IOException e10) {
            throw new zzhb(e10, this.zzg, (int) CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgnVar) throws zzhb {
        long min;
        this.zzg = zzgnVar;
        this.zzn = 0L;
        long j10 = zzgnVar.zzf;
        long j11 = zzgnVar.zzg;
        if (j11 == -1) {
            min = this.zzr;
        } else {
            min = Math.min(this.zzr, j11);
        }
        this.zzo = j10;
        HttpURLConnection zzk = zzk(j10, (min + j10) - 1, 1);
        this.zzh = zzk;
        String headerField = zzk.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zzb.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j12 = zzgnVar.zzg;
                    if (j12 != -1) {
                        this.zzm = j12;
                        this.zzp = Math.max(parseLong, (this.zzo + j12) - 1);
                    } else {
                        this.zzm = parseLong2 - this.zzo;
                        this.zzp = parseLong2 - 1;
                    }
                    this.zzq = parseLong;
                    this.zzk = true;
                    zzj(zzgnVar);
                    return this.zzm;
                } catch (NumberFormatException unused) {
                    zzcaa.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new zzcew(headerField, zzgnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzd() throws zzhb {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new zzhb(e10, this.zzg, (int) CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzl();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgc, com.google.android.gms.internal.ads.zzgi
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final HttpURLConnection zzk(long j10, long j11, int i10) throws zzhb {
        String uri = this.zzg.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.zzc);
            httpURLConnection.setReadTimeout(this.zzd);
            for (Map.Entry entry : this.zzf.zza().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j10 + "-" + j11);
            httpURLConnection.setRequestProperty("User-Agent", this.zze);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzi.add(httpURLConnection);
            String uri2 = this.zzg.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.zzl = responseCode;
                if (responseCode >= 200 && responseCode <= 299) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (this.zzj != null) {
                            inputStream = new SequenceInputStream(this.zzj, inputStream);
                        }
                        this.zzj = inputStream;
                        return httpURLConnection;
                    } catch (IOException e10) {
                        zzl();
                        throw new zzhb(e10, this.zzg, (int) CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, i10);
                    }
                }
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                zzl();
                throw new zzcex(this.zzl, headerFields, this.zzg, i10);
            } catch (IOException e11) {
                zzl();
                throw new zzhb("Unable to connect to ".concat(String.valueOf(uri2)), e11, this.zzg, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, i10);
            }
        } catch (IOException e12) {
            throw new zzhb("Unable to connect to ".concat(String.valueOf(uri)), e12, this.zzg, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, i10);
        }
    }
}
