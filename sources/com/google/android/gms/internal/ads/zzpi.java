package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzpi {
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private boolean zzE;
    private long zzF;
    private long zzG;
    private boolean zzH;
    private long zzI;
    private zzdz zzJ;
    private final zzph zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private int zze;
    private zzpg zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private float zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private Method zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private int zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    public zzpi(zzph zzphVar) {
        this.zza = zzphVar;
        int i10 = zzfk.zza;
        try {
            this.zzn = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
        this.zzJ = zzdz.zza;
    }

    private final long zzm(long j10) {
        return (j10 * this.zzg) / 1000000;
    }

    private final long zzn(long j10) {
        return (j10 * 1000000) / this.zzg;
    }

    private final long zzo() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzy != -9223372036854775807L) {
            return Math.min(this.zzB, this.zzA + zzm(zzfk.zzn(zzfk.zzp(elapsedRealtime) - this.zzy, this.zzj)));
        }
        if (elapsedRealtime - this.zzs >= 5) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                long j10 = 0;
                if (this.zzh) {
                    if (playState == 2) {
                        if (playbackHeadPosition == 0) {
                            this.zzv = this.zzt;
                        }
                        playState = 2;
                    }
                    playbackHeadPosition += this.zzv;
                }
                if (zzfk.zza <= 29) {
                    if (playbackHeadPosition == 0) {
                        if (this.zzt > 0 && playState == 3) {
                            if (this.zzz == -9223372036854775807L) {
                                this.zzz = elapsedRealtime;
                            }
                        }
                    } else {
                        j10 = playbackHeadPosition;
                    }
                    this.zzz = -9223372036854775807L;
                    playbackHeadPosition = j10;
                }
                if (this.zzt > playbackHeadPosition) {
                    this.zzu++;
                }
                this.zzt = playbackHeadPosition;
            }
            this.zzs = elapsedRealtime;
        }
        return this.zzt + this.zzI + (this.zzu << 32);
    }

    private final void zzp() {
        this.zzl = 0L;
        this.zzx = 0;
        this.zzw = 0;
        this.zzm = 0L;
        this.zzD = 0L;
        this.zzG = 0L;
        this.zzk = false;
    }

    public final int zza(long j10) {
        return this.zze - ((int) (j10 - (zzo() * this.zzd)));
    }

    public final long zzb(boolean z10) {
        long zzn;
        zzpb zzpbVar;
        zzpb zzpbVar2;
        zzox zzoxVar;
        Method method;
        long zzG;
        long zzH;
        long zzG2;
        long zzH2;
        zzpi zzpiVar = this;
        AudioTrack audioTrack = zzpiVar.zzc;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - zzpiVar.zzm >= 30000) {
                long zzn2 = zzpiVar.zzn(zzo());
                if (zzn2 != 0) {
                    zzpiVar.zzb[zzpiVar.zzw] = zzfk.zzo(zzn2, zzpiVar.zzj) - nanoTime;
                    zzpiVar.zzw = (zzpiVar.zzw + 1) % 10;
                    int i10 = zzpiVar.zzx;
                    if (i10 < 10) {
                        zzpiVar.zzx = i10 + 1;
                    }
                    zzpiVar.zzm = nanoTime;
                    zzpiVar.zzl = 0L;
                    int i11 = 0;
                    while (true) {
                        int i12 = zzpiVar.zzx;
                        if (i11 >= i12) {
                            break;
                        }
                        zzpiVar.zzl += zzpiVar.zzb[i11] / i12;
                        i11++;
                    }
                }
            }
            if (!zzpiVar.zzh) {
                zzpg zzpgVar = zzpiVar.zzf;
                zzpgVar.getClass();
                if (zzpgVar.zzg(nanoTime)) {
                    long zzb = zzpgVar.zzb();
                    long zza = zzpgVar.zza();
                    long zzn3 = zzpiVar.zzn(zzo());
                    if (Math.abs(zzb - nanoTime) > 5000000) {
                        zzpz zzpzVar = (zzpz) zzpiVar.zza;
                        zzG2 = zzpzVar.zza.zzG();
                        zzH2 = zzpzVar.zza.zzH();
                        zzes.zzf("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + zza + ", " + zzb + ", " + nanoTime + ", " + zzn3 + ", " + zzG2 + ", " + zzH2);
                        zzpgVar.zzd();
                    } else if (Math.abs(zzpiVar.zzn(zza) - zzn3) > 5000000) {
                        zzpz zzpzVar2 = (zzpz) zzpiVar.zza;
                        zzG = zzpzVar2.zza.zzG();
                        zzH = zzpzVar2.zza.zzH();
                        zzes.zzf("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + zza + ", " + zzb + ", " + nanoTime + ", " + zzn3 + ", " + zzG + ", " + zzH);
                        zzpgVar.zzd();
                    } else {
                        zzpgVar.zzc();
                    }
                    zzpiVar = this;
                }
                if (zzpiVar.zzq && (method = zzpiVar.zzn) != null && nanoTime - zzpiVar.zzr >= 500000) {
                    try {
                        AudioTrack audioTrack2 = zzpiVar.zzc;
                        audioTrack2.getClass();
                        Integer num = (Integer) method.invoke(audioTrack2, new Object[0]);
                        int i13 = zzfk.zza;
                        long intValue = num.intValue();
                        long j10 = zzpiVar.zzi;
                        Long.signum(intValue);
                        long j11 = (intValue * 1000) - j10;
                        zzpiVar.zzo = j11;
                        long max = Math.max(j11, 0L);
                        zzpiVar.zzo = max;
                        if (max > 5000000) {
                            zzes.zzf("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                            zzpiVar.zzo = 0L;
                        }
                    } catch (Exception unused) {
                        zzpiVar.zzn = null;
                    }
                    zzpiVar.zzr = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        zzpg zzpgVar2 = zzpiVar.zzf;
        zzpgVar2.getClass();
        boolean zzf = zzpgVar2.zzf();
        if (zzf) {
            zzn = zzpiVar.zzn(zzpgVar2.zza()) + zzfk.zzn(nanoTime2 - zzpgVar2.zzb(), zzpiVar.zzj);
        } else {
            if (zzpiVar.zzx == 0) {
                zzn = zzpiVar.zzn(zzo());
            } else {
                zzn = zzfk.zzn(zzpiVar.zzl + nanoTime2, zzpiVar.zzj);
            }
            if (!z10) {
                zzn = Math.max(0L, zzn - zzpiVar.zzo);
            }
        }
        if (zzpiVar.zzE != zzf) {
            zzpiVar.zzG = zzpiVar.zzD;
            zzpiVar.zzF = zzpiVar.zzC;
        }
        long j12 = nanoTime2 - zzpiVar.zzG;
        if (j12 < 1000000) {
            long zzn4 = zzpiVar.zzF + zzfk.zzn(j12, zzpiVar.zzj);
            long j13 = (j12 * 1000) / 1000000;
            zzn = ((zzn * j13) + ((1000 - j13) * zzn4)) / 1000;
        }
        if (!zzpiVar.zzk) {
            long j14 = zzpiVar.zzC;
            if (zzn > j14) {
                zzpiVar.zzk = true;
                int i14 = zzfk.zza;
                long currentTimeMillis = System.currentTimeMillis() - zzfk.zzr(zzfk.zzo(zzfk.zzr(zzn - j14), zzpiVar.zzj));
                zzqe zzqeVar = ((zzpz) zzpiVar.zza).zza;
                zzpbVar = zzqeVar.zzp;
                if (zzpbVar != null) {
                    zzpbVar2 = zzqeVar.zzp;
                    zzoxVar = ((zzqj) zzpbVar2).zza.zzc;
                    zzoxVar.zzr(currentTimeMillis);
                }
            }
        }
        zzpiVar.zzD = nanoTime2;
        zzpiVar.zzC = zzn;
        zzpiVar.zzE = zzf;
        return zzn;
    }

    public final void zzc(long j10) {
        this.zzA = zzo();
        this.zzy = zzfk.zzp(SystemClock.elapsedRealtime());
        this.zzB = j10;
    }

    public final void zzd() {
        zzp();
        this.zzc = null;
        this.zzf = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zze(android.media.AudioTrack r3, boolean r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            r2.zzc = r3
            r2.zzd = r6
            r2.zze = r7
            com.google.android.gms.internal.ads.zzpg r0 = new com.google.android.gms.internal.ads.zzpg
            r0.<init>(r3)
            r2.zzf = r0
            int r3 = r3.getSampleRate()
            r2.zzg = r3
            r3 = 0
            if (r4 == 0) goto L25
            int r4 = com.google.android.gms.internal.ads.zzfk.zza
            r0 = 23
            if (r4 >= r0) goto L25
            r4 = 5
            r0 = 1
            if (r5 == r4) goto L26
            r4 = 6
            if (r5 != r4) goto L25
            r5 = 6
            goto L26
        L25:
            r0 = 0
        L26:
            r2.zzh = r0
            boolean r4 = com.google.android.gms.internal.ads.zzfk.zzE(r5)
            r2.zzq = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L3c
            int r7 = r7 / r6
            long r4 = (long) r7
            long r4 = r2.zzn(r4)
            goto L3d
        L3c:
            r4 = r0
        L3d:
            r2.zzi = r4
            r4 = 0
            r2.zzt = r4
            r2.zzu = r4
            r2.zzH = r3
            r2.zzI = r4
            r2.zzv = r4
            r2.zzp = r3
            r2.zzy = r0
            r2.zzz = r0
            r2.zzr = r4
            r2.zzo = r4
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.zzj = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpi.zze(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final void zzf(zzdz zzdzVar) {
        this.zzJ = zzdzVar;
    }

    public final void zzg() {
        zzpg zzpgVar = this.zzf;
        zzpgVar.getClass();
        zzpgVar.zze();
    }

    public final boolean zzh(long j10) {
        if (j10 <= zzm(zzb(false))) {
            if (this.zzh) {
                AudioTrack audioTrack = this.zzc;
                audioTrack.getClass();
                if (audioTrack.getPlayState() == 2 && zzo() == 0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean zzi() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            return true;
        }
        return false;
    }

    public final boolean zzj(long j10) {
        if (this.zzz != -9223372036854775807L && j10 > 0 && SystemClock.elapsedRealtime() - this.zzz >= 200) {
            return true;
        }
        return false;
    }

    public final boolean zzk(long j10) {
        zzpb zzpbVar;
        long j11;
        zzpb zzpbVar2;
        zzox zzoxVar;
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.zzh) {
            if (playState == 2) {
                this.zzp = false;
                return false;
            } else if (playState == 1) {
                if (zzo() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z10 = this.zzp;
        boolean zzh = zzh(j10);
        this.zzp = zzh;
        if (z10 && !zzh && playState != 1) {
            zzph zzphVar = this.zza;
            int i10 = this.zze;
            long zzr = zzfk.zzr(this.zzi);
            zzpz zzpzVar = (zzpz) zzphVar;
            zzpbVar = zzpzVar.zza.zzp;
            if (zzpbVar != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zzqe zzqeVar = zzpzVar.zza;
                j11 = zzqeVar.zzV;
                zzpbVar2 = zzqeVar.zzp;
                zzoxVar = ((zzqj) zzpbVar2).zza.zzc;
                zzoxVar.zzt(i10, zzr, elapsedRealtime - j11);
            }
        }
        return true;
    }

    public final boolean zzl() {
        zzp();
        if (this.zzy == -9223372036854775807L) {
            zzpg zzpgVar = this.zzf;
            zzpgVar.getClass();
            zzpgVar.zze();
            return true;
        }
        return false;
    }
}
