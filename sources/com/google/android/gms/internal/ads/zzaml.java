package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaml implements zzakz {
    private final zzamk zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzaml(zzamk zzamkVar, int i10) {
        this.zzc = zzamkVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(InputStream inputStream) throws IOException {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzf(InputStream inputStream) throws IOException {
        return (zzn(inputStream) & 255) | ((zzn(inputStream) & 255) << 8) | ((zzn(inputStream) & 255) << 16) | ((zzn(inputStream) & 255) << 24) | ((zzn(inputStream) & 255) << 32) | ((zzn(inputStream) & 255) << 40) | ((zzn(inputStream) & 255) << 48) | ((zzn(inputStream) & 255) << 56);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzh(zzamj zzamjVar) throws IOException {
        return new String(zzm(zzamjVar, zzf(zzamjVar)), "UTF-8");
    }

    static void zzj(OutputStream outputStream, int i10) throws IOException {
        outputStream.write(i10 & 255);
        outputStream.write((i10 >> 8) & 255);
        outputStream.write((i10 >> 16) & 255);
        outputStream.write((i10 >> 24) & 255);
    }

    static void zzk(OutputStream outputStream, long j10) throws IOException {
        outputStream.write((byte) j10);
        outputStream.write((byte) (j10 >>> 8));
        outputStream.write((byte) (j10 >>> 16));
        outputStream.write((byte) (j10 >>> 24));
        outputStream.write((byte) (j10 >>> 32));
        outputStream.write((byte) (j10 >>> 40));
        outputStream.write((byte) (j10 >>> 48));
        outputStream.write((byte) (j10 >>> 56));
    }

    static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzk(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] zzm(zzamj zzamjVar, long j10) throws IOException {
        long zza = zzamjVar.zza();
        if (j10 >= 0 && j10 <= zza) {
            int i10 = (int) j10;
            if (i10 == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(zzamjVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j10 + ", maxLength=" + zza);
    }

    private static int zzn(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private final void zzo(String str, zzami zzamiVar) {
        if (!this.zza.containsKey(str)) {
            this.zzb += zzamiVar.zza;
        } else {
            this.zzb += zzamiVar.zza - ((zzami) this.zza.get(str)).zza;
        }
        this.zza.put(str, zzamiVar);
    }

    private final void zzp(String str) {
        zzami zzamiVar = (zzami) this.zza.remove(str);
        if (zzamiVar != null) {
            this.zzb -= zzamiVar.zza;
        }
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzakz
    public final synchronized zzaky zza(String str) {
        zzami zzamiVar = (zzami) this.zza.get(str);
        if (zzamiVar == null) {
            return null;
        }
        File zzg = zzg(str);
        try {
            zzamj zzamjVar = new zzamj(new BufferedInputStream(new FileInputStream(zzg)), zzg.length());
            try {
                zzami zza = zzami.zza(zzamjVar);
                if (!TextUtils.equals(str, zza.zzb)) {
                    zzamb.zza("%s: key=%s, found=%s", zzg.getAbsolutePath(), str, zza.zzb);
                    zzp(str);
                    return null;
                }
                byte[] zzm = zzm(zzamjVar, zzamjVar.zza());
                zzaky zzakyVar = new zzaky();
                zzakyVar.zza = zzm;
                zzakyVar.zzb = zzamiVar.zzc;
                zzakyVar.zzc = zzamiVar.zzd;
                zzakyVar.zzd = zzamiVar.zze;
                zzakyVar.zze = zzamiVar.zzf;
                zzakyVar.zzf = zzamiVar.zzg;
                List<zzalh> list = zzamiVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzalh zzalhVar : list) {
                    treeMap.put(zzalhVar.zza(), zzalhVar.zzb());
                }
                zzakyVar.zzg = treeMap;
                zzakyVar.zzh = Collections.unmodifiableList(zzamiVar.zzh);
                return zzakyVar;
            } finally {
                zzamjVar.close();
            }
        } catch (IOException e10) {
            zzamb.zza("%s: %s", zzg.getAbsolutePath(), e10.toString());
            zzi(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakz
    public final synchronized void zzb() {
        File zza = this.zzc.zza();
        if (!zza.exists()) {
            if (!zza.mkdirs()) {
                zzamb.zzb("Unable to create cache dir %s", zza.getAbsolutePath());
                return;
            }
            return;
        }
        File[] listFiles = zza.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                try {
                    long length = file.length();
                    zzamj zzamjVar = new zzamj(new BufferedInputStream(new FileInputStream(file)), length);
                    try {
                        zzami zza2 = zzami.zza(zzamjVar);
                        zza2.zza = length;
                        zzo(zza2.zzb, zza2);
                        zzamjVar.close();
                    } catch (Throwable th) {
                        zzamjVar.close();
                        throw th;
                        break;
                    }
                } catch (IOException unused) {
                    file.delete();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakz
    public final synchronized void zzc(String str, boolean z10) {
        zzaky zza = zza(str);
        if (zza != null) {
            zza.zzf = 0L;
            zza.zze = 0L;
            zzd(str, zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakz
    public final synchronized void zzd(String str, zzaky zzakyVar) {
        long j10;
        long j11 = this.zzb;
        int length = zzakyVar.zza.length;
        long j12 = j11 + length;
        int i10 = this.zzd;
        if (j12 > i10 && length > i10 * 0.9f) {
            return;
        }
        File zzg = zzg(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(zzg));
            zzami zzamiVar = new zzami(str, zzakyVar);
            try {
                zzj(bufferedOutputStream, 538247942);
                zzl(bufferedOutputStream, zzamiVar.zzb);
                String str2 = zzamiVar.zzc;
                if (str2 == null) {
                    str2 = "";
                }
                zzl(bufferedOutputStream, str2);
                zzk(bufferedOutputStream, zzamiVar.zzd);
                zzk(bufferedOutputStream, zzamiVar.zze);
                zzk(bufferedOutputStream, zzamiVar.zzf);
                zzk(bufferedOutputStream, zzamiVar.zzg);
                List<zzalh> list = zzamiVar.zzh;
                if (list != null) {
                    zzj(bufferedOutputStream, list.size());
                    for (zzalh zzalhVar : list) {
                        zzl(bufferedOutputStream, zzalhVar.zza());
                        zzl(bufferedOutputStream, zzalhVar.zzb());
                    }
                } else {
                    zzj(bufferedOutputStream, 0);
                }
                bufferedOutputStream.flush();
                bufferedOutputStream.write(zzakyVar.zza);
                bufferedOutputStream.close();
                zzamiVar.zza = zzg.length();
                zzo(str, zzamiVar);
                if (this.zzb >= this.zzd) {
                    if (zzamb.zzb) {
                        zzamb.zzd("Pruning old cache entries.", new Object[0]);
                    }
                    long j13 = this.zzb;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    Iterator it = this.zza.entrySet().iterator();
                    int i11 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            zzami zzamiVar2 = (zzami) ((Map.Entry) it.next()).getValue();
                            if (zzg(zzamiVar2.zzb).delete()) {
                                j10 = elapsedRealtime;
                                this.zzb -= zzamiVar2.zza;
                            } else {
                                j10 = elapsedRealtime;
                                String str3 = zzamiVar2.zzb;
                                zzamb.zza("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                            }
                            it.remove();
                            i11++;
                            if (((float) this.zzb) < this.zzd * 0.9f) {
                                break;
                            }
                            elapsedRealtime = j10;
                        } else {
                            j10 = elapsedRealtime;
                            break;
                        }
                    }
                    if (zzamb.zzb) {
                        zzamb.zzd("pruned %d files, %d bytes, %d ms", Integer.valueOf(i11), Long.valueOf(this.zzb - j13), Long.valueOf(SystemClock.elapsedRealtime() - j10));
                    }
                }
            } catch (IOException e10) {
                zzamb.zza("%s", e10.toString());
                bufferedOutputStream.close();
                zzamb.zza("Failed to write header for %s", zzg.getAbsolutePath());
                throw new IOException();
            }
        } catch (IOException unused) {
            if (!zzg.delete()) {
                zzamb.zza("Could not clean up file %s", zzg.getAbsolutePath());
            }
            if (!this.zzc.zza().exists()) {
                zzamb.zza("Re-initializing cache after external clearing.", new Object[0]);
                this.zza.clear();
                this.zzb = 0L;
                zzb();
            }
        }
    }

    public final File zzg(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public final synchronized void zzi(String str) {
        boolean delete = zzg(str).delete();
        zzp(str);
        if (!delete) {
            zzamb.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
        }
    }

    public zzaml(File file, int i10) {
        this.zzc = new zzamh(this, file);
    }
}
